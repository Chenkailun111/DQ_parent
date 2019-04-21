package com.itqf.controller;

import com.itqf.service.FileUploadService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FileUploadController {
    //参数，一个action=config,一个uploadimage
    @Autowired
    private FileUploadService fileUploadService;

    /**
     * 该请求最终要响应config.json文件中的内容,response中的内容,是get请求
     * 限定请求方法为get
     */
    @RequestMapping(value = "/server/fileUpload",method = RequestMethod.GET)
    public void  initFileUpload(String action, HttpServletResponse response){
        try {
            if (action.equalsIgnoreCase("config")){
                PrintWriter out = response.getWriter();
                //得到config.json输入流
                InputStream inputStream = FileUploadController
                        .class.getClassLoader().getResourceAsStream("config.json");
                IOUtils.copy(inputStream,out);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 处理正在的图片的上传
     * 返回值
     * 响应内容：{
     * 	"state": "SUCCESS",
     * 	"original": "2.垂直分片.png",
     * 	"size": "71480",
     * 	"title": "1544167032973038155.png",
     * 	"type": ".png",
     * 	"url": "/ueditor/jsp/upload/image/20181207/1544167032973038155.png"
     * }
     * @return
     */
    @RequestMapping(value = "/server/fileUpload",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> fileUpload(@RequestParam(name="upfile") MultipartFile file){
        return  fileUploadService.upload(file);
    }
}
