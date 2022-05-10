package com.company.task6;

import com.company.task5.Workers5;

//Класс "Работники" - Workers6 наследует от Workers5
public class Workers6 extends Workers5 {

    //поля
    protected double award;// премия сотрудника
    protected double workHours = 2; // 1 работа выполняется 2 часа
    protected double workDays = 8; // 1 день работы = 8 часов

    // конструкторы
    // 1.конструктор с 5 параметрами
    public Workers6(String surname, String initials, String typeOfPayment,
                    double time, double payment) {
        super(surname, initials, typeOfPayment, time, payment);
    }

    // 2.конструктор с 6 параметрами
    public Workers6(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children) {
        super(surname, initials, typeOfPayment, time, payment, children);

    }

    // 3.конструктор с 7 параметрами
    public Workers6(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, time, payment, children, offshore);
        this.offshore = offshore;
    }

    // 4.конструктор с 8 параметрами
    public Workers6(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children, boolean offshore, double award) {
        super(surname, initials, typeOfPayment, time, payment, children, offshore);
        this.award = award;
    }

    // getters and setters
    public double getAward() {
        return award;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkDays(double workDays) {
        this.workDays = workDays;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public void setAward(double award) {
        this.award = award;
    }
}
