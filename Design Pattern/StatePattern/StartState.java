package StatePattern;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("This is a start state");
        context.setState( this );
    }

    public String toString() {
        return "Start State";
    }
}
