public class Gauge {
    private int num = 0;
        public void increase(){
            if (6> num){
                num = num+1;
            }else {
                num = num;
            }
        }
        public void decrease(){
            if (num ==  0){
                num = num;
            }else {
                num = num-1;
            }
        }
        public int value() {
            return num;
        }
        public boolean full(){
            if (num == 5){
                return true;
            } else return false;
        }
}
