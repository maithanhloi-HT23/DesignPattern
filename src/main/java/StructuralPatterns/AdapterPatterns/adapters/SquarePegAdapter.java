package StructuralPatterns.AdapterPatterns.adapters;

import StructuralPatterns.AdapterPatterns.round.RoundPeg;
import StructuralPatterns.AdapterPatterns.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
       this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        result = peg.getWidth() * Math.sqrt(2)/2;
        return result;
    }
}
