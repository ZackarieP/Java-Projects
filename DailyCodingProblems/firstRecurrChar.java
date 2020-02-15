/**
 * firstRecurrChar
 */
public class firstRecurrChar {

    public static void main(String[] args) {

        firstRecurrCharacter("word");
        System.out.println();
        firstRecurrCharacter("wordd");

    } // end main method

    // Given a string, return the first recurring letter that appears.
    // If there are no recurring letters, return 'None'

    public static String firstRecurrCharacter(String word) {

        String[] letters = word.split("");

        String temp = "";

        for (int i = 0; i < word.length(); i++) {

            if (letters[i].equals(letters[i + 1])) {
                return temp;
            } else {
                return "None";
            }
        } // return 'i' loop

    } // end firstRecurrChar method
} // end class