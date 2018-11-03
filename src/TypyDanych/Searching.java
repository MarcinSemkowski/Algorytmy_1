package TypyDanych;

    public class Searching {



        public int number(int[] array, int num){
           int number =0 ;
         for(int i =0; i < array.length; i++){

           if(array[i] == num){

             number = i;
            break;
           }


         }


         return number;
        }








    }
