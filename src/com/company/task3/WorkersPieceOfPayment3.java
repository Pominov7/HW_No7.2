package com.company.task3;

// класс WorkersPieceOfPayment3 (сдельная оплата) - наследник  Workers3

public class WorkersPieceOfPayment3 extends Workers3 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersPieceOfPayment3(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked) {
        super(surname, initials, typeOfPayment, piecework, sumWorked);

    }

    // 2. конструктор с 6 параметрами
    public WorkersPieceOfPayment3(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked, boolean children) {
        super(surname, initials, typeOfPayment, piecework, sumWorked, children);
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
        if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * taxPiece / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + taxPiece) / 100));
    }
}



