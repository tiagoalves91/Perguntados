package org.academiadecodigo.fellinux.perguntados.view;
import org.academiadecodigo.bootcamp.scanners.string.StringSetInputScanner;
import org.academiadecodigo.fellinux.perguntados.model.Player;
import org.academiadecodigo.fellinux.perguntados.model.QuestionsList;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ShowQuizView extends AbstractView {

    public static int pointsCount= 0;
    public static int questCount=0;


    @Override
    public void show() throws IOException {
        while (questCount < 10) {

            Set<String> quizAnswers = new HashSet<String>();
            quizAnswers.add("true");
            quizAnswers.add("false");

            StringSetInputScanner quizQuestion = new StringSetInputScanner(quizAnswers);
            QuestionsList questionsList = QuestionsList.getMessages().get((int) (Math.floor(Math.random() * 20)));// get 1 random question from LinkedList in enum;
            String question = questionsList.getQuestion();// store a current question;

            String answer = questionsList.getAnswer(); // store a current answer;
            quizQuestion.setMessage(question);// show the current question;
            String response = prompt.getUserInput(quizQuestion);
            questCount++;
            if (response.equals(answer)) { // compare current question with current answer. If true add cont ++;
                pointsCount++;
                System.out.println(pointsCount);
            }


        }
    }
}