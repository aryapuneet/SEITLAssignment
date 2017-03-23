package sei.com.arrayexample;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import sei.com.arrayexample.iface.IFindDulpicateArray;
import sei.com.arrayexample.impl.FindDulpicateArrayImpl;

public class FindDuplicateTest {
	
	public static int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16,
			19, 1, 18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16,
			3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
	IFindDulpicateArray findDuplicateArray;
	int count;
	public int[] emptyArray= {};
	
    @Before
    public void init() {
    	findDuplicateArray = new FindDulpicateArrayImpl();
    }

	@Test
	public void testFindAndRemoveDuplicateThroughListAndSet() throws Exception {
		int[] actualArrayThroughListAndSet = findDuplicateArray.
				findAndRemoveDuplicateThroughListAndSet(randomIntegers);
		
		//lengths are not same as duplicate has removed
		assertTrue(actualArrayThroughListAndSet.length != randomIntegers.length);
		assertTrue(actualArrayThroughListAndSet.length > 0);
		
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughListAndSetCheckOrder() throws Exception {
		int[] actualArrayThroughListAndSet = findDuplicateArray.
				findAndRemoveDuplicateThroughListAndSet(randomIntegers);
		
		//lengths are not same as duplciate has removed
		assertTrue(actualArrayThroughListAndSet.length != randomIntegers.length);
		
		//checking few elements for order, can be checked with smaller array
		assertTrue(actualArrayThroughListAndSet[0] == 1);
		assertTrue(actualArrayThroughListAndSet[2] == 34);
		assertTrue(actualArrayThroughListAndSet[4] == 45);
		
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughListAndSetFromEmptyArray() throws Exception {
		int[] actualArrayThroughListAndSet = findDuplicateArray.
				findAndRemoveDuplicateThroughListAndSet(emptyArray);
		
		//empty array has been handled
		assertTrue(actualArrayThroughListAndSet.length == 0);
		
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughListAndSetIfArrayIsNull() throws Exception {
		int[] actualArrayThroughListAndSet = findDuplicateArray.
				findAndRemoveDuplicateThroughListAndSet(null);
		
		//empty array has been handled
		assertTrue(actualArrayThroughListAndSet.length == 0);
		
	}

	@Test
	public void testFindAndRemoveDuplicateThroughForLoop() throws Exception {
		Set<Integer> integerSet = findDuplicateArray.
				findAndRemoveDuplicateThroughForLoop(randomIntegers);
		
		//lengths are not same as duplicate has removed
		assertTrue(integerSet.size() != randomIntegers.length);
		assertTrue(integerSet.size() > 0);
		
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughForLoopToCheckOrder() throws Exception {
		Set<Integer> integerSet = findDuplicateArray.
				findAndRemoveDuplicateThroughForLoop(randomIntegers);
		
		//lengths are not same as duplicate has removed
		assertTrue(integerSet.size() > 0);
		
		assertTrue(getIndex(integerSet, 1) == 0);
		assertTrue(getIndex(integerSet, 34) == 2);
		assertTrue(getIndex(integerSet, 45) == 4);
		
		//not in array
		assertTrue(getIndex(integerSet, 0) == -1);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughForLoopFromEmptyArray() throws Exception {
		Set<Integer> integerSet = findDuplicateArray.
				findAndRemoveDuplicateThroughForLoop(emptyArray);
		
		//size will be zero
		assertTrue(integerSet.size() == 0);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughForLoopFromNull() throws Exception {
		Set<Integer> integerSet = findDuplicateArray.
				findAndRemoveDuplicateThroughForLoop(null);
		
		//size will be zero
		assertTrue(integerSet.size() == 0);
	}

	@Test
	public void testFindAndRemoveDuplicateThroughLoops() throws Exception {
		Set<Integer> integerSetThroughLoops = findDuplicateArray.
				findAndRemoveDuplicateThroughLoops(randomIntegers);
		
		//lengths are not same as duplicate has removed
		assertTrue(integerSetThroughLoops.size() != randomIntegers.length);
		assertTrue(integerSetThroughLoops.size() > 0);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughLoopsToCheckOrder() throws Exception {
		Set<Integer> integerSetThroughLoops = findDuplicateArray.
				findAndRemoveDuplicateThroughLoops(randomIntegers);
		
		assertTrue(integerSetThroughLoops.size() > 0);
		
		assertTrue(getIndex(integerSetThroughLoops, 1) == 0);
		assertTrue(getIndex(integerSetThroughLoops, 34) == 2);
		assertTrue(getIndex(integerSetThroughLoops, 45) == 4);
		
		//not in array
		assertTrue(getIndex(integerSetThroughLoops, 0) == -1);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughLoopsFromEmptyArray() throws Exception {
		Set<Integer> integerSetThroughLoops = findDuplicateArray.
				findAndRemoveDuplicateThroughLoops(emptyArray);
		
		//size will be zero
		assertTrue(integerSetThroughLoops.size() == 0);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughLoopsFromNull() throws Exception {
		Set<Integer> integerSetThroughLoops = findDuplicateArray.
				findAndRemoveDuplicateThroughLoops(null);
		
		//size will be zero
		assertTrue(integerSetThroughLoops.size() == 0);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughLoopsArray() throws Exception {
		int[] actualArrayThroughLoops = findDuplicateArray.
				findAndRemoveDuplicateThroughLoopsArray(randomIntegers);
		
		//lengths are not same as duplciate has removed
		assertTrue(actualArrayThroughLoops.length != randomIntegers.length);
		assertTrue(actualArrayThroughLoops.length > 0);
		assertTrue(randomIntegers.length > actualArrayThroughLoops.length);
		
		//checking few elements for order, can be checked with smaller array
		assertTrue(actualArrayThroughLoops[0] == 1);
		assertTrue(actualArrayThroughLoops[2] == 34);
		assertTrue(actualArrayThroughLoops[4] == 45);
	}
	
	@Test
	public void testFindAndRemoveDuplicateThroughForLoopArray() throws Exception {
		int[] actualArrayThroughForLoop = findDuplicateArray.
				findAndRemoveDuplicateThroughForLoopArray(randomIntegers);
		
		//lengths are not same as duplciate has removed
		assertTrue(actualArrayThroughForLoop.length != randomIntegers.length);
		assertTrue(actualArrayThroughForLoop.length > 0);
		assertTrue(randomIntegers.length > actualArrayThroughForLoop.length);
		
		//checking few elements for order, can be checked with smaller array
		assertTrue(actualArrayThroughForLoop[0] == 1);
		assertTrue(actualArrayThroughForLoop[2] == 34);
		assertTrue(actualArrayThroughForLoop[4] == 45);
	}
	
	//small function to check the index value in the set, can be moved to test utils too
	public int getIndex(Set<? extends Object> set, Object value) {
	   int result = 0;
	   for (Object entry:set) {
	     if (entry.equals(value)) return result;
	     result++;
	   }
	   return -1;
	 }
	
}
