package haxe.java.vm;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class DequeNode<T>
{
	public    DequeNode(T val)
	{
		this.value = val;
	}
	
	
	public  T value;
	
	public  haxe.java.vm.DequeNode<T> next;
	
}


