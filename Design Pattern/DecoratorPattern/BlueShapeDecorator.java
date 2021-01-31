package DecoratorPattern;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    public void setBlueBorder(Shape decoratedShape) {
        System.out.println("Border color: Blue");
    }

}
