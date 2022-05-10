package com.company.task4;

import com.company.task3.Workers3;

//Класс "Работники" - Workers4 наследует от Workers3
public class Workers4 extends Workers3 {

    //поля
    protected int currency = 8;

    // конструкторы
    // 1.конструктор с 5 параметрами
    public Workers4(String surname, String initials, String typeOfPayment,
                    double time, double payment) {
        super(surname, initials, typeOfPayment, time, payment);
    }

    // 2.конструктор с 6 параметрами
    public Workers4(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children) {
        super(surname, initials, typeOfPayment, time, payment, children);

    }

    // getters and setters
    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

}
