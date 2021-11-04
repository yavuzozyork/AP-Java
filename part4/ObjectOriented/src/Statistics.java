import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;
    private double average;
    private ArrayList<Integer> lists = new ArrayList<>();
        public Statistics(){
            this.count = 0;
        }
        public void addNumber(int number){
            this.count ++;
            this.lists.add(number);


        }
        public int getCount(){
            return this.count;
        }

}
