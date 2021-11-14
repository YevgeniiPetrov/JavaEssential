/* Задание
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.*/

package com.itvdn.javaEssential.petrov.lesson001.homeWork;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(30056);
        address.setCountry("Ukraine");
        address.setCity("Kyiv");
        address.setStreet("Shevchenko");
        address.setHouse("45B");
        address.setApartment(145);
        System.out.printf("%d, %s, %s, %s, %s, %d", address.getIndex(), address.getCountry(),
                address.getCity(), address.getStreet(), address.getHouse(), address.getApartment());
    }
}
