package com.itqf.controller;
import com.itqf.dto.PortalIndexDTO;
import com.itqf.utils.HttpClientUtil;
import com.itqf.utils.JsonUtils;
import com.itqf.utils.Lg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 门户系统首页
 */
@Controller
public class PortalIndexController {

    @RequestMapping("/index.html")
    public String index(Model model){
        //
        Lg.log("门户系统首页！");
        //发起http请求 跨域请求http://localhost:8081/findById?id=2  获得场馆信息
        //推荐场馆
      String json =  HttpClientUtil.doGet("http://localhost:8081/findById?id=29");
        //json转化为对象
      PortalIndexDTO dto =   JsonUtils.jsonToPojo(json,PortalIndexDTO.class);
        model.addAttribute("ptDto",dto);
        return "index";
    }
}
