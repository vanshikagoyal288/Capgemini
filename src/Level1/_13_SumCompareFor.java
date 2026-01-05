package Level1;
import java.util.Scanner;

public class _13_SumCompareFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n >= 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;

            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
            System.out.println(sumFormula == sumLoop);
        }
        input.close();
    }
}


