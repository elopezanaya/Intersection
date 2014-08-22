package intersection;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IntersectionTest {

	Intersection intersection = new Intersection();
	int[] conjunctionOne={1,2,3,4,5,6};
	int[] conjunctionTwo={1,2,3,5,8,11};
	int[] result={1,2,3,5};
	
	
	private List<Integer> arrayToList(int[] conjuction){
		
		List<Integer> result= new ArrayList<Integer>();
		
		for (int i : conjuction){
			
			result.add(i);
		}
		
		return result;
	}
	
	@Test
	public void test() {
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}
	
	@Test
	public void testBiggerChain() {
		
		int[] conjunctionOne={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] conjunctionTwo={1,1,2,3,5,8,13,21,34,55,89,144};
		int[] result={1,2,3,5,8,13};
		
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}

	
	@Test
	public void testNegativeNumbers() {
		
		int[] conjunctionOne={-1,1,2,-3,4,-5,6,-7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] conjunctionTwo={-1,1,2,3,5,8,13,21,34,55,89,144};
		int[] result={-1,1,2,8,13};
		
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}
	
	
	@Test
	public void testJustZeroAndOne() {
		
		int[] conjunctionOne={0,1,1,0,1,0,0,0,0,1,1,0,1,1,1,1,0,1,1,0,1,1,0,0,0,1,1,0,0,0,0,1};
		int[] conjunctionTwo={0,1,1,0,1,0,0,0,0,1,1,0,0,1,0,1,0,1,1,0,1,1,0,0,0,1,1,0,1,1,0,0, 0,1,1,0,1,1,1,1};
		int[] result={0,1};
		
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}

	@Test
	public void testNullConjuctions() {
		
		int[] conjunctionOne=null;
		int[] conjunctionTwo=null;
		int[] result={};
		
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}
	
	@Test
	public void testEmptyConjuctions() {
		
		int[] conjunctionOne={};
		int[] conjunctionTwo={};
		int[] result={};
		
		
	assertEquals(arrayToList(result), intersection.obtainIntersection(conjunctionOne,conjunctionTwo));
	
	}
}
