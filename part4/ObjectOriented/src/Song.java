public class Song {
    private String name;
    private int length;
        public Song(String name,int length){
            this.length = length;
            this.name = name;
        }
        public void prnt (){
            System.out.println("The song " + name + " has a length of " + length + " seconds.");
        }
}
