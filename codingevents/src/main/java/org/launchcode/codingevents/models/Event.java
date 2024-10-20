package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.NumberFormat;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;

    @NotNull(message = "Please select an event type")
    private EventType type;

    @NotBlank(message = "Please enter a name")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Please enter a location")
    @NotNull(message = "Please enter valid location")
    private String location;


//    @Size(min = 1, message = "Please enter a number greater than 0")
    @Positive(message = "Please enter a number greater than 0")
    private int numOfAttendees;

    @Size(max = 500, message = "Description too long")
    private String description;

    @Email(message = "Invalid email")
    @NotBlank(message = "Please enter your email")
    private String contactEmail;

    @AssertTrue(message = "You can't register unless you promise!")
    private boolean registered;

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public Event(EventType type,String name, String location, int numOfAttendees, String description,
                 String contactEmail, boolean registered) {
        this();
        this.type = type;
        this.name = name;
        this.location = location;
        this.numOfAttendees = numOfAttendees;
        this.description = description;
        this.contactEmail = contactEmail;
        this.registered = registered;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public @NotBlank(message = "Please enter a location") @NotNull(message = "Please enter valid location") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Please enter a location") @NotNull(message = "Please enter valid location") String location) {
        this.location = location;
    }


    public int getNumOfAttendees() {
        return numOfAttendees;
    }

    public void setNumOfAttendees(@NotBlank(message = "Please enter a number greater than 0") @NotNull(message = "Please enter a number greater than 0") @Positive(message = "Please enter a number greater than 0") int numOfAttendees) {
        this.numOfAttendees = numOfAttendees;
    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public int getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
