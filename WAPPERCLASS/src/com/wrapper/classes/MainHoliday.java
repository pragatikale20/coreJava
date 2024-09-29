package com.wrapper.classes;

public class MainHoliday {
public static void main(String[] args) {
        Holiday[] holidays = new Holiday[] {
            new Holiday("January 26", "Republic Day"),
            new Holiday("August 15", "Independence Day"),
        };
  //enhanced for loop
        for (Holiday holiday : holidays) {
            System.out.println(" Date: " + holiday.date + " ---->" + " Festival: " + holiday.festival);
        }
    }
}
