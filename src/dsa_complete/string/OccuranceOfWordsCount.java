package dsa_complete.string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsCount {

	public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        String[] strArray=str.split(" ");
        Map<String,Integer> map=new HashMap<String, Integer>();
        for (String string : strArray) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}
			else {
				map.put(string,1);
			}
		}
        map.forEach((key,value)->{System.out.println("Value: "+key+" count: "+value);});
	}

}
