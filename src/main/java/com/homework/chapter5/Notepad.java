package com.homework.chapter5;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notepad {
    Map<Date, List<Note>> notes = new HashMap<>();

    private class Note {
        Date date;
        Event event;

        private class Event {
            String summary;
            String description;
        }
    }
}

