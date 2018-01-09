package Arrays;

import java.util.regex.Pattern;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * 
 * @author Sean Cadigal
 * @version 0.1.0
 * @since January 09, 2018
 **/

public class ArrayFunctions {
	private String f;									//holder for the function call
	private Pattern p;
	private Matcher m;
	
	public ArrayFunctions() {
		
	}
	
	/**
	 * 
	 * @param text - line of that is use to extract the function of the array
	 */
	private void getFunction(String text) {
		String pattern = ".\\w\\(.*\\)";			// regex to be used in order to get the function call
		
		p = Pattern.compile(pattern);
		m = p.matcher(text);
		if(m.find()) {
			this.f = m.group();						// saves the calling function to the class variable "f";
		}
	}
	
	/**
	 * 
	 * @param arrName - the array name that calls the function
	 * @param memory  - holds the value of the objects
	 * @return any specified errors or value
	 */
	public Object findFunction(Map<String,Object> memory) {	
		Object returnValue = null;					// object class that is used to return to the compiler
		String pattern = ".\\w";					// regex to be used in order to get the desired function
		String[] params;							// parameters of the called function		
		
		p = Pattern.compile(pattern);
		m = p.matcher(f);
		
		//search for the desired function to be conducted
		params = getParameters();
		switch(m.group()) {
			case ".search":					
				// parameters (1) ArrayName (2) Value to be searched
				if(params.length == 2) {
					returnValue = (memory.containsKey(params[0]))? search(params,memory) : (String) "Array not found";
				} else {
					returnValue = (String) "Invalid Parameters";
				}
				
				break;
			
			case ".size": 			break;
			case ".delete":			break;
			case ".append":			break;
			case ".insert": 		break;
			case ".retrieve": 		break;
			case ".stringToArray":	break;
			default:  
		}
		
		return returnValue;
	}
	
	private String[] getParameters() {
		String pattern = "\\(.*\\)";
		
		String paramGroup;
		String[] params;
		
		p = Pattern.compile(pattern);
		m = p.matcher(f);
		
		paramGroup = m.group();
		
		paramGroup.replaceAll("\\(|\\)", "");
		
		params = paramGroup.split(",");		
		
		return params;
	}
	
	/**
	 * 
	 * @param params -> parameters of search function (1) - ArrayName (2) - Value
	 * @param memory -> memory of the compiler
	 * @return the index of the first occurence of the value else returns -1
	 */
	private Object search(String[] params, Map<String,Object> memory) {
		
		Object returnValue = null;
		
		Map<String,Object> array = (Map<String,Object>) memory.get(params[0]);
				
		if(array.containsValue(params[1])) {
			List<Object> values = (List<Object>) array.values();
			returnValue = (Integer) values.indexOf((Object)params[1]);
		} else {
			returnValue = (String) "Error: Value not found, function return of index -1";
		}
		
		
		return returnValue;
	}
	
}

