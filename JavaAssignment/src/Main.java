import CloudVandana.Pangram.Pangram;
import CloudVandana.RomanToInteger.RomanToInt;
import CloudVandana.ShuffleProgram.shuffleArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // First program execution
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
         Arrays.stream(originalArray).forEach(i-> System.out.print(i+" "));
        shuffleArray obj=new shuffleArray();
        int []result=obj.shuffle(originalArray);
        System.out.println();
        Arrays.stream(result).forEach(i-> System.out.print(i+" "));
        System.out.println();
        // Second program execution
        RomanToInt romanToInt=new RomanToInt();
        System.out.println(romanToInt.convert("IX"));
        System.out.println();
        // Third program execution

        Pangram pangram=new Pangram();
        pangram.allLetter("Abcdefghijklmnopqrstuvwxyz12");


    }
}