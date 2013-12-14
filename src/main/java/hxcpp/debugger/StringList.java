package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringList extends haxe.lang.Enum
{
	static 
	{
		StringList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Element"});
		StringList.Terminator = new StringList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    StringList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static StringList Terminator;
	
	public static StringList Element(java.lang.String string, StringList next)
	{
		return new StringList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{string, next})) ));
	}
	
	
}


