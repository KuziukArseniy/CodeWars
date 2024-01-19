package CollatzConjecture;

public class CollatzConjecture {
    public static String collatz(int n) {
        StringBuilder collatz = new StringBuilder();
        collatz.append(n);
        while (n != 1) {
            if (n % 2 == 0){
                n /= 2;
                collatz.append("->").append(n);
            }
            else {
                n = 3 * n + 1;
                collatz.append("->").append(n);
            }
        }
        return collatz.toString();
    }
}
