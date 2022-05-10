package com.company.task5;

// класс WorkersPieceOfPayment5 (сдельная оплата) - наследник  Workers5

public class WorkersPieceOfPayment5 extends Workers5 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersPieceOfPayment5(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked) {
        super(surname, initials, typeOfPayment, piecework, sumWorked);

    }

    // 2. конструктор с 6 параметрами
    public WorkersPieceOfPayment5(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked, boolean children) {
        super(surname, initials, typeOfPayment, piecework, sumWorked, children);
    }

    // 3. конструктор с 7 параметрами
    public WorkersPieceOfPayment5(String surname, String initials, String typeOfPayment, double rateHour,
                                  double hourWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, rateHour, hourWorked, children, offshore);

    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        if (super.children) {
            return "|" + super.toString() + "|" + taxPiece + "%|" + salaryCalculation() + " руб.|" +
                    taxFix() + " руб.|";
        } else return "|" + super.toString() + "|" + (taxChild + taxPiece) + "%|" + salaryCalculation() + " руб.|" +
                taxFix() + " руб.|";
    }

    // 2. метод вычисления заработной платы работника с учётом налога 15%
    public double taxFix() {
        if (super.offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation()) * taxPiece / 100);
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + taxPiece) / 100));
    }
}


