package com.company.task1;

// класс WorkersPieceOfPayment (сдельная оплата) - наследник  Workers

public class WorkersPieceOfPayment extends Workers {

    // конструкторы
    // конструктор с 5 параметрами
    public WorkersPieceOfPayment(String surname, String initials, String typeOfPayment,
                                 double piecework, double sumWorked) {
        super(surname, initials, typeOfPayment, piecework, sumWorked);
    }

    // методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return "|" + super.toString() + "|" + typeOfPayment + "|" + salaryCalculation() + "руб.|";
    }
}



