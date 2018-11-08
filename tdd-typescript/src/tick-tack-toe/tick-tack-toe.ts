type Tie = "Tie";
enum Player {
    X = "X",
    O = "O"
}
enum Error {
    OutOfOrderMove = "OutOfOrderMove",
    TooManyMoves = "TooManyMoves",
    MoveAlreadyTaken = "MoveAlreadyTaken"
}

type CoordinateValues = -1 | 0 | 1;

interface Coordinate {
    x: CoordinateValues;
    y: CoordinateValues;
}

interface Move {
    player: Player;
    coordinate: Coordinate;
}

interface BoardState {
    x: Coordinate[];
    y: Coordinate[];
    playerTurn: Player;
}

interface Finished {
    winner: Player | Tie;
}
type BoardUpdater = (state: BoardState, move: Move) => BoardState | Finished | Error;

const initialState: BoardState = {
    x: [],
    y: [],
    playerTurn: Player.X,
};

const tickTackToe: BoardUpdater = (state, move) => {
    return state;
};

export {
    Player,
    Error,
    Coordinate,
    Move,
    BoardState,
    initialState,
    tickTackToe,
};
