package me.elice.sort;

/**
 * Created by pokeoseu on 2017. 6. 26..
 */
public class Quick {
    public int[] sort(int[] input, int l, int r){

        int left = l;
        int right = r;
        int pivot = input[(l+r)/2];

        do{
            while(input[left] < pivot) left++;
            while(input[right] > pivot) right--;
            if(left <= right){
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) sort(input, l, right);
        if(r > left) sort(input, left, r);

        return input;
    }
}
