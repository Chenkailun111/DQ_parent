package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

public class JedisDemo {

    public static void main(String[] args) {
        ApplicationContext a = new ClassPathXmlApplicationContext("spring/applicationContext-redis.xml");


        JedisCluster cluster =  a.getBean(JedisCluster.class);

        cluster.set("a","aaa");
        System.out.println(cluster.get("a"));





    }


}
