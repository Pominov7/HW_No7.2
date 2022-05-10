package com.company.task1;

// класс WorkersRateOfPayment (ставка) - наследник  Workers

public class WorkersRateOfPayment extends Workers {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersRateOfPayment(String surname, String initials, String typeOfPayment, double rateDays,
                                double daysWorked) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + super.toString() + "|" + typeOfPayment + "|" + salaryCalculation() + "руб.|";
    }
}
