public class BodyMassİndex {
    private String name;
    private int weight;
    private int height;
        public BodyMassİndex(String name,int weight,int height){
            this.height = height;
            this.name = name;
            this.weight = weight;
        }
        public double Calculate(){
            double heightPerHundered = height/100.0;
            return this.weight / (heightPerHundered*heightPerHundered);
        }
        public void Print(){
            System.out.println(name+","+" body mass index is "+Calculate());
        }
}
