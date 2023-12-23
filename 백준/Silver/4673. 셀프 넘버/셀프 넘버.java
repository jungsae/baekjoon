class Main {
    static boolean check[] = new boolean[10001];

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int dn = d(i);
            if (dn <= 10000) {
                check[dn] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }
    }

    static int d(int n) {
        int sum = n;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
