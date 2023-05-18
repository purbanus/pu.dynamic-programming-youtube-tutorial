package pu.phonenumbers;

public class LettersToPhoneNumbers
{

public String letterToPhoneNumber( String aLetters )
{
	String number = aLetters.replaceAll( "[ABCabc]", "2" );
	number = number.replaceAll( "[DEFdef]", "3" );
	number = number.replaceAll( "[GHIghi]", "4" );
	number = number.replaceAll( "[JKLjkl]", "5" );
	number = number.replaceAll( "[MNOmno]", "6" );
	number = number.replaceAll( "[PQRSpqrs]", "7" );
	number = number.replaceAll( "[TUVtuv]", "8" );
	number = number.replaceAll( "[WXYZwxyz]", "9" );
	return number;

}

}
