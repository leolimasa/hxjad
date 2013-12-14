package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableValue extends haxe.lang.Enum
{
	static 
	{
		VariableValue.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Item", "NoItem"});
		VariableValue.NoItem = new VariableValue(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    VariableValue(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static VariableValue Item(java.lang.String type, java.lang.String value, VariableNameList children)
	{
		return new VariableValue(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{type, value, children})) ));
	}
	
	
	public static VariableValue NoItem;
	
}


