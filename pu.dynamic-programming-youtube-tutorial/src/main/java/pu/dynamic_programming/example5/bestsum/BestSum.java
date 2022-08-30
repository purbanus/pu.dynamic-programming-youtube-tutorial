package pu.dynamic_programming.example5.bestsum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum
{

public static void main( String [] args )
{
	new BestSum().run();
}

private void run()
{

	bestSum( 7, List.of( 5, 3, 4, 7 ) );
	bestSum( 8, List.of( 2, 3, 5 ) );
	bestSum( 8, List.of( 1, 4, 5 ) );
	bestSum( 100, List.of( 1, 2, 5, 25 ) );
	
	/* m = target sum
	 * n = aParts.size()
	 * 
	 * Brute Force
	 * time : O(n^m * m)
	 * space: O(m^2)
	 * 
	 * Memoized
	 * time : O(m^2 * n)
	 * space: O(m^2)
	 */

}
private void log( Object aThing )
{
	System.out.println( aThing );
}

private void bestSum( int aTarget, List<Integer> aParts )
{
	List<Integer> bestSums = bestSum( aTarget, aParts, new HashMap<>() );
	if ( bestSums != null )
	{
		Collections.reverse( bestSums );
	}
	log( "Making " + aTarget + " from " + aParts + (bestSums != null ? " can be done by " + bestSums : " cannot be done" ) );
}

private List<Integer> bestSum( int aTarget, List<Integer> aParts, Map<Integer, List<Integer>> aMemo )
{
	if ( aMemo.containsKey( aTarget ) )
	{
		return aMemo.get( aTarget );
	}
	if ( aTarget == 0 )
	{
		return new ArrayList<>();
	}
	if ( aTarget < 0 )
	{
		return null;
	}
	List<Integer> bestSum = null;
	for ( int part : aParts )
	{
		int newTarget = aTarget - part;
	
		List<Integer> newBestSum = bestSum( newTarget, aParts, aMemo );
		if ( newBestSum != null )
		{
			newBestSum = new ArrayList<>( newBestSum );
			newBestSum.add( part );
			if ( bestSum == null || newBestSum.size() < bestSum.size() )
			{
				bestSum = newBestSum;
			}
		}
	}
	aMemo.put( aTarget, bestSum );
	return bestSum;
}

}
