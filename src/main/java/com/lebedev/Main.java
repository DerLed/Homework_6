package com.lebedev;

import com.lebedev.dao.UserDao;
import com.lebedev.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        UserDao ud = new UserDao();
        UserEntity user3 = new UserEntity("Василий", "888@mail.ru");
        ud.saveUser(user3);
        UserEntity user2 = ud.findUserByName("Антон").get();
        ud.deleteUser(user2);
        List<UserEntity> users = ud.findAllUser();

        for (UserEntity u: users){
            System.out.println(u);
        }


        UserEntity user1 = ud.findUserById(4L).get();

        System.out.println(user1);



        System.out.println(user2);


    }
}
