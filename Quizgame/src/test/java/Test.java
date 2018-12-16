package tech.bts.quizGame;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class Test {


    @Test (expected = NoQuizzesException.class)
    public void not_playing_without_quizzes() {
        Game game = new Game();
        game.play();
    }

    @Test
    public void add_quiz_to_game() throws Exception{
        String question = "Test question";
        List<String> correctAnswers = Arrays.asList("answer1", "answer2");
        List<String> horribleAnswers = Arrays.asList("horrible1", "horrible2");
        Quiz quiz = new Quiz(question);
        quiz.setCorrectAnswers(correctAnswers);
        quiz.setHorribleAnswers(horribleAnswers);
        Game game = new Game();
        game.getQuizzes();
        game.addQuiz(quiz);

    }
}