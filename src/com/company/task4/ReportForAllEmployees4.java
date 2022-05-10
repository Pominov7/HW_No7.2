package com.company.task4;

import com.company.task3.WorkersPieceOfPayment3;
import com.company.task3.WorkersRateOfPayment3;

public class ReportForAllEmployees4 {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment3 employee1 = new WorkersRateOfPayment3("Иванов", "И.С.", "Ставка",
                100, 30,true);

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment4 employee2 = new WorkersHourOfPayment4("Сидоров", "А.П.", "Почасовая",
                100, 8,true);

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment3 employee3 = new WorkersPieceOfPayment3("Петров", "В.В.", "Сдельная",
                550, 10,true);

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате
        System.out.println("|ФИО " + "|Налог,% " + "|Сумма (руб) |" + "К оплате (руб/тугрики) Курс 1/ 8|");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.taxRate() + employee2.taxOnHourly() +
                employee3.taxFix()) + "руб.|");
    }
}