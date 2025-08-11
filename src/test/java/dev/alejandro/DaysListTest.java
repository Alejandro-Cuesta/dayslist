package dev.alejandro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaysListTest {

    private DaysList daysList;

    @BeforeEach
    public void setup() {
        daysList = new DaysList();
    }

    @Test
    public void testCreateDayList() {
        daysList.createDayList();
        assertNotNull(daysList.getDays());
    }

    @Test
    public void testGetDaysList() {
        daysList.createDayList();
        List<String> days = daysList.getDays();

        assertNotNull(days);
        assertTrue(days.contains("Lunes"));
    }

    @Test
    public void testGetSize() {
        daysList.createDayList();
        int count = daysList.getSize();

        assertEquals(7, count);
    }

    @Test
    public void testRemoveDay() {
        daysList.createDayList();

        assertTrue(daysList.containsDay("Lunes"));

        boolean removed = daysList.removeDay("Lunes");
        assertTrue(removed);

        assertFalse(daysList.containsDay("Lunes"));
        assertEquals(6, daysList.getSize());
    }

    @Test
    public void testGetDay() {
        daysList.createDayList();
        String day = daysList.getDay(0);

        assertEquals("Lunes", day);
    }

    @Test
    public void testContainsDay() {
        daysList.createDayList();

        assertTrue(daysList.containsDay("Lunes"));
        assertFalse(daysList.containsDay("Fiesta"));
    }

    @Test
    public void testSortDays() {
        daysList.createDayList();
        daysList.sortDays();

        List<String> sortedDays = daysList.getDays();

        assertEquals("Domingo", sortedDays.get(0));
        assertEquals("Viernes", sortedDays.get(sortedDays.size() - 1));
    }

    @Test
    public void testClearDays() {
        daysList.createDayList();
        assertEquals(7, daysList.getSize());

        daysList.clearDays();
        assertEquals(0, daysList.getSize());
    }
}