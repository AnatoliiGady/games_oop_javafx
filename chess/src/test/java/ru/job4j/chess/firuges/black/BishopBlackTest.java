package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.chess.firuges.Cell;

import javax.swing.text.Position;

public class BishopBlackTest {

    @Test
    void whenSameCell() {
        BishopBlack testMove = new BishopBlack(Cell.A1);
        assertThat(testMove.position()).isEqualTo(Cell.A1);
    }

    @Test
    void whenCorrectPosition() {
        BishopBlack testMove = new BishopBlack(Cell.A2);
        testMove.copy(Cell.A2);
        assertThat(testMove.position()).isEqualTo(Cell.A2);
    }

    @Test
    void whenWayCorrectPosition() {
        BishopBlack testMove = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps).isEqualTo(testMove.way(Cell.G5));
    }

}