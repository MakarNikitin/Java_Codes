public class Vip {
    public void calculatorVip(double bodyCredit, double monthPay, double percent) throws Exception {
        double result = 0;
        double counter;
        if ((monthPay * 12 < (bodyCredit * (percent / 100))) || bodyCredit < 0) {
            throw new Exception("Вы не сможете выплатить кредит");
        } else {
            while (bodyCredit - monthPay * 12 > 0) {
                bodyCredit = (bodyCredit - monthPay * 12);
                counter = (percent / 100 * bodyCredit);
                bodyCredit = bodyCredit + counter;
                result += counter;
            }
            System.out.println(result);
        }
    }
}
