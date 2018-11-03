package TypyDanych;

import java.util.Random;

public class Zadanie_p {


      int[] tablicaInt = new int[6];

      String[] tablicaString = new String[6];




       public int[] randomArray(){

       int[] randomarray = new int[6];

       Random r = new Random();

       for(int i =0; i < randomarray.length -1; i++){

         randomarray[i] = r.nextInt();

       }
        return  randomarray;
       }




       public int[] evenArray(){

         int[] even = new int[6];

         even[0] = 2;

         even[1] = 4;

         even[2] = 6;

         even[3] = 8;

         even[4] = 10;

         even[5] = 12;



           return even;
       }




    public int[] oddArray(){

        int[] odd = new int[6];

        odd[0] = 1;

        odd[1] = 3;

        odd[2] = 5;

        odd[3] = 7;

        odd[4] = 11;

        odd[5] = 13;



        return odd;
    }

    }
