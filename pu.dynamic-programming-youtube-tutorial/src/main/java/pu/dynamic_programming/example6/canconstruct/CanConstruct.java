package pu.dynamic_programming.example6.canconstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CanConstruct
{

public static void main( String [] args )
{
	new CanConstruct().run();
	new CanConstruct().run_ZijnOplossing();
}

private void run()
{

	canConstruct( "", List.of( "cat", "dog", "mouse" ) );
	canConstruct( "abcdef", List.of( "ab", "abc", "cd", "def", "abcd" ) );
	canConstruct( "skateboard", List.of( "bo", "rd", "ate", "t", "ska", "sk", "boar" ) );
	canConstruct( "enterapotentpot", List.of( "a", "p", "ent", "enter", "ot", "o", "t"  ) );
	canConstruct( "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", List.of( "e", "ee", "eee", "eeee", "eeeee", "eeeeee" ) );

	
	/* m = target.length
	 * n = wordbank.length
	 * 
	 * Brute Force
	 * time : O(n^m * m) n^m = tree height * branching factor, *m  = target.substring
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

private boolean canConstruct( String aTarget, List<String> aWordbank )
{
	boolean result = canConstruct( aTarget, "", aWordbank, new HashMap<String, Boolean>() );
	log( aTarget + (result ? " can" : " cannot" ) + " be created from " + aWordbank );
	return result;
}
private boolean canConstruct( String aTarget, String aPartialTarget, List<String> aaWordbank, Map<String, Boolean> aMemo )
{
	if ( aMemo.get( aPartialTarget ) != null )
	{
		return aMemo.get( aPartialTarget );
	}
	if ( aTarget.equals( aPartialTarget ) )
	{
		return true;
	}
	for ( String word : aaWordbank )
	{
		String newTarget = aPartialTarget + word;
		if ( aTarget.startsWith( newTarget ) )
		{
			boolean result = canConstruct( aTarget, newTarget, aaWordbank, aMemo );
			if ( result )
			{
				aMemo.put( newTarget, true );
				return result;
			}
		}
	}
	aMemo.put( aPartialTarget, false );
	return false;
}
private void run_ZijnOplossing()
{
	canConstruct_ZijnOplossing( "", List.of( "cat", "dog", "mouse" ) );
	canConstruct_ZijnOplossing( "abcdef", List.of( "ab", "abc", "cd", "def", "abcd" ) );
	canConstruct_ZijnOplossing( "skateboard", List.of( "bo", "rd", "ate", "t", "ska", "sk", "boar" ) );
	canConstruct_ZijnOplossing( "enterapotentpot", List.of( "a", "p", "ent", "enter", "ot", "o", "t"  ) );
	canConstruct_ZijnOplossing( "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", List.of( "e", "ee", "eee", "eeee", "eeeee", "eeeeee" ) );
}
private boolean canConstruct_ZijnOplossing( String aTarget, List<String> aWordbank )
{
	boolean result = canConstruct_ZijnOplossing( aTarget, aWordbank, new HashMap<String, Boolean>() );
	log( aTarget + (result ? " can" : " cannot" ) + " be created from " + aWordbank );
	return result;
}
/**
 * Wat ik doe is een extra stringparm gebruiken die steeds groeit met het onderhanden woord.
 * Wat hij doet is steeds het begin van aTarget afsnoepen met het onderhanden woord.
 * @param aTarget
 * @param aWordbank
 * @param aMemo
 * @return
 */
private boolean canConstruct_ZijnOplossing( String aTarget, List<String> aWordbank, Map<String, Boolean> aMemo )
{
	if ( aMemo.get( aTarget ) != null )
	{
		return aMemo.get( aTarget );
	}
	if ( aTarget.isEmpty() )
	{
		return true;
	}
	for ( String word : aWordbank )
	{
		if ( aTarget.startsWith( word ) )
		{
			String newTarget = aTarget.substring( word.length() );
			boolean result = canConstruct_ZijnOplossing( newTarget, aWordbank, aMemo );
			if ( result )
			{
				aMemo.put( newTarget, true );
				return result;
			}
		}
	}
	aMemo.put( aTarget, false );
	return false;
}
/*
 can be created from [cat, dog, mouse]
abcdef can be created from [ab, abc, cd, def, abcd]
skateboard cannot be created from [bo, rd, ate, t, ska, sk, boar]
enterapotentpot can be created from [a, p, ent, enter, ot, o, t]
eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef cannot be created from [e, ee, eee, eeee, eeeee, eeeeee]
 can be created from [cat, dog, mouse]
abcdef can be created from [ab, abc, cd, def, abcd]
skateboard cannot be created from [bo, rd, ate, t, ska, sk, boar]
enterapotentpot can be created from [a, p, ent, enter, ot, o, t]
eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef cannot be created from [e, ee, eee, eeee, eeeee, eeeeee]

 */
}
