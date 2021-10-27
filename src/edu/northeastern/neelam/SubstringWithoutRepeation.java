package edu.northeastern.neelam;

import java.util.HashSet;
import java.util.Set;

public class SubstringWithoutRepeation {

    public static void main(String[] args) {
        System.out.println(longestSubStringNoRepeat("ayzpppqq"));
    }

    private static String longestSubStringNoRepeat(String str){
        if(str.length() <= 1){
            return str;
        }
        HashSet<Character> set = new HashSet<>();

        int start = 0;
        int maxLength = 0;
        String longestSubstring = "";

        for(int current = 0 ; current < str.length(); current ++){
            if( !set.contains(str.charAt(current) )){
                set.add(str.charAt(current));
                if(maxLength <  current - start +1 ){
                    maxLength = current - start +1;
                    longestSubstring = str.substring(start, current+1);
                }
            }else{
                while( set.contains(str.charAt(current)) ) {
                    set.remove(str.charAt(start));
                    start ++;
                }
                set.add(str.charAt(current));
            }
        }
        return longestSubstring;

    }

}