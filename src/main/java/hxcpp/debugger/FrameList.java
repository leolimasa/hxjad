package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class FrameList extends haxe.lang.Enum
{
	static 
	{
		FrameList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Frame"});
		FrameList.Terminator = new FrameList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    FrameList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static FrameList Terminator;
	
	public static FrameList Frame(boolean isCurrent, int number, java.lang.String className, java.lang.String functionName, java.lang.String fileName, int lineNumber, FrameList next)
	{
		return new FrameList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{isCurrent, number, className, functionName, fileName, lineNumber, next})) ));
	}
	
	
}


