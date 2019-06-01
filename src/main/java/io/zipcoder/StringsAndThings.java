package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int count = 0;
        String[] str = input.split(" ");
        for(String word: str) {
            char c = word.charAt(word.length() - 1);
            if (c == 'y' || c == 'z' || c == 'Z' || c == 'Y') {
                count++;
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        return base.replaceAll(remove,"");

    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){

        boolean b = false;
        int i = 0;
        int n = 0;
        String temp = input;
        while (temp != null) {
            int index = temp.indexOf("is");
            if (index >= 0) {
                i++;
                temp = temp.substring(index + 2);
                System.out.println(temp);
            } else {
                break;
            }
        }

        temp = input;
        while (temp != null) {
            int index = temp.indexOf("not");
            if (index >= 0) {
                n++;
                temp = temp.substring(index + 3);
            } else {
                break;
            }
        }

        if (i == n) {
            b = true;
        }

        return b;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean b = true;
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            char c1 = 'd';
            if (i > 0) {
                c1 = input.charAt(i -1);
            }

            char c2 = 'd';
            if (i != input.length() - 1) {
                c2 = input.charAt(i + 1);
            }

            if(c == 'g' && !(c1 == c || c2 == c)) {
                b = false;
                break;
            }
        }

        return b;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        //String[] str = new String[input.length()];
        for(int i = 1; i< input.length()-1; i++) {
            char ch = input.charAt(i);
            char ch1 = input.charAt(i -1);
            char ch2 = input.charAt(i + 1);
            if(ch == ch1 && ch == ch2) {
                count++;
            System.out.println(count);
            }

        }

        return count;
    }
}
