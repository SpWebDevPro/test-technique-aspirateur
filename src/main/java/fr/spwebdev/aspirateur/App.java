package fr.spwebdev.aspirateur;

/**
 * TP Aspirateur!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to TP Aspirateur" );
        Aspi myAspi = new Aspi(5,5,directionEnum.N);
        System.out.println(myAspi.toString()); 
        myAspi.move(commandEnum.D);
        myAspi.move(commandEnum.A);
        myAspi.move(commandEnum.D);
        myAspi.move(commandEnum.A);
        myAspi.move(commandEnum.D);
        myAspi.move(commandEnum.A);
        myAspi.move(commandEnum.D);
        myAspi.move(commandEnum.A);
        myAspi.move(commandEnum.A);
        System.out.println(myAspi.toString()); 
        
    }
    
    
}
