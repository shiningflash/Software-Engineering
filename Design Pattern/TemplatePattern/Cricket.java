package TemplatePattern;

public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket match initialized!");
    }

    @Override
    void start() {
        System.out.println("Cricket match started. Enjoy the game!");
    }

    @Override
    void end() {
        System.out.println("Cricket match finished!");
    }
}
