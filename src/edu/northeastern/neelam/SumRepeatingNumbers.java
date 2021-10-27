package edu.northeastern.neelam;

import java.util.Hashtable;
import java.util.Map;

public class SumRepeatingNumbers{
    public static void main(String[] args) {

        int [] arr = new int [] {1,1,1, 2, 3, 4, 2, 7, 8, 8, 3};
        Hashtable<Integer,Integer> table = new Hashtable<>();
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            table.put(arr[i],table.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> set: table.entrySet() ) {
            if(set.getValue()>1){
               sum+= set.getKey();
            }
        }
        System.out.println(sum);
    }
}