public class Main {
    public static void main(String[] args) {

        // Задача 1

        byte number1 = 1;
        short number2 = 128;
        int number3 = 32768;
        long number4 = 2147483648L;
        float number5 = 0.99999f;
        double number6 = 0.999999999;
        System.out.println("Значение переменной number1 с типом byte равно " + number1);
        System.out.println("Значение переменной number2 с типом short равно " + number2);
        System.out.println("Значение переменной number3 с типом int равно " + number3);
        System.out.println("Значение переменной number4 с типом long равно " + number4);
        System.out.println("Значение переменной number5 с типом float равно " + number5);
        System.out.println("Значение переменной number6 с типом double равно " + number6);

        // Задача 2

        float floatNumber = 27.12f;
        long longNumber = 987678965549L;
        double doubleNumber = 2.786;
        short shortNumber1 = 569;
        short shortNumber2 = -159;
        int intNumber = 27897;
        byte byteNumber = 67;

        // Задача 3

        byte numberOfStudentsLP = 23;
        byte numberOfStudentsAS = 27;
        byte numberOfStudentsEA = 30;
        short totalNumberOfSheets = 480;
        int numberOfSheetsPerStudent = (totalNumberOfSheets / (numberOfStudentsLP
                + numberOfStudentsAS + numberOfStudentsEA));
        System.out.println("На каждого ученика рассчитано " + numberOfSheetsPerStudent
                + " листов бумаги.");

        // Задача 4

        byte amountBottles = 16;
        byte time = 2;
        int machinePerformanceInMin = amountBottles / time;
        byte period1 = 20;
        short period2 = 24 * 60;
        short period3 = 24 * 60 * 3;
        int period4 = 24 * 60 * 30;
        System.out.println("За " + period1 + " минут машина произвела "
                + machinePerformanceInMin * period1 + " штук бутылок.");
        System.out.println("За " + period2 + " минут машина произвела "
                + machinePerformanceInMin * period2 + " штук бутылок.");
        System.out.println("За " + period3 + " минут машина произвела "
                + machinePerformanceInMin * period3 + " штук бутылок.");
        System.out.println("За " + period4 + " минут машина произвела "
                + machinePerformanceInMin * period4 + " штук бутылок.");

        // Задача 5

        byte totalAmountPaintCans = 120;
        byte amountWhitePaintCansPerClass = 2;
        byte amountBrownPaintCansPerClass = 4;
        int amountClasses = (totalAmountPaintCans / (amountWhitePaintCansPerClass
                + amountBrownPaintCansPerClass));
        int amountWhitePaintCans = (amountClasses * amountWhitePaintCansPerClass);
        int amountBrownPaintCans = (amountClasses * amountBrownPaintCansPerClass);
        System.out.println("В школе, где " + amountClasses + " классов, нужно "
                + amountWhitePaintCans + " банок белой краски и " + amountBrownPaintCans
                + " банок коричневой краски.");

        // Задача 6

        byte amountBananas = 5;
        byte weightOneBanana = 80;
        short amountMilk = 200;
        byte portionMilk = 100;
        byte weightPortionMilk = 105;
        byte amountIceCreams = 2;
        byte weightOneIceCream = 100;
        byte amountEggs = 4;
        byte weightOneEgg = 70;

        int weightBananas = (amountBananas * weightOneBanana);
        int weightMilk = (amountMilk / portionMilk * weightPortionMilk);
        int weightIceCreams = (amountIceCreams * weightOneIceCream);
        int weightEggs = (amountEggs * weightOneEgg);
        int weightBreakfastInGrams = (weightBananas + weightMilk + weightIceCreams
                + weightEggs);
        float weightBreakfastInKilograms = weightBreakfastInGrams / 1000f;
        System.out.println("Вес спортзавтрака равен " + weightBreakfastInGrams
                + " грамм или " + weightBreakfastInKilograms + " килограмм.");

        // Задача 7

        byte totalLossWeight = 7;
        short lossWeightPerDayMin = 250;
        short lossWeightPerDayMax = 500;

        int totalLossWeightInGrams = (totalLossWeight * 1000);
        int amountDaysMin = (totalLossWeightInGrams / lossWeightPerDayMin);
        int amountDaysMax = (totalLossWeightInGrams / lossWeightPerDayMax);
        int lossWeightPerDayMid = (lossWeightPerDayMax + lossWeightPerDayMin) / 2;
        float amountDaysMid = (float) totalLossWeightInGrams / lossWeightPerDayMid;
        System.out.println("Если терять в весе по 250 грамм в день, то потребуется "
                + amountDaysMin + " дней, если по 500 грамм в день - " + amountDaysMax
                + " дней, а в среднем - " + amountDaysMid + " дней.");

        // Задача 8

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte indexing = 10;

        int newSalaryMasha = salaryMasha + (salaryMasha * indexing / 100);
        int newSalaryDenis = salaryDenis + (salaryDenis * indexing / 100);
        int newSalaryKristina = salaryKristina + (salaryKristina * indexing / 100);
        int earlyIncomeMasha = newSalaryMasha * 12 - salaryMasha * 12;
        int earlyIncomeDenis = newSalaryDenis * 12 - salaryDenis * 12;
        int earlyIncomeKristina = newSalaryKristina * 12 - salaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha
                + " рублей. Годовой доход вырос на " + earlyIncomeMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis
                + " рублей. Годовой доход вырос на " + earlyIncomeDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina
                + " рублей. Годовой доход вырос на " + earlyIncomeKristina + " рублей.");
    }
}