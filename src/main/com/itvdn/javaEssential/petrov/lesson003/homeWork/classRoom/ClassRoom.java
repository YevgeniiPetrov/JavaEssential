package com.itvdn.javaEssential.petrov.lesson003.homeWork.classRoom;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil firstPupil, Pupil secondPupil, Pupil thirdPupil, Pupil fourthPupil) {
        this.pupils = new Pupil[] {firstPupil, secondPupil, thirdPupil, fourthPupil};
    }

    public ClassRoom(Pupil firstPupil, Pupil secondPupil, Pupil thirdPupil) {
        this(firstPupil, secondPupil, thirdPupil, null);
    }

    public ClassRoom(Pupil firstPupil, Pupil secondPupil) {
        this(firstPupil, secondPupil, null);
    }

    public void info() {
        for (int i = 0, j = 0; i < pupils.length; i++) {
            if (pupils[i] != null) {
                System.out.printf("Pupil №%d: ", ++j);
                pupils[i].study();
                System.out.print(", ");
                pupils[i].read();
                System.out.print(", ");
                pupils[i].write();
                System.out.print(", ");
                pupils[i].relax();
                System.out.println(".");
            }
        }
    }
}
