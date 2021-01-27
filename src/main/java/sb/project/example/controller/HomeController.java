package sb.project.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sb.project.example.entity.Corp;
import sb.project.example.mapper.CorpMapper;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private CorpMapper corpMapper;


    @RequestMapping("/")
    public String home() {
        return "hello world";
    }

    @Resource
    private DataSource dataSource;

    @RequestMapping("/get-json-data.json")
    @ResponseBody
    public HashMap getJsonData() {

        System.out.println("查询到的数据源连接池信息是:"+ dataSource);
        System.out.println("查询到的数据源连接池类型是:"+ dataSource.getClass());

        HashMap<String, Object> responseBody = new HashMap<String, Object>();
        responseBody.put("ok", true);
        responseBody.put("code", 200);
        responseBody.put("data", "good request");


        return responseBody;
    }

    @RequestMapping("/get-corp-list.json")
    @ResponseBody
    public HashMap getCorpList() {

        List<Corp> corpList = corpMapper.queryCorpList();

        System.out.println("查询到的公司列表:" + corpList);

        HashMap<String, Object> responseBody = new HashMap<String, Object>();
        responseBody.put("ok", true);
        responseBody.put("code", 200);
        responseBody.put("data", corpList);


        return responseBody;
    }
}
