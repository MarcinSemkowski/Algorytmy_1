package Zadania_2;

    public class BubbleSort {


        //todo zrobić w chacie 



       public <T  extends Comparable>  T[] BubbleSort( T[] sort    ){


           int n = sort.length;
         int t = sort.length -1;
           for( int i = 1; i <t; i++){

            for(int j = n - 1; j >= 1; j--){

                if(sort[j].compareTo(sort[j -1]) > 0){

                 T bufor = sort[j];

                 sort[j] = sort[j -1] ;

                 sort[j -1] = bufor;



                }

            }


         }




        return sort;
       }







    }
