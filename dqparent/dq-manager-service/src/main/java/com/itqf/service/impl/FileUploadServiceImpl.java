package com.itqf.service.impl;
import com.itqf.service.FileUploadService;
import com.itqf.utils.FtpUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.HashMap;
import java.util.Map;
@Service
public class FileUploadServiceImpl implements FileUploadService {

    String host="192.168.43.50";
    int port = 21;
    String username="ftpuser";
    String password="ftpuser";
    String path="/home/ftpuser/www/images/";

    @Override
    public Map<String, Object> upload(MultipartFile file) {
        Map<String,Object>  map = new HashMap<>();
        try {
            //图片上传
            //得到目标文件的名称
            String name = file.getOriginalFilename();
            String suffix = name.substring(name.lastIndexOf("."));
            String filename = System.currentTimeMillis()+""+suffix;

           // File file1 = new File("D:\\images\\"+filename);
            // file.transferTo(file1);
            FtpUtil.uploadFile(host,port,username,password,path,"",filename,file.getInputStream());
            map.put("state","SUCCESS");
            map.put("original",name);
            map.put("size",file.getSize());
            map.put("title",filename);
            map.put("type",suffix);
            //url：图片路径
            map.put("url","http://www.jackchen.com/images/"+filename);
        } catch (Exception e) {
            map.put("state","EEROR");
        }
        return  map;
    }
}
