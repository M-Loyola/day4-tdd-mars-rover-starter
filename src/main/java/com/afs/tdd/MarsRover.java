package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommandMove() {
        Direction direction = location.getDirection();

        switch (direction) {
            case NORTH:
                location.setY(location.getY() + 1);
                break;
            case SOUTH:
                location.setY(location.getY() - 1);
                break;
            case EAST:
                location.setX(location.getX() + 1);
                break;
            case WEST:
                location.setX(location.getX() - 1);
                break;
        }
    }

    public void executeCommandLeft() {
        Direction currentDirection = location.getDirection();

        switch (currentDirection) {
            case NORTH:
                currentDirection = Direction.WEST;
                break;
            case SOUTH:
                currentDirection = Direction.EAST;
                break;
            case EAST:
                currentDirection = Direction.NORTH;
                break;
            case WEST:
                currentDirection = Direction.SOUTH;
                break;
        }

        location.setDirection(currentDirection);
    }

    public void executeCommandRight() {
        Direction currentDirection = location.getDirection();

        switch (currentDirection) {
            case NORTH:
                currentDirection = Direction.EAST;
                break;
            case SOUTH:
                currentDirection = Direction.WEST;
                break;
            case EAST:
                currentDirection = Direction.SOUTH;
                break;
            case WEST:
                currentDirection = Direction.NORTH;
                break;
        }

        location.setDirection(currentDirection);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
