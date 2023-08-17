package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {
    Command givenCommand = Command.MOVE;
    private Location getLocation(Location initialLocation) {
        MarsRover marsRover = new MarsRover(initialLocation);
        marsRover.executeCommand(givenCommand);
        Location currentLocation = marsRover.getCurrentLocation();
        return currentLocation;
    }
    @Test
    void should_change_to_location_0_1_N_when_executeCommand_given_0_0_North_and_command_Move() {
        // Given
        Location initialLocation = new Location(0, 0, Direction.NORTH);
        // When
        Location currentLocation = getLocation(initialLocation);
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
        Location currentLocation = getLocation(initialLocation);
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
        Location currentLocation = getLocation(initialLocation);
        //Then
        Assertions.assertEquals(1 , currentLocation.getX());
        Assertions.assertEquals(0 , currentLocation.getY());
        Assertions.assertEquals(Direction.EAST , currentLocation.getDirection());
    }
}
