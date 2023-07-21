import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int mod = (int) 1e9 + 7;
        int[] prevIndex = new int[n + 1];
        Arrays.fill(prevIndex, -1);

        long[] dp = new long[n + 1];
        dp[0] = 0;
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % mod;
            if (prevIndex[arr[i - 1]] != -1) {
                dp[i] = (dp[i] - dp[prevIndex[arr[i - 1]]] + mod) % mod;
            }
            prevIndex[arr[i - 1]] = i;
            sum = (sum + dp[i]) % mod;
        }

        System.out.println(sum);
    }
}
