package org.academiadecodigo.fellinux.perguntados.controller;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.fellinux.perguntados.utilities.Messages;
import org.academiadecodigo.fellinux.perguntados.view.UserOptions;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Map;

public class MenuController extends AbstractController {

    private Map<Integer, Controller> controllerMap;

    public void setControllerMap(Map<Integer, Controller> controllerMap) {
        this.controllerMap = controllerMap;
    }

    public void onMenuSelection(int option) {


    }
}
