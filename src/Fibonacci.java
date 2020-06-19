public class Fibonacci {
    public static void main(String[] args) {
        int n = 1;
        int f = of(n);
        while (f <= 200) {
            System.out.println(f);
            n += 1;
            f = of(n);
        }
    }

    public static int of(int n) {
        if (n == 1 || n == 2) return 1;
        int p1, p2 = 1;
        int rst = 2;
        for (int i = 3; i < n; i++) {
            p1 = p2;
            p2 = rst;
            rst = p1 + p2;
        }
        return rst;
    }
}