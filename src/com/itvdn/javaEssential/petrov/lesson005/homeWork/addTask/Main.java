/* 1. Так как вы не знаете дженерики - будет говорить что создаем на основании СТРИНГИ.
2. Изначальный массив должен иметь длину 10.
3. Вы создаете интерфейс
MyList
И класс
MyArrayListImpl

4. Реализуете методы:
(название методов не менять. Название переменных - очень желательно)
add(String e)
add(String e, int pos)
size()
remove(String e)
remove(int pos)
clear()
set(String e, int pos)
indexOf(String e)
get(int pos)

5. Подумайте о том, что некоторые методы могут вызывать другие методы внутри себя.*/

package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        System.out.println(myArrayList);
        myArrayList.add("1");
        System.out.println(myArrayList);
        myArrayList.add("2", 4);
        System.out.println(myArrayList);
        myArrayList.add("3", 7);
        System.out.println(myArrayList);
        myArrayList.add("4", 1);
        System.out.println(myArrayList);
        myArrayList.add("5");
        System.out.println(myArrayList);
        myArrayList.remove("3");
        System.out.println(myArrayList);
        myArrayList.remove(4);
        System.out.println(myArrayList);
        myArrayList.set("6", 8);
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);
    }
}
