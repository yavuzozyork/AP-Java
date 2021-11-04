public class Agent {
    private String name;
    private String lastName;
        public Agent(String name, String lastName){
            this.lastName = lastName;
            this.name = name;
        }
        public String toString(){
            return "My name is "+lastName+","+name+" "+lastName;
        }
}
