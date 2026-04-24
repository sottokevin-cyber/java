import java.util.Scanner;

public class task5 {
   
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Enter 1st number: ");
    int x = scanner.nextInt();
    System.out.print("Enter 2nd number: ");
    int y = scanner.nextInt();
    System.out.println(x+" + " + y + " = " + addNum(x,y) );
    System.out.println(x+" - " + y + " = " + subNum(x,y) );
    System.out.println(x+" * " + y + " = " + mulNum(x,y) );
    System.out.println(x+" / " + y + " = " + divNum(x,y) );

}

public static int addNum(int a, int b){

    return a+b;
    
}
public static int subNum(int a, int b){

    return a-b;
    
}

public static int mulNum(int a, int b){

    return a*b;
    
}

public static int divNum(int a, int b){

    return a/b;
    
}
}


