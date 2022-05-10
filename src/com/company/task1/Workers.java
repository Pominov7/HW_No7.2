package com.company.task1;

//Класс "Работники" - Workers
public class Workers {

    //поля
    protected String typeOfPayment; // вид оплаты
    protected String surname; // фамилия работника
    protected String initials; // инициалы работника
    protected double payment;
    protected double time;

    // конструкторы
    // 1. конструктор без параметров
    public Workers() {
        typeOfPayment = "Payment";
        surname = "surname";
        initials = "initials";
    }

    // 2. конструктор с двумя параметрами
    public Workers(String surname, String initials) {
        this.surname = surname;
        this.initials = initials;
    }

    // 3. конструктор с тремя параметрами
    public Workers(String surname, String initials, String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
        this.surname = surname;
        this.initials = initials;
    }

    // 4. конструктор с 5 параметрами
    public Workers(String surname, String initials, String typeOfPayment,
                   double time, double payment) {
        this.typeOfPayment = typeOfPayment;
        this.surname = surname;
        this.initials = initials;
        this.payment = payment;
        this.time = time;
    }

    // getters and setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    //методы
    // 1. метод представления класса в виде строки - перегрузка метода toString
    @Override
    public String toString() {
        return surname + " " + initials;
    }

    // 2. метод расчета заработной платы по виду оплаты "Почасовая"
    public double salaryCalculation() {
        return payment * time;
    }
}
