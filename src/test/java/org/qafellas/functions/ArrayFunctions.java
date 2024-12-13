package org.qafellas.functions;

public class ArrayFunctions {
    public int sumOfElements(int [] arr){
        int sum=0;
        for(int elem : arr){
            sum += elem;
        }
          return sum;
    }

    public int maxNum(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
