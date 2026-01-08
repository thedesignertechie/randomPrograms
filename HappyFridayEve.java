import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class HappyFridayEve {
    
  public static void main(String args[]) {
    
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("On a scale from 1-10, what's your boredom level? ");

    int boredomLevel = scanner.nextInt();
    
    if(boredomLevel > 3){
        
       Random rand = new Random();
       
       System.out.println("That's not good. Let's pick a random activity!");

       List<String> activities = List.of("movies", "food", "exercise", "drive", "code", "write", "art");
       List<String> affirmations = List.of("That should have helped.", "Stay focused!", "Great job!", "Easy Peasy!");

       while(boredomLevel > 3){
       
            int activityIndex = rand.nextInt(activities.size());
            String randomActivity = activities.get(activityIndex);
            System.out.println("Let's do this: " + randomActivity);

            boredomLevel--;

            int affirmationIndex = rand.nextInt(affirmations.size());
            String randomAffirmation = affirmations.get(affirmationIndex);
            System.out.println(randomAffirmation);


        }
    }

    System.out.println("Good! Remember to be productive");
  }
  
}
