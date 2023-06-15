//find smallest no

package com.javaarray;


public class SmalletNumber {
    public static void main(String[] args) {

        int[] arr={10,50,74,25,2,45,95};

      //  int min = 0;
        int temp=0;

      int min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            for(int j= i+1 ;j< arr.length ;j++)
            {
                if(min>arr[j])
                {
                    temp=arr[j];
                    min=temp;
                }
            }

        }
        System.out.println("min no is " +min);

    }

}
