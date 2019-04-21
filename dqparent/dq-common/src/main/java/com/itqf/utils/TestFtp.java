package com.itqf.utils;


import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFtp {

   public static void main(String[] args) {
      try {
         //1，创建FtpClient对象
         FTPClient ftpClient = new FTPClient();
         //2,建立连接
         ftpClient.connect("10.11.55.188",21);
         //3,登录
         boolean f = ftpClient.login("ftpuser","ftpuser");
         if (f){
            //System.out.println("登录成功！");
            FileInputStream fileInputStream = new FileInputStream("D:\\idea\\dqparent\\dq-common\\src\\main\\resources\\solr初步介绍.png");

            //设置虚拟机的保存路径
            ftpClient.changeWorkingDirectory("/home/ftpuser/www/images/");
            //设置文件类型
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            //保存文件到虚拟机
            boolean flag = ftpClient.storeFile("solr.png",fileInputStream);
            System.out.println(flag?"文件上传成功":"文件上传失败！");

         }


      } catch (IOException e) {
         e.printStackTrace();
      }


   }


   }




