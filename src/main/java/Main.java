public class Main {

    public static void main(String[] args) {
BonusService service = new BonusService();
       int bonus = (int)service.calculate(35000, true);
System.out.println(bonus);
    }
}
