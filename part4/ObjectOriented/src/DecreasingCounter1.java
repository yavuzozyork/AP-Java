public class DecreasingCounter1 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(16);
        counter.Print();
        counter.Decrement();
        counter.Print();
        counter.Decrement();
        counter.Print();
        counter.Decrement();
        counter.Print();
        counter.Decrement();
        counter.Print();
        counter.Decrement();
        counter.Print();
        counter.Decrement();
        counter.reset();
    }
}
