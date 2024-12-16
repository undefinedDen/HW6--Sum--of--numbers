package app;

public class Main {

    static int sum = 0;
    static int count = 1;
    static int totalSum;

    public static void main(String[] args) {
        do {
            sum += count;
            System.out.println("Num is " + count + ", sum is " + sum);
            count++;
        } while (count <= 6);
        totalSum = sum;
        System.out.println("-------------------------------------");
        System.out.println("Total Sum is " + totalSum);
    }
}