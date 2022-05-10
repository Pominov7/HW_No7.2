package com.company.task1;

// класс WorkersHourOfPayment (почасовая ставка) - наследник  Workers
public class WorkersHourOfPayment extends Workers {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersHourOfPayment(String surname, String initials, String typeOfPayment,
                                double rateHour, double hourWorked) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + super.toString() + "|" + typeOfPayment + "|" + salaryCalculation() + "руб.|";
    }
}
