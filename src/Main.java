import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] words = name.split(" ");
        MistakeChecker check = new MistakeChecker();
        check.Checker(words);
    }
}
