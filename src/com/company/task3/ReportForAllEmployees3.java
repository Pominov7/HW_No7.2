package com.company.task3;

public class ReportForAllEmployees3 {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment3 employee1 = new WorkersRateOfPayment3("Иванов", "И.С.", "Ставка",
                100, 30, true);// у этого сотрудника есть дети

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment3 employee2 = new WorkersHourOfPayment3("Сидоров", "А.П.", "Почасовая",
                100, 8, false);// у этого сотрудника есть дети

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment3 employee3 = new WorkersPieceOfPayment3("Петров", "В.В.", "Сдельная",
                550, 10, true);// у этого сотрудника нет детей, ставка налога станет на 5% больше

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате
        System.out.println("|ФИО " + "|Налог,% " + "|Сумма (руб) |" + "К оплате (руб)|");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.taxRate() + employee2.taxOnHourly() +
                employee3.taxFix()) + "руб.|");
    }
}