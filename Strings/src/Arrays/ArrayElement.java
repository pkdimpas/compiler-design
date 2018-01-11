package Arrays;

/**
 * 
 * @author Sean Cadigal
 *
 */

public class ArrayElement<T> {
	private String key;
	private T value;
	
	/** Getters and Setters **/
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	
	public ArrayElement(String key, T value) {
		this.key = key;
		this.value = value;
	}
	
}
