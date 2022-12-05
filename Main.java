package com.company;
import java.util.ArrayList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println();
        int[] num_array ={12,21,32,15,35,156,1,0,45};
        System.out.println("unsorted Array:"+ Arrays.toString(num_array));
        System.out.println("sorted Array:"+ Arrays.toString(sort(num_array)));}
     public static  int[] sort(int[] array) {
        int length = array.length;
        for (int i=1;i<length;i++){
            int key = array[i];
           int j=i-1;
            while (j >=0 && array[j] > key ){
                array[j+1]=array[j];
                j=j-1;}
            array[j+1] =key;}
        return array;}}

