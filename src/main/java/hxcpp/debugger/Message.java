package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Message extends haxe.lang.Enum
{
	static 
	{
		Message.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"ErrorInternal", "ErrorNoSuchThread", "ErrorNoSuchFile", "ErrorNoSuchBreakpoint", "ErrorBadClassNameRegex", "ErrorBadFunctionNameRegex", "ErrorNoMatchingFunctions", "ErrorBadCount", "ErrorCurrentThreadNotStopped", "ErrorEvaluatingExpression", "OK", "Exited", "Detached", "Files", "Classes", "MemBytes", "Compacted", "Collected", "CurrentThread", "FileLineBreakpointNumber", "ClassFunctionBreakpointNumber", "Breakpoints", "BreakpointDescription", "BreakpointStatuses", "Continued", "ThreadsWhere", "CurrentFrame", "Variables", "Value", "ThreadCreated", "ThreadTerminated", "ThreadStarted", "ThreadStopped", "MessageId", "Variable"});
		Message.OK = new Message(((int) (10) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Message.Exited = new Message(((int) (11) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Message.Detached = new Message(((int) (12) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    Message(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static Message ErrorInternal(java.lang.String details)
	{
		return new Message(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static Message ErrorNoSuchThread(int number)
	{
		return new Message(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ErrorNoSuchFile(java.lang.String fileName)
	{
		return new Message(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName})) ));
	}
	
	
	public static Message ErrorNoSuchBreakpoint(int number)
	{
		return new Message(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ErrorBadClassNameRegex(java.lang.String details)
	{
		return new Message(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static Message ErrorBadFunctionNameRegex(java.lang.String details)
	{
		return new Message(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static Message ErrorNoMatchingFunctions(java.lang.String className, java.lang.String functionName, StringList unresolvableClasses)
	{
		return new Message(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName, unresolvableClasses})) ));
	}
	
	
	public static Message ErrorBadCount(int count)
	{
		return new Message(((int) (7) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Message ErrorCurrentThreadNotStopped(int threadNumber)
	{
		return new Message(((int) (8) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{threadNumber})) ));
	}
	
	
	public static Message ErrorEvaluatingExpression(java.lang.String details)
	{
		return new Message(((int) (9) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{details})) ));
	}
	
	
	public static Message OK;
	
	public static Message Exited;
	
	public static Message Detached;
	
	public static Message Files(StringList list)
	{
		return new Message(((int) (13) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message Classes(StringList list)
	{
		return new Message(((int) (14) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message MemBytes(int bytes)
	{
		return new Message(((int) (15) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytes})) ));
	}
	
	
	public static Message Compacted(int bytesBefore, int bytesAfter)
	{
		return new Message(((int) (16) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytesBefore, bytesAfter})) ));
	}
	
	
	public static Message Collected(int bytesBefore, int bytesAfter)
	{
		return new Message(((int) (17) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{bytesBefore, bytesAfter})) ));
	}
	
	
	public static Message CurrentThread(int number)
	{
		return new Message(((int) (18) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message FileLineBreakpointNumber(int number)
	{
		return new Message(((int) (19) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ClassFunctionBreakpointNumber(int number, StringList unresolvableClasses)
	{
		return new Message(((int) (20) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, unresolvableClasses})) ));
	}
	
	
	public static Message Breakpoints(BreakpointList list)
	{
		return new Message(((int) (21) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message BreakpointDescription(int number, BreakpointLocationList list)
	{
		return new Message(((int) (22) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, list})) ));
	}
	
	
	public static Message BreakpointStatuses(BreakpointStatusList list)
	{
		return new Message(((int) (23) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message Continued(int count)
	{
		return new Message(((int) (24) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Message ThreadsWhere(ThreadWhereList list)
	{
		return new Message(((int) (25) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message CurrentFrame(int number)
	{
		return new Message(((int) (26) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message Variables(StringList list)
	{
		return new Message(((int) (27) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{list})) ));
	}
	
	
	public static Message Value(java.lang.String expression, java.lang.String type, java.lang.String value)
	{
		return new Message(((int) (28) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{expression, type, value})) ));
	}
	
	
	public static Message ThreadCreated(int number)
	{
		return new Message(((int) (29) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ThreadTerminated(int number)
	{
		return new Message(((int) (30) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ThreadStarted(int number)
	{
		return new Message(((int) (31) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Message ThreadStopped(int number, java.lang.String className, java.lang.String functionName, java.lang.String fileName, int lineNumber)
	{
		return new Message(((int) (32) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, className, functionName, fileName, lineNumber})) ));
	}
	
	
	public static Message MessageId(int id, Message message)
	{
		return new Message(((int) (33) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{id, message})) ));
	}
	
	
	public static Message Variable(java.lang.String name, VariableValue value)
	{
		return new Message(((int) (34) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{name, value})) ));
	}
	
	
}


