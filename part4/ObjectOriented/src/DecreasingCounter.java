public class DecreasingCounter {
    private int value;
        public DecreasingCounter(int value){
            this.value = value;
        }
        public void Print(){
            System.out.println("Value: "+this.value);
        }
        public void Decrement(){
            if (0<this.value){
                this.value = this.value -1;
            }
        }
        public void reset(){
            this.value = 0;
        }
}
