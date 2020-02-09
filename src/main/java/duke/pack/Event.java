package duke.pack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Represents a command to add an event type of task.
 */
public class Event extends Task {
    protected String fullDesc;
    protected String time;
    protected LocalDate date;

    /**
     * Creates an event type of task.
     * @param description task to be done
     * @param time time of event
     * @param date date of event
     * @param fullDesc the full description of the task
     */
    public Event(String description, String time, LocalDate date, String fullDesc) {
        super(description, fullDesc);
        this.time = time;
        this.date = date;
    }

    /**
     * Formats the task to be saved in hard disk.
     * @return a string of the formatted task
     */
    @Override
    public String formatForFile() {
        String type = "E";
        String done;
        if (isDone) {
            done = "1";
        } else {
            done = "0";
        }

        return type + " | " + done + " | " + description
                + " | " + time + " | " + date.toString() + "\n";
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: "
                + date.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ", " + time + ")";
    }
}
