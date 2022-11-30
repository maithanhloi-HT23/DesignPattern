package StructuralPatterns.CompositePatterns.shapes;

import java.awt.*;

public class Dot extends BaseShape {
    private final int DOT_SIZE = 3;

    public Dot(int y, int x, Color color) {
        super(y, x, color);
    }
    @Override
    public int getWidth(){
        return DOT_SIZE;
    }
    @Override
    public int getHeight(){
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.fillRect(x - 1, y -1, getWidth(), getHeight());
    }
}
