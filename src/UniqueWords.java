import java.util.ArrayList;

/* Project: Unique Words Counter
 * Class: SOFTWARE DESIGN METHODS
 * Author: MEHMET SOYDAN
 * Date: February 27 2025
 * This program counts the number of unique strings in an ArrayList without using a HashSet.
 */
public class UniqueWords {
    /**
     * Counts the number of unique strings in a list.
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
    public static int countUnique(ArrayList<String> list) {
        int count = 0;

        // Iterate through each element in the list
        for (int i = 0; i < list.size(); i++) {
            boolean isUnique = true;

            // Check if the current element has appeared before in the list
            for (int j = 0; j < i; j++) {
                if (list.get(i).equals(list.get(j))) {
                    isUnique = false; // Duplicate found
                    break;
                }
            }

            // If the element is unique, increment the count
            if (isUnique) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");

        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}

// we could do this with hashsets instead of nested loops too
//import java.util.ArrayList;
//import java.util.HashSet;

//public class UniqueWords {
    /**
     * Counts the number of unique strings in a list.
     * @param list ArrayList of strings to be examined
     * @return number of unique strings in the list
     */
   // public static int countUnique(ArrayList<String> list) {
        // Use a HashSet to store unique elements
       // HashSet<String> uniqueSet = new HashSet<>(list);
        // The size of the HashSet is the number of unique elements
       // return uniqueSet.size();
   // }

   // public static void main(String[] args) {
        //ArrayList<String> words = new ArrayList<>();
        //words.add("apple");
        //words.add("orange");
        //words.add("blackboard");
        //words.add("apple");
        //words.add("orange");
        //words.add("sun");
        //words.add("moon");

       //int unique = countUnique(words);
        //System.out.println(words + " has " + unique + " unique words");
    //}
//}
