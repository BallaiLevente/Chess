package com.chess.engine.board;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;
import com.chess.engine.board.MoveStatus;

public class MoveTransition {

    private final Board toBoard;
    private final Move transitionMove;
    private final MoveStatus moveStatus; // we are able or not to make a move, leaves us in check or not, is not a legal move
    private final Board fromBoard;

    public MoveTransition(final Board fromBoard,
                          final Board toBoard,
                          final Move transitionMove,
                          final MoveStatus moveStatus) {

        this.fromBoard = fromBoard;
        this.toBoard = toBoard;
        this.transitionMove = transitionMove;
        this.moveStatus = moveStatus;
    }

    public Board getFromBoard() {
        return this.fromBoard;
    }

    public Board getToBoard() {
        return this.toBoard;
    }

    public Move getTransitionMove() {
        return this.transitionMove;
    }

    public MoveStatus getMoveStatus() {
        return this.moveStatus;
    }
}
