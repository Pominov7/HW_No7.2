package com.company.task5;

import com.company.task4.Workers4;

//Класс "Работники" - Workers5 наследует от Workers4
public class Workers5 extends Workers4 {

    //поля
    protected boolean offshore;// сотрудник работает в офшорной зоне

    // конструкторы
    // 1.конструктор с 5 параметрами
    public Workers5(String surname, String initials, String typeOfPayment,
                    double time, double payment) {
        super(surname, initials, typeOfPayment, time, payment);
    }

    // 2.конструктор с 6 параметрами
    public Workers5(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children) {
        super(surname, initials, typeOfPayment, time, payment, children);

    }

    // 3.конструктор с 7 параметрами
    public Workers5(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children, boolean offshore) {
        super(surname, initials, typeOfPayment, time, payment, children);
        this.offshore = offshore;
    }

    // getters and setters
    public boolean isOffshore() {
        return offshore;
    }

    public void setOffshore(boolean offshore) {
        this.offshore = offshore;
    }

}
