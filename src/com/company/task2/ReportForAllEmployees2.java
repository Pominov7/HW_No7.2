package com.company.task2;

public class ReportForAllEmployees2 {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment2 employee1 = new WorkersRateOfPayment2("Иванов", "И.С.", "Ставка",
                100, 30);

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment2 employee2 = new WorkersHourOfPayment2("Сидоров", "А.П.", "Почасовая",
                100, 8);

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment2 employee3 = new WorkersPieceOfPayment2("Петров", "В.В.", "Сдельная",
                550, 10);

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате\
        System.out.println("|ФИО " + "|Налог,% " + "|Сумма (руб) |" + "К оплате (руб)|");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.taxRate() + employee2.taxOnHourly() +
                employee3.taxFix()) + "руб.|");
    }
}