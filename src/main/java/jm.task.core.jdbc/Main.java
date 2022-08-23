package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("�����", "�����", (byte) 30);
        user.saveUser("����", "������", (byte) 23);
        user.saveUser("����", "�������", (byte) 34);
        user.saveUser("����", "������", (byte) 45);

        user.removeUserById(1);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}

