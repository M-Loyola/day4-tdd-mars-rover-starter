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
        Direction newDirection = null;

        switch (currentDirection) {
            case NORTH:
                newDirection = Direction.WEST;
                break;
            case SOUTH:
                newDirection = Direction.EAST;
                break;
            case EAST:
                newDirection = Direction.NORTH;
                break;
            case WEST:
                newDirection = Direction.SOUTH;
                break;
        }

        location.setDirection(newDirection);
    }

    public void executeCommandRight() {
        Direction currentDirection = location.getDirection();
        Direction newDirection = null;

        switch (currentDirection) {
            case NORTH:
                newDirection = Direction.EAST;
                break;
            case SOUTH:
                newDirection = Direction.WEST;
                break;
            case EAST:
                newDirection = Direction.SOUTH;
                break;
            case WEST:
                newDirection = Direction.NORTH;
                break;
        }

        location.setDirection(newDirection);
    }

    public Location getCurrentLocation() {
        return location;
    }
}
