public class task9 {

    public static int add (int a,int b){
        return(Math.addExact(a, b));
    }
    public static int subtract (int a,int b){
        return(Math.subtractExact(a, b));
    }
    public static int multiply (int a,int b){
        return(Math.multiplyExact(a, b));
    }
    public static int divide (int a,int b){
        return(Math.floorDiv(a, b));
    }
    public static void main(String[] args) {
        System.out.println(add(10,5));
        System.out.println(subtract(10,2));
        System.out.println(multiply(10,3));
        System.out.println(divide(40,4));
    }
}
