package Zadania_2;

    public class QuickSort {




       public int[] sort_quick(int[] sort, int left, int right){

          int pivot = sort[(left+right) /2];

          int l,p,x;

          l = left;

          p = right;


          do{

          while(sort[l] > pivot)l++;

          while(sort[p] < pivot) p--;
          if(l <=p){

            x = sort[l];

            sort[l] = sort[p];

            sort[p] = x;



          }

          }while(l <=p);

          if(p > left ) sort_quick(sort,left,p);

          if(l < right) sort_quick(sort,l,right);


          return sort;
       }



    }



