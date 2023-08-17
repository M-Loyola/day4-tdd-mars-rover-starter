package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    private String move = "MOVE";
    private String left = "LEFT";
    private String right = "RIGHT";
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(move);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_negative1_S_when_executeCommand_given_0_0_South_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(move);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(-1, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_1_0_E_when_executeCommand_given_0_0_East_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(move);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_negative1_0_W_when_executeCommand_given_0_0_West_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(move);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_North_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(left);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_South_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(left);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_East_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(left);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_West_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(left);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_E_when_executeCommand_given_0_0_North_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(right);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.EAST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_W_when_executeCommand_given_0_0_South_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(right);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.WEST, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_S_when_executeCommand_given_0_0_East_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(right);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_0_N_when_executeCommand_given_0_0_West_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeBatchCommands(right);
        // When
        Location currentLocation = marsRover.getCurrentLocation();
        //Then
        Assertions.assertEquals(0, currentLocation.getX());
        Assertions.assertEquals(0, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_negative1_1_S_executeCommand_given_0_0_North_and_command_M_L_M_R() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        MarsRover marsRover = new MarsRover(initialLocation);
        // When
        marsRover.executeBatchCommands(String.format("%s,%s,%s,%s", move, left, move, right));
        Location currentLocation = marsRover.getCurrentLocation();
        // Then
        Assertions.assertEquals(-1, currentLocation.getX());
        Assertions.assertEquals(1, currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH, currentLocation.getDirection());
    }
}
