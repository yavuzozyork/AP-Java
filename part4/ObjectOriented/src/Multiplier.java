public class Multiplier {
    private int multiplier ;
    private int multiply;
        public Multiplier(int num1, int num2){
            this.multiplier = num1;
            this.multiply = num2;
        }
        public int Calculate(){
            return multiplier*multiply;
        }
        public String prnt(){
            return multiplier+"x"+multiply+" equals ="+Calculate();
        }
}
