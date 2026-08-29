import java.util.Scanner;
class Quiz{
     String[]gkques={"What  is the capital of India ?","Which planet is known as Red Planet ?","Who wrote the Indian national anthem ?",
         "Which is the largest ocean in the world ?","How many continents are there ?","Which is the samllest prime number?","Which country is known as the land of the rising sun?",
         "What is the largest mammal?","How many days are there in a leap year ? ","Which gas do plants mainly absorb ?"};
         
         String[][]gkopt={{"A.Mumbaai","B.Delhi","C.Kolkata","D.Chennai"},{"A.Earth","B.Venus","C.Mars","D.Jupiter"} , {"A. Rabindranath Tagore", "B. Mahatma Gandhi", "C. Jawaharlal Nehru", "D. Subhash Chandra Bose"},
            {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
            {"A. 5", "B. 6", "C. 7", "D. 8"},
            {"A. 0", "B. 1", "C. 2", "D. 3"},
            {"A. China", "B. Japan", "C. Thailand", "D. Korea"},
            {"A. Elephant", "B. Giraffe", "C. Blue Whale", "D. Hippopotamus"},
            {"A. 365", "B. 366", "C. 364", "D. 367"},
            {"A. Oxygen", "B. Nitrogen", "C. Carbon Dioxide", "D. Hydrogen"}};
    

    static char[] gkAnswers = {
            'B', 'C', 'A', 'D', 'C',
            'C', 'B', 'C', 'B', 'C'
    };
    String[] javaQuestions = {
            "Which keyword is used to create a class in Java?",
            "Which method is the starting point of a Java program?",
            "Which data type is used to store whole numbers?",
            "Which symbol is used for a single-line comment?",
            "Which keyword is used to create an object?",
            "Which data type stores true or false?",
            "Which keyword is used to inherit a class?",
            "Which of these is NOT a primitive data type?",
            "Which loop is commonly used when the number of iterations is known?",
            "Which keyword is used to define a constant variable?"
    };

    static String[][] javaOptions = {
            {"A. function", "B. class", "C. define", "D. object"},
            {"A. start()", "B. run()", "C. main()", "D. begin()"},
            {"A. double", "B. String", "C. boolean", "D. int"},
            {"A. //", "B. ##", "C. <!--", "D. **"},
            {"A. object", "B. new", "C. create", "D. class"},
            {"A. int", "B. char", "C. boolean", "D. String"},
            {"A. implements", "B. extends", "C. inherits", "D. super"},
            {"A. int", "B. double", "C. boolean", "D. String"},
            {"A. for loop", "B. while loop", "C. do-while loop", "D. switch"},
            {"A. constant", "B. static", "C. final", "D. const"}
    };

    static char[] javaAnswers = {
            'B', 'C', 'D', 'A', 'B',
            'C', 'B', 'D', 'A', 'C'
    };
     void main( ) {

        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {

            System.out.println("================================");
            System.out.println("        WELCOME TO QUIZ GAME");
            System.out.println("================================");
 System.out.println("Enter your name");
 
 String name =sc.nextLine();
  System.out.println("Welcome "+name+"!");
            System.out.println("Choose your quiz:");
            System.out.println("1. General Knowledge");
            System.out.println("2. Java");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            int score = 0;
            switch (choice)
            { case  1:
                System.out.println("\n======GENERAL KNOWLEDGE QUIZ======\n");
                 System.out.println("Good luck  "+name+" !");
                score=StartQuiz(sc,gkques,gkopt,gkAnswers);
                break;
                case 2:
                    System.out.println("\n=====JAVA QUIZ======\n");
                     System.out.println("Good luck "+name+" !");
                    score=StartQuiz(sc,javaQuestions,javaOptions,javaAnswers);
                    break;
                    default:
                        System.out.println("Invalid Choice!");
                        continue;}
                        System.out.println("QUIZ OVER !");
                        System.out.println(name +" Your Score is "+score+" /10");
                    if(score==10)
                    System.out.println("Perfect score .WELL DONE !");
                   else if(score>=7)
                    System.out.println("Good job!");
                    else if (score>=5)
                    System.out.println("Good efforts!");
                    else
                    System.out.println("Keep practising");
                    System.out.println("/n DO YOU WANT TO PLAY AGAIN?(YES/NO):");
                    String replay = sc.nextLine();
                    if(!replay.equalsIgnoreCase("yes"))
                    {playAgain=false;
                    }System.out.println();
                
                        System.out.println("Thanks for  playing!"+name);}
                sc.close();
            }
            int StartQuiz( Scanner sc, String[]questions, String[][] options, char[] answers)
            
            {  int score =0;
                for(int i=0;i<questions.length;i++)
                {
                    System.out.println((i+1)+"."+questions[i]);
                    for(int j=0; j<options[i].length; j++)
                    {
                        System.out.println(options[i][j]);
                        
                    }
                    System.out.println("Your Answer=");
                    String userans=sc.nextLine();
                     if(!userans.isEmpty()&&Character.toUpperCase(userans.charAt(0))==answers[i])
                     {System.out.println("Correct answer!");
                         score++;
                                       }
                    else
                    {System.out.println("Wrong Answer , correct answer is "+answers[i]);
                    }
                    System.out.println();
                }return score ;
            }}
                
            

    
