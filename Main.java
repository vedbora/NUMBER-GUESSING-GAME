import java.util.*;
class guess
{
    public int points=0;
    Scanner sc = new Scanner(System.in);
    public void guess_number(int lower_limit,int upper_limit)
    {
        Random random = new Random();
        System.out.println("Any Guess..?");
        int guess_number = sc.nextInt();

        int randomNumber = random.nextInt(upper_limit - lower_limit +1)+lower_limit ;
        System.out.println(randomNumber);

        if(guess_number == randomNumber){
            System.out.println("Your guess is corect..!");
            points++;
        } else if (guess_number>randomNumber) {
            System.out.println("your entered number is greater");
        } else {
            System.out.println("your entered number is lower");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int i,j=1;
        Scanner inp = new Scanner(System.in);
        guess g1 = new guess();
        while (j<=3){
            g1.points=0;
            System.out.println("\n ROUND.."+j+"\n");
            System.out.println("give your lower_limit");
            int lower_limit= inp.nextInt();
            System.out.println("give your uppper limit");
            int upper_limit= inp.nextInt();
            for( i=1;i<=5;i++) {
                System.out.println("Attempt - "+i);
                g1.guess_number(lower_limit, upper_limit);
            }
            System.out.println("YOUR SCORE OF ROUND "+ j + "="+ g1.points);
            j++;
        }

    }
}
