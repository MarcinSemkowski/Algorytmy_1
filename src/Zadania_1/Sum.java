package Zadania_1;

import java.util.Scanner;

public class Sum {


    public static final Scanner scan = new Scanner(System.in);



          int z = -1;

           int n =0;

          int g;

           int[] numbers = new int[n];



          int t = 0;


        public void sum() {

          System.out.println("Podaj ile liczb chcesz dodać:");

           this.n = scan.nextInt();

             numbers = new int[n];


           while( g != n){
               g++;

               System.out.println("Podaj liczbę :");

                z = scan.nextInt();

                numbers[t] = z ;

              t++;
           }

          count();


        }


        public void count (){

         int[] wynik = new int[n];



           wynik[0] = 0;

           int t =0;


         for(int i = 0; i <= n -1   ; i++) {

             if(i >= 2){

                t++;
             }
             wynik[i] = wynik[t] + numbers[i];




         }

         for(int i =0; i <= wynik.length -1; i++){

             System.out.println(wynik[i]);

         }


        }









    }



































