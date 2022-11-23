import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] words = name.split(" ");
        MistakeChecker check = new MistakeChecker();
        check.compute(words);
    }
}
