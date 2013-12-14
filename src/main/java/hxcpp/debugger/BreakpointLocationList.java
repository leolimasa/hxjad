package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointLocationList extends haxe.lang.Enum
{
	static 
	{
		BreakpointLocationList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "FileLine", "ClassFunction"});
		BreakpointLocationList.Terminator = new BreakpointLocationList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointLocationList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static BreakpointLocationList Terminator;
	
	public static BreakpointLocationList FileLine(java.lang.String fileName, int lineNumber, BreakpointLocationList next)
	{
		return new BreakpointLocationList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{fileName, lineNumber, next})) ));
	}
	
	
	public static BreakpointLocationList ClassFunction(java.lang.String className, java.lang.String functionName, BreakpointLocationList next)
	{
		return new BreakpointLocationList(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{className, functionName, next})) ));
	}
	
	
}


