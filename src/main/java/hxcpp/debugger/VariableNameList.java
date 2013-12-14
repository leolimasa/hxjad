package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableNameList extends haxe.lang.Enum
{
	static 
	{
		VariableNameList.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Terminator", "Element"});
		VariableNameList.Terminator = new VariableNameList(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    VariableNameList(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static VariableNameList Terminator;
	
	public static VariableNameList Element(VariableName variable, VariableNameList next)
	{
		return new VariableNameList(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{variable, next})) ));
	}
	
	
}


