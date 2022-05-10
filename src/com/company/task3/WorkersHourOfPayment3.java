package com.company.task3;

// класс WorkersHourOfPayment3 (почасовая ставка) - наследник  Workers3
public class WorkersHourOfPayment3 extends Workers3 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersHourOfPayment3(String surname, String initials, String typeOfPayment,
                                 double rateHour, double hourWorked) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersHourOfPayment3(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children);

    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        if (super.children) {
            return "|" + super.toString() + "|" + tax + "%|" + salaryCalculation() + " руб.|" +
                    taxOnHourly() + " руб.|";
        } else return "|" + super.toString() + "|" + (taxChild + tax) + "%|" + salaryCalculation() + " руб.|" +
                taxOnHourly() + " руб.|";
    }

    // 2. метод вычисления заработной платы работника с учётом налога 20%
    public double taxOnHourly() {
        if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * tax / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
    }
}

