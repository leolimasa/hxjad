package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ThreadStatus extends haxe.lang.Enum
{
	static 
	{
		ThreadStatus.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Running", "StoppedImmediate", "StoppedBreakpoint", "StoppedUncaughtException", "StoppedCriticalError"});
		ThreadStatus.Running = new ThreadStatus(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		ThreadStatus.StoppedImmediate = new ThreadStatus(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		ThreadStatus.StoppedUncaughtException = new ThreadStatus(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    ThreadStatus(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static ThreadStatus Running;
	
	public static ThreadStatus StoppedImmediate;
	
	public static ThreadStatus StoppedBreakpoint(int number)
	{
		return new ThreadStatus(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{number})) ));
	}
	
	
	public static ThreadStatus StoppedUncaughtException;
	
	public static ThreadStatus StoppedCriticalError(java.lang.String description)
	{
		return new ThreadStatus(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{description})) ));
	}
	
	
}


