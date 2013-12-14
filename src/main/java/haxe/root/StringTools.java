package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringTools extends haxe.lang.HxObject
{
	public    StringTools(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    StringTools()
	{
		haxe.root.StringTools.__hx_ctor__StringTools(this);
	}
	
	
	public static   void __hx_ctor__StringTools(haxe.root.StringTools __temp_me7)
	{
		{
		}
		
	}
	
	
	public static   java.lang.String urlEncode(java.lang.String s)
	{
		try 
		{
			return java.net.URLEncoder.encode(s, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException75)
		{
			java.lang.Object __temp_catchall76 = __temp_catchallException75;
			if (( __temp_catchall76 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall76 = ((haxe.lang.HaxeException) (__temp_catchallException75) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall76;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static   java.lang.String urlDecode(java.lang.String s)
	{
		try 
		{
			return java.net.URLDecoder.decode(s, "UTF-8");
		}
		catch (java.lang.Throwable __temp_catchallException77)
		{
			java.lang.Object __temp_catchall78 = __temp_catchallException77;
			if (( __temp_catchall78 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall78 = ((haxe.lang.HaxeException) (__temp_catchallException77) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall78;
				throw haxe.lang.HaxeException.wrap(e);
			}
			
		}
		
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.StringTools(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.StringTools();
	}
	
	
}


