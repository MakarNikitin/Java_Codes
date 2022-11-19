import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String[] words = name.split(" ");
        if ((words.length) == 4 && ((Objects.equals(words[3], "human")) || (Objects.equals(words[3], "business")))) {
            double bodycredit = Double.parseDouble(words[0]);
            double monthpay = Double.parseDouble(words[1]);
            double percent = Double.parseDouble(words[2]);
            String type = words[3];
            double y;
            double z = 0;
            double r = 0;
            if ((monthpay * 12 < (bodycredit * (percent / 100))) || bodycredit < 0) {
                System.out.println("throws Exception");
            } else {
                if ((Objects.equals(type, "human"))) {
                    while (bodycredit > 0) {
                        r += bodycredit * (percent / 100);
                        bodycredit = bodycredit + (bodycredit * (percent / 100)) - monthpay * 12;
                        System.out.println(r);
                    }
                }
                if (Objects.equals(type, "business")) {
                    while (bodycredit - monthpay * 12 > 0) {
                        bodycredit = (bodycredit - monthpay * 12);
                        y = (percent / 100 * bodycredit);
                        bodycredit = bodycredit + y;
                        z += y;
                    }
                    System.out.println(z);
                }
            }
        } else {
            System.out.println("throws Exception");
        }
    }
}