package StructuralPatterns.CompositePatterns.shapes;

import java.awt.*;

public class Circle extends BaseShape{
    public int radius;

    public Circle(int y, int x, int radius, Color color) {
        super(y, x, color);
        this.radius = radius;
    }
    @Override
    public int getWidth() {
        return radius * 2;
    }
    @Override
    public int getHeight() {
        return radius * 2;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawOval(x, y, getWidth() - 1, getHeight() - 1);
    }
}
