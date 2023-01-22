public class Main {
    static int sumOfMultiples(int n){
        int n3 = (n-1) / 3;
        int n5 = (n-1) / 5;
        int n15 = (n-1) / 15;
        return (int) (3*n3*(n3+1) / 2) + (5*n5*(n5+1) / 2) - (15*n15*(n15+1) / 2);
    }
    public static void main(String[] args) {
        System.out.println(sumOfMultiples(1000));
    }
}
