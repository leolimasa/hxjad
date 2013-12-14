package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Sys extends haxe.lang.HxObject
{
	public    Sys(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Sys()
	{
		haxe.root.Sys.__hx_ctor__Sys(this);
	}
	
	
	public static   void __hx_ctor__Sys(haxe.root.Sys __temp_me8)
	{
		{
		}
		
	}
	
	
	public static  java.lang.String[] _args;
	
	public static   haxe.root.Array<java.lang.String> args()
	{
		if (( haxe.root.Sys._args == null )) 
		{
			return new haxe.root.Array<java.lang.String>(new java.lang.String[]{});
		}
		
		return haxe.java.Lib.array(haxe.root.Sys._args);
	}
	
	
	public static   void sleep(double seconds)
	{
		try 
		{
			java.lang.Thread.sleep(((long) (( seconds * 1000 )) ));
		}
		catch (java.lang.Throwable __temp_catchallException79)
		{
			java.lang.Object __temp_catchall80 = __temp_catchallException79;
			if (( __temp_catchall80 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall80 = ((haxe.lang.HaxeException) (__temp_catchallException79) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall80;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static   void exit(int code)
	{
		java.lang.System.exit(((int) (code) ));
	}
	
	
	public static   haxe.io.Input stdin()
	{
		java.io.InputStream _in = ((java.io.InputStream) (haxe.lang.Runtime.getField(java.lang.System.class, "in", false)) );
		return new haxe.java.io.NativeInput(((java.io.InputStream) (_in) ));
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Sys(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Sys();
	}
	
	
}


