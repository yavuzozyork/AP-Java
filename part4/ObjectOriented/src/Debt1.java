public class Debt1 {
    public static void main(String[] args) {
        Debt mortgage = new Debt(120, 2);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

    }
}
