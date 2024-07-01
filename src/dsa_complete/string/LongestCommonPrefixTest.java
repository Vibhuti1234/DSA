package dsa_complete.string;

public class LongestCommonPrefixTest {

	public static void main(String[] args) {
     String[] strs = {"flower","flow","flight"};
     String prefix=LongestCommonPrefix.longestCommonPrefix(strs);
     System.out.println(prefix);
	}

}
