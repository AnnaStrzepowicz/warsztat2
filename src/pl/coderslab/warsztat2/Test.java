package pl.coderslab.warsztat2;

import pl.coderslab.warsztat2.dao.UserDao;
import pl.coderslab.warsztat2.model.User;

public class Test {
    public static void main(String[] args) {
        User u = new User("user1", "user1@mail.pl", "user1");
        UserDao.create(u);
        System.out.println(u.getId());
        System.out.println(u.getPassword());
    }
}
