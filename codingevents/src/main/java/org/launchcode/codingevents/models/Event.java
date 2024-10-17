package org.launchcode.codingevents.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class Event {
    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Please enter a name")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotBlank(message = "Please enter a location")
    @NotNull(message = "Please enter valid location")
    private String location;

    @Size(max = 500, message = "Description too long")
    private String description;

    @Email(message = "Invalid email")
    @NotBlank(message = "Please enter your email")
    private String contactEmail;

    public Event() {
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String location, String description, String contactEmail) {
        this();
        this.name = name;
        this.location = location;
        this.description = description;
        this.contactEmail = contactEmail;
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

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
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
