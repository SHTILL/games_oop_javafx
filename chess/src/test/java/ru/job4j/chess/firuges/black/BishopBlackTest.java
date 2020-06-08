package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure b = new BishopBlack(Cell.A1);
        assertThat(b.position(), is(Cell.A1));
    }

    @Test
    public void way() {
        Figure b = new BishopBlack(Cell.C1);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(b.way(Cell.C1, Cell.G5), is(expect));
    }

    @Test(expected = IllegalStateException.class)
    public void wayNoWay() {
        Figure b = new BishopBlack(Cell.C1);
        Cell[] rsl = b.way(Cell.C1, Cell.C2);
    }

    @Test
    public void copy() {
        Figure b = new BishopBlack(Cell.A1);
        b = b.copy(Cell.A2);
        assertThat(b.position(), is(Cell.A2));
    }
}