public class Room {
    public String code;
    public int numberOfSeats;

        public Room(String code, int numberOfSeats){
            this.code = code;
            this.numberOfSeats = numberOfSeats;
        }
        public void printRoom(){
            System.out.println(code+"yavuz"+numberOfSeats);
        }
}
