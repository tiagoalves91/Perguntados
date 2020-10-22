package org.academiadecodigo.fellinux.perguntados.controller;

import org.academiadecodigo.fellinux.perguntados.view.View;

import java.io.IOException;

public abstract class AbstractController implements Controller{

    protected View view;

    public void setView(View view){
        this.view = view;
    }

    public void init() throws IOException {
        view.show();

    }
}
