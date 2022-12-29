package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;


public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenNotFound() throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic test = new Logic();
        test.add(new BishopBlack(Cell.C1));
        test.move(Cell.A4, Cell.C8);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedCellException() throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.E3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove() throws OccupiedCellException, FigureNotFoundException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.A1);
    }
}