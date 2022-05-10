package com.company.task3;

// класс WorkersRateOfPayment3 (ставка) - наследник  Workers3

public class WorkersRateOfPayment3 extends Workers3 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersRateOfPayment3(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersRateOfPayment3(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked, children);

    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        if (super.children) {
            return "|" + super.toString() + "|" + tax + "%|" + salaryCalculation() + " руб.|" +
                    taxRate() + " руб.|";
        } else return "|" + super.toString() + "|" + (taxChild + tax) + "%|" + salaryCalculation() + " руб.|" +
                taxRate() + " руб.|";
    }

    // 2. метод вычисления заработной платы работника с учётом налога 20%
    public double taxRate() {
        if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * tax / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
    }
}
