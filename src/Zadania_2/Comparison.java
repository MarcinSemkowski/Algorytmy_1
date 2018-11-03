package Zadania_2;

    public class Comparison {





        public int comparison(String[] string){

          int l =0 ;


          int index = 1;

            for(int i =0; i < string.length; i++){
            if( i ==  string.length -1){

              if(string[i].length() > string[i -1].length() ) {
                  l = i;
                  continue;
              }
              else{

               l = i;



              }

            }



            if(string[i].length() > string[index++].length() ){

               l = i;

            }
            else{

             l= i;



            }




            }

           return l;
        }










    }
