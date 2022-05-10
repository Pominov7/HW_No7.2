package com.company.task6;

// класс WorkersPieceOfPayment6 (сдельная оплата) - наследник  Workers6

public class WorkersPieceOfPayment6 extends Workers6 {

    // конструкторы
    // 1. конструктор с 5 параметрами
    public WorkersPieceOfPayment6(String surname, String initials, String typeOfPayment, double piecework, double sumWorked) {
        super(surname, initials, typeOfPayment, piecework, sumWorked);

    }

    // 2. конструктор с 6 параметрами
    public WorkersPieceOfPayment6(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked, boolean children) {
        super(surname, initials, typeOfPayment, piecework, sumWorked, children);
    }

    // 3. конструктор с 7 параметрами
    public WorkersPieceOfPayment6(String surname, String initials, String typeOfPayment,
                                  double piecework, double sumWorked, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, piecework, sumWorked, children, offshore);

    }

    // 4. конструктор с 8 параметрами
    public WorkersPieceOfPayment6(String surname, String initials, String typeOfPayment, double piecework,
                                  double sumWorked, boolean children, boolean offshore, double award) {
        super(surname, initials, typeOfPayment, piecework, sumWorked, children, offshore, award);

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

    // 2. метод вычисления отработанных часов, с учетом новой перменной workHours
    public double transferOfWorkToHours() {
        return super.payment * super.workHours;
    }

    // 3. метод вычисления заработной платы работника с учётом налога 15%
    public double taxFix() {
        if (!super.offshore && transferOfWorkToHours() >= 200) {
            double sum = (salaryCalculation() - (salaryCalculation() * taxPiece / 100));
            return sum * award + sum;
        } else if (super.offshore) {
            return salaryCalculation();
        } else if (super.children) {
            return (salaryCalculation() - (salaryCalculation() * taxPiece / 100));
        } else
            return (salaryCalculation() - (salaryCalculation() * (taxChild + taxPiece) / 100));
    }

}


