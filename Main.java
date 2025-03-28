import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i < n; i++) {
            int flag = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    flag++;
            }
            if (flag < 3) System.out.println(i);

        }
    }
}