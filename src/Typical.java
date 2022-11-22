public class Typical {
    public void calculatorTypical(double bodyCredit, double monthPay, double percent) {
        if ((monthPay * 12 < (bodyCredit * (percent / 100))) || bodyCredit < 0) {
            System.out.println("throws Exception");
        } else {
            double result = 0;
            while (bodyCredit > 0) {
                result += bodyCredit * (percent / 100);
                bodyCredit = bodyCredit + (bodyCredit * (percent / 100)) - monthPay * 12;
            }
            System.out.println(result);
        }
    }
}