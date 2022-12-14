package StructuralPatterns.CompositePatterns.shapes;

import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unselect();
    boolean isSelect();
    void paint(Graphics graphics);
}
