package dsa_complete.string;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class RepeatedSubstringPatternLeetcodeTest {

	public static void main(String[] args) {
      String str="ababab";
      boolean isRepeatedSubstring=checkRepeatedSubstring(str);
		System.out.println(isRepeatedSubstring);
	}

	private static boolean checkRepeatedSubstring(String str) {
		if(str.length()%2!=0) {
			return false;
		}
		Queue<Character> chQueue=new ConcurrentLinkedQueue<Character>();
		chQueue.add(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (!chQueue.isEmpty() && chQueue.peek()==str.charAt(i)) {
				chQueue.poll();
				
			}
			else {
				chQueue.add(str.charAt(i));

			}
			
		}
		return chQueue.isEmpty();
	}
      
	}


