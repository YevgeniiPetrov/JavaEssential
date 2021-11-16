package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class Client {
    private User user;
    private Authentication authentication;
    private Secret secret;
    private Orders orders;

    private Client(User user, Authentication authentication) {
        this.user = user;
        this.authentication = authentication;
    }

    public Client(String firstName, String lastName, String birthday, String email, String login, String password) {
        this(new User(firstName, lastName, birthday, email), new Authentication(login, password));
    }

    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }

    public Orders getOrders() {
        return orders;
    }

    public void addOrder(int order) {
        if (this.orders == null) {
            this.orders = new Orders(order);
        } else {
            this.orders.add(order);
        }
    }

    public boolean recoveryCheck(String login, String password, String birthday, String email, String question, String answer, int order) {
        return (this.user.getPercent(birthday, email) +
                this.authentication.getPercent(login, password) +
                (this.secret == null ? Storage.ZERO : this.secret.getPercent(question, answer)) +
                (this.orders == null ? Storage.ZERO : this.orders.getPercent(order))) >= Storage.CORRECT_ANSWERS_PERCENT;
    }
}
