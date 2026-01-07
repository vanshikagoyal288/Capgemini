//Factors, Perfect, Abundant, Deficient, Strong
package Methods.level3;

public class Q6 {

    static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[idx++] = i;

        return f;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) sum += i;
        return sum == n;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 145;
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
