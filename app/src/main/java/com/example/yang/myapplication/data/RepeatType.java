package com.example.yang.myapplication.data;

/**
 * Created by yang on 16/5/18.
 */
public class RepeatType {

    public final static int EVERYDAY = 0x1;
    public final static int WEEKDAY = 0x2;
    public final static int MONTHDAY = 0x3;
    public final static int YEARDAY = 0x4;
    public final static int ONEDAY = 0x5;

    private int year = -1;
    private int month = -1;
    private int day = -1;

    private WeekDay[] weekDays = null;

    public RepeatType(int year, int month, int day) {
        year = year;
        month = month;
        day = day;
    }

    public RepeatType(WeekDay... weekDays) {

        this.weekDays = weekDays;

    }

    public int getType() {
        int type = EVERYDAY;
        if (year == -1) {
            if (month == -1) {
                if (day == -1) {
                    if (weekDays != null) {
                        type = WEEKDAY;
                    }
                } else {
                    type = MONTHDAY;
                }
            } else {
                type = YEARDAY;
            }
        } else {
            type = ONEDAY;
        }
        return type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setWeekDays(WeekDay[] weekDays) {
        this.weekDays = weekDays;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public WeekDay[] getWeekDays() {
        return weekDays;
    }
}
