package src;

import com.sun.scenario.effect.Brightpass;

public class quicksort {


 public static void quicksort(int[] arr, int start, int end ){
     //*Partition de array -> partitionig the arrayreturn the position of the pivot
     //*quicksort(a,start,pIndex-1)
     //*quicksort(a,pIndex+1,end)

     if (start >= end){
        return ;
     }

     int index = partition(arr,start,end);
     quicksort(arr,start,index-1);
     quicksort(arr,index+1,end);

 }


 public static int  partition(int[] array,int start, int end){

    int pivot = array[end];
    int pIndex = start;


     for (int i = start; i < end; i++) {

        if(array[i]<= pivot){

            int temp = array[pIndex];
            array[pIndex ] = array[i];
            array[i] = temp;
            pIndex++;

        }



     }
     int temp = array[pIndex];
     array[pIndex] = pivot;
     array[end] = temp;

     return pIndex;
    }

    public static void main(String[] args) {

     int A [] = {7,2,1,6,8,5,3,4};
     quicksort(A,0,7);

        for (int i = 0; i < 7; i++) {
            System.out.println(A[i]);
        }
    }
}
