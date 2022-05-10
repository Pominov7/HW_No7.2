package com.company.task6;

// класс WorkersRateOfPayment6 (ставка) - наследник  Workers6

public class WorkersRateOfPayment6 extends Workers6 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersRateOfPayment6(String surname, String initials, String typeOfPayment,
                                 double rateDays, double daysWorked) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked);
    }

    // 2. конструктор с 6 параметрами
    public WorkersRateOfPayment6(String surname, String initials, String typeOfPayment,
                                 double rateDays, double daysWorked, boolean children) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked, children);

    }

    // 3. конструктор с 7 параметрами
    public WorkersRateOfPayment6(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked, children, offshore);
    }

    // 4. конструктор с 8 параметрами
    public WorkersRateOfPayment6(String surname, String initials, String typeOfPayment, double rateDays,
                                 double daysWorked, boolean children, boolean offshore, double award) {
        super(surname, initials, typeOfPayment, rateDays, daysWorked, children, offshore, award);
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

    // 2. метод вычисления отработанных часов, с учетом новой перменной workDays
    public double transferOfDaysToHours() {
        return super.payment * super.workDays;
    }

    // 3. метод вычисления заработной платы работника с учётом налога 20%
    public double taxRate() {
        if (!super.offshore && transferOfDaysToHours() >= 200) {
            double sum = (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
            return sum * award + sum;
        } else if (super.offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * tax / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + tax) / 100));
    }
}
