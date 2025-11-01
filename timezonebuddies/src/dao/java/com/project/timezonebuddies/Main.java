package com.project;

import com.project.model.Meeting;
import com.project.model.User;

public class Main {
    public static void main(String[] args) {
        // Create a Meeting object
        Meeting meeting = new Meeting(101, "Alice", "Bob", "2025-11-01", "Project Kickoff");

        // Create a User object
        User user = new User(1, "Charlie", "charlie@example.com", "charlie123", "securePass", "Asia/Kolkata");

        // Print Meeting details
        System.out.println("Meeting Details:");
        System.out.println("ID: " + meeting.getId());
        System.out.println("Organizer: " + meeting.getOrganizer());
        System.out.println("Participant: " + meeting.getParticipant());
        System.out.println("Date: " + meeting.getDate());
        System.out.println("Topic: " + meeting.getTopic());

        System.out.println();

        // Print User details
        System.out.println("User Details:");
        System.out.println("ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Timezone: " + user.getTimezone());
    }
}
