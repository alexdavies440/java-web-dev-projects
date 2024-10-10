package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    // Need place to put events
    // Made final to prevent replacement by another collection for security
    private static final Map<Integer, Event> events = new HashMap<>();
    // Get all events
    public static Collection<Event> getAll() {
        return events.values();
    }
    //Get a single event
    public static Event getById(int id) {
        return events.get(id);
    }
    // Add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }
    // Remove event
    public static void remove(int id) {
        events.remove(id);
    }
}
