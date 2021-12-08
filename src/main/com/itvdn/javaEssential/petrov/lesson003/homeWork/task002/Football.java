package com.itvdn.javaEssential.petrov.lesson003.homeWork.task002;

public class Football implements Sport, Game, Team {
    @Override
    public void info() {
        System.out.println("Футбол - командный вид спорта, в котором целью является забить мяч в ворота соперника " +
                "ногами или другими частями тела (кроме рук) большее количество раз, чем команда соперника.");
        System.out.printf("Количество игроков в команде: %d.\n", getAmountMembers());
    }

    @Override
    public void play() {
        System.out.println("Играть в футбол.");
    }

    @Override
    public int getAmountMembers() {
        return 11;
    }
}
