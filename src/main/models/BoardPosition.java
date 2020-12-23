package models;

import java.util.Objects;

public class BoardPosition {
  private Row row;
  private int cellNumber;

  public BoardPosition(String position) {
    this.row = Row.valueOf(Character.toString(position.charAt(0)));
    this.cellNumber = Character.getNumericValue(position.charAt(1));
  }

  public BoardPosition(Row row, int cellNumber) {
    this.row = row;
    this.cellNumber = cellNumber;
  }

  public Row getRow() {
    return row;
  }

  public int getCellNumber() {
    return cellNumber;
  }

  @Override
  public String toString() {
    return row.toString() + cellNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BoardPosition that = (BoardPosition) o;
    return cellNumber == that.cellNumber &&
        row == that.row;
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, cellNumber);
  }
}
