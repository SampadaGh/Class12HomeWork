package homeWorkClass12;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        2) Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String reverse="Sampada";
        int j=reverse.length();
        for (int i = j-1; i >=0 ; i--) {
            System.out.print(reverse.charAt(i));

        }
    }
}
