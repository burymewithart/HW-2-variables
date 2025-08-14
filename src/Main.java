//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int myInt = 10;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        byte myByte = 120;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        short myShort = 1000;
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        long myLong = 1234567890;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        float myFloat = 12.3f;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        double myDouble = 12.34;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        System.out.println("Задание 2");

        float floatValue = 27.12f;
        long longValue = 987678965549L;
        double doubleValue = 2.786;
        int intValue = 569;
        short shortValue = -159;
        int alsoInt = 27897;
        byte byteValue = 67;
        System.out.println("floatValue переменная = " + floatValue + " (тип float)");
        System.out.println("longValue переменная = " + longValue + " (тип long)");
        System.out.println("doubleValue переменная = " + doubleValue + " (тип double)");
        System.out.println("intValue переменная = " + intValue + " (тип int)");
        System.out.println("shortValue переменная = " + shortValue + " (тип short)");
        System.out.println("alsoInt переменная = " + alsoInt + " (тип int)");
        System.out.println("byteValue переменная = " + byteValue + " (тип byte)");

        System.out.println("Задание 3");

        byte firstTeacher = 23;
        System.out.println("У Людмилы Павловны " + firstTeacher + " ученика");
        byte secondTeacher = 27;
        System.out.println("У Анны Сергеевны " + secondTeacher + " учеников");
        int thirdTeacher = 30;
        System.out.println("У Екатерины Андреевны " + thirdTeacher + " учеников");
        short paper = 480;
        System.out.println("Количество бумаги, которое учителя закупили для учеников - " + paper);
        int sumPupils = firstTeacher + secondTeacher + thirdTeacher;
        System.out.println("Суммарное количество учеников - " + sumPupils);
        int result = paper / sumPupils;
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        System.out.println("Задание 4");

        int bottlesPer2Min = 16;
        System.out.println("Производительность машины для изготовления бутылок - " + bottlesPer2Min + " за 2 минуты");
        int bottlesPer1Min = bottlesPer2Min / 2;
        System.out.println("Производительность бутылок в минуту - " + bottlesPer1Min);
        int bottlesPer20min = bottlesPer1Min * 20;
        System.out.println("Производительность бутылок за 20 минут - " + bottlesPer20min);
        int minInOneDay = 24 * 60;
        System.out.println("Производительность бутылок за один день - " + minInOneDay);
        int minInThreeDays = minInOneDay * 3;
        System.out.println("Производительность бутылок за три дня - " + minInThreeDays);
        int minInOneMonth = minInOneDay * 30;
        System.out.println("Производительность бутылок за один месяц - " + minInOneMonth);

        System.out.println("Задание 5");

        int needPaintForOneClassRoom = 120;
        System.out.println("Суммарное количество банок, которое необходимо - " + needPaintForOneClassRoom);
        int perOneClassRoomWhite = 2;
        System.out.println("Затрачивается белой краски на один класс - " + perOneClassRoomWhite);
        int perOneClassRoomBrown = 4;
        System.out.println("Затрачивается коричневой краски на один класс - " + perOneClassRoomBrown);
        int classRooms = needPaintForOneClassRoom / (perOneClassRoomWhite + perOneClassRoomBrown);
        System.out.println("Количество классов - " + classRooms);
        int sumWhite = perOneClassRoomWhite * classRooms;
        System.out.println("Количество белой краски - " + sumWhite);
        int sumBrown = perOneClassRoomBrown * classRooms;
        System.out.println("Количество коричневой краски - " + sumBrown);
        System.out.println("В школе, где " + classRooms + " классов, нужно " + sumWhite + " банок белой краски и " + sumBrown + " банок коричневой краски");

        System.out.println("Задание 6");

        int bananaAmount = 5;
        int bananaWeightGr = 80;
        int milkVolume = 200;
        int milkWeightPer100Ml = 105;
        int iceCreamAmount = 2;
        int iceCreamWeightGr = 100;
        int eggAmount = 4;
        int eggWeightGr = 70;
        int sumWeightGr = (bananaAmount * bananaWeightGr) + ((milkVolume * milkWeightPer100Ml) / 100) + (iceCreamAmount * iceCreamWeightGr) + (eggAmount * eggWeightGr);
        double sumWeightKg = sumWeightGr / 1000.0;
        System.out.println("Суммарный вес спортзавтрка - " + sumWeightGr + " грамм или " + sumWeightKg + " киллограмм");

        System.out.println("Задание 7");

        int goalLossWeightKg = 7;
        int lossWeightPerDayGrFrom = 250;
        short lossWeightPerDayGrTo = 500;
        double sumDaysFrom = (goalLossWeightKg * 1000.0) / lossWeightPerDayGrFrom;
        System.out.println();
        System.out.println("Потребуется дней для похудения - " + sumDaysFrom + " при условии, что спортсмен cбрасывал ежедневно " + lossWeightPerDayGrFrom + " грамм");
        double sumDaysTo = (goalLossWeightKg * 1000.0) / lossWeightPerDayGrTo;
        System.out.println();
        System.out.println("Потребуется дней для похудения - " + sumDaysTo + " при условии, что спортсмен cбрасывал ежедневно " + lossWeightPerDayGrTo + " грамм");
        double averageDays = (sumDaysFrom + sumDaysTo) / 2;
        System.out.println();
        System.out.println("Среднее количество дней для похудения - " + averageDays);

        System.out.println("Задание 8");
        int currentSalaryMasha = 67760;
        int currentSalaryDen = 83690;
        int currentSalaryKris = 76230;
        int monthInOneYear = 12;
        double percentMore = 1.1;
        int mashaSalaryBefore = currentSalaryMasha * monthInOneYear;
        int denSalaryBefore = currentSalaryDen * monthInOneYear;
        int krisSalaryBefore = currentSalaryKris * monthInOneYear;
        System.out.println();
        System.out.println("Заработная плата Маши в год до индексации составляет - " + mashaSalaryBefore);
        System.out.println("Заработная плата Дениса в год до индексации составляет - " + denSalaryBefore);
        System.out.println("Заработная плата Кристины в год до индексации составляет - " + krisSalaryBefore);

        double afterMonthSalaryMasha = currentSalaryMasha * percentMore;
        double afterMonthSalaryDen = currentSalaryDen * percentMore;
        double afterMonthSalaryKris = currentSalaryKris * percentMore;
        System.out.println();
        System.out.println("Заработная плата Маши в месяц после индексации составляет - " + afterMonthSalaryMasha);
        System.out.println("Заработная плата Дениса в месяц после индексации составляет - " + String.format("%.1f", afterMonthSalaryDen));
        System.out.println("Заработная плата Кристины в месяц после индексации составляет - " + afterMonthSalaryKris);

        double afterYearSalaryMasha = afterMonthSalaryMasha * monthInOneYear;
        double afterYearSalaryDen = afterMonthSalaryDen * monthInOneYear;
        double afterYearSalaryKris = afterMonthSalaryKris * monthInOneYear;
        System.out.println();
        System.out.println("Заработная плата Маши в год после индексации составляет - " + afterYearSalaryMasha);
        System.out.println("Заработная плата Дениса в год после индексации составляет - " + String.format("%.1f", afterYearSalaryDen));
        System.out.println("Заработная плата Кристины в год после индексации составляет - " + afterYearSalaryKris);

        double differenceMasha = afterYearSalaryMasha - mashaSalaryBefore;
        double differenceDen = afterYearSalaryDen - denSalaryBefore;
        double differenceKris = afterYearSalaryKris - krisSalaryBefore;
        System.out.println();
        System.out.println("Маша теперь получает " + afterMonthSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + String.format("%.1f", afterMonthSalaryDen) + " рублей. Годовой доход вырос на " + String.format("%.1f", differenceDen) + " рублей");
        System.out.println("Кристина теперь получает " + afterMonthSalaryKris + " рублей. Годовой доход вырос на " + differenceKris + " рублей");
    }
}