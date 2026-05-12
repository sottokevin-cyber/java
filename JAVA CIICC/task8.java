public class task8 {
    public static int addAll(int... numbers) {
        int total = 0;
        int cumulative = 0;
        for (int number : numbers) {
            total += number; 
            for(int i=0; i<=number;i++){
                cumulative = cumulative + i ;
        }
        System.out.println(number + " = " + cumulative);
        cumulative = 0;
    }
        return total;
    }
    
    public static void main(String[] args) {
        
        System.out.println("total sum is " + addAll(4,25,10));


    }
}
