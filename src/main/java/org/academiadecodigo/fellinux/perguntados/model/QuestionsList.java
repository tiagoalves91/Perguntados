package org.academiadecodigo.fellinux.perguntados.model;
import java.util.Arrays;
import java.util.LinkedList;


public enum QuestionsList {


    QUESTIONS1 ("\nAbstract is one of the four pillars of functional programming.\n","false"),
    QUESTIONS2 ("\nIn an Labda expression, the symbol that separates parameters from a function is the ¨<¨.\n","false"),
    QUESTIONS3 ("\nThread is a line of execution.\n","true"),
    QUESTIONS4 ("\nA subclass extend from a superclass.\n","true"),
    QUESTIONS5 ("\nA class can implement more than one interface\n","true"),
    QUESTIONS6("\nPillars of Functional Programming are: Purity; Recursion; Inheritance; and Immutability.","false"),
    QUESTIONS7 ("\nMVC stands for: Model View Controller archtectural model.\n","true"),
    QUESTIONS8("\nDesign Patterns doesn't solve any recurrent programming issues.\n","false"),
    QUESTIONS9("\nAbstraction is a powerful technique for dealing with complexity.\n","true"),
    QUESTIONS10("\nComposition is a weak relationship, the contained classes can exist without an instance of the container class.\n","false"),
    QUESTIONS11("\nAggregation is a strong relationship, the contained classes are owned and cannot exist without the container class.\n","false"),
    QUESTIONS12("\nInheritance defines IS-A relationships.\n","true"),
    QUESTIONS13("\nAlways favor composition over inheritance.\n","true"),
    QUESTIONS14("\nDesign patterns are a general repeatable solution to a commonly occurring problem in software design.\n","true"),
    QUESTIONS15("\nInterfaces allow a class to use functionality depending on the implementing class directly.\n","false"),
    QUESTIONS16("\nThe 'Gang of Four' divided the design patterns they documented into three fundamental groups: Creational, Structural and Behavioral.\n","true"),
    QUESTIONS17("\nMagnets can induce electric current on a wire, but electric current on a wire can't generate a magnetic field.\n","false"),
    QUESTIONS18("\nThe discrete digital values are encoded in a set of 0s and 1s, representing the two possible voltage levels on a digital signal.\n","true"),
    QUESTIONS19("\nGeorge Boole was a British mathematician born in 1815.\n","true"),
    Questions20("\nOperating System is the most important piece of software in a computer machine.\n","true");


    public String getQuestion() {
        return question;
    }

    String question;
    String answer;

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    QuestionsList(String question, String answer) {
        this.question = question;
        this.answer=answer;
    }

    public String getAnswer() {
        return answer;
    }

    public static LinkedList<QuestionsList> getMessages() {  //make a new LinkedList from the enum, and return the new LinkedList.
        return new LinkedList<>(Arrays.asList(values()));

    }
}