/** **************************************************************************
 * IController.hx
 *
 * Copyright 2013 TiVo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ************************************************************************** **/

package hxcpp.debugger;


/**
 * This is the interface by which the debugger thread and user interface
 * classes pass commands and messages back and forth.
 *
 * The methods are called by the debugger thread and are expected to be
 * serviced by the user interface thread or a proxy thereof.
 **/
interface IController
{
    /**
     * Blocking call which returns the next command for the debugger to
     * execute.
     *
     * @return the next command for the debugger to execute
     **/
    public function getNextCommand() : Command;

    /**
     * Called when the debugger has a message to deliver.  Note that this may
     * be called by multiple threads simultaneously if an asynchronous thread
     * event occurs.  The implementation should probably lock as necessary.
     *
     * @param message is the message
     **/
    public function acceptMessage(message : Message) : Void;
}


/**
 * This enum defines all of the commands that can be sent to a debugger
 * thread.  For each command, a comment gives the set of response messages
 * that can be expected for that command.
 **/
enum Command
{
    Exit;
    // Response: Exited

    Detach;
    // Response: Detached

    Files;
    // Response: StringList

    Classes;
    // Response: StringList

    Mem;
    // Response: MemBytes

    Compact;
    // Response: Compacted

    Collect;
    // Response: Collected

    SetCurrentThread(number : Int);
    // Response: CurrentThread, ErrorNoSuchThread

    AddFileLineBreakpoint(fileName : String, lineNumber : Int);
    // Response: FileLineBreakpointNumber, ErrorNoSuchFile

    AddClassFunctionBreakpoint(className : String, functionName : String);
    // Response: ClassFunctionBreakpointNumber, ErrorBadClassNameRegex,
    // ErrorBadFunctionNameRegex, ErrorNoMatchingFunctions

    ListBreakpoints(enabled : Bool, disabled : Bool);
    // Response: Breakpoints

    DescribeBreakpoint(number : Int);
    // Response: BreakpointDescription, ErrorNoSuchBreakpoint

    DisableAllBreakpoints;
    // Response: BreakpointStatuses

    DisableBreakpointRange(first : Int, last: Int);
    // Response: BreakpointStatuses

    EnableAllBreakpoints;
    // Response: BreakpointStatuses

    EnableBreakpointRange(first : Int, last: Int);
    // Response: BreakpointStatuses

    DeleteAllBreakpoints;
    // Response: BreakpointStatuses

    DeleteBreakpointRange(first : Int, last: Int);
    // Response: BreakpointStatuses

    BreakNow;
    // Response: OK

    Continue(count : Int);
    // Response: Continued, ErrorBadCount

    Step(count : Int);
    // Response: Continued, ErrorBadCount

    Next(count : Int);
    // Response: Continued, ErrorBadCount

    Finish(count : Int);
    // Response: Continued, ErrorBadCount

    WhereCurrentThread(unsafe : Bool);
    // Response: ThreadsWhere, ErrorCurrentThreadNotStopped

    WhereAllThreads;
    // Response: ThreadsWhere

    Up(count : Int);
    // Response: CurrentFrame, ErrorCurrentThreadNotStopped, ErrorBadCount

    Down(count : Int);
    // Response: CurrentFrame, ErrorCurrentThreadNotStopped, ErrorBadCount

    SetFrame(number : Int);
    // Response: CurrentFrame, ErrorCurrentThreadNotStopped, ErrorBadCount

    Variables(unsafe : Bool);
    // Response: ErrorCurrentThreadNotStopped, Variables

    PrintExpression(unsafe : Bool, expression : String);
    // Response: Value, ErrorCurrentThreadNotStopped, ErrorEvaluatingExpression

    SetExpression(unsafe: Bool, lhs : String, rhs : String);
    // Response: Valuet, ErrorCurrentThreadNotStopped,
    // ErrorEvaluatingExpression
	
    CommandId(id: Int, command: Command);
	// Response: MessageId

    GetExpression(unsafe: Bool, expression : String);
	// Response: Variable
}


/**
 * A list of strings
 **/
enum StringList
{
    Terminator;
    Element(string : String, next : StringList);
}


/**
 * A list of breakpoints
 **/
enum BreakpointList
{
    Terminator;
    Breakpoint(number : Int, description : String, enabled : Bool,
               multi : Bool, next : BreakpointList);
}


/**
 * A list of locations at which a breakpoint breaks
 **/
enum BreakpointLocationList
{
    Terminator;
    FileLine(fileName : String, lineNumber : Int,
             next : BreakpointLocationList);
    ClassFunction(className : String, functionName : String,
                  next : BreakpointLocationList);
}


/**
 * A list of breakpoint status that results from disabling, enabling, or
 * deleting breakpoints
 **/
enum BreakpointStatusList
{
    Terminator;
    Nonexistent(number : Int, next : BreakpointStatusList);
    Disabled(number : Int, next : BreakpointStatusList);
    AlreadyDisabled(number : Int, next : BreakpointStatusList);
    Enabled(number : Int, next : BreakpointStatusList);
    AlreadyEnabled(number : Int, next : BreakpointStatusList);
    Deleted(number : Int, next : BreakpointStatusList);
}


/**
 * Status of a thread
 **/
enum ThreadStatus
{
    Running;
    StoppedImmediate;
    StoppedBreakpoint(number : Int);
    StoppedUncaughtException;
    StoppedCriticalError(description : String);
}


/**
 * A list of call stack frames of a thread
 **/
enum FrameList
{
    Terminator;
    Frame(isCurrent : Bool, number : Int, className : String,
          functionName : String, fileName : String, lineNumber : Int,
          next : FrameList);
}


/**
 * Information about why and where a thread has stopped
 **/
enum ThreadWhereList
{
    Terminator;
    Where(number : Int, status : ThreadStatus, frameList : FrameList,
          next : ThreadWhereList);
}

enum VariableValue
{
	Item(type : String, value : String, children : VariableNameList);
	NoItem;
}

enum VariableName
{
	Variable(name : String, fullName : String, isStatic : Bool, value : VariableValue);
}

enum VariableNameList
{
	Terminator;
	Element(variable : VariableName, next: VariableNameList);
}

/**
 * Messages are delivered by the debugger thread in response to Commands and
 * also spuriously for thread events.
 **/
enum Message
{
    // Errors
    ErrorInternal(details : String);
    ErrorNoSuchThread(number : Int);
    ErrorNoSuchFile(fileName : String);
    ErrorNoSuchBreakpoint(number : Int);
    ErrorBadClassNameRegex(details : String);
    ErrorBadFunctionNameRegex(details : String);
    ErrorNoMatchingFunctions(className : String, functionName : String,
                             unresolvableClasses : StringList);
    ErrorBadCount(count : Int);
    ErrorCurrentThreadNotStopped(threadNumber : Int);
    ErrorEvaluatingExpression(details : String);

    // Normal messages
    OK;
    Exited;
    Detached;
    Files(list : StringList);
    Classes(list : StringList);
    MemBytes(bytes : Int);
    Compacted(bytesBefore : Int, bytesAfter : Int);
    Collected(bytesBefore : Int, bytesAfter : Int);
    CurrentThread(number : Int);
    FileLineBreakpointNumber(number : Int);
    ClassFunctionBreakpointNumber(number : Int, 
                                  unresolvableClasses : StringList);
    Breakpoints(list : BreakpointList);
    BreakpointDescription(number : Int, list : BreakpointLocationList);
    BreakpointStatuses(list : BreakpointStatusList);
    Continued(count : Int);
    ThreadsWhere(list : ThreadWhereList);
    CurrentFrame(number : Int);
    Variables(list : StringList);
    Value(expression : String, type : String, value : String);

    // Asynchronously delivered on thread events
    ThreadCreated(number : Int);
    ThreadTerminated(number : Int);
    ThreadStarted(number : Int);
    ThreadStopped(number : Int, className : String, functionName : String,
                  fileName : String, lineNumber : Int);

	MessageId(id : Int, message : Message);
	Variable(name : String, value : VariableValue);
}
