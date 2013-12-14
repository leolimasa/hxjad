package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class BreakpointStatusList extends haxe.lang.Enum
{
	static 
	{
		BreakpointStatusList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Nonexistent", "Disabled", "AlreadyDisabled", "Enabled", "AlreadyEnabled", "Deleted"});
		BreakpointStatusList.Terminator = new BreakpointStatusList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    BreakpointStatusList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static BreakpointStatusList Terminator;
	
	public static BreakpointStatusList Nonexistent(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static BreakpointStatusList Disabled(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static BreakpointStatusList AlreadyDisabled(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static BreakpointStatusList Enabled(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static BreakpointStatusList AlreadyEnabled(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
	public static BreakpointStatusList Deleted(int number, BreakpointStatusList next)
	{
		return new BreakpointStatusList(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, next})) ));
	}
	
	
}


