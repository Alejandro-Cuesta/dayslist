package dev.alejandro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysList {
    private List<String> days;

    public DaysList() {
        this.days = new ArrayList<>();
    }

    public void createDayList() {
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public List<String> getDays() {
        return days;
    }

    public int getSize() {
        return days.size();
    }

    public boolean removeDay(String day) {
        return days.remove(day);
    }

    public String getDay(int index) {
        return days.get(index);
    }

    public boolean containsDay(String day) {
        return days.contains(day);
    }

    public void sortDays() {
        Collections.sort(days);
    }

    public void clearDays() {
        days.clear();
    }
}