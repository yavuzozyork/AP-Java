public class PersonNameAge {
    private String name;
    private int age;
    private int num = 1;
        public PersonNameAge(String name,int age){
            this.age = age;
            this.name = name;
        }
        public void prntNM(){
            System.out.println("My name is "+name+" I will be "+age+" years old later");
        }
}
