package dsa_complete.string;


public class StringLeetCodeTest {

	public static void main(String[] args) {
      String haystack="sadbutsad";
      String needle="sad";
      String result="";
      boolean isPresent=false;
      for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
		for (int j = 0; j < needle.toCharArray().length; j++) {
			if (haystack.charAt(i)==needle.charAt(j)) {
				if(haystack.substring(i,i+needle.length()).equals(needle)) {
					System.out.println(i);
					isPresent=true;
				}
				
			}
			
		}
	}
      if (!isPresent) {
          System.out.println(-1);

	}
     	}

}
