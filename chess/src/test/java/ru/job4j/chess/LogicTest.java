package ru.job4j.chess;

import org.hamcrest.core.Is;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LogicTest {

    @Ignore
    @Test
    public void move() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        boolean rsl = logic.move(Cell.C1, Cell.H6);
        assertThat(rsl, is(true));
    }


    @Test
    public void whenHasWayFalse() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure bishopInTheWay = new BishopBlack(Cell.E3);
        logic.add(bishop);
        logic.add(bishopInTheWay);
        boolean result = logic.move(Cell.C1, Cell.G5);
        assertThat(result, Is.is(false));
    }

    @Test
    public void whenHasWayTrue() {
        Logic logic = new Logic();
        Figure bishop = new BishopBlack(Cell.C1);
        Figure bishopInTheWay = new BishopBlack(Cell.H2);
        logic.add(bishopInTheWay);
        logic.add(bishop);
        boolean result = logic.move(Cell.C1, Cell.D2);
        assertThat(result, Is.is(true));
    }
}