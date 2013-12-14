package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringRefl
{
	static 
	{
		haxe.lang.StringRefl.fields = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"length", "toUpperCase", "toLowerCase", "charAt", "charCodeAt", "indexOf", "lastIndexOf", "split", "substr", "substring"});
	}
	public    StringRefl()
	{
		{
		}
		
	}
	
	
	public static  haxe.root.Array<java.lang.String> fields;
	
	public static   java.lang.Object handleGetField(java.lang.String str, java.lang.String f, boolean throwErrors)
	{
		{
			java.lang.String __temp_svar197 = (f);
			boolean __temp_executeDef198 = true;
			switch (__temp_svar197.hashCode())
			{
				case -1106363674:
				{
					if (__temp_svar197.equals("length")) 
					{
						__temp_executeDef198 = false;
						return str.length();
					}
					
					break;
				}
				
				
				case 530542161:
				{
					if (__temp_svar197.equals("substring")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case -399551817:
				{
					if (__temp_svar197.equals("toUpperCase")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case -891529231:
				{
					if (__temp_svar197.equals("substr")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case -1137582698:
				{
					if (__temp_svar197.equals("toLowerCase")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case 109648666:
				{
					if (__temp_svar197.equals("split")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case -1361633751:
				{
					if (__temp_svar197.equals("charAt")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case -467511597:
				{
					if (__temp_svar197.equals("lastIndexOf")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case 397153782:
				{
					if (__temp_svar197.equals("charCodeAt")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
				case 1943291465:
				{
					if (__temp_svar197.equals("indexOf")) 
					{
						__temp_executeDef198 = false;
						return new haxe.lang.Closure(((java.lang.Object) (str) ), haxe.lang.Runtime.toString(f));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef198) 
			{
				if (throwErrors) 
				{
					throw haxe.lang.HaxeException.wrap(( ( "Field not found: \'" + f ) + "\' in String" ));
				}
				 else 
				{
					return null;
				}
				
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	public static   java.lang.Object handleCallField(java.lang.String str, java.lang.String f, haxe.root.Array args)
	{
		haxe.root.Array _args = new haxe.root.Array(new java.lang.Object[]{str});
		if (( args == null )) 
		{
			args = _args;
		}
		 else 
		{
			args = _args.concat(args);
		}
		
		return haxe.lang.Runtime.slowCallField(haxe.lang.StringExt.class, f, args);
	}
	
	
}


