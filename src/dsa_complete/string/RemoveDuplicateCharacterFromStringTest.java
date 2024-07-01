package dsa_complete.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicateCharacterFromStringTest {

	public static void main(String[] args) {
		String str = "hello";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.remove(str.charAt(i));
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		map.forEach((i, j) -> {
			System.out.print(i + "");
		});
		// java 8 programme to remove an element at given index
		int[] arr = { 3, 5, 4, 2, 3, 4, 6, 7, 8, 9, 9 };
		int k = 3;
		int[] resultArray = IntStream.range(0, arr.length).filter(i -> i != k).map(i -> arr[i]).toArray();
		System.out.println();
		for (int i = 0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}

		// using array list
		// Create ArrayList from the array
		List<Integer> arrayList = IntStream.of(arr).boxed().collect(Collectors.toList());
		int index = 9;
		// Remove the specified element
		arrayList.remove(index);
		// return the resultant array
		int[] result = arrayList.stream().mapToInt(Integer::intValue).toArray();
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

}
