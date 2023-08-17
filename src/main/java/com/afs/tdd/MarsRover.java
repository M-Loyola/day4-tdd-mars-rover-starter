package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommandMove() {
        if (location.getDirection() == Direction.NORTH) {
            location.setY(location.getY() + 1);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setY(location.getY() - 1);
        } else if (location.getDirection() == Direction.EAST) {
            location.setX(location.getX() + 1);
        } else if (location.getDirection() == Direction.WEST) {
            location.setX(location.getX() - 1);
        }
    }

    public void executeCommandLeft() {
        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.NORTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.SOUTH);
        }
    }

    public void executeCommandRight() {
        if (location.getDirection() == Direction.NORTH) {
            location.setDirection(Direction.EAST);
        } else if (location.getDirection() == Direction.SOUTH) {
            location.setDirection(Direction.WEST);
        } else if (location.getDirection() == Direction.EAST) {
            location.setDirection(Direction.SOUTH);
        } else if (location.getDirection() == Direction.WEST) {
            location.setDirection(Direction.NORTH);
        }
    }

    public Location getCurrentLocation() {
        return location;
    }
}
