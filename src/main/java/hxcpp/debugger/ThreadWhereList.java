package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ThreadWhereList extends haxe.lang.Enum
{
	static 
	{
		ThreadWhereList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Where"});
		ThreadWhereList.Terminator = new ThreadWhereList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    ThreadWhereList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static ThreadWhereList Terminator;
	
	public static ThreadWhereList Where(int number, ThreadStatus status, FrameList frameList, ThreadWhereList next)
	{
		return new ThreadWhereList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number, status, frameList, next})) ));
	}
	
	
}


