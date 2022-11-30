package StructuralPatterns.CompositePatterns.editor;

import StructuralPatterns.CompositePatterns.shapes.CompoundShape;
import StructuralPatterns.CompositePatterns.shapes.Shape;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ImageEditor {
    private EditorCanvas canvas;
    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor() {
        this.canvas = new EditorCanvas();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    private class EditorCanvas extends Canvas {
        JFrame frame;

        private static final int PADDING = 10;

        EditorCanvas() {
            createFrame();
            refresh();
            addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    allShapes.unselect();
                    allShapes.selectChildAt(e.getX(), e.getY());
                    e.getComponent().repaint();
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
        }

        void createFrame() {
            frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JPanel contentPanel = new JPanel();
            Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
            contentPanel.setBorder(padding);
            frame.setContentPane(contentPanel);

            frame.add(this);
            frame.setVisible(true);
            frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public int getWidth() {
            return allShapes.getX() + allShapes.getWidth() + PADDING;
        }

        @Override
        public int getHeight() {
            return allShapes.getY() + allShapes.getHeight() + PADDING;
        }

        void refresh() {
            this.setSize(getWidth(), getHeight());
            frame.pack();
        }

        @Override
        public void paint(Graphics graphics) {
            allShapes.paint(graphics);
        }
    }
}
