import java.util.HashMap;
import java.util.Map;

public class NineThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map class object created having string as a key and integer as value
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		//put the element as key and value
		m.put("Amit", 56);
		m.put("Anil", 85);
		m.put("Hello", 6);
		
		//iterate through all the element of the map
		for(Map.Entry hm: m.entrySet()){
			
			System.out.println(hm.getKey()+" "+hm.getValue());
		}
		
	}

}
