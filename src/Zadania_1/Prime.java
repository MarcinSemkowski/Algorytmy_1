package Zadania_1;

public class Prime {




     public boolean prime( int n){

          boolean result = true;

         if(n < 2){

             result = false;
            return result ;


         }

           else {
             int i = 2;

             while (i < n) {

                 if (n % i == 0) {

                     result = false;

                     return result ;


                 }

                 else {
                     i++;
                     result = true;


                 }

             }


         }
        return  result;
     }



}
