package com.company.task2;

// класс WorkersHourOfPayment2 (почасовая ставка) - наследник  Workers2
public class WorkersHourOfPayment2 extends Workers2 {

    // конструкторы
    // конструктор с 5 параметрами
    public WorkersHourOfPayment2(String surname, String initials, String typeOfPayment,
                                 double rateHour, double hourWorked) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked);
    }

    // getters and setters
    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    // методы
    // 1. метод вычисления заработной платы работника с учётом налога 20%
    public double taxOnHourly() {
        return (salaryCalculation() - (salaryCalculation() * tax / 100));
    }

    // 2. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + surname + " " + initials + "|" + tax + "%|" + salaryCalculation() + "руб.|" +
                taxOnHourly() + " руб.|";
    }
}

