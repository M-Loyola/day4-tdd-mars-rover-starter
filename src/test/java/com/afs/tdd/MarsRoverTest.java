package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    Command commandMove = Command.MOVE;
    Command commandTurnLeft = Command.TURN_LEFT;
    Command commandTurnRight = Command.TURN_RIGHT;
    private Location getCurrentLocation(Location initialLocation, Command givenCommand) {
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(givenCommand);
        return marsRover.getCurrentLocation();
    }
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandMove);
        // Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(1 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }

    @Test
    void should_change_to_location_0_negative1_S_when_executeCommand_give_0_0_South_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandMove);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(-1 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_1_0_E_when_executeCommand_give_0_0_East_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandMove);
        //Then
        Assertions.assertEquals(1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_negative1_0_W_when_executeCommand_give_0_0_West_and_command_Move() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandMove);
        //Then
        Assertions.assertEquals(-1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_W_when_executeCommand_give_0_0_North_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnLeft);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_E_when_executeCommand_give_0_0_South_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnLeft);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_N_when_executeCommand_give_0_0_East_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.EAST);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnLeft);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.NORTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_S_when_executeCommand_give_0_0_West_and_command_TurnLeft() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.WEST);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnLeft);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.SOUTH , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_E_when_executeCommand_give_0_0_North_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnRight);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
    @Test
    void should_change_to_location_0_0_W_when_executeCommand_give_0_0_South_and_command_TurnRight() {
        //Given
        Location initialLocation = new Location(0, 0, Direction.SOUTH);
        // When
        Location currentLocation = getCurrentLocation(initialLocation,commandTurnRight);
        //Then
        Assertions.assertEquals(0 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.WEST , currentLocation.getDirection());
    }
}
