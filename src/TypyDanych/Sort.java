package TypyDanych;

import Zadania_2.BubbleSort;
import Zadania_2.InsertionSort;

public class Sort {




       public int[] sort(int[] array, int number){

        int[] new_array = new int[array.length +1];

        for(int i = 0; i < new_array.length; i++){

            if(i == new_array.length -1 ){

              new_array[i] = number;
              continue;
            }

          new_array[i] = array[i];

        }

           InsertionSort sort = new InsertionSort();




        return sort.insertionSort(new_array);
       }




    }
