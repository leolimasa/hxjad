package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class VariableName extends haxe.lang.Enum
{
	static 
	{
		VariableName.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"Variable"});
	}
	public    VariableName(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static VariableName Variable(java.lang.String name, java.lang.String fullName, boolean isStatic, VariableValue value)
	{
		return new VariableName(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{name, fullName, isStatic, value})) ));
	}
	
	
}


