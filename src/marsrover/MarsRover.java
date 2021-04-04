package marsrover;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MarsRover {

    public static void main(String[] args) throws IOException {


        System.out.println("Please enter size of matris1. Please leave space between size");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String matrisSize1 = in.readLine();
        System.out.println("Please enter current position of first rover");
        String currentPosition1 = in.readLine();
        System.out.println("Please enter moving direction for first rover");
        String movingDirection1 = in.readLine();
        System.out.println("Please enter current position of second rover");
        String currentPosition2 = in.readLine();
        System.out.println("Please enter moving direction for second rover");
        String movingDirection2 = in.readLine();


        in.close();

        MaxArea maxArea = new MaxArea();

        maxArea.setMaxXPosition(Integer.parseInt(matrisSize1.substring(0, 1)));
        maxArea.setMaxYPosition(Integer.parseInt(matrisSize1.substring(2, 3)));

        Position currentPos = new Position();
        Direction currentDirection = new Direction();

        currentPos.setxPosition(Integer.parseInt(currentPosition1.substring(0, 1)));
        currentPos.setyPosition(Integer.parseInt(currentPosition1.substring(2, 3)));
        currentDirection.setMoveDirection(currentPosition1.substring(4, 5));
        currentPos.setDirection(currentDirection);


        char[] ch = movingDirection1.toCharArray();
        List<String> movingDirections = new ArrayList<>();

        for (char c : ch) {
            movingDirections.add(String.valueOf(c));
        }

        System.out.println("Output for rovers are :");

        System.out.println(getLastPosition(movingDirections, currentPos, maxArea));

        currentPos.setxPosition(Integer.parseInt(currentPosition2.substring(0, 1)));
        currentPos.setyPosition(Integer.parseInt(currentPosition2.substring(2, 3)));
        currentDirection.setMoveDirection(currentPosition2.substring(4, 5));
        currentPos.setDirection(currentDirection);

        ch = movingDirection2.toCharArray();
        movingDirections.clear();

        for (char c : ch) {
            movingDirections.add(String.valueOf(c));
        }

        System.out.print(getLastPosition(movingDirections, currentPos, maxArea));


    }

    private static Position getLastPosition(List<String> movingDirections, Position position, MaxArea maxArea) {

        int end = 0;

        while (end < movingDirections.size()) {
            if (movingDirections.get(end).equals(position.getDirection().getRIGHTDIRECTION())) {

                position.setDirection(checkConditionForRightDirection(position.getDirection()));

            } else if (movingDirections.get(end).equals(position.getDirection().getLEFTDIRECTION())) {

                position.setDirection(checkConditionForLeftDirection(position.getDirection()));

            } else if (movingDirections.get(end).equals(position.getDirection().getMOVEFORWARD())) {

                checkConditionForMoveCommand(position, maxArea);
            }
            end++;
        }

        return position;
    }

    private static void checkConditionForMoveCommand(Position position, MaxArea maxArea) {
        if (position.getDirection().getMoveDirection().equals(position.getDirection().getNORTH()) && position.getyPosition() < maxArea.getMaxYPosition()) {
            position.setyPosition(position.getyPosition() + 1);

        } else if (position.getDirection().getMoveDirection().equals(position.getDirection().getSOUTH()) && position.getyPosition() > 0) {
            position.setyPosition(position.getyPosition() - 1);

        } else if (position.getDirection().getMoveDirection().equals(position.getDirection().getEAST()) && position.getxPosition() < maxArea.getMaxXPosition()) {
            position.setxPosition(position.getxPosition() + 1);

        } else if (position.getDirection().getMoveDirection().equals(position.getDirection().getWEST()) && position.getxPosition() > 0) {
            position.setxPosition(position.getxPosition() - 1);

        }
    }

    private static Direction checkConditionForLeftDirection(Direction currentDirection) {
        if (currentDirection.getMoveDirection().equals(currentDirection.getNORTH())) {

            currentDirection.setMoveDirection(currentDirection.getWEST());

        } else if (currentDirection.getMoveDirection().equals(currentDirection.getSOUTH())) {

            currentDirection.setMoveDirection(currentDirection.getEAST());

        } else if (currentDirection.getMoveDirection().equals(currentDirection.getEAST())) {

            currentDirection.setMoveDirection(currentDirection.getNORTH());

        } else if (currentDirection.getMoveDirection().equals(currentDirection.getWEST())) {

            currentDirection.setMoveDirection(currentDirection.getSOUTH());

        }
        return currentDirection;
    }

    private static Direction checkConditionForRightDirection(Direction currentDirection) {
        if (currentDirection.getMoveDirection().equals(currentDirection.getNORTH())) {

            currentDirection.setMoveDirection(currentDirection.getEAST());

        } else if (currentDirection.getMoveDirection().equals(currentDirection.getSOUTH())) {

            currentDirection.setMoveDirection(currentDirection.getWEST());

        } else if (currentDirection.getMoveDirection().equals(currentDirection.getEAST())) {

            currentDirection.setMoveDirection(currentDirection.getSOUTH());
        } else if (currentDirection.getMoveDirection().equals(currentDirection.getWEST())) {

            currentDirection.setMoveDirection(currentDirection.getNORTH());

        }
        return currentDirection;
    }
}
