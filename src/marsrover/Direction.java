package marsrover;

public class Direction {

    private String moveDirection;

    private static final String EAST = "E";

    private static final String WEST = "W";

    private static final String SOUTH = "S";

    private static final String NORTH = "N";

    private static final String RIGHTDIRECTION = "R";

    private static final String LEFTDIRECTION = "L";

    private static final String MOVEFORWARD = "M";

    public String getMoveDirection() {
        return moveDirection;
    }

    public void setMoveDirection(String moveDirection) {
        this.moveDirection = moveDirection;
    }

    @Override
    public String toString() {
        return moveDirection;
    }

    public String getEAST() {
        return EAST;
    }

    public String getWEST() {
        return WEST;
    }

    public String getSOUTH() {
        return SOUTH;
    }

    public String getNORTH() {
        return NORTH;
    }

    public String getRIGHTDIRECTION() {
        return RIGHTDIRECTION;
    }

    public String getLEFTDIRECTION() {
        return LEFTDIRECTION;
    }

    public String getMOVEFORWARD() {
        return MOVEFORWARD;
    }
}
