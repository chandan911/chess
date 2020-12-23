package service;

import models.BoardPosition;
import models.PieceType;
import service.impl.*;

import java.util.List;

public interface PositionsFinder {

  List<BoardPosition> getPossibleBoardPositionsFrom(BoardPosition startingPosition);

  static PositionsFinder createPositionsFinder(PieceType pieceType) {
    switch (pieceType) {
      case King:
        return new KingsPositionFinder();
      case Queen:
        return new QueensPositionsFinder();
      case Bishop:
        return new BishopsPositionsFinder();
      case Horse:
        return new HorsesPositionsFinder();
      case Rook:
        return new RooksPositionsFinder();
      case Pawn:
        return new PawnsPositionFinder();
      default:
        throw new RuntimeException("Unsupported Piece type input!");
    }
  }
}
