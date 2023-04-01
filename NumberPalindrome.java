public class CheckPalindrome {

public static void main(String[] args)
        {
                // Input string
                String str = "abbba";

                // Convert the string to lowercase
                str = str.toLowerCase();
                
// Initializing an empty string to store the reverse
                // of the original str
                String rev = "";

for (int i = str.length() - 1; i >= 0; i--) {
                        rev = rev + str.charAt(i);
                }

// Checking if both the strings are equal
                if (str.equals(rev)) {
System.out.println("Yes, the input is a Palindrome");
}
else 
System.out.println("No, the input is not a Palindrome");                
}
}