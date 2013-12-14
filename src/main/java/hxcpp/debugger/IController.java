package hxcpp.debugger;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  interface IController extends haxe.lang.IHxObject
{
	   Command getNextCommand();
	
	   void acceptMessage(Message message);
	
}


