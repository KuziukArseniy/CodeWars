package BuildSquare;

public class Square {
    public static String generateShape(int n) {
        StringBuilder square = new StringBuilder();
        for (int i = 0; i < n; i++) {
            square.append("+".repeat(n));
            if (i == n - 1)
                break;
            square.append("\n");
        }
        return square.toString();
    }
}
