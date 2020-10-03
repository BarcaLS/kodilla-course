package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        // When
        Board board = (Board) context.getBean("getBoard");
        board.toDoList.tasks.add("Pierwsze zadanie");
        board.inProgressList.tasks.add("Drugie zadanie");
        board.doneList.tasks.add("Trzecie zadanie");

        // Then
        Assert.assertEquals("Pierwsze zadanie", board.toDoList.tasks.get(0));
        Assert.assertEquals("Drugie zadanie", board.inProgressList.tasks.get(0));
        Assert.assertEquals("Trzecie zadanie", board.doneList.tasks.get(0));
    }
}
