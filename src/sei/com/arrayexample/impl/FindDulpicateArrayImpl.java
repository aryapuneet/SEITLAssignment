package sei.com.arrayexample.impl;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import sei.com.arrayexample.iface.IFindDulpicateArray;

public class FindDulpicateArrayImpl implements IFindDulpicateArray {
	
	/*solution 1 convert array to collection and then pass it
	 *  to set and then convert back set to array
	 *  This solution  retain the order as LinkedHashSet guarantee that
	 */
	@Override
	public int[] findAndRemoveDuplicateThroughListAndSet(int[] randomIntegers) throws Exception {
		// the array which will be not be having duplicates
		int[] actualIntArray = {};
		
		if(isArrayEmpty(randomIntegers)) {
			//you can do what so ever you want. Can throw an exception too
			return actualIntArray;
		}

		// java 8 streams to convert array of primitive into list of Object
		List<Integer> lstOfIntegers = Arrays.stream(randomIntegers).boxed().collect(Collectors.toList());
		
		//set always contains unique object so duplication will be gone
		Set<Integer> arraySet = new LinkedHashSet<Integer>(lstOfIntegers);
		
		//converting set of object into array of primitive using java 8 streams
		actualIntArray = arraySet.stream().mapToInt(i -> i).toArray();

		return actualIntArray;
	}
	
	/*
	 * just iterating through array and add to set(non-Javadoc)
	 * @see sei.com.arrayexample.iface.IFindDulpicateArray#findAndRemoveDuplicateThroughForLoop(int[])
	 * This solution  retain the order as LinkedHashSet guarantee that
	 */
	
	@Override
	public Set<Integer> findAndRemoveDuplicateThroughForLoop(int[] randomIntegers) throws Exception {
		//using set as it filter the duplicate items can use array too
		Set<Integer> arraySet = new LinkedHashSet<Integer>();
		
		if(isArrayEmpty(randomIntegers)) {
			//you can do what so ever you want. Can throw an exception too
			return arraySet;
		}
		
		//autoboxing
		for(Integer number: randomIntegers) {
			if(arraySet.add(number) == false) {
				//I am duplicate number
			}
		}
		
		return arraySet;
	}
	
	/*
	 * bad solution(non-Javadoc)
	 * @see sei.com.arrayexample.iface.IFindDulpicateArray#findAndRemoveDuplicateThroughLoops(int[])
	 * This solution  retain the order as LinkedHashSet guarantee that
	 */
	@Override
	public Set<Integer> findAndRemoveDuplicateThroughLoops(int[] randomIntegers) throws Exception {
		//using set as it filter the duplicate items can use array too
		Set<Integer> arraySet = new LinkedHashSet<Integer>();
		
		if(isArrayEmpty(randomIntegers)) {
			//you can do what so ever you want. Can throw an exception too
			return arraySet;
		}
		
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
	
	@Override
	public int[] findAndRemoveDuplicateThroughForLoopArray(int[] randomIntegers) throws Exception {
		Set<Integer> arraySet = findAndRemoveDuplicateThroughForLoop(randomIntegers);
		
		int actualIntArray[] = {};
		//converting set of object into array of primitive using java 8 streams
		actualIntArray = arraySet.stream().mapToInt(i -> i).toArray();
		
		return actualIntArray;
	}

	@Override
	public int[] findAndRemoveDuplicateThroughLoopsArray(int[] randomIntegers) throws Exception {
		Set<Integer> arraySet = findAndRemoveDuplicateThroughLoops(randomIntegers);
		int actualIntArray[] = {};
		//converting set of object into array of primitive using java 8 streams
		actualIntArray = arraySet.stream().mapToInt(i -> i).toArray();
		
		return actualIntArray;
	}
	
	//this can be moved to some Utils class too
	public boolean isArrayEmpty(int[] randomArray) {
		if(randomArray == null || randomArray.length < 1) {
			return true;
		}
		return false;
	}

}
