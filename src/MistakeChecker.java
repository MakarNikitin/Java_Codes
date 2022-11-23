public class MistakeChecker {
    public void compute(String[] words) throws Exception {
        try {
            if (words[3].equals("human")) {
                Typical human = new Typical();
                human.calculatorTypical(Double.parseDouble(words[0]), Double.parseDouble(words[1]), Double.parseDouble(words[2]));
            } else if (words[3].equals("business")) {
                Vip business = new Vip();
                business.calculatorVip(Double.parseDouble(words[0]), Double.parseDouble(words[1]), Double.parseDouble(words[2]));
            } else {
                System.out.println("throws Exception");
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new Exception("Ошибка ввода данных");
        }
    }
}