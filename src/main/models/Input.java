package main.models;

public class Input {
  private PieceType pieceType;
  private BoardPosition boardPosition;

  public Input(String inputString) {
    String[] typeAndPosition = inputString.split(" ");
    this.pieceType = PieceType.valueOf(typeAndPosition[0]);
    this.boardPosition = new BoardPosition(typeAndPosition[1]);
  }

  public PieceType getPieceType() {
    return pieceType;
  }

  public BoardPosition getBoardPosition() {
    return boardPosition;
  }

  @Override
  public String toString() {
    return pieceType.toString() + " " + boardPosition.toString();
  }
}
