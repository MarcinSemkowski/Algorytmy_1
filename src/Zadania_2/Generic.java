package Zadania_2;

    public class Generic{



        public <T> T pickGeneric(T[] array, int index){

          return array[index];

        }


        public <T> int findGeneric(T[] array, T element){

            for(int i =0; i < array.length ; i++) {
                if (array[i].equals(element)) {

                    return i;


                }


            }
         return -1;
        }



    }
