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
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        arrayList.add(0, "1");
        arrayList.add(0, "2");
        arrayList.add(2, "3");
        arrayList.add(2, "4");
        System.out.println(arrayList);
        System.out.println();


        MyArrayListImpl myArrayList = new MyArrayListImpl();
        System.out.println(myArrayList);
        myArrayList.add("1");
        System.out.println(myArrayList);
        myArrayList.add("2", 7);
        System.out.println(myArrayList);
        myArrayList.add("3", 7);
        System.out.println(myArrayList);
        myArrayList.add("4", 7);
        System.out.println(myArrayList);
        myArrayList.add("5", 3);
        System.out.println(myArrayList);
        myArrayList.add("6");
        myArrayList.add("9", 0);
        System.out.println(myArrayList);
        myArrayList.add("7");
        myArrayList.add("8");
        System.out.println(myArrayList);
        myArrayList.add("10", 0);
        System.out.println(myArrayList);
    }
}
