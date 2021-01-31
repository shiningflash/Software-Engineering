package TemplatePattern;

public class Football extends Game {

    @Override
    void initialize() {
        System.out.println("Football match initialized!");
    }

    @Override
    void start() {
        System.out.println("Football match started. Enjoy the match!");
    }

    @Override
    void end() {
        System.out.println("Football match finished!");
    }
}
