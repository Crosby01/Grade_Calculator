//Grade Calculator

import java.util.Scanner;

class calculator1 {
    public static void main(String[] args) {
        System.out.println("Grade Calculator");

        int test;
        int exam;
        int total;
        
        //Below is the code that accepts the score from the user
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your test score: ");
        test = userInput.nextInt();


        System.out.println("Enter your exam score: ");
        exam = userInput.nextInt();

        total = test + exam;
        
        //The code below terminates the system and returns 'F' if the score exceeds the range 
        if (test > 30) {
            System.out.println("Invalid test score");
            System.exit(test);
        } 

        if (exam > 70) {
            System.out.println("Invalid exam score");
            System.exit(exam);
        }

        if (total > 100) {
            System.out.println("Invalid Score");
            {
                System.out.println("Your Grade is F");
            }
            System.exit(total);
        } 
        

        System.out.println("Your total score is: " + total);
        //Code range to print grade depending on the user total score


        if(total >=70 )  if(total<=100){
            System.out.println("Your grade is: A");
        }
           

        if(total >= 60) if(total <= 69){
            System.out.println("Your Grade is: B");
        }

          if(total >= 50) if(total <= 59){
            System.out.println("Your Grade is: C");
        }

          if(total >= 45) if(total <= 49){
            System.out.println("Your Grade is: D");
        }

          if(total >= 40) if(total <= 44){
            System.out.println("Your Grade is: E");
        }

        if(total < 40){
            System.out.println("Your Grade is F");
        }
    


        userInput.close();
    }
}