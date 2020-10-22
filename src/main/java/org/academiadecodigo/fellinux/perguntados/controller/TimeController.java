package org.academiadecodigo.fellinux.perguntados.controller;

import java.util.Timer;

public class TimeController {

    private Timer timer;

    public TimeController(Timer timer) {
        this.timer = timer;
    }


    public void something() {
        try {
            timer.wait(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
