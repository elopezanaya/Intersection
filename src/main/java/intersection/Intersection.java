package intersection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.log4j.Logger;

public class Intersection {

	Logger logger = Logger.getLogger(Intersection.class);
	
	public SortedSet castToCollection(int[] conjuction){
		
		SortedSet conjuctionOrdered = new TreeSet();
		
		for (Object element : conjuction ){
			
			conjuctionOrdered.add(element);
		}

		return conjuctionOrdered;
	}
	
	public Object obtainIntersection(int[] conjunctionOne, int[] conjunctionTwo) {
		
	List<Integer> result= new ArrayList<Integer>();
	
	if (conjunctionOne != null && conjunctionTwo != null){
	
		Set conjuctionBase= castToCollection(conjunctionOne);
		SortedSet conjuctionToSearch= castToCollection(conjunctionTwo);
		
		Iterator iterator = conjuctionBase.iterator();
		int candidate=0;
		while(iterator.hasNext()){
			candidate= (Integer) iterator.next();

			if (conjuctionToSearch.contains(candidate)){
				result.add(candidate);
			}
		}
	}
	logger.debug(Arrays.toString(result.toArray()));
	return result;
	}

}
