public class FactorialNumber {
    public static void main(String[] args) {
        int n = 8;
        int sum=1;
        System.out.print( + n + "! = ");
        for (int i=n; i>=1; i--){
            sum= sum*i;
        }
        System.out.println(sum);
    }
}