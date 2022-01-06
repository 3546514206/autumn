package edu.zjnu.autumn;

/**
 * @description: UserService
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public class UserService {

    private String userId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(userId));
    }
}
