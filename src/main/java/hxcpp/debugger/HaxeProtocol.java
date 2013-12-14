package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class HaxeProtocol extends haxe.lang.HxObject
{
	public static String gClientIdentification = "Haxe debug client v1.0 coming at you!\n\n";
	public static String gServerIdentification = "Haxe debug server v1.0 ready and willing, sir!\n\n";

	public    HaxeProtocol(haxe.lang.EmptyObject empty)
	{
		{
		}
		
	}
	
	
	public    HaxeProtocol()
	{
		HaxeProtocol.__hx_ctor_org_flashdevelop_cpp_debugger_HaxeProtocol(this);
	}
	
	
	public static   void __hx_ctor_org_flashdevelop_cpp_debugger_HaxeProtocol(HaxeProtocol __temp_me29)
	{
		{
		}
		
	}
	
	
	public static   void writeClientIdentification(haxe.io.Output output)
	{
		output.writeString(gClientIdentification);
	}
	
	
	public static   void writeServerIdentification(haxe.io.Output output)
	{
		output.writeString(HaxeProtocol.gServerIdentification);
	}
	
	
	public static   void readClientIdentification(haxe.io.Input input)
	{
		haxe.io.Bytes id = input.read(HaxeProtocol.gClientIdentification.length());
		if ( ! (haxe.lang.Runtime.valEq(id.toString(), HaxeProtocol.gClientIdentification)) )
		{
			throw haxe.lang.HaxeException.wrap(( "Unexpected client identification string: " + haxe.root.Std.string(id) ));
		}
		
	}
	
	
	public static   void readServerIdentification(haxe.io.Input input)
	{
		haxe.io.Bytes id = input.read(HaxeProtocol.gServerIdentification.length());
		if ( ! (haxe.lang.Runtime.valEq(id.toString(), HaxeProtocol.gServerIdentification)) )
		{
			throw haxe.lang.HaxeException.wrap(( "Unexpected server identification string: " + haxe.root.Std.string(id) ));
		}
		
	}
	
	
	public static   void writeCommand(haxe.io.Output output, Command command)
	{
		HaxeProtocol.writeDynamic(output, command);
	}
	
	
	public static   void writeMessage(haxe.io.Output output, Message message)
	{
		HaxeProtocol.writeDynamic(output, message);
	}
	
	
	public static Command readCommand(haxe.io.Input input)
	{
		java.lang.Object raw = HaxeProtocol.readDynamic(input);
		try 
		{
			return ((Command) (raw) );
		}
		catch (java.lang.Throwable __temp_catchallException386)
		{
			java.lang.Object __temp_catchall387 = __temp_catchallException386;
			if (( __temp_catchall387 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall387 = ((haxe.lang.HaxeException) (__temp_catchallException386) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall387;
				throw haxe.lang.HaxeException.wrap(( ( ( "Expected Command, but got " + haxe.root.Std.string(raw) ) + ": " ) + haxe.root.Std.string(e) ));
			}
			
		}
		
		
	}
	
	
	public static Message readMessage(haxe.io.Input input)
	{
		java.lang.Object raw = HaxeProtocol.readDynamic(input);
		try 
		{
			return ((Message) (raw) );
		}
		catch (java.lang.Throwable __temp_catchallException388)
		{
			java.lang.Object __temp_catchall389 = __temp_catchallException388;
			if (( __temp_catchall389 instanceof haxe.lang.HaxeException )) 
			{
				__temp_catchall389 = ((haxe.lang.HaxeException) (__temp_catchallException388) ).obj;
			}
			
			{
				java.lang.Object e = __temp_catchall389;
				throw haxe.lang.HaxeException.wrap(( ( ( "Expected Message, but got " + haxe.root.Std.string(raw) ) + ": " ) + haxe.root.Std.string(e) ));
			}
			
		}
		
		
	}
	
	
	public static   void writeDynamic(haxe.io.Output output, java.lang.Object value)
	{
		java.lang.String string = haxe.Serializer.run(value);
		int msg_len = string.length();
		haxe.io.Bytes msg_len_raw = haxe.io.Bytes.alloc(8);
		{
			int _g = 0;
			while (( _g < 8 ))
			{
				int i = _g++;
				msg_len_raw.b[( 7 - i )] = ((byte) (( ( msg_len % 10 ) + 48 )) );
				msg_len = ( msg_len / 10 );
			}
			
		}
		
		output.write(msg_len_raw);
		output.writeString(string);
	}
	
	
	public static   java.lang.Object readDynamic(haxe.io.Input input)
	{
		haxe.io.Bytes msg_len_raw = input.read(8);
		int msg_len = 0;
		{
			int _g = 0;
			while (( _g < 8 ))
			{
				int i = _g++;
				msg_len *= 10;
				msg_len += ( (( msg_len_raw.b[i] & 255 )) - 48 );
			}
			
		}
		
		if (( msg_len > 102400 )) 
		{
			throw haxe.lang.HaxeException.wrap(( ( "Read bad message length: " + msg_len ) + "." ));
		}
		
		return haxe.Unserializer.run(input.read(msg_len).toString());
	}
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new HaxeProtocol(((haxe.lang.EmptyObject) (haxe.lang.EmptyObject.EMPTY) ));
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new HaxeProtocol();
	}
	
	
}


