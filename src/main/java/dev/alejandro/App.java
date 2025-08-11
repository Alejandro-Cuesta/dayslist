package dev.alejandro;

public class App {
    public static void main(String[] args) {
        System.out.println("Días de la semana:");

        DaysList daysList = new DaysList();
        daysList.createDayList();

        for (String day : daysList.getDays()) {
            System.out.println(day);
        }
    }
}