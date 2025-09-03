package pu.dynamic_programming.example1.fibo;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibo
{
private Map<Integer, BigInteger> memo = new HashMap<>();

public static void main( String [] args )
{
	new Fibo().run();
}

private void run()
{
	log( fiboOfIndex( 1 ) );
	log( fiboOfIndex( 2 ) );
	log( fiboOfIndex( 5 ) );
	log( fiboOfIndex( 8 ) );
	log( fiboOfIndex( 13 ) );
	log( fiboOfIndex( 21 ) );
	log( fiboOfIndex( 1000 ) );

	log( fiboOfIndexStraight( 1 ) );
	log( fiboOfIndexStraight( 2 ) );
	log( fiboOfIndexStraight( 5 ) );
	log( fiboOfIndexStraight( 8 ) );
	log( fiboOfIndexStraight( 13 ) );
	log( fiboOfIndexStraight( 21 ) );
	log( fiboOfIndexStraight( 100 ) );
}
private void log( long aNumber )
{
	System.out.println( aNumber );
}
private void log( BigInteger aNumber )
{
	System.out.println( aNumber );
}
private BigInteger fiboOfIndex( int aIndex )
{
	if ( memo.containsKey( aIndex ) )
	{
		return memo.get( aIndex );
	}
	if ( aIndex == 1 || aIndex == 2 )
	{
		return BigInteger.valueOf( 1 );
	}
	BigInteger result = fiboOfIndex( aIndex - 1 ).add( fiboOfIndex( aIndex - 2 ) );
	memo.put( aIndex, result );
	return result;
}
private long fiboOfIndexStraight( int aIndex )
{
	if ( aIndex <= 2 )
	{
		return 1;
	}
	long prevPrev = 1;
	long prev = 1;
	long fibo = 0;
	for ( int x = 3; x <= aIndex; x++ )
	{
		fibo = prevPrev + prev;
		prevPrev = prev;
		prev = fibo;
	}
	return fibo;
}
/*
1
1
5
21
233
10946
3736710778780434371
 */
}
