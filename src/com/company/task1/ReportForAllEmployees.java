package com.company.task1;

public class ReportForAllEmployees {
    public static void main(String[] args) {

        //Создаём объект работника с видом оплаты труда "Ставка"
        WorkersRateOfPayment employee1 = new WorkersRateOfPayment("Иванов", "И.С.", "Ставка",
                100, 30);

        //Создаём объект работника с видом оплаты труда "Почасовая"
        WorkersHourOfPayment employee2 = new WorkersHourOfPayment("Сидоров", "А.П.", "Почасовая",
                100, 8);

        //Создаём объект работника с видом оплаты труда "Сдельная"
        WorkersPieceOfPayment employee3 = new WorkersPieceOfPayment("Петров", "В.В.", "Сдельная",
                550, 10);

        //вывод в консоль отчета по всем сотрудникам фирмы о заработной плате\
        System.out.println("| ФИО " + "| Вид оплаты " + "| Сумма |");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("|Итого " + (employee1.salaryCalculation() + employee2.salaryCalculation() +
                employee3.salaryCalculation()) + "руб.|");
    }
}