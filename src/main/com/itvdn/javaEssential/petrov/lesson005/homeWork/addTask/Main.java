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

public class Main {
    public static void main(String[] args) {
        MyArrayListImpl myArrayList = new MyArrayListImpl();
        for (int i = 0; i < 50; i++) {
            myArrayList.add("" + i, ((int) (Math.random() * myArrayList.size())));
            System.out.println(myArrayList);
        }
        for (int i = 0; i < 50; i++) {
            myArrayList.remove((int) (Math.random() * myArrayList.size()));
            System.out.println(myArrayList);
        }
    }
}
