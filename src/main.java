import Zadania_1.Cash;
import Zadania_1.Reverse;
import Zadania_1.Sum;
import Zadania_2.*;

import java.util.Scanner;

public class main {


           public static final Scanner scan = new Scanner(System.in);



        public static void main(String[] args) {


            //CASH


            /*
           System.out.println("Podaj liczbę wystopień :");

           int n = scan.nextInt();

            Cash cash = new Cash(n);

            System.out.println("Podaj kwotę: ");
             double a = scan.nextDouble();

            cash.count(a);

            cash.showMonetization();

             */





            /*
              int[] array ={1,2,3,4,5};

              for(int i =0; i < array.length  ; i++){

                  System.out.println(array[i]);

              }
              */


              /*
               int [] inde = new int[array.length];
              int  index = 1;

             for(int i = 0; i < array.length ; i++){

                 if( i == array.length -1){
                     inde[i] = array[0];
                    continue;
                 }

                 inde[i] = array[index++];




                }


                for(int i =0; i < inde.length; i++){

                  System.out.println(inde[i]);

                }

              /*
              Reverse r = new  Reverse();

              r.arrayS(array);

              */

               /*
              String[] str = {"Ala","ma","kota","able"};


            Comparison c = new Comparison();

           System.out.println( str[c.comparison(str)]);

                          */



                 /*
               int[] sort = {5,4,3,2,1};

            BubbleSort s = new  BubbleSort();

            for(int i =0; i < sort.length; i++) {

                System.out.println(s.bubbleSort(sort)[i]);

            }
            */
             /*
              int[] in = {1,2,3,4,5,6,7,8,9,10,11} ;


            QuickSort s = new QuickSort();


            System.out.println("Zaczynamy" );

            for(int i =0; i < in.length -1 ; i++ ){

              System.out.println(s.sort_quick(in,0,in.length -1)[i]);

            }
               */



                     BubbleSort b = new BubbleSort();
                     QuickSort q = new QuickSort();

                     Person p1 = new Person("Mt","Ter",44);
            Person p2 = new Person("Trf","Tfr",22);

            Person p3 = new Person("Cdf","Trer",12);
            Person p4 = new Person("Fre","Tuiuo",9);

                Person.addPerson(p1);
               Person.addPerson(p2);
            Person.addPerson(p3);
            Person.addPerson(p4);

            Person[] p =  Person.exampleArray();





            /*
            int[] in = {11,10,9,8,7,6,5,4,3,2,1} ;

            InsertionSort is = new InsertionSort();

            for(int i =0; i < in.length -1 ; i++ ){

                System.out.println(is.insertionSort(in)[i]);

            }
               */


        }



    }

