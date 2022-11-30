package StructuralPatterns.AdapterPatterns;

import StructuralPatterns.AdapterPatterns.adapters.SquarePegAdapter;
import StructuralPatterns.AdapterPatterns.round.RoundHole;
import StructuralPatterns.AdapterPatterns.round.RoundPeg;
import StructuralPatterns.AdapterPatterns.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSpeg = new SquarePeg(2);
        SquarePeg largeSpeg = new SquarePeg(20);

        SquarePegAdapter smallSpegAdapter = new SquarePegAdapter(smallSpeg);
        SquarePegAdapter largeSpegAdapter = new SquarePegAdapter(largeSpeg);

        if (hole.fits(smallSpegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!hole.fits(largeSpegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
