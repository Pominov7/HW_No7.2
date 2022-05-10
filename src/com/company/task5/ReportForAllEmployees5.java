package com.company.task5;

public class ReportForAllEmployees5 {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment5 employee1 = new WorkersRateOfPayment5("Иванов", "И.С.", "Ставка",
                100, 30);

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment5 employee2 = new WorkersHourOfPayment5("Сидоров", "А.П.", "Почасовая",
                100, 8,true, true);

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment5 employee3 = new WorkersPieceOfPayment5("Петров", "В.В.", "Сдельная",
                550, 10, true, true);

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате\
        System.out.println("|ФИО " + "|Налог,% " + "|Сумма (руб) |" + "К оплате (руб)|");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.taxRate() + employee2.taxOnHourly() +
                employee3.taxFix()) + "руб.|");
    }
}