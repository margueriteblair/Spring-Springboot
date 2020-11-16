package com.margieblair;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hotel {
    private String name;
    private List<Integer> availableRooms = new ArrayList<>();
    private List<Integer> unavailableRooms = new ArrayList<>();

    public Hotel(String name, Integer... rooms) {
        this.name = name;
        for (int room : rooms) {
            availableRooms.add(room);
        }
    }

    public void bookRoom(int room) {
        unavailableRooms.add(unavailableRooms.size(), room);
        availableRooms.remove(availableRooms.indexOf(room));
        availableRooms = availableRooms.stream().sorted().collect(Collectors.toList());
        unavailableRooms = unavailableRooms.stream().sorted().collect(Collectors.toList());
        System.out.println("Thank you for booking room " + room);
    }

    public void unbookRoom(int room) {
        //simply inserts the room into the back of all the rooms
        availableRooms.add(availableRooms.size(), room);
        unavailableRooms.remove(unavailableRooms.indexOf(room));
        unavailableRooms = unavailableRooms.stream().sorted().collect(Collectors.toList());
        availableRooms = availableRooms.stream().sorted().collect(Collectors.toList());
        System.out.println("Thank you for staying! See you next time.");
    }

    public String getName() {
        return name;
    }

    public List<Integer> getAvailableRooms() {
        System.out.println("Please choose from one of the following rooms:");
        System.out.println(availableRooms);
        return availableRooms;
    }

    public List<Integer> getUnavailableRooms() {
        System.out.println("Which of the following rooms are you checking out of:");
        System.out.println(unavailableRooms);
        return unavailableRooms;
    }


}
