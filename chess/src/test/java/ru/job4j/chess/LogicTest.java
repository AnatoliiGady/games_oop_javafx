package ru.job4j.chess;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    @Test
    public void whenNotFound() {
        FigureNotFoundException thrown =
                Assertions.assertThrows(FigureNotFoundException.class, () -> {
            Logic test = new Logic();
            test.add(new BishopBlack(Cell.C1));
            test.move(Cell.A4, Cell.C8);
        });
    }

    @Test
    public void whenOccupiedCellException() {
        OccupiedCellException thrown = Assertions.assertThrows(OccupiedCellException.class, () -> {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.add(new BishopBlack(Cell.D2));
            logic.move(Cell.C1, Cell.E3);
        });
    }

    @Test
    public void whenImpossibleMove() {
        ImpossibleMoveException thrown =
                Assertions.assertThrows(ImpossibleMoveException.class, () -> {
            Logic logic = new Logic();
            logic.add(new BishopBlack(Cell.C1));
            logic.move(Cell.C1, Cell.A1);
        });
    }
}