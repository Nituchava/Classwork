
//Print even position elemnts

package com.javaarray;

public class EvenPosition {

    public static void main(String[] args)
    {
        int[] arr={5,7,9,7,6,2,4,6};
        int len=arr.length;
        for(int i=0;i<arr.length;i++)

        {
            if(i%2==0)

            {
                System.out.print(arr[i]);
            }
        }


    }
}

