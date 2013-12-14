package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointList extends haxe.lang.Enum
{
	static 
	{
		BreakpointList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Breakpoint"});
		BreakpointList.Terminator = new BreakpointList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static BreakpointList Terminator;
	
	public static BreakpointList Breakpoint(int number, java.lang.String description, boolean enabled, boolean multi, BreakpointList next)
	{
		return new BreakpointList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, description, enabled, multi, next})) ));
	}
	
	
}


