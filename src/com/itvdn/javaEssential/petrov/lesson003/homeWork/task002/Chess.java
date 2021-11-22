package com.itvdn.javaEssential.petrov.lesson003.homeWork.task002;

public class Chess implements Sport, Game {
    @Override
    public void info() {
        System.out.println("Шахматы - настольная логическая игра с шахматными фигурами на 64-клеточной доске, " +
                "сочетающая в себе элементы искусства (в том числе в части шахматной композиции), науки и спорта.");
    }

    @Override
    public void play() {
        System.out.println("Играть в шахматы.");
    }
}
