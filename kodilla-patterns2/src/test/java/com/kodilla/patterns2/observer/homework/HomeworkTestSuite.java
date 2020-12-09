package com.kodilla.patterns2.observer.homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        TaskQueue tasksFromDrJekyll = new TaskQueue("Tasks from Doctor Jekyll");
        TaskQueue tasksFromMrHyde = new TaskQueue("Tasks from MrHyde");
        Mentor andree = new Mentor("Andree");
        Mentor tabaluga = new Mentor("Tabaluga");
        tasksFromDrJekyll.registerObserver(andree);
        tasksFromMrHyde.registerObserver(tabaluga);
        //When
        tasksFromDrJekyll.addTask("Tata znowu nie działa to wideło");
        tasksFromDrJekyll.addTask("Popatrz na mojego Intellidżeja, to się już kameruje");
        tasksFromMrHyde.addTask("Najtrudniejsze w Javie to te streamy");
        // Then
        assertEquals(2, andree.getUpdateCount());
        assertEquals(1, tabaluga.getUpdateCount());
    }
}
