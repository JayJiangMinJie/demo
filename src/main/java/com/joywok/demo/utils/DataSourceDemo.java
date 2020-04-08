package com.joywok.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Jay
 * @Date: 2020/4/2 17:33
 */
@RestController
public class DataSourceDemo {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/demo1")
    public List<Map<String, Object>> queryUsers(){
        String sql = "select * from test";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);

        return list;


    }
    @RequestMapping("/demo2")
    public List<String> test(){
        List list1 = new ArrayList();
        list1.add("1");
        list1.add("2");
        return list1;
    }

}
