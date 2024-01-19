import StringTraining.SpaceBtwWords;

public class Main {
    public static void main(String[] args) {
        System.out.println(SpaceBtwWords.breakCamelCase("hellomotherFucker"));
        String result = String.join("-", "Hello", "world");
        System.out.println(result);
    }
}