package com.itqf.utils;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;

/**
 * HttpClient：谷歌提供的发起http请求的工具类,可以实现跨域
 * HttpURLConnection  jdk提供
 * CloseableHttpClient:apache提供的
 */
public class TestHttpClient {

    public static void main(String[] args) {
        try {
            //1,创建HttpClient对象
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //2,创建HttpGet对象  请求对象
            //HttpGet httpGet = new HttpGet("http://www.baidu.com");
            HttpGet httpGet = new HttpGet("http://localhost:8081/findAll");
            //3,执行请求
            CloseableHttpResponse httpResponse =  httpClient.execute(httpGet);
            //4,判断请求是否成功
            if (httpResponse.getStatusLine().getStatusCode()==200){
                //得到响应的实体对象
               HttpEntity entity =  httpResponse.getEntity();
               InputStream is =  entity.getContent();
               byte []bv = new byte[1024];
               int len = 0;
               while((len=is.read(bv))!=-1){
                   System.out.println(new String(bv,0,len));
               }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
