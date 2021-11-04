public class Statics1 {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(4);
        statistics.addNumber(8);
        statistics.addNumber(7);
        statistics.addNumber(2);
        System.out.println("Count = "+statistics.getCount());
    }
}
