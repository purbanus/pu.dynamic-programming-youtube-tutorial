package pu.dynamic_programming.example2.gridtraveler;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main
{
public static class RowColumn
{
final int row;
final int column;
public RowColumn( int aRow, int aColumn )
{
	row = aRow;
	column = aColumn;
}
public RowColumn down()
{
	return new RowColumn( row - 1, column );
}
public RowColumn right()
{
	return new RowColumn( row, column - 1 );
}
@Override
public int hashCode()
{
	return Objects.hash( column, row );
}
@Override
public boolean equals( Object obj )
{
	if ( this == obj )
		return true;
	if ( obj == null )
		return false;
	if ( getClass() != obj.getClass() )
		return false;
	RowColumn other = (RowColumn) obj;
	return column == other.column && row == other.row;
}
}

// Deze hoeft niet elke keer geinitialiseerd te worden: RowColumn(x,y) is altijd hetzelfde
private Map<RowColumn, Long> memo = new HashMap<>();

public static void main( String [] args )
{
	new Main().run();
}
public void run()
{
	log( gridTraveler( new RowColumn( 1, 1 ) ) );
	log( gridTraveler( new RowColumn( 2, 3 ) ) );
	log( gridTraveler( new RowColumn( 3, 2 ) ) );
	log( gridTraveler( new RowColumn( 3, 3 ) ) );
	log( gridTraveler( new RowColumn( 4, 4 ) ) );
	log( gridTraveler( new RowColumn( 6, 6 ) ) );
	log( gridTraveler( new RowColumn( 18, 18 ) ) );
	log( gridTraveler( new RowColumn( 50, 50 ) ) );
	log( memo.size() );
}
private void log( long aNumber )
{
	System.out.println( aNumber );
}
public long gridTraveler( RowColumn aRowColumn )
{
	if ( memo.get( aRowColumn ) != null )
	{
		return memo.get( aRowColumn );
	}
	if ( aRowColumn.row == 0 || aRowColumn.column == 0 )
	{
		return 0;
	}
	if ( aRowColumn.row == 1 && aRowColumn.column == 1)
	{
		return 1;
	}
	long result = gridTraveler( aRowColumn.down() ) + gridTraveler( aRowColumn.right() );
	memo.put( aRowColumn, result );
	return result;
}

/*
 * 3
20
252
2333606220

 */
}
