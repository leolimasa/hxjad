package haxe.java.vm;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Deque<T>
{
	public    Deque()
	{
		this.head = this.tail = new haxe.java.vm.DequeNode<T>(((T) (null) ));
	}
	
	
	public  haxe.java.vm.DequeNode<T> head;
	
	public  haxe.java.vm.DequeNode<T> tail;
	
	public   void push(T i)
	{
		haxe.java.vm.DequeNode<T> n = new haxe.java.vm.DequeNode<T>(((T) (i) ));
		synchronized(this)
		{
			n.next = this.head.next;
			this.head.next = n;
			try 
			{
				this.notify();
			}
			catch (java.lang.Throwable __temp_catchallException201)
			{
				java.lang.Object __temp_catchall202 = __temp_catchallException201;
				if (( __temp_catchall202 instanceof haxe.lang.HaxeException )) 
				{
					__temp_catchall202 = ((haxe.lang.HaxeException) (__temp_catchallException201) ).obj;
				}
				
				{
					java.lang.Object e = __temp_catchall202;
					throw haxe.lang.HaxeException.wrap(e);
				}
				
			}
			
			
		}
		;
	}
	
	
	public   T pop(boolean block)
	{
		T ret = null;
		synchronized(this)
		{
			haxe.java.vm.DequeNode<T> n = null;
			do 
			{
				n = this.head.next;
				if (( n != null )) 
				{
					ret = n.value;
					n.value = null;
					this.head = n;
				}
				 else 
				{
					if (block) 
					{
						try 
						{
							this.wait();
						}
						catch (java.lang.Throwable __temp_catchallException203)
						{
							java.lang.Object __temp_catchall204 = __temp_catchallException203;
							if (( __temp_catchall204 instanceof haxe.lang.HaxeException )) 
							{
								__temp_catchall204 = ((haxe.lang.HaxeException) (__temp_catchallException203) ).obj;
							}
							
							{
								java.lang.Object e = __temp_catchall204;
								throw haxe.lang.HaxeException.wrap(e);
							}
							
						}
						
						
					}
					
				}
				
			}
			while (( block && ( n == null ) ));
		}
		;
		return ret;
	}
	
	
}


