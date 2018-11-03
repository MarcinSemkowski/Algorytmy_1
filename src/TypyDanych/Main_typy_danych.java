package TypyDanych;

import Zadania_2.InsertionSort;
import sun.invoke.empty.Empty;

import java.util.EmptyStackException;


public class Main_typy_danych {


    public static void main(String[] args) {

       /*

       Zadanie_p po = new Zadanie_p();

       for( int i = 0; i < po.evenArray().length ; i++ ){


         if(i == po.evenArray().length ){

           throw new EmptyStackException();


         }
           System.out.println(po.evenArray()[i]);

       }

        */


       /*
          Searching s = new Searching();

        Zadanie_p po = new Zadanie_p();

          System.out.println( s.number(po.evenArray(),2));

        */


       int[] array = {5,4,3,2,1};

        InsertionSort s = new InsertionSort();

        Sort sort = new Sort();



        for(int i =0;i< array.length ; i++){

            System.out.println( s.insertionSort(array)[i]);



        }

           System.out.println();


        for(int i =0;i< array.length + 1; i++){



          System.out.println(sort.sort(s.insertionSort(array),8)[i]);

       }










    }


}
