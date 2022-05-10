package com.company.task6;

// класс WorkersHourOfPayment6 (почасовая ставка) - наследник  Workers6
public class WorkersHourOfPayment6 extends Workers6 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersHourOfPayment6(String surname, String initials, String typeOfPayment,
                                 double rateHour, double hourWorked) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersHourOfPayment6(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children);
    }

    // 3. конструктор с 7 параметрами
    public WorkersHourOfPayment6(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children, offshore);
    }

    // 4. конструктор с 8 параметрами
    public WorkersHourOfPayment6(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children, boolean offshore, double award) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children, offshore, award);
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

    // 2. метод вычисления заработной платы работника с учётом премии и налога 20%
    public double taxOnHourly() {
        if (!super.offshore && super.payment >= 200) {
            double sum = (salaryCalculation() - (salaryCalculation() * tax / 100));
            return sum * award + sum;
        } else if (super.offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * tax / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
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
