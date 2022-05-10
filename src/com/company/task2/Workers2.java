package com.company.task2;

import com.company.task1.Workers;

//Класс "Работники" - Workers2 наследует от Workers
public class Workers2 extends Workers {

    //поля
    protected int taxPiece = 15; // налог 15%
    protected int tax = 20; // налог 20%

    // конструкторы
    // конструктор с 5 параметрами
    public Workers2(String surname, String initials, String typeOfPayment,
                    double time, double payment) {
        super(surname, initials, typeOfPayment, time, payment);
    }

    // getters and setters
    public int getTaxPiece() {
        return taxPiece;
    }

    public void setTaxPiece(int taxPiece) {
        this.taxPiece = taxPiece;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

}
