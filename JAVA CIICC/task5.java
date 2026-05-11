import java.util.Scanner;

public class task5 {

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in); 
            System.out.print("Enter 1st number: ");
            int x = scanner.nextInt();
            System.out.print("Enter 2nd number: ");
            int y = scanner.nextInt();
            System.out.print("Enter 3nd number: ");
            int z = scanner.nextInt();
            if(x==y&&x==z){
                System.out.println("all numbers are equal");
            }else{

                if(x>y){
                    if(x>z)System.out.println(x + " is the largest number");
                    else System.out.println(z + " is the largest number");
                }else {
                if(y>z)System.out.println(y + " is the largest number");
                    else System.out.println(z + " is the largest number");
                }


            }
                

    }
}
