package sei.com.arrayexample.iface;
/*
 * defining interface so that the underlying 
 *  implementation can change as per requirement
 */

import java.util.Set;

public interface IFindDulpicateArray {
	
	//functions throwing very generic exception can be customized
	public int[] findAndRemoveDuplicateThroughListAndSet(int[] randomIntegers) throws Exception;
	public int[] findAndRemoveDuplicateThroughForLoopArray(int[] randomIntegers) throws Exception;
	public int[] findAndRemoveDuplicateThroughLoopsArray(int[] randomIntegers) throws Exception;
	
	//done isolation in case if we need to return collection in any case
	public Set<Integer> findAndRemoveDuplicateThroughForLoop(int[] randomIntegers) throws Exception;
	public Set<Integer> findAndRemoveDuplicateThroughLoops(int[] randomIntegers) throws Exception;
	
	//can add more functions to it

}
