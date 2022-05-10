package com.company.task5;

// класс WorkersRateOfPayment5 (ставка) - наследник  Workers5

public class WorkersRateOfPayment5 extends Workers5 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersRateOfPayment5(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersRateOfPayment5(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked, children);

    }

    // 3. конструктор с 7 параметрами
    public WorkersRateOfPayment5(String surname, String initials, String typeOfPayment, double rateHour,
                                 double hourWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children, offshore);
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
        if (super.offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation()) * tax / 100);
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
    }
}
