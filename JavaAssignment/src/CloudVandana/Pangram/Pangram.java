package CloudVandana.Pangram;

public class Pangram {

    public  void allLetter(String str)
    {
        // Converting the given string
        // into lowercase
        str = str.toUpperCase();

        boolean allLetterPresent = true;

        // Loop over each character itself
        for (char ch = 'A'; ch <= 'Z'; ch++) {

            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        // Check if all letter present then
        // print "Yes", else print "No"
        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
