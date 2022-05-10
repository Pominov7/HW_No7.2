package com.company.task2;

// класс WorkersRateOfPayment2 (ставка) - наследник  Workers2

public class WorkersRateOfPayment2 extends Workers2 {

    // конструкторы
    // конструктор с 5 параметрами
    public WorkersRateOfPayment2(String surname, String initials, String typeOfPayment,
                                 double rateDays, double daysWorked) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + surname + " " + initials + "|" + tax + "%|" + salaryCalculation() + "руб.|" +
                taxRate() + " руб.|";
    }

    // 2. метод вычисления заработной платы работника с учётом налога 20%
    public double taxRate() {
        return (salaryCalculation() - (salaryCalculation() * tax / 100));
    }
}
