package com.itvdn.javaEssential.petrov.lesson003.homeWork.documentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
