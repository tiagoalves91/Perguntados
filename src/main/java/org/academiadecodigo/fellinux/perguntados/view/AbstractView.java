package org.academiadecodigo.fellinux.perguntados.view;

import org.academiadecodigo.bootcamp.Prompt;

public abstract class AbstractView implements View {

    protected Prompt prompt;

    public void setPrompt(Prompt prompt) {
        this.prompt = prompt;
    }
}
