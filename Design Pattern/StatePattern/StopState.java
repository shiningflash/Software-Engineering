package StatePattern;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("This is a stop state.");
        context.setState( this );
    }

    public String toString() {
        return "Stop State";
    }
}
