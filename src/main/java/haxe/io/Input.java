package haxe.io;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Input extends haxe.lang.HxObject
{
	public    Input(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Input()
	{
		haxe.io.Input.__hx_ctor_haxe_io_Input(this);
	}
	
	
	public static   void __hx_ctor_haxe_io_Input(haxe.io.Input __temp_me16)
	{
		{
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.io.Input(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.io.Input();
	}
	
	
	public   int readByte()
	{
		throw haxe.lang.HaxeException.wrap("Not implemented");
	}
	
	
	public   int readBytes(haxe.io.Bytes s, int pos, int len)
	{
		int k = len;
		byte[] b = s.b;
		if (( ( ( pos < 0 ) || ( len < 0 ) ) || ( ( pos + len ) > s.length ) )) 
		{
			throw haxe.lang.HaxeException.wrap(haxe.io.Error.OutsideBounds);
		}
		
		while (( k > 0 ))
		{
			b[pos] = ((byte) (this.readByte()) );
			pos++;
			k--;
		}
		
		return len;
	}
	
	
	public   void close()
	{
		{
		}
		
	}
	
	
	public   haxe.io.Bytes read(int nbytes)
	{
		haxe.io.Bytes s = haxe.io.Bytes.alloc(nbytes);
		int p = 0;
		while (( nbytes > 0 ))
		{
			int k = this.readBytes(s, p, nbytes);
			if (( k == 0 )) 
			{
				throw haxe.lang.HaxeException.wrap(haxe.io.Error.Blocked);
			}
			
			p += k;
			nbytes -= k;
		}
		
		return s;
	}
	
	
	public   java.lang.String readLine()
	{
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		int last = 0;
		java.lang.String s = null;
		try 
		{
			while (( (last = this.readByte()) != 10 ))
			{
				buf.addChar(last);
			}
			
			s = buf.toString();
			if (haxe.lang.Runtime.eq(haxe.lang.StringExt.charCodeAt(s, ( s.length() - 1 )), 13)) 
			{
				s = haxe.lang.StringExt.substr(s, 0, -1);
			}
			
		}
		catch (java.lang.Throwable __temp_catchallException179)
		{
			java.lang.Object __temp_catchall180 = __temp_catchallException179;
			if (( __temp_catchall180 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall180 = ((haxe.lang.HaxeException) (__temp_catchallException179) ).obj;
			}
			
			if (( __temp_catchall180 instanceof haxe.io.Eof )) 
			{
				haxe.io.Eof e = ((haxe.io.Eof) (__temp_catchall180) );
				{
					s = buf.toString();
					if (( s.length() == 0 )) 
					{
						throw haxe.lang.HaxeException.wrap(e);
					}
					
				}
				
			}
			 else 
			{
				throw haxe.lang.HaxeException.wrap(__temp_catchallException179);
			}
			
		}
		
		
		return s;
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef181 = true;
			switch (field.hashCode())
			{
				case -867777878:
				{
					if (field.equals("readLine")) 
					{
						__temp_executeDef181 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("readLine"))) );
					}
					
					break;
				}
				
				
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef181 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("readByte"))) );
					}
					
					break;
				}
				
				
				case 3496342:
				{
					if (field.equals("read")) 
					{
						__temp_executeDef181 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("read"))) );
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef181 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("readBytes"))) );
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef181 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("close"))) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef181) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef182 = true;
			switch (field.hashCode())
			{
				case -867777878:
				{
					if (field.equals("readLine")) 
					{
						__temp_executeDef182 = false;
						return this.readLine();
					}
					
					break;
				}
				
				
				case -868060226:
				{
					if (field.equals("readByte")) 
					{
						__temp_executeDef182 = false;
						return this.readByte();
					}
					
					break;
				}
				
				
				case 3496342:
				{
					if (field.equals("read")) 
					{
						__temp_executeDef182 = false;
						return this.read(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ));
					}
					
					break;
				}
				
				
				case -1140063115:
				{
					if (field.equals("readBytes")) 
					{
						__temp_executeDef182 = false;
						return this.readBytes(((haxe.io.Bytes) (dynargs.__get(0)) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ));
					}
					
					break;
				}
				
				
				case 94756344:
				{
					if (field.equals("close")) 
					{
						__temp_executeDef182 = false;
						this.close();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef182) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
}


