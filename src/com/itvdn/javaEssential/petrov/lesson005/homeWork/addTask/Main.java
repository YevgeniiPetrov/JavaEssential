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
        arrayList.add("test");
        arrayList.add("test1");
        arrayList.add(1, "test2");
        System.out.println(arrayList);
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        myArrayList.add("t1");
        myArrayList.add("t2");
        myArrayList.add("t2", 5);
        myArrayList.add("t2", 8);
        myArrayList.add("t3");
        System.out.println(myArrayList);
    }
}
