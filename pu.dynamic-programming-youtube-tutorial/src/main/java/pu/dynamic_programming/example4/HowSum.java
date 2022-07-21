package pu.dynamic_programming.example4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum
{

public static void main( String [] args )
{
	new HowSum().run();
}

private void run()
{
	howSum( 7, List.of( 2, 3 ) );
	howSum( 7, List.of( 5, 3, 4, 7 ) );
	howSum( 7, List.of( 2, 4 ) );
	howSum( 8, List.of( 2, 3, 5 ) );
	howSum( 300, List.of( 7, 14 ) );
	howSum( 3000, List.of( 7, 14 ) );
	howSum( 14000, List.of( 7, 14 ) );

//	howSumZijnOplossing( 7, List.of( 2, 3 ) );
//	howSumZijnOplossing( 7, List.of( 5, 3, 4, 7 ) );
	howSumZijnOplossing( 7, List.of( 2, 4 ) );
	howSumZijnOplossing( 8, List.of( 2, 3, 5 ) );
	howSumZijnOplossing( 300, List.of( 7, 14 ) );
	howSumZijnOplossing( 3000, List.of( 7, 14 ) );
	howSumZijnOplossing( 14000, List.of( 7, 14 ) );
}
private void log( Object aThing )
{
	System.out.println( aThing );
}
private void howSum( int aTarget, List<Integer> aParts )
{
	List<Integer> deSums = new ArrayList<>();
	boolean canSum = howSum( aTarget, aParts, new HashMap<Integer, Boolean>(), deSums );
	if ( deSums != null )
	{
		Collections.reverse( deSums );
	}
	log( "Making " + aTarget + " from " + aParts + (canSum ? " can be done by " + deSums : " cannot be done" ) );
}
private boolean howSum( int aTarget, List<Integer> aParts, Map<Integer, Boolean> aMemo, List<Integer> aDeSums )
{
	if ( aMemo.containsKey( aTarget ) )
	{
		return aMemo.get( aTarget );
	}
	if ( aTarget == 0 )
	{
		return true;
	}
	if ( aTarget < 0 )
	{
		return false;
	}

	for ( int part : aParts )
	{
		int newTarget = aTarget - part;
		boolean result = howSum( newTarget, aParts, aMemo, aDeSums );
		if ( result )
		{
			aMemo.put( aTarget, true );
			aDeSums.add( part );
			return result;
		}
	}
	aMemo.put( aTarget, false );
	return false;
}
private void howSumZijnOplossing( int aTarget, List<Integer> aParts )
{
	List<Integer> deSums = howSumZijnOplossing( aTarget, aParts, new HashMap<>() );
	if ( deSums != null )
	{
		Collections.reverse( deSums );
	}
	log( "Making " + aTarget + " from " + aParts + (deSums != null ? " can be done by " + deSums : " cannot be done" ) );
}

private List<Integer> howSumZijnOplossing( int aTarget, List<Integer> aParts, Map<Integer, List<Integer>> aMemo )
{
	// Je moet hier NIET aMeno.get( aTarget ) != null doen want null is ambigu hier:
	// - Het kan betekenen dat de key aTarget noiet voorkomt in de hashmap
	// - Het kan betekenen dat de key voorkomt maar null is
	// end
	// en dat is heel wat anders!
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

	for ( int part : aParts )
	{
		int newTarget = aTarget - part;
	
		List<Integer> result = howSumZijnOplossing( newTarget, aParts, aMemo );
		if ( result != null )
		{
			result = new ArrayList<>( result );
			result.add( part );
			aMemo.put( aTarget, result );
			return result;
		}
	}
	aMemo.put( aTarget, null );
	return null;
}

}
