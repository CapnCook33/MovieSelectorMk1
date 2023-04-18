/* A random movie selector
User will input number of movies to choose between
They'll then enter the movies titles, a random number generator will give them
a movie from 1 - their input. */

import java.util.*;
import java.lang.*;
public class MovieSelectorMk1 {

    public static void main(String[] args) {
        int choices;
        Random rand = new Random();
        List<String> movies = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of movies you're choosing between.");
        choices = keyboard.nextInt();
        keyboard.nextLine();//Clearing buffer after nextInt.

        for(int i = 0; i < choices; i++){//Getting movies from user.
            System.out.println("Enter the title of movie number " +(i+1));
            movies.add(keyboard.nextLine());
        }
        for(int i = 0; i < movies.size(); i++){//Showing movies entered.
            System.out.println("Movie #" +(i+1)+ " is " +movies.get(i));
        }
        System.out.println("You should watch: " +movies.get(rand.nextInt(choices)));
    }
}