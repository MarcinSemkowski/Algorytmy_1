package Zadania_1;

    public class Cash {


         private int cases;

         private int[] cash = {20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};

         private int[] count_c = new int[cash.length];
         private String[] name = {"200zl","100zl","50zl","20zl","10zl","5zl","2zl","1zl","50gr","20gr","10gr",
                 "5gr","2gr","1gr"};



        public Cash(int cases){

         this.cases = cases;


       }


        public void count(double  amount){


           long g_amount = Math.round(amount * 100 ) ;


           // while(g_amount != 0 ){

             for(int i =0; i < cash.length ; i++){



               if(g_amount >= cash[i]){
                  /* if(i == cash.length -1){
                       count_c[i] = (int)g_amount;

                       g_amount =0;
                   }
                   */



                       count_c[i] = Math.round(g_amount / cash[i]);

                       g_amount = g_amount % cash[i];



               }

             }


           //}




          }





      public void  showMonetization(){

        for(int i =0; i < name.length -1; i++){


            if(count_c[i] != 0) {
                System.out.println(name[i] + " =  " + " x"+count_c[i]);
            }

        }



      }





       public int getCases() {
            return cases;
        }
    }


