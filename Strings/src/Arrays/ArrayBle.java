package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sean Cadigal
 *
 */
public class ArrayBle {
	private List<ArrayElement<?>> l;
	
	public ArrayBle() {
		this.l = new ArrayList<>();
	}
	
	public void put(String key, Object value) {
		ArrayElement<Object> e = new ArrayElement<>(key,value);
		l.add(e);
	}
	
	public Object get (String key) {
		Object ret = null;
		int i;
		
		for(i = 0 ; i < l.size() && l.get(i).getKey().contentEquals(key); i++) { }
		if( i < l.size()) {
			ret = l.get(i).getValue();
		}
		
		return ret;
	}
	
	public Object get (int index) {
		return l.get(index).getValue();
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
	
}
