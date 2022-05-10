package com.company.task5;

// класс WorkersHourOfPayment5 (почасовая ставка) - наследник  Workers5
public class WorkersHourOfPayment5 extends Workers5 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersHourOfPayment5(String surname, String initials, String typeOfPayment,
                                 double rateHour, double hourWorked) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersHourOfPayment5(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children);
    }

    // 3. конструктор с 7 параметрами
    public WorkersHourOfPayment5(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children, offshore);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        if (super.children) {
            return "|" + super.toString() + "|" + tax + "%|" + salaryCalculation() + " руб.|" +
                    halfSalary() + " / " + currencyOnHourly();
        } else return "|" + super.toString() + "|" + (taxChild + tax) + "%|" + salaryCalculation() + " руб.|" +
                halfSalary() + " / " + currencyOnHourly();
    }

    // 2. метод вычисления заработной платы работника с учётом налога 20%
    public double taxOnHourly() {
        if (offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * tax / 100));
        } else
            return (salaryCalculation() - (salaryCalculation()) * (taxChild + tax) / 100);
    }

    // 3. метод вычисления половин заработной платы работника в рублях
    public double halfSalary() {
        return taxOnHourly() / 2;
    }

    // 4. метод вычисления половины заработной платы работника в тугриках
    public double currencyOnHourly() {
        return halfSalary() / currency;
    }
}
