package jCoffee_Library.Code;

import java.util.ArrayList;
import java.util.List;

public interface Library {
    
    public static void main( String[] args ) {

            System.out.println("Bem Vindo a Biblioteca!");

        System.out.println();

        List<Midia> acervo = new ArrayList<>();

        acervo.add( new Book ( 0 , "Alice no País das Maravilhas" , 1871 , "Lewis Carroll" ) );
        acervo.add( new Movie ( 1 , "Baby Driver" , 2017 , "Edgar Wright" , 120 ) );
        acervo.add( new Music ( 3 , "Justice" , 2016 , "Justin Bieber" , 16 ) );

        System.out.println("Midias Registradas:");

        for ( Midia midia : acervo ) {

            System.out.println();
            
            System.out.println( midia.getDetalhes() );
            
        }

        for ( Midia midia : acervo ) {

            if ( midia instanceof iLendable ) {

                iLendable itemEmprestavel = ( iLendable ) midia;

                System.out.println();

                itemEmprestavel.emprestar();
                itemEmprestavel.devolver();

            }

        }

    }

}
