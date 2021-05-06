import java.util.TreeMap;

public class SourceTreeMap {
	
	private static TreeMap<String, String>data;
	public SourceTreeMap() {
		data = new TreeMap<String, String>();
		
	}
	public String getNumber(String name) {
		return data.get(name);
		
	}
	public boolean getName(String number) {
		if(data.containsValue(number)) {
			return true;
		}
		else {
			return false;
		}
	}
	public String putNumber(String name, String number) {
		try {
			data.put(name, number);
			return "True";
		}
		catch(Exception e) {
			throw new IllegalArgumentException("Name or Number : Null Exception");
		}
	}

}
