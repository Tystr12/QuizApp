package quiz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Quiz {

    private List<QuizQuestion> quizQuestions;

    public Quiz(List<QuizQuestion> quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    public List<QuizQuestion> getThreeRandomQuizQuestions() {
        List<QuizQuestion> randomQuizQuestions = new ArrayList<>();
        Random random = new Random();
        int size = quizQuestions.size();
        if (size <= 3) {
            return quizQuestions;
        } else {
            while (randomQuizQuestions.size() < 3) {
                int index = random.nextInt(size);
                QuizQuestion quizQuestion = quizQuestions.get(index);
                if (!randomQuizQuestions.contains(quizQuestion)) {
                    randomQuizQuestions.add(quizQuestion);
                }
            }
            return randomQuizQuestions;
        }
    }
}
/*
    The Quiz class contains a single instance variable quizQuestions which is a list of QuizQuestion objects. The class provides a constructor method to initialize the list of quiz questions and a method getThreeRandomQuizQuestions() that returns three random non-duplicate quiz questions.

        The getThreeRandomQuizQuestions() method uses a Random object to generate random indices and selects QuizQuestion objects from the quizQuestions list accordingly. It then checks if the selected quiz question is already in the list of random quiz questions, and if not, adds it to the list. The method continues generating random indices and adding new quiz questions to the list until the list contains three elements.

        }
*/