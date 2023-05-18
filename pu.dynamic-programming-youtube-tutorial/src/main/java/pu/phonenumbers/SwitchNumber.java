package pu.phonenumbers;

public class SwitchNumber
{

public static void main( String [] args )
{
	int number = 4;
	switch ( number )
	{
		case 1:
			System.out.println( "Python" );
			break;
		case 2:
			System.out.println( "Java" );
			break;
		case 3:
			System.out.println( "PHP" );
			break;
		default:
			System.out.println( number );
			break;
	}
}

}
