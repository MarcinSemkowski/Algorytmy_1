package Zadania_2;

    public class InsertionSort {


        public int[] insertionSort(int[] sort) {

         int x;

         int i;

            int n = sort.length;

         for(int j =  n -2; j >= 0;j--){
            i = j + 1;

            x = sort[j];
            while(i < n && (x > sort[i]) ){

              sort[i -1]  = sort[i];
              i++;


           }

           sort[ i -1] = x;

         }



          return sort;
        }





    }





