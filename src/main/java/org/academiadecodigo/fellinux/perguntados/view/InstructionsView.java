package org.academiadecodigo.fellinux.perguntados.view;

import org.academiadecodigo.fellinux.perguntados.controller.InstructionsController;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class InstructionsView extends AbstractView{

    private InstructionsController instructionsController;
    private Socket socketPlayer;
    public void setInstructionsController(InstructionsController instructionsController) {
        this.instructionsController = instructionsController;
    }

    public void showInstructions(){



    }
    @Override
    public void show() throws IOException {
        showInstructions();


    }
}
