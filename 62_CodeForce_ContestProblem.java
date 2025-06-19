import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of points
            int s = sc.nextInt(); // Starting point

            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = sc.nextInt();
            }

            // Sort the array if not already sorted
            Arrays.sort(x);

            int mi = x[0];         // Minimum value
            int ma = x[n - 1];     // Maximum value

            // Calculate the distance to cover the interval plus distance from 's' to closer end
            int ans = (ma - mi) + Math.min(Math.abs(s - mi), Math.abs(s - ma));
            System.out.println(ans);
        }

        sc.close();
    }
}
