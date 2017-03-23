package sei.com.arrayexample;
import java.util.Set;

import sei.com.arrayexample.iface.IFindDulpicateArray;
import sei.com.arrayexample.impl.FindDulpicateArrayImpl;

public class FindDuplicateArray {

	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16,
			19, 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16,
			3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	
	public static void main(String[] args) {
		
		IFindDulpicateArray findDuplicateArray = new FindDulpicateArrayImpl();
		
		try {
			
			//you will see each and every array have same length
			int[] actualArrayThroughListAndSet = findDuplicateArray.findAndRemoveDuplicateThroughListAndSet(randomIntegers);
			System.out.println("actualArrayThroughListAndSet " + actualArrayThroughListAndSet.length);
			
			Set<Integer> actualArrayThroughForLoop  = findDuplicateArray.findAndRemoveDuplicateThroughForLoop(randomIntegers);
			System.out.println("actualArrayThroughForLoop " + actualArrayThroughForLoop.size());
			
			Set<Integer> actualArrayThroughLoops  = findDuplicateArray.findAndRemoveDuplicateThroughLoops(randomIntegers);
			System.out.println("iActualArrayThroughLoops " + actualArrayThroughLoops.size());
			
			int[] actualArrayThroughForLoopArray = findDuplicateArray.findAndRemoveDuplicateThroughForLoopArray(randomIntegers);
			System.out.println("actualArrayThroughListAndSet " + actualArrayThroughForLoopArray.length);
			
			int[] actualArrayThroughLoopsArray = findDuplicateArray.findAndRemoveDuplicateThroughLoopsArray(randomIntegers);
			System.out.println("actualArrayThroughListAndSet " + actualArrayThroughLoopsArray.length);
			
			
		//exception handling can be customized	
		} catch ( Exception ex){
			//very vague way can be customized
			System.out.println("exception message -> "  + ex.getMessage() + "exception cause  -> " + ex.getCause());
		}
	}
	
}
