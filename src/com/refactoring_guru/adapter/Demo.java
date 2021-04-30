package com.refactoring_guru.adapter;

import com.refactoring_guru.adapter.adapters.SquarePegAdapter;
import com.refactoring_guru.adapter.round.RoundHole;
import com.refactoring_guru.adapter.round.RoundPeg;
import com.refactoring_guru.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg();
        if (hole.fits(peg)) {
            System.out.println("Round peg fits round hole.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        // Adapter solve the problem.
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (hole.fits(smallPegAdapter)) {
            System.out.println("Square peg small fits round hole.");
        }
        if (!hole.fits(largePegAdapter)) {
            System.out.println("Square peg large does not fit round hole.");
        }
    }
}
