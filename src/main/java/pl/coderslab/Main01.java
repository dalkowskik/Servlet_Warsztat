package pl.coderslab;

import pl.coderslab.utils.UserDao;

public class Main01 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.findAll();
    }
}
