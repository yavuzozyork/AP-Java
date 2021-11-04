import java.util.Scanner;

public class Film1 {
    public static void main(String[] args) {
        Film movie = new Film(" God Father",18);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());
        if (age >= movie.ageRating()){
            System.out.println("You may watch the film"+movie.name());
        }else {
            System.out.println("You may not whatch the film" + movie.name());
        }
    }
}
