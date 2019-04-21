package com.itqf.controller;

import com.itqf.utils.Lg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        Lg.log("去首页");
        return "index";
    }

    /**
     * 通用处理请求方法
     * /item-list  ---->/WEB-INF/jsp/item-list.jsp
     * /item-add---->/WEB-INF/jsp/item-add.jsp
     */
    @RequestMapping("/{path}")
    public String path(@PathVariable String path){
        Lg.log("跳转到："+path);
        return path;//物理视图 =前缀+逻辑视图+后缀 = /WEB-INF/jsp/item-list.jsp
    }


}
