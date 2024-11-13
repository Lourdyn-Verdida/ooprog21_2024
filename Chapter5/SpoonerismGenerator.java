import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = scanner.nextLine();
        
        System.out.print("Enter the second word: ");
        String secondWord = scanner.nextLine();
        
        if (firstWord.isEmpty() || secondWord.isEmpty()) {
            System.out.println("Words cannot be empty.");
            return;
        }
        
        if (!containsVowel(firstWord) || !containsVowel(secondWord)) {
            System.out.println(firstWord+" and "+secondWord+" do not contain a vowel. Cannot generate a spoonerism.");
            return;
        }
        
        if (startsWithVowel(firstWord) || startsWithVowel(secondWord)) {
            System.out.println(firstWord+" and "+secondWord+" do not contain a vowel. Cannot generate a spoonerism.");
            return;
        }
        
        String newFirstWord = secondWord.charAt(0) + firstWord.substring(1);
        String newSecondWord = firstWord.charAt(0) + secondWord.substring(1);
        
        System.out.println("The spoonerized words are: " + newFirstWord + " " + newSecondWord);
    }

    public static boolean containsVowel(String word) {
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean startsWithVowel(String word) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(word.charAt(0)) != -1;
    }
}
