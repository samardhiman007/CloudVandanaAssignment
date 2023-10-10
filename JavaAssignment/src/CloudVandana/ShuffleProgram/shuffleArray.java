package CloudVandana.ShuffleProgram;

import java.util.Random;

public class shuffleArray {
    public int[] shuffle(int[] array){
        int[] shuffledArray = array.clone();
        Random rand = new Random();

        // Start from the last element and swap with a random element before it
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
           // System.out.println(index);
            // Swap elements
            int temp = shuffledArray[index];
            shuffledArray[index] = shuffledArray[i];
            shuffledArray[i] = temp;
        }

        return shuffledArray;
    }


}
