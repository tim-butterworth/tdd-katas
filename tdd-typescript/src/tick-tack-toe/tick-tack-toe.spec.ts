import {
    Player,
    Error,
    Coordinate,
    Move,
    BoardState,
    initialState,
    tickTackToe
} from "./tick-tack-toe";
import * as _ from "lodash";

describe("tickTackToe", () => {
    describe("returns 'OutOfOrderMove'", () => {
        it("when it is player X's turn and player O makes a move", () => {
            const boardState: BoardState = {
                playerTurn: Player.X,
                x: [],
                y: []
            };
            const move: Move = {
                player: Player.O,
                coordinate: {
                    x: 1,
                    y: 1
                }
            };

            expect(tickTackToe(boardState, move)).toEqual(Error.OutOfOrderMove);
        });

        it("when it is player O's turn and player X makes a move", () => {
            const boardState: BoardState = {
                playerTurn: Player.O,
                x: [],
                y: []
            };
            const move: Move = {
                player: Player.X,
                coordinate: {
                    x: 1,
                    y: 1
                }
            };

            expect(tickTackToe(boardState, move)).toEqual(Error.OutOfOrderMove);
        });
    });
    describe("returns 'TooManyMoves'", () => {
        it("when 9 moves have already been made", () => {
            const coordinate: Coordinate = { x: 0, y: 0 };
            const boardState: BoardState = {
                playerTurn: Player.X,
                x: _.times(9, _.constant(coordinate)),
                y: []
            };

            expect(tickTackToe(boardState, {
                player: Player.X,
                coordinate: {
                    x: 1,
                    y: 1
                }
            })).toEqual(Error.TooManyMoves);
        });
    });
});
