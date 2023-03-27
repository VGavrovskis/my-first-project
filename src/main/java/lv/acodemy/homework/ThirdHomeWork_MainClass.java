package lv.acodemy.homework;

public class ThirdHomeWork_MainClass {
    public static void main(String[] args) {
        ThirdHomeWork_PezDispenser superman = new ThirdHomeWork_PezDispenser("blue","Superman","DC");
        System.out.println(superman.getPezName());
        System.out.println(superman.getSeriesName());
        System.out.println(superman.getColor());
        System.out.println(superman.getCandyCount());
        superman.eatCandy();
        superman.eatCandy();
        superman.eatCandy();
        superman.eatCandies(2);
        System.out.println(superman.getCandyCount());
        superman.fill();
        superman.fill(1);
        superman.setCandyCount();

    }
}
//Задание: сделать PEZ dispenser (наверняка знаете что это такое)
//PEZ dispenser должен иметь возможность:
//- отдавать по одной конфетке
//- отдавать любое количество нам нужных конфет
//- загружать целиком недостающие конфеты
//- загружать по одной конфетке
//- загружать любое количество конфет
//
//Очень важно:
//продумать логику чтобы нельзя было съесть больше количество конфет чем реально есть так же как и загрузить и тд
//
//PEZ должен иметь название, цвет и название серии (это может быть MARVEL, MARIO, LOONEY TUNES и тд) - все это надо подавать в конструктор при создании объекта
//На выходе должно быть два класса (один с описанием полей, методов нашего класса PezDispenser), второе сам класс где будете создавать объект и играться с методами