
package learnrecursivemethods.methods;


public class ReverseAString {

    // Example: reverse("hello") = "olleh"
    public  String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
