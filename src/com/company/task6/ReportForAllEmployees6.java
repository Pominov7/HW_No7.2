package com.company.task6;

public class ReportForAllEmployees6 {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment6 employee1 = new WorkersRateOfPayment6("Иванов", "И.С.", "Ставка",
                200, 25, false, true, 1);

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment6 employee2 = new WorkersHourOfPayment6("Сидоров", "А.П.", "Почасовая",
                100, 180, true, false, 0.2);

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment6 employee3 = new WorkersPieceOfPayment6("Петров", "В.В.", "Сдельная",
                200, 100, true, false, 0.5);

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате
        System.out.println("|ФИО " + "|Налог,% " + "|Сумма (руб) |" + "К оплате (руб)|");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.taxRate() + employee2.taxOnHourly() +
                employee3.taxFix()) + "руб.|");
    }
}