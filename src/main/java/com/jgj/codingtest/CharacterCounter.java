package com.jgj.codingtest;

import java.util.Arrays;

public class CharacterCounter {

    private int getMaxWord(char[] sentence, char input, char delimeter, StringBuilder sb) {
        int length = sentence.length;
        int startIndex = -1, count=0, maxcount=0;
        int retIndex = -1, tempLength=0, wordlength = 0;
        for( int i=0; i < length; i++) {
            if(startIndex == -1 )
                startIndex = i;

            if(input == sentence[i]) {
                count++;
            }

            if(delimeter == sentence[i] || i == (length-1 ) ) {
                if( i == (length-1 ) && delimeter != sentence[i] )
                    i++;

                if (count > maxcount ||
                        ( count!=0 && count == maxcount && ( i - startIndex > wordlength ) ) ) {
                    maxcount = count;
                    wordlength = i - startIndex;
                    retIndex = startIndex;
                }

                startIndex = -1;
                count = 0;
            }
        }
        if( sb != null && wordlength > 0) {
            sb.append(Arrays.copyOfRange(sentence, retIndex, retIndex + wordlength));
        }

        return retIndex;
    }

    public String findWordWithMostCharacters(String sentence, char input) {

        if (null == sentence || sentence.isEmpty() || input == ' ' )
            return "";

        StringBuilder sb = new StringBuilder();
        getMaxWord(sentence.toCharArray(), input, ' ', sb);

        System.out.println("The Word containing most number of given character is => " + sb + " for Input character " + input);

        return sb.toString();
    }

    public int getStartingPos(int num) {

        int start = getMaxWord(Integer.toBinaryString(num).toCharArray(),'1','0', null);
        System.out.println("Starting position of the longest continuous sequence of 1 is => " + (start + 1) + " in " + Integer.toBinaryString(num) );
        return (start + 1);

    }

    public static void main(String[] args) {

    }


}
