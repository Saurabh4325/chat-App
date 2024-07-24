package strings;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; // created using String literals stored in the method area
        String name2 = "CipherSchools";
        String name3 = new String("CipherSchools"); // creating string using constructors
        String name4 = new String("CipherSchools");

        // Comparing references for objects and values for primitive data types
        System.out.println(name == name2); // true, because both refer to the same literal in the string pool
        System.out.println(name3 == name4); // false, because they are different objects in heap
        System.out.println(name == name3); // false, because one is from the string pool and the other is a new object

        // Strings are immutable, and every time we do an operation on a string, a new object is created
        System.out.println("-----------------------------------------------");

        // 8. Extract a substring
        System.out.println("Extract a substring");
        String WF = "Wakanda forever";
        String subString = WF.substring(3); // from starting index included till the end of string
        System.out.println(subString);
        String subString2 = WF.substring(3, 7); // from starting index included till the ending index [excluded]
        System.out.println(subString2);

        // 9. Finding a character at a given index
        System.out.println("Finding a character at a given index ");
        System.out.println(name.charAt(4));
        char charAtIndex = name.charAt(6);
        System.out.println(charAtIndex);

        // 10. Char Array from a string
        System.out.println("Char Array from a string");
        char[] arr2 = name.toCharArray(); // string to charArray
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // 11. Check if a string is empty
        System.out.println("Check if a string is empty");
        String emptyString = new String();
        String emptyString2 = " ";
        String blankString = "  ";
        System.out.println(emptyString);
        System.out.println(emptyString2);
        System.out.println(emptyString.equals(" "));
        System.out.println(emptyString2.equals(" "));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString2.isEmpty());
        System.out.println(blankString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println(emptyString2.isBlank());
        System.out.println(blankString.isBlank());

        // 12. Comparing strings lexicographically (alphabetically)
        System.out.println("Comparing strings lexicographically (alphabetically)");
        String textOne = "QHey";
        String textTwo = "QBye";
        System.out.println(textOne.compareTo(textTwo)); // compares characters to character
        System.out.println(textTwo.compareTo(textOne));

        // 13. Trimming whitespaces from front and end
        System.out.println("Trimming whitespaces from front and end");
        String S5 = new String("Hello  ");
        String S6 = new String("    Hello");
        String S7 = new String("   Hello   People  ");
        System.out.println("*" + S5.trim() + "*");
        System.out.println("*" + S6.trim() + "*");
        System.out.println("*" + S7.trim() + "*");

        // 14. Replacing a character
        System.out.println("Replacing a character");
        System.out.println(name.replace('o', 'O'));
        System.out.println(name.replace("oo", "OO"));
    }
}
