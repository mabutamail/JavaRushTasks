package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {

//        Методы должны возвращать строку вида:
//<getDescription() родительского класса> +
//            <" Моя страна - Sssss. Я несу N яиц в месяц.">
//            где Sssss - название страны
//        где N - количество яиц в месяц

//        String Sssss = Country.BELARUS;
//        Integer N = getCountOfEggsPerMonth();

        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());

        //       return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
