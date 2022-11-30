package StructuralPatterns.CompositePatterns.shapes;

import java.awt.*;

public class Rectangle extends BaseShape {
    public int width;
    public int height;

    public Rectangle(int y, int x, int width, int height, Color color) {
        super(y, x, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}
