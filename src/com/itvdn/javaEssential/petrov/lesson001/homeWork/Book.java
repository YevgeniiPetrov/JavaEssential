/* Задание 3
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс Book(Main). Создать классы Title, Author и Content, каждый из которых должен
содержать одно строковое поле и метод void show (). Реализуйте возможность добавления в книгу
названия книги, имени автора и содержания. Выведите на экран при помощи метода show() название
книги, имя автора и Содержание.*/

package com.itvdn.javaEssential.petrov.lesson001.homeWork;

public class Book {
    private Title title;
    private Author author;
    private Content content;

    public Book(String title, String author, String content) {
        this.title = new Title(title);
        this.author = new Author(author);
        this.content = new Content(content);
    }

    public void show() {
        System.out.print("Название книги: ");
        this.title.show();
        System.out.print("Имя автора: ");
        this.author.show();
        System.out.print("Содержание: ");
        this.content.show();
    }

    public static void main(String[] args) {
        new Book("Java", "Petrov Yevgenii", "About Java").show();
    }
}
