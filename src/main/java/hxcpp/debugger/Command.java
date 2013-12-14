package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Command extends haxe.lang.Enum
{
	static 
	{
		Command.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Exit", "Detach", "Files", "Classes", "Mem", "Compact", "Collect", "SetCurrentThread", "AddFileLineBreakpoint", "AddClassFunctionBreakpoint", "ListBreakpoints", "DescribeBreakpoint", "DisableAllBreakpoints", "DisableBreakpointRange", "EnableAllBreakpoints", "EnableBreakpointRange", "DeleteAllBreakpoints", "DeleteBreakpointRange", "BreakNow", "Continue", "Step", "Next", "Finish", "WhereCurrentThread", "WhereAllThreads", "Up", "Down", "SetFrame", "Variables", "PrintExpression", "SetExpression", "CommandId", "GetExpression"});
		Command.Exit = new Command(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Detach = new Command(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Files = new Command(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Classes = new Command(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Mem = new Command(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Compact = new Command(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.Collect = new Command(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.DisableAllBreakpoints = new Command(((int) (12) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.EnableAllBreakpoints = new Command(((int) (14) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.DeleteAllBreakpoints = new Command(((int) (16) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.BreakNow = new Command(((int) (18) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		Command.WhereAllThreads = new Command(((int) (24) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    Command(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static Command Exit;
	
	public static Command Detach;
	
	public static Command Files;
	
	public static Command Classes;
	
	public static Command Mem;
	
	public static Command Compact;
	
	public static Command Collect;
	
	public static Command SetCurrentThread(int number)
	{
		return new Command(((int) (7) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Command AddFileLineBreakpoint(java.lang.String fileName, int lineNumber)
	{
		return new Command(((int) (8) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName, lineNumber})) ));
	}
	
	
	public static Command AddClassFunctionBreakpoint(java.lang.String className, java.lang.String functionName)
	{
		return new Command(((int) (9) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName})) ));
	}
	
	
	public static Command ListBreakpoints(boolean enabled, boolean disabled)
	{
		return new Command(((int) (10) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{enabled, disabled})) ));
	}
	
	
	public static Command DescribeBreakpoint(int number)
	{
		return new Command(((int) (11) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Command DisableAllBreakpoints;
	
	public static Command DisableBreakpointRange(int first, int last)
	{
		return new Command(((int) (13) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static Command EnableAllBreakpoints;
	
	public static Command EnableBreakpointRange(int first, int last)
	{
		return new Command(((int) (15) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static Command DeleteAllBreakpoints;
	
	public static Command DeleteBreakpointRange(int first, int last)
	{
		return new Command(((int) (17) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{first, last})) ));
	}
	
	
	public static Command BreakNow;
	
	public static Command Continue(int count)
	{
		return new Command(((int) (19) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command Step(int count)
	{
		return new Command(((int) (20) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command Next(int count)
	{
		return new Command(((int) (21) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command Finish(int count)
	{
		return new Command(((int) (22) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command WhereCurrentThread(boolean unsafe)
	{
		return new Command(((int) (23) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe})) ));
	}
	
	
	public static Command WhereAllThreads;
	
	public static Command Up(int count)
	{
		return new Command(((int) (25) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command Down(int count)
	{
		return new Command(((int) (26) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{count})) ));
	}
	
	
	public static Command SetFrame(int number)
	{
		return new Command(((int) (27) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static Command Variables(boolean unsafe)
	{
		return new Command(((int) (28) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe})) ));
	}
	
	
	public static Command PrintExpression(boolean unsafe, java.lang.String expression)
	{
		return new Command(((int) (29) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, expression})) ));
	}
	
	
	public static Command SetExpression(boolean unsafe, java.lang.String lhs, java.lang.String rhs)
	{
		return new Command(((int) (30) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, lhs, rhs})) ));
	}
	
	
	public static Command CommandId(int id, Command command)
	{
		return new Command(((int) (31) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{id, command})) ));
	}
	
	
	public static Command GetExpression(boolean unsafe, java.lang.String expression)
	{
		return new Command(((int) (32) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{unsafe, expression})) ));
	}
	
	
}


