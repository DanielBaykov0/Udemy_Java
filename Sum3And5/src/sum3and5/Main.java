package sum3and5;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count ++;
                sum += i;
                System.out.println("Number is " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
