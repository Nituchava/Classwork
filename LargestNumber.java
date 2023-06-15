// find largest number in array

package com.javaarray;

public class LargestNumber {

    public static void main(String[] args) {

          int[] arr={10,50,74,25,62,45,95};

        int max = 0;
        int temp=0;

        max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            for(int j= i+1 ;j< arr.length ;j++)
            {
                if(max<arr[j])
                {
                  temp=arr[j];
                    max=temp;
                }
            }

        }
        System.out.println("max no is " +temp);

    }
}