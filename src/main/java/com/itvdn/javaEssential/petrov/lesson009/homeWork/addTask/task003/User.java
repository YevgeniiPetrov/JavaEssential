/* 3. Создать класс родителя (User), и 2 потомка - Админ и Пользователь.
В общем должны храниться такие поля:
Имя пользователя, логин, пароль, имеет ли права админа и пару своих полей.
Создать toString который в Админе будет нарушать правила безопасности и выводить все данные.
Создать toString который в пользователе не будет нарушать правила безопасности и выводить только те данные которые
можно выводить.
Самостоятельно решить какие поля можно выводить*/

package com.itvdn.javaEssential.petrov.lesson009.homeWork.addTask.task003;

public abstract class User {
    private String name;
    private String login;
    private String password;
    private boolean admin;

    public User(String name, String login, String password, boolean admin) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return admin;
    }

    @Override
    public abstract String toString();
}
