package org.academiadecodigo.fellinux.perguntados.controller;
import org.academiadecodigo.fellinux.perguntados.view.ShowQuizView;
import java.io.IOException;

public class ShowQuizController extends AbstractController {

    ShowQuizView showQuizView = new ShowQuizView();


    public void init() throws IOException {
        showQuizView.show();
    }

    public void setShowQuizController(ShowQuizView showQuizView) {
        this.showQuizView = showQuizView;
    }
}