package edu.zjnu.autumn;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: UserDao
 * @author: 杨海波
 * @date: 2022-01-06
 **/
public class UserDao {

    private static Map<String,String> map = new HashMap<>();

    static {
        map.put("10001","大人");
        map.put("10002","小孩");
        map.put("10003","全世界最好的");
    }

    public String queryUserName(String userId){
        return map.get(userId);
    }

}
