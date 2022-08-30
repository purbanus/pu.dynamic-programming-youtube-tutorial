package pu.dynamic_programming.example3.cansum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanSum
{

public static void main( String [] args )
{
	new CanSum().run();
}

private void run()
{
	log( canSum( 7, List.of( 2, 3 ) ) );
	log( canSum( 7, List.of( 5, 3, 4, 7 ) ) );
	log( canSum( 7, List.of( 2, 4 ) ) );
	log( canSum( 8, List.of( 2, 3, 5 ) ) );
	log( canSum( 300, List.of( 7, 14 ) ) );
	log( canSum( 3000, List.of( 7, 14 ) ) );
	log( canSum( 14000, List.of( 7, 14 ) ) );
}
private void log( Object aThing )
{
	System.out.println( aThing );
}
private boolean canSum( int aTarget, List<Integer> aParts )
{
	return canSum( aTarget, aParts, new HashMap<Integer, Boolean>() );
}
private boolean canSum( int aTarget, List<Integer> aParts, Map<Integer, Boolean> aMemo )
{
	if ( aMemo.get( aTarget ) != null )
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
		boolean result = canSum( newTarget, aParts, aMemo );
		if ( result )
		{
			aMemo.put( aTarget, true );
			return result;
		}
	}
	aMemo.put( aTarget, false );
	return false;
}

}
