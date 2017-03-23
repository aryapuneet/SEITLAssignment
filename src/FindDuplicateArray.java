import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateArray {

	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16,
			19, 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16,
			3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	
	public static void main(String[] args) {

		int[] actualArrayThroughSet = findAndRemoveDuplicateThroughSet();
		System.out.println(actualArrayThroughSet.length);
		
		Set<Integer> actualArrayThroughLoop  = findAndRemoveDuplicateThroughLoops();
		System.out.println(actualArrayThroughLoop.size());
		
		Set<Integer> actualArrayThroughForLoop  = findAndRemoveDuplicateThroughLoops();
		System.out.println(actualArrayThroughForLoop.size());
		
	}
	
	/*solution 1 convert array to collection and then pass it
	 *  to set and then convert back set to array
	 */
	public static int[] findAndRemoveDuplicateThroughSet() {

		// the array which will be not be having duplicates
		int[] actualIntArray = {};

		// java 8 streams to convert array of primitive into list of Object
		List<Integer> lstOfIntegers = Arrays.stream(randomIntegers).boxed().collect(Collectors.toList());
		
		//set always contains unique object so duplication will be gone
		Set<Integer> arraySet = new HashSet<Integer>(lstOfIntegers);
		
		//converting set of object into array of primitive using java 8 streams
		actualIntArray = arraySet.stream().mapToInt(i -> i).toArray();

		return actualIntArray;
	}
	
	//just iterating through array and add to set
	public static Set<Integer> findAndRemoveDuplicateThroughForLoop() {
		
		//using set as it filter the duplicate items can use array too
		Set<Integer> arraySet = new HashSet<Integer>();
		
		//autoboxing
		for(Integer number: randomIntegers) {
			if(arraySet.add(number) == false) {
				//I am duplicate number
			}
		}
		
		return arraySet;
	}
	
	//bad solution looping and check each and every element
	public static Set<Integer> findAndRemoveDuplicateThroughLoops() {
		
		//using set as it filter the duplicate items can use array too
		Set<Integer> arraySet = new HashSet<Integer>();
		
		//outer loop to go through each element
		for(int i=0 ;i < randomIntegers.length; i++) {
			//inner loop to compare first loop element with every other in array
			for (int j= 1 ;j < randomIntegers.length ; j++) {
				if(randomIntegers[i] != randomIntegers[j] && i!=j){
					arraySet.add(randomIntegers[i]);
					break;
				} 
			}
		}
		return arraySet;
	}

}
