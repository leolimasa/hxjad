package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Array_iterator_381__Fun<T> extends haxe.lang.Function
{
	public    Array_iterator_381__Fun(haxe.root.Array<java.lang.Object> i, haxe.root.Array<haxe.root.Array> _g)
	{
		super(0, 0);
		this.i = i;
		this._g = _g;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		T[] __temp_stmt53 = ((haxe.root.Array<T>) (((haxe.root.Array) (this._g.__get(0)) )) ).__a;
		int __temp_stmt54 = 0;
		{
			int __temp_arrIndex39 = 0;
			int __temp_arrVal37 = ((int) (haxe.lang.Runtime.toInt(this.i.__get(__temp_arrIndex39))) );
			int __temp_arrRet38 = __temp_arrVal37++;
			int __temp_expr55 = ((int) (haxe.lang.Runtime.toInt(this.i.__set(__temp_arrIndex39, __temp_arrVal37))) );
			__temp_stmt54 = __temp_arrRet38;
		}
		
		return __temp_stmt53[__temp_stmt54];
	}
	
	
	public  haxe.root.Array<java.lang.Object> i;
	
	public  haxe.root.Array<haxe.root.Array> _g;
	
}


