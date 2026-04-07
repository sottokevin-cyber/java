import java.util.Scanner;

public class task4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String input = scanner.nextLine();
        StringBuilder palindrome = new StringBuilder(input);
        if (input.equals((palindrome.reverse()).toString())){
            System.out.println("the input string is a palindrome");
        }else{
            System.out.println("the input string is not a palindrome");
        }

    }

}
