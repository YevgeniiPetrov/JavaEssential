package com.itvdn.javaEssential.petrov.lesson005.homeWork.addTask;

public interface MyList {
    void add(String element);
    void add(String element, int index);
    int size();
    void remove(String element);
    void remove(int index);
    void clear();
    void set(String element, int index);
    int indexOf(String element);
    Object get(int index);
}
