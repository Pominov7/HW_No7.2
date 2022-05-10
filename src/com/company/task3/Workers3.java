package com.company.task3;

import com.company.task2.Workers2;

//Класс "Работники" -  Workers3 наследует от Workers2
public class Workers3 extends Workers2 {

    //поля
    protected boolean children;// дети у сотрудника
    protected int taxChild = 5;  // добавляется налог 5%, для работников без детей

    // конструкторы
    // 1.конструктор с 5 параметрами
    public Workers3(String surname, String initials, String typeOfPayment,
                    double time, double payment) {
        super(surname, initials, typeOfPayment, time, payment);
    }

    // 2.конструктор с 6 параметрами
    public Workers3(String surname, String initials, String typeOfPayment,
                    double time, double payment, boolean children) {
        super(surname, initials, typeOfPayment, time, payment);
        this.children = children;
    }

    // getters and setters
    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public int getTaxChild() {
        return taxChild;
    }

    public void setTaxChild(int taxChild) {
        this.taxChild = taxChild;
    }

}
