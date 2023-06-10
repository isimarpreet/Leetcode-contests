
/*Minimize String Length

Given a 0-indexed string s, repeatedly perform the following operation any number of times:
Choose an index i in the string, and let c be the character in position i. Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
Your task is to minimize the length of s by performing the above operation any number of times.
Return an integer denoting the length of the minimized string.

Explananation-
To solve this question we can use string builder class . String 
Builder class search for the characters that occurs at left and
Right position of the string. While searching if such characters 
Are found it deletes the closest right and left occurrences. This
Process will continue until no more deletions can be  made.
We can use boolean data type to solve this question.

First we will iterate through string using for loop . Then we will 
Extract a character  and then initialise 2 variables say left index and right
Index. Using the search techniques that is lastIndexOf and indexOf to find their values . Then see that if it satisfies the if condition then delete the characters .



Java code- */



class Solution {
    public int minimizedStringLength(String s) {
       StringBuilder sb = new StringBuilder(s);

        boolean found = true;
        while (found) {
            found = false;
            for (int i = 0; i < sb.length(); i++) {
                char c = sb.charAt(i);
                int leftIndex = sb.lastIndexOf(Character.toString(c), i - 1);
                int rightIndex = sb.indexOf(Character.toString(c), i + 1);

                if (leftIndex != -1 && rightIndex != -1) {
                    sb.deleteCharAt(leftIndex);
                    sb.deleteCharAt(rightIndex - 1);
                    found = true;
                    break;
                }
            }
        }

        return sb.length();
    }
  }
