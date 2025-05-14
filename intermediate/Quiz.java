import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);

        // Sample questions and answers for each category
        String[][] questions = {
            { // Filipino
                "What is the national language of the Philippines?",
                "What is 'hello' in Filipino?",
                "Sino ang pambansang bayani ng Pilipinas?"
                
            },

            { // History
                "Who was the first president of the Philippines?",
                "In what year did World War II end?",
                "What country colonized the Philippines for 333 years?"
                
            },
            { // General Knowledge
                "Who is the president of the USA in 2024?",
                "How many continents are there?",
                "What color is a banana?"
                
            }
        };

        String[][] answers = {

            {"filipino", "kamusta", "jose rizal"},
            {"emilio aguinaldo", "1945", "spain"},
            {"joe biden", "7", "yellow"}

        };

        System.out.println("Welcome to Test Think!");
        System.out.println("Choose a category : ");
        System.out.println("1. Filipino");
        System.out.println("2. History");
        System.out.println("3. General Knowledge");
        System.out.print("Enter your choice (1-3): ");

        int choice = q.nextInt();
        q.nextLine(); // Consume newline

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid category. Exiting...");
            return;
        }

        int score = 0;
        int categoryIndex = choice - 1;

        for (int i = 0; i < questions[categoryIndex].length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[categoryIndex][i]);
            System.out.print("> ");
            String userAnswer = q.nextLine().toLowerCase();

            if (userAnswer.equals(answers[categoryIndex][i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[categoryIndex][i]);
            }
        }

        System.out.println("\nQuiz Over! You scored: " + score + "/" + questions[categoryIndex].length);
    }
}
