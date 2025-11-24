import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int sum = 0;
        int h = 0;

        for(int i = 0; i < y; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            h = a*b;
            sum += h;
        }
        if (sum == x) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}