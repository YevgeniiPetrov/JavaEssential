package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class Orders {
    private int[] orders;

    public Orders(int order) {
        this.orders = new int[] {order};
    }

    public void add(int order) {
        if (this == null) {
            this.orders = new int[] {order};
            return;
        }
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == order) {
                return;
            }
        }
        int[] temp = this.orders;
        this.orders = new int[this.orders.length + 1];
        for (int i = 0; i < temp.length; i++) {
            this.orders[i] = temp[i];
        }
        this.orders[this.orders.length - 1] = order;
    }

    public boolean check(int order) {
        if (order == Storage.ZERO) {
            return false;
        }
        for (int i = 0; i < this.orders.length; i++) {
            if (this.orders[i] == order) {
                return true;
            }
        }
        return false;
    }

    public int getPercent(int order) {
        return this.check(order) ? Storage.ORDER_PERCENT : Storage.ZERO;
    }
}
