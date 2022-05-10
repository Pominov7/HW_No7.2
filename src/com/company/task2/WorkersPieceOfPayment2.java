package com.company.task2;

// класс WorkersPieceOfPayment2 (сдельная оплата) - наследник  Workers2

public class WorkersPieceOfPayment2 extends Workers2 {

    // конструкторы
    // конструктор с 5 параметрами
    public WorkersPieceOfPayment2(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked) {
        super(surname, initials, typeOfPayment, piecework, sumWorked);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + surname + " " + initials + "|" + taxPiece + "%|" + salaryCalculation() + "руб.|" +
                taxFix() + " руб.|";
    }

    // 2. метод вычисления заработной платы работника с учётом налога 15%
    public double taxFix() {
        return (salaryCalculation() - (salaryCalculation() * taxPiece / 100));
    }
}



