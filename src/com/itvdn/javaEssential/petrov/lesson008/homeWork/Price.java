/* Создайте проект, используя IntelliJ IDEA.
Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.
Написать программу, выполняющую следующие действия:
 ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
быть упорядочены в алфавитном порядке по названиям магазинов);
 вывод на экран информации о товарах, продающихся в магазине, название которого введено с
клавиатуры (если такого магазина нет, вывести исключение).*/

package com.itvdn.javaEssential.petrov.lesson008.homeWork;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Price {
    private String productName;
    private String market;
    private int productPrice;

    public Price(String productName, String market, int productPrice) {
        this.productName = productName;
        this.market = market;
        this.productPrice = productPrice;
    }

    public String getMarket() {
        return market;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productName='" + productName + '\'' +
                ", market='" + market + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public static String getInputString(Scanner sc, String message) {
        System.out.println(message);
        return sc.next();
    }

    public static int getInputNumber(Scanner sc, String message) {
        return Integer.parseInt(getInputString(sc, message));
    }

    public static void main(String[] args) {
        Price[] prices = new Price[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < prices.length; i++) {
            System.out.printf("Введите данные товара №%d:\n", i + 1);
            prices[i] = new Price(
                    getInputString(sc, "- введите название товара:"),
                    getInputString(sc, "- введите название магазина, в котором продается товар:"),
                    getInputNumber(sc, "- стоимость товара в гривнах:")
            );
        }
        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price price1, Price price2) {
                return price1.getMarket().compareTo(price2.getMarket());
            }
        });
        boolean productAvailability = false;
        String market = getInputString(sc, "Введите название магазина:");
        for (Price price: prices) {
            if (price.getMarket().equals(market)) {
                System.out.println(price);
                productAvailability = true;
            }
        }
        try {
            if (!productAvailability) {
                throw new Exception("Указанного магазина нет.");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        sc.close();
    }
}
