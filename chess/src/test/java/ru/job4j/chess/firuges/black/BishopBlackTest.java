package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Sergey
 */
public class BishopBlackTest {

    @Test
    public void position() {
        Cell cell = Cell.findBy(0, 0);
        BishopBlack bishopBlack = new BishopBlack(cell);
        Cell result = bishopBlack.position();
        assertThat(result, is(cell));

    }


    @Test
    public void copy() {
        Cell cell = Cell.findBy(0, 2);
        BishopBlack bishopBlack = new BishopBlack(cell);
        Figure result = bishopBlack.copy(cell);
        Figure expected = bishopBlack;
        assertTrue(result.equals(expected));

    }


    @Test
    public void way() {
        Cell start = Cell.C1;
        Cell finish = Cell.G5;
        Figure bishop = new BishopBlack(start);
        Cell[] result = bishop.way(start, finish);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(result, is(expected));
    }
}