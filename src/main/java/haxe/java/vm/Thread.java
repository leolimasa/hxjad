package haxe.java.vm;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Thread extends haxe.lang.HxObject
{
	public    Thread(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Thread()
	{
		haxe.java.vm.Thread.__hx_ctor_haxe_java_vm_Thread(this);
	}
	
	
	public static   void __hx_ctor_haxe_java_vm_Thread(haxe.java.vm.Thread __temp_me27)
	{
		__temp_me27.messages = new haxe.java.vm.Deque();
	}
	
	
	public static   haxe.java.vm.Thread create(haxe.lang.Function fn)
	{
		haxe.java.vm.Thread ret = new haxe.java.vm.Thread();
		haxe.java.vm.HaxeThread t = new haxe.java.vm.HaxeThread(((haxe.java.vm.Thread) (ret) ), ((haxe.lang.Function) (fn) ));
		t.start();
		return ret;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.java.vm.Thread(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.java.vm.Thread();
	}
	
	
	public  haxe.java.vm.Deque messages;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef205 = true;
			switch (field.hashCode())
			{
				case -462094004:
				{
					if (field.equals("messages")) 
					{
						__temp_executeDef205 = false;
						this.messages = ((haxe.java.vm.Deque) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef205) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef206 = true;
			switch (field.hashCode())
			{
				case -462094004:
				{
					if (field.equals("messages")) 
					{
						__temp_executeDef206 = false;
						return this.messages;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef206) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("messages");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


