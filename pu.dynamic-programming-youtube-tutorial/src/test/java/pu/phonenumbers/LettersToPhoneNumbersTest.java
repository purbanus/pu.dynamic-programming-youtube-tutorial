package pu.phonenumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class LettersToPhoneNumbersTest
{
private LettersToPhoneNumbers lettersToPhoneNumbers = new LettersToPhoneNumbers();

@Test
public void testAZ()
{
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "a" ) );
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "b" ) );
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "c" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "d" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "e" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "f" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "g" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "h" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "i" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "j" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "k" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "l" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "m" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "n" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "o" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "p" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "q" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "r" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "s" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "t" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "u" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "v" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "w" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "x" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "y" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "z" ) );
	
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "A" ) );
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "B" ) );
	assertEquals( "2", lettersToPhoneNumbers.letterToPhoneNumber( "C" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "D" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "E" ) );
	assertEquals( "3", lettersToPhoneNumbers.letterToPhoneNumber( "F" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "G" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "H" ) );
	assertEquals( "4", lettersToPhoneNumbers.letterToPhoneNumber( "I" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "J" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "K" ) );
	assertEquals( "5", lettersToPhoneNumbers.letterToPhoneNumber( "L" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "M" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "N" ) );
	assertEquals( "6", lettersToPhoneNumbers.letterToPhoneNumber( "O" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "P" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "Q" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "R" ) );
	assertEquals( "7", lettersToPhoneNumbers.letterToPhoneNumber( "S" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "T" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "U" ) );
	assertEquals( "8", lettersToPhoneNumbers.letterToPhoneNumber( "V" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "W" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "X" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "Y" ) );
	assertEquals( "9", lettersToPhoneNumbers.letterToPhoneNumber( "Z" ) );
}

}
