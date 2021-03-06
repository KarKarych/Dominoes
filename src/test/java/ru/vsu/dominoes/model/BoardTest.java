package ru.vsu.dominoes.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.vsu.dominoes.model.players.AIPlayer;
import ru.vsu.dominoes.model.players.HumanPlayer;
import ru.vsu.dominoes.model.players.Player;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
  Board board;

  @BeforeEach
  void initialize() {
    board = new Board(2);
    Player human = new HumanPlayer("Yuri");
    Player android = new AIPlayer("Werther");
    board.setPlayers(new Player[]{human, android});

    board.addChipToLeftSide(new Chip(3, 3));
    board.addChipToLeftSide(new Chip(1, 3));
    board.addChipToRightSide(new Chip(3, 6));
  }

  @Test
  void testGetLeftChip() {
    assertEquals(new Chip(1, 3), board.getLeftChip());
  }

  @Test
  void testGetRightChip() {
    assertEquals(new Chip(3, 6), board.getRightChip());
  }

  @Test
  void testGetChips() {
    assertEquals(Arrays.asList(new Chip(1, 3), new Chip(3, 3), new Chip(3, 6)), board.getChips());
  }

  @Test
  void testGetPlayers() {
    assertArrayEquals(new Player[]{new HumanPlayer("Yuri"), new AIPlayer("Werther")}, board.getPlayers());
  }
}
