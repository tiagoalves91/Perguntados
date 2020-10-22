package org.academiadecodigo.fellinux.perguntados.controller;

import org.academiadecodigo.fellinux.perguntados.view.InstructionsView;

import java.io.IOException;

public class InstructionsController extends AbstractController {

    private InstructionsView instructionsView;


    @Override
    public void init() throws IOException {
      instructionsView.show();
    }
}
