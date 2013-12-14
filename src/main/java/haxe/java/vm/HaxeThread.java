package haxe.java.vm;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class HaxeThread extends java.lang.Thread implements haxe.lang.IHxObject
{
	public    HaxeThread(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public    HaxeThread(haxe.java.vm.Thread hxThread, haxe.lang.Function run)
	{
		super();
		this.threadObject = hxThread;
		this.runFunction = run;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.java.vm.HaxeThread(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.java.vm.HaxeThread(((haxe.java.vm.Thread) (arr.__get(0)) ), ((haxe.lang.Function) (arr.__get(1)) ));
	}
	
	
	public  haxe.java.vm.Thread threadObject;
	
	public  haxe.lang.Function runFunction;
	
	@Override public   void run()
	{
		this.runFunction.__hx_invoke0_o();
	}
	
	
	public   boolean __hx_deleteField(java.lang.String field)
	{
		return false;
	}
	
	
	public   java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		if (isCheck) 
		{
			return haxe.lang.Runtime.undefined;
		}
		 else 
		{
			if (throwErrors) 
			{
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			 else 
			{
				return null;
			}
			
		}
		
	}
	
	
	public   double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		if (throwErrors) 
		{
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		 else 
		{
			return 0.0;
		}
		
	}
	
	
	public   java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public   double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			{
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef208 = true;
			switch (field.hashCode())
			{
				case -17180797:
				{
					if (field.equals("runFunction")) 
					{
						__temp_executeDef208 = false;
						this.runFunction = ((haxe.lang.Function) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -742232599:
				{
					if (field.equals("threadObject")) 
					{
						__temp_executeDef208 = false;
						this.threadObject = ((haxe.java.vm.Thread) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef208) 
			{
				return this.__hx_lookupSetField(field, value);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef209 = true;
			switch (field.hashCode())
			{
				case -1671974670:
				{
					if (field.equals("setUncaughtExceptionHandler")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setUncaughtExceptionHandler"))) );
					}
					
					break;
				}
				
				
				case -742232599:
				{
					if (field.equals("threadObject")) 
					{
						__temp_executeDef209 = false;
						return this.threadObject;
					}
					
					break;
				}
				
				
				case -326440986:
				{
					if (field.equals("getUncaughtExceptionHandler")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getUncaughtExceptionHandler"))) );
					}
					
					break;
				}
				
				
				case -17180797:
				{
					if (field.equals("runFunction")) 
					{
						__temp_executeDef209 = false;
						return this.runFunction;
					}
					
					break;
				}
				
				
				case 1965583067:
				{
					if (field.equals("getState")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getState"))) );
					}
					
					break;
				}
				
				
				case 113291:
				{
					if (field.equals("run")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("run"))) );
					}
					
					break;
				}
				
				
				case 98245393:
				{
					if (field.equals("getId")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getId"))) );
					}
					
					break;
				}
				
				
				case 94756189:
				{
					if (field.equals("clone")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("clone"))) );
					}
					
					break;
				}
				
				
				case 1728531347:
				{
					if (field.equals("getStackTrace")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getStackTrace"))) );
					}
					
					break;
				}
				
				
				case 109757538:
				{
					if (field.equals("start")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("start"))) );
					}
					
					break;
				}
				
				
				case -579858818:
				{
					if (field.equals("setContextClassLoader")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setContextClassLoader"))) );
					}
					
					break;
				}
				
				
				case 3540994:
				{
					if (field.equals("stop")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("stop"))) );
					}
					
					break;
				}
				
				
				case 1178897522:
				{
					if (field.equals("getContextClassLoader")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getContextClassLoader"))) );
					}
					
					break;
				}
				
				
				case 503000675:
				{
					if (field.equals("interrupt")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("interrupt"))) );
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("toString"))) );
					}
					
					break;
				}
				
				
				case 937282232:
				{
					if (field.equals("isInterrupted")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("isInterrupted"))) );
					}
					
					break;
				}
				
				
				case 237150348:
				{
					if (field.equals("checkAccess")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("checkAccess"))) );
					}
					
					break;
				}
				
				
				case 1557372922:
				{
					if (field.equals("destroy")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("destroy"))) );
					}
					
					break;
				}
				
				
				case -665319346:
				{
					if (field.equals("isDaemon")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("isDaemon"))) );
					}
					
					break;
				}
				
				
				case 2054309315:
				{
					if (field.equals("isAlive")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("isAlive"))) );
					}
					
					break;
				}
				
				
				case 142044550:
				{
					if (field.equals("setDaemon")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setDaemon"))) );
					}
					
					break;
				}
				
				
				case -1852006340:
				{
					if (field.equals("suspend")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("suspend"))) );
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("join"))) );
					}
					
					break;
				}
				
				
				case -934426579:
				{
					if (field.equals("resume")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("resume"))) );
					}
					
					break;
				}
				
				
				case 1346802879:
				{
					if (field.equals("countStackFrames")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("countStackFrames"))) );
					}
					
					break;
				}
				
				
				case 823859238:
				{
					if (field.equals("setPriority")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setPriority"))) );
					}
					
					break;
				}
				
				
				case 1268544863:
				{
					if (field.equals("getThreadGroup")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getThreadGroup"))) );
					}
					
					break;
				}
				
				
				case 912439066:
				{
					if (field.equals("getPriority")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getPriority"))) );
					}
					
					break;
				}
				
				
				case -75308287:
				{
					if (field.equals("getName")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("getName"))) );
					}
					
					break;
				}
				
				
				case 1984801293:
				{
					if (field.equals("setName")) 
					{
						__temp_executeDef209 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setName"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef209) 
			{
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			{
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			int __temp_hash212 = field.hashCode();
			boolean __temp_executeDef211 = true;
			switch (__temp_hash212)
			{
				case -1671974670:case -326440986:case 1965583067:case 98245393:case 1728531347:case -579858818:case 1178897522:case -1776922004:case 237150348:case -665319346:case 142044550:case 3267882:case 1346802879:case 1268544863:case -75308287:case 1984801293:case 912439066:case 823859238:case -934426579:case -1852006340:case 2054309315:case 1557372922:case 937282232:case 503000675:case 3540994:case 109757538:case 94756189:case 113291:
				{
					if (( (( ( __temp_hash212 == -1671974670 ) && field.equals("setUncaughtExceptionHandler") )) || ( (( ( __temp_hash212 == -326440986 ) && field.equals("getUncaughtExceptionHandler") )) || ( (( ( __temp_hash212 == 1965583067 ) && field.equals("getState") )) || ( (( ( __temp_hash212 == 98245393 ) && field.equals("getId") )) || ( (( ( __temp_hash212 == 1728531347 ) && field.equals("getStackTrace") )) || ( (( ( __temp_hash212 == -579858818 ) && field.equals("setContextClassLoader") )) || ( (( ( __temp_hash212 == 1178897522 ) && field.equals("getContextClassLoader") )) || ( (( ( __temp_hash212 == -1776922004 ) && field.equals("toString") )) || ( (( ( __temp_hash212 == 237150348 ) && field.equals("checkAccess") )) || ( (( ( __temp_hash212 == -665319346 ) && field.equals("isDaemon") )) || ( (( ( __temp_hash212 == 142044550 ) && field.equals("setDaemon") )) || ( (( ( __temp_hash212 == 3267882 ) && field.equals("join") )) || ( (( ( __temp_hash212 == 1346802879 ) && field.equals("countStackFrames") )) || ( (( ( __temp_hash212 == 1268544863 ) && field.equals("getThreadGroup") )) || ( (( ( __temp_hash212 == -75308287 ) && field.equals("getName") )) || ( (( ( __temp_hash212 == 1984801293 ) && field.equals("setName") )) || ( (( ( __temp_hash212 == 912439066 ) && field.equals("getPriority") )) || ( (( ( __temp_hash212 == 823859238 ) && field.equals("setPriority") )) || ( (( ( __temp_hash212 == -934426579 ) && field.equals("resume") )) || ( (( ( __temp_hash212 == -1852006340 ) && field.equals("suspend") )) || ( (( ( __temp_hash212 == 2054309315 ) && field.equals("isAlive") )) || ( (( ( __temp_hash212 == 1557372922 ) && field.equals("destroy") )) || ( (( ( __temp_hash212 == 937282232 ) && field.equals("isInterrupted") )) || ( (( ( __temp_hash212 == 503000675 ) && field.equals("interrupt") )) || ( (( ( __temp_hash212 == 3540994 ) && field.equals("stop") )) || ( (( ( __temp_hash212 == 109757538 ) && field.equals("start") )) || ( (( ( __temp_hash212 == 94756189 ) && field.equals("clone") )) || field.equals("run") ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						__temp_executeDef211 = false;
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef211) 
			{
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("runFunction");
		baseArr.push("threadObject");
	}
	
	
}


