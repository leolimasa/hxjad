package haxe;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Unserializer extends haxe.lang.HxObject
{
	static 
	{
		haxe.Unserializer.DEFAULT_RESOLVER = haxe.root.Type.class;
		haxe.Unserializer.BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789%:";
		haxe.Unserializer.CODES = null;
	}
	public    Unserializer(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    Unserializer(java.lang.String buf)
	{
		haxe.Unserializer.__hx_ctor_haxe_Unserializer(this, buf);
	}
	
	
	public static   void __hx_ctor_haxe_Unserializer(haxe.Unserializer __temp_me11, java.lang.String buf)
	{
		__temp_me11.buf = buf;
		__temp_me11.length = buf.length();
		__temp_me11.pos = 0;
		__temp_me11.scache = new haxe.root.Array<java.lang.String>();
		__temp_me11.cache = new haxe.root.Array();
		java.lang.Object r = haxe.Unserializer.DEFAULT_RESOLVER;
		if (( r == null )) 
		{
			r = haxe.root.Type.class;
			haxe.Unserializer.DEFAULT_RESOLVER = r;
		}
		
		__temp_me11.setResolver(r);
	}
	
	
	public static  java.lang.Object DEFAULT_RESOLVER;
	
	public static  java.lang.String BASE64;
	
	public static  haxe.root.Array<java.lang.Object> CODES;
	
	public static   haxe.root.Array<java.lang.Object> initCodes()
	{
		haxe.root.Array<java.lang.Object> codes = new haxe.root.Array<java.lang.Object>();
		{
			int _g1 = 0;
			int _g = haxe.Unserializer.BASE64.length();
			while (( _g1 < _g ))
			{
				int i = _g1++;
				int __temp_stmt124 = 0;
				{
					java.lang.String s = haxe.Unserializer.BASE64;
					__temp_stmt124 = ( (( i < s.length() )) ? (((int) (s.charAt(i)) )) : (-1) );
				}
				
				codes.__set(__temp_stmt124, i);
			}
			
		}
		
		return codes;
	}
	
	
	public static   java.lang.Object run(java.lang.String v)
	{
		return new haxe.Unserializer(haxe.lang.Runtime.toString(v)).unserialize();
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.Unserializer(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.Unserializer(haxe.lang.Runtime.toString(arr.__get(0)));
	}
	
	
	public  java.lang.String buf;
	
	public  int pos;
	
	public  int length;
	
	public  haxe.root.Array cache;
	
	public  haxe.root.Array<java.lang.String> scache;
	
	public  java.lang.Object resolver;
	
	public   void setResolver(java.lang.Object r)
	{
		if (( r == null )) 
		{
			{
				haxe.lang.Function __temp_odecl89 = ( (( haxe.Unserializer_setResolver_127__Fun.__hx_current != null )) ? (haxe.Unserializer_setResolver_127__Fun.__hx_current) : (haxe.Unserializer_setResolver_127__Fun.__hx_current = ((haxe.Unserializer_setResolver_127__Fun) (new haxe.Unserializer_setResolver_127__Fun()) )) );
				haxe.lang.Function __temp_odecl90 = ( (( haxe.Unserializer_setResolver_128__Fun.__hx_current != null )) ? (haxe.Unserializer_setResolver_128__Fun.__hx_current) : (haxe.Unserializer_setResolver_128__Fun.__hx_current = ((haxe.Unserializer_setResolver_128__Fun) (new haxe.Unserializer_setResolver_128__Fun()) )) );
				this.resolver = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"resolveClass", "resolveEnum"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{__temp_odecl89, __temp_odecl90}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}));
			}
			
		}
		 else 
		{
			this.resolver = r;
		}
		
	}
	
	
	public   int readDigits()
	{
		int k = 0;
		boolean s = false;
		int fpos = this.pos;
		while (true)
		{
			int c = 0;
			{
				int p = this.pos;
				{
					java.lang.String s1 = this.buf;
					if (( p < s1.length() )) 
					{
						c = ((int) (s1.charAt(p)) );
					}
					 else 
					{
						c = -1;
					}
					
				}
				
			}
			
			if (( c == -1 )) 
			{
				break;
			}
			
			if (( c == 45 )) 
			{
				if (( this.pos != fpos )) 
				{
					break;
				}
				
				s = true;
				this.pos++;
				continue;
			}
			
			if (( ( c < 48 ) || ( c > 57 ) )) 
			{
				break;
			}
			
			k = ( ( k * 10 ) + (( c - 48 )) );
			this.pos++;
		}
		
		if (s) 
		{
			k *= -1;
		}
		
		return k;
	}
	
	
	public   void unserializeObject(java.lang.Object o)
	{
		while (true)
		{
			if (( this.pos >= this.length )) 
			{
				throw haxe.lang.HaxeException.wrap("Invalid object");
			}
			
			int __temp_stmt91 = 0;
			{
				int p = this.pos;
				{
					java.lang.String s = this.buf;
					__temp_stmt91 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
				}
				
			}
			
			if (( __temp_stmt91 == 103 )) 
			{
				break;
			}
			
			java.lang.String k = haxe.lang.Runtime.toString(this.unserialize());
			if ( ! (( k instanceof java.lang.String )) ) 
			{
				throw haxe.lang.HaxeException.wrap("Invalid object key");
			}
			
			java.lang.Object v = this.unserialize();
			haxe.root.Reflect.setField(o, k, v);
		}
		
		this.pos++;
	}
	
	
	public   java.lang.Object unserializeEnum(java.lang.Class<java.lang.Object> edecl, java.lang.String tag)
	{
		int __temp_stmt92 = 0;
		{
			int p = this.pos++;
			{
				java.lang.String s = this.buf;
				__temp_stmt92 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
			}
			
		}
		
		if (( __temp_stmt92 != 58 )) 
		{
			throw haxe.lang.HaxeException.wrap("Invalid enum format");
		}
		
		int nargs = this.readDigits();
		if (( nargs == 0 )) 
		{
			return haxe.root.Type.createEnum(edecl, tag, null);
		}
		
		haxe.root.Array args = new haxe.root.Array();
		while (( nargs-- > 0 ))
		{
			args.push(this.unserialize());
		}
		
		return haxe.root.Type.createEnum(edecl, tag, args);
	}
	
	
	public   java.lang.Object unserialize()
	{
		{
			int _g = 0;
			{
				int p = this.pos++;
				{
					java.lang.String s = this.buf;
					if (( p < s.length() )) 
					{
						_g = ((int) (s.charAt(p)) );
					}
					 else 
					{
						_g = -1;
					}
					
				}
				
			}
			
			switch (_g)
			{
				case 110:
				{
					return null;
				}
				
				
				case 116:
				{
					return true;
				}
				
				
				case 102:
				{
					return false;
				}
				
				
				case 122:
				{
					return 0;
				}
				
				
				case 105:
				{
					return this.readDigits();
				}
				
				
				case 100:
				{
					int p1 = this.pos;
					while (true)
					{
						int c = 0;
						{
							int p = this.pos;
							{
								java.lang.String s = this.buf;
								if (( p < s.length() )) 
								{
									c = ((int) (s.charAt(p)) );
								}
								 else 
								{
									c = -1;
								}
								
							}
							
						}
						
						if (( ( ( ( c >= 43 ) && ( c < 58 ) ) || ( c == 101 ) ) || ( c == 69 ) )) 
						{
							this.pos++;
						}
						 else 
						{
							break;
						}
						
					}
					
					return haxe.root.Std.parseFloat(haxe.lang.StringExt.substr(this.buf, p1, ( this.pos - p1 )));
				}
				
				
				case 121:
				{
					int len = this.readDigits();
					int __temp_stmt95 = 0;
					{
						int p = this.pos++;
						{
							java.lang.String s = this.buf;
							__temp_stmt95 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
						}
						
					}
					
					boolean __temp_stmt94 = ( __temp_stmt95 != 58 );
					boolean __temp_boolv96 = false;
					if ( ! (__temp_stmt94) ) 
					{
						__temp_boolv96 = ( ( this.length - this.pos ) < len );
					}
					
					boolean __temp_stmt93 = ( __temp_stmt94 || __temp_boolv96 );
					if (__temp_stmt93) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid string length");
					}
					
					java.lang.String s = haxe.lang.StringExt.substr(this.buf, this.pos, len);
					this.pos += len;
					s = haxe.root.StringTools.urlDecode(s);
					this.scache.push(s);
					return s;
				}
				
				
				case 107:
				{
					return java.lang.Double.NaN;
				}
				
				
				case 109:
				{
					return java.lang.Double.NEGATIVE_INFINITY;
				}
				
				
				case 112:
				{
					return java.lang.Double.POSITIVE_INFINITY;
				}
				
				
				case 97:
				{
					java.lang.String buf = this.buf;
					haxe.root.Array a = new haxe.root.Array();
					this.cache.push(a);
					while (true)
					{
						int c = 0;
						{
							int p = this.pos;
							{
								java.lang.String s = this.buf;
								if (( p < s.length() )) 
								{
									c = ((int) (s.charAt(p)) );
								}
								 else 
								{
									c = -1;
								}
								
							}
							
						}
						
						if (( c == 104 )) 
						{
							this.pos++;
							break;
						}
						
						if (( c == 117 )) 
						{
							this.pos++;
							int n = this.readDigits();
							a.__set(( ( a.length + n ) - 1 ), null);
						}
						 else 
						{
							a.push(this.unserialize());
						}
						
					}
					
					return a;
				}
				
				
				case 111:
				{
					java.lang.Object o = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}));
					this.cache.push(o);
					this.unserializeObject(o);
					return o;
				}
				
				
				case 114:
				{
					int n = this.readDigits();
					if (( ( n < 0 ) || ( n >= this.cache.length ) )) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid reference");
					}
					
					return this.cache.__get(n);
				}
				
				
				case 82:
				{
					int n = this.readDigits();
					if (( ( n < 0 ) || ( n >= this.scache.length ) )) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid string reference");
					}
					
					return this.scache.__get(n);
				}
				
				
				case 120:
				{
					throw haxe.lang.HaxeException.wrap(this.unserialize());
				}
				
				
				case 99:
				{
					java.lang.String name = haxe.lang.Runtime.toString(this.unserialize());
					java.lang.Class cl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveClass", new haxe.root.Array(new java.lang.Object[]{name}))) );
					if (( ((java.lang.Object) (cl) ) == ((java.lang.Object) (null) ) )) 
					{
						throw haxe.lang.HaxeException.wrap(( "Class not found " + name ));
					}
					
					java.lang.Object o = haxe.root.Type.createEmptyInstance(cl);
					this.cache.push(o);
					this.unserializeObject(o);
					return o;
				}
				
				
				case 119:
				{
					java.lang.String name = haxe.lang.Runtime.toString(this.unserialize());
					java.lang.Class edecl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveEnum", new haxe.root.Array(new java.lang.Object[]{name}))) );
					if (( ((java.lang.Object) (edecl) ) == ((java.lang.Object) (null) ) )) 
					{
						throw haxe.lang.HaxeException.wrap(( "Enum not found " + name ));
					}
					
					java.lang.Object e = this.unserializeEnum(edecl, haxe.lang.Runtime.toString(this.unserialize()));
					this.cache.push(e);
					return e;
				}
				
				
				case 106:
				{
					java.lang.String name = haxe.lang.Runtime.toString(this.unserialize());
					java.lang.Class edecl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveEnum", new haxe.root.Array(new java.lang.Object[]{name}))) );
					if (( ((java.lang.Object) (edecl) ) == ((java.lang.Object) (null) ) )) 
					{
						throw haxe.lang.HaxeException.wrap(( "Enum not found " + name ));
					}
					
					this.pos++;
					int index = this.readDigits();
					java.lang.String tag = haxe.root.Type.getEnumConstructs(edecl).__get(index);
					if (( tag == null )) 
					{
						throw haxe.lang.HaxeException.wrap(( ( ( "Unknown enum index " + name ) + "@" ) + index ));
					}
					
					java.lang.Object e = this.unserializeEnum(edecl, tag);
					this.cache.push(e);
					return e;
				}
				
				
				case 108:
				{
					haxe.root.List l = new haxe.root.List();
					this.cache.push(l);
					java.lang.String buf = this.buf;
					do 
					{
						int __temp_stmt97 = 0;
						{
							int p = this.pos;
							{
								java.lang.String s = this.buf;
								__temp_stmt97 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
							}
							
						}
						
						if (( __temp_stmt97 != 104 )) 
						{
							l.add(this.unserialize());
						}
						 else 
						{
							break;
						}
						
					}
					while (true);
					this.pos++;
					return l;
				}
				
				
				case 98:
				{
					haxe.ds.StringMap h = new haxe.ds.StringMap();
					this.cache.push(h);
					java.lang.String buf = this.buf;
					do 
					{
						int __temp_stmt98 = 0;
						{
							int p = this.pos;
							{
								java.lang.String s = this.buf;
								__temp_stmt98 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
							}
							
						}
						
						if (( __temp_stmt98 != 104 )) 
						{
							java.lang.String s = haxe.lang.Runtime.toString(this.unserialize());
							h.set(s, this.unserialize());
						}
						 else 
						{
							break;
						}
						
					}
					while (true);
					this.pos++;
					return h;
				}
				
				
				case 113:
				{
					haxe.ds.IntMap h = new haxe.ds.IntMap();
					this.cache.push(h);
					java.lang.String buf = this.buf;
					int c = 0;
					{
						int p = this.pos++;
						{
							java.lang.String s = this.buf;
							if (( p < s.length() )) 
							{
								c = ((int) (s.charAt(p)) );
							}
							 else 
							{
								c = -1;
							}
							
						}
						
					}
					
					while (( c == 58 ))
					{
						int i = this.readDigits();
						h.set(i, this.unserialize());
						{
							int p = this.pos++;
							{
								java.lang.String s = this.buf;
								if (( p < s.length() )) 
								{
									c = ((int) (s.charAt(p)) );
								}
								 else 
								{
									c = -1;
								}
								
							}
							
						}
						
					}
					
					if (( c != 104 )) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid IntMap format");
					}
					
					return h;
				}
				
				
				case 77:
				{
					haxe.ds.ObjectMap h = new haxe.ds.ObjectMap();
					this.cache.push(h);
					java.lang.String buf = this.buf;
					do 
					{
						int __temp_stmt99 = 0;
						{
							int p = this.pos;
							{
								java.lang.String s = this.buf;
								__temp_stmt99 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
							}
							
						}
						
						if (( __temp_stmt99 != 104 )) 
						{
							java.lang.Object s = this.unserialize();
							h.set(s, this.unserialize());
						}
						 else 
						{
							break;
						}
						
					}
					while (true);
					this.pos++;
					return h;
				}
				
				
				case 118:
				{
					haxe.root.Date d = haxe.root.Date.fromString(haxe.lang.StringExt.substr(this.buf, this.pos, 19));
					this.cache.push(d);
					this.pos += 19;
					return d;
				}
				
				
				case 115:
				{
					int len = this.readDigits();
					java.lang.String buf = this.buf;
					int __temp_stmt102 = 0;
					{
						int p = this.pos++;
						{
							java.lang.String s = this.buf;
							__temp_stmt102 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
						}
						
					}
					
					boolean __temp_stmt101 = ( __temp_stmt102 != 58 );
					boolean __temp_boolv103 = false;
					if ( ! (__temp_stmt101) ) 
					{
						__temp_boolv103 = ( ( this.length - this.pos ) < len );
					}
					
					boolean __temp_stmt100 = ( __temp_stmt101 || __temp_boolv103 );
					if (__temp_stmt100) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid bytes length");
					}
					
					haxe.root.Array<java.lang.Object> codes = haxe.Unserializer.CODES;
					if (( codes == null )) 
					{
						codes = haxe.Unserializer.initCodes();
						haxe.Unserializer.CODES = codes;
					}
					
					int i = this.pos;
					int rest = ( len & 3 );
					int size = 0;
					size = ( ( (( len >> 2 )) * 3 ) + (( (( rest >= 2 )) ? (( rest - 1 )) : (0) )) );
					int max = ( i + (( len - rest )) );
					haxe.io.Bytes bytes = haxe.io.Bytes.alloc(size);
					int bpos = 0;
					while (( i < max ))
					{
						int __temp_stmt105 = 0;
						{
							int index = i++;
							__temp_stmt105 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt104 = codes.__get(__temp_stmt105);
						int c1 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt104)) );
						int __temp_stmt107 = 0;
						{
							int index = i++;
							__temp_stmt107 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt106 = codes.__get(__temp_stmt107);
						int c2 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt106)) );
						{
							int pos = bpos++;
							bytes.b[pos] = ((byte) (( ( c1 << 2 ) | ( c2 >> 4 ) )) );
						}
						
						int __temp_stmt109 = 0;
						{
							int index = i++;
							__temp_stmt109 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt108 = codes.__get(__temp_stmt109);
						int c3 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt108)) );
						{
							int pos = bpos++;
							bytes.b[pos] = ((byte) (( ( c2 << 4 ) | ( c3 >> 2 ) )) );
						}
						
						int __temp_stmt111 = 0;
						{
							int index = i++;
							__temp_stmt111 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt110 = codes.__get(__temp_stmt111);
						int c4 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt110)) );
						{
							int pos = bpos++;
							bytes.b[pos] = ((byte) (( ( c3 << 6 ) | c4 )) );
						}
						
					}
					
					if (( rest >= 2 )) 
					{
						int __temp_stmt113 = 0;
						{
							int index = i++;
							__temp_stmt113 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt112 = codes.__get(__temp_stmt113);
						int c1 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt112)) );
						int __temp_stmt115 = 0;
						{
							int index = i++;
							__temp_stmt115 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
						}
						
						java.lang.Object __temp_stmt114 = codes.__get(__temp_stmt115);
						int c2 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt114)) );
						{
							int pos = bpos++;
							bytes.b[pos] = ((byte) (( ( c1 << 2 ) | ( c2 >> 4 ) )) );
						}
						
						if (( rest == 3 )) 
						{
							int __temp_stmt117 = 0;
							{
								int index = i++;
								__temp_stmt117 = ( (( index < buf.length() )) ? (((int) (buf.charAt(index)) )) : (-1) );
							}
							
							java.lang.Object __temp_stmt116 = codes.__get(__temp_stmt117);
							int c3 = ((int) (haxe.lang.Runtime.toInt(__temp_stmt116)) );
							{
								int pos = bpos++;
								bytes.b[pos] = ((byte) (( ( c2 << 4 ) | ( c3 >> 2 ) )) );
							}
							
						}
						
					}
					
					this.pos += len;
					this.cache.push(bytes);
					return bytes;
				}
				
				
				case 67:
				{
					java.lang.String name = haxe.lang.Runtime.toString(this.unserialize());
					java.lang.Class cl = ((java.lang.Class) (haxe.lang.Runtime.callField(this.resolver, "resolveClass", new haxe.root.Array(new java.lang.Object[]{name}))) );
					if (( ((java.lang.Object) (cl) ) == ((java.lang.Object) (null) ) )) 
					{
						throw haxe.lang.HaxeException.wrap(( "Class not found " + name ));
					}
					
					java.lang.Object o = haxe.root.Type.createEmptyInstance(cl);
					this.cache.push(o);
					haxe.lang.Runtime.callField(o, "hxUnserialize", new haxe.root.Array(new java.lang.Object[]{this}));
					int __temp_stmt118 = 0;
					{
						int p = this.pos++;
						{
							java.lang.String s = this.buf;
							__temp_stmt118 = ( (( p < s.length() )) ? (((int) (s.charAt(p)) )) : (-1) );
						}
						
					}
					
					if (( __temp_stmt118 != 103 )) 
					{
						throw haxe.lang.HaxeException.wrap("Invalid custom data");
					}
					
					return o;
				}
				
				
				default:
				{
					{
					}
					
					break;
				}
				
			}
			
		}
		
		this.pos--;
		throw haxe.lang.HaxeException.wrap(( ( ( "Invalid char " + haxe.lang.StringExt.charAt(this.buf, this.pos) ) + " at position " ) + this.pos ));
	}
	
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef119 = true;
			switch (field.hashCode())
			{
				case -341328890:
				{
					if (field.equals("resolver")) 
					{
						__temp_executeDef119 = false;
						this.resolver = ((java.lang.Object) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef119 = false;
						this.pos = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef119 = false;
						this.length = ((int) (value) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef119) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef120 = true;
			switch (field.hashCode())
			{
				case -341328890:
				{
					if (field.equals("resolver")) 
					{
						__temp_executeDef120 = false;
						this.resolver = ((java.lang.Object) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 97907:
				{
					if (field.equals("buf")) 
					{
						__temp_executeDef120 = false;
						this.buf = haxe.lang.Runtime.toString(value);
						return value;
					}
					
					break;
				}
				
				
				case -908198161:
				{
					if (field.equals("scache")) 
					{
						__temp_executeDef120 = false;
						this.scache = ((haxe.root.Array<java.lang.String>) (value) );
						return value;
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef120 = false;
						this.pos = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
				case 94416770:
				{
					if (field.equals("cache")) 
					{
						__temp_executeDef120 = false;
						this.cache = ((haxe.root.Array) (value) );
						return value;
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef120 = false;
						this.length = ((int) (haxe.lang.Runtime.toInt(value)) );
						return value;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef120) 
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
			boolean __temp_executeDef121 = true;
			switch (field.hashCode())
			{
				case -505039769:
				{
					if (field.equals("unserialize")) 
					{
						__temp_executeDef121 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("unserialize"))) );
					}
					
					break;
				}
				
				
				case 97907:
				{
					if (field.equals("buf")) 
					{
						__temp_executeDef121 = false;
						return this.buf;
					}
					
					break;
				}
				
				
				case 1438134792:
				{
					if (field.equals("unserializeEnum")) 
					{
						__temp_executeDef121 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("unserializeEnum"))) );
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef121 = false;
						return this.pos;
					}
					
					break;
				}
				
				
				case -657057146:
				{
					if (field.equals("unserializeObject")) 
					{
						__temp_executeDef121 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("unserializeObject"))) );
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef121 = false;
						return this.length;
					}
					
					break;
				}
				
				
				case -940119524:
				{
					if (field.equals("readDigits")) 
					{
						__temp_executeDef121 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("readDigits"))) );
					}
					
					break;
				}
				
				
				case 94416770:
				{
					if (field.equals("cache")) 
					{
						__temp_executeDef121 = false;
						return this.cache;
					}
					
					break;
				}
				
				
				case 1647991432:
				{
					if (field.equals("setResolver")) 
					{
						__temp_executeDef121 = false;
						return ((haxe.lang.Function) (new haxe.lang.Closure(((java.lang.Object) (this) ), haxe.lang.Runtime.toString("setResolver"))) );
					}
					
					break;
				}
				
				
				case -908198161:
				{
					if (field.equals("scache")) 
					{
						__temp_executeDef121 = false;
						return this.scache;
					}
					
					break;
				}
				
				
				case -341328890:
				{
					if (field.equals("resolver")) 
					{
						__temp_executeDef121 = false;
						return this.resolver;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef121) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef122 = true;
			switch (field.hashCode())
			{
				case -341328890:
				{
					if (field.equals("resolver")) 
					{
						__temp_executeDef122 = false;
						return ((double) (haxe.lang.Runtime.toDouble(this.resolver)) );
					}
					
					break;
				}
				
				
				case 111188:
				{
					if (field.equals("pos")) 
					{
						__temp_executeDef122 = false;
						return ((double) (this.pos) );
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef122 = false;
						return ((double) (this.length) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef122) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
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
			boolean __temp_executeDef123 = true;
			switch (field.hashCode())
			{
				case -505039769:
				{
					if (field.equals("unserialize")) 
					{
						__temp_executeDef123 = false;
						return this.unserialize();
					}
					
					break;
				}
				
				
				case 1647991432:
				{
					if (field.equals("setResolver")) 
					{
						__temp_executeDef123 = false;
						this.setResolver(dynargs.__get(0));
					}
					
					break;
				}
				
				
				case 1438134792:
				{
					if (field.equals("unserializeEnum")) 
					{
						__temp_executeDef123 = false;
						return this.unserializeEnum(((java.lang.Class<java.lang.Object>) (dynargs.__get(0)) ), haxe.lang.Runtime.toString(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case -940119524:
				{
					if (field.equals("readDigits")) 
					{
						__temp_executeDef123 = false;
						return this.readDigits();
					}
					
					break;
				}
				
				
				case -657057146:
				{
					if (field.equals("unserializeObject")) 
					{
						__temp_executeDef123 = false;
						this.unserializeObject(dynargs.__get(0));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef123) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			
		}
		
		return null;
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("resolver");
		baseArr.push("scache");
		baseArr.push("cache");
		baseArr.push("length");
		baseArr.push("pos");
		baseArr.push("buf");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


