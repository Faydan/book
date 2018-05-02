package com.faydan.book.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * IndexController created with IntelliJ IDEA.
 * User:  faydan
 * Email: fei321457749@126.com
 * Date:  2018-05-02
 * Time:  13:20
 * <p>
 * Describe:
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "index/index";
    }

    @GetMapping("/form")
    @ResponseBody
    public String content() {
        return getContent("http://192.168.5.133/group1/M00/00/00/wKgFhVrphmaAFBhSAAAf8qZ_y0E35.html");
    }

    public static String getContent(String url) {
        StringBuilder result= new StringBuilder();//访问返回结果
        BufferedReader read=null;//读取访问结果

        try {
            //创建url
//            URL realurl=new URL("http://192.168.5.133/group1/M00/00/00/wKgFhVrphmaAFBhSAAAf8qZ_y0E35.html");
            URL realurl=new URL(url);
            //打开连接
            URLConnection connection=realurl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            //建立连接
            connection.connect();
            // 获取所有响应头字段
//            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段，获取到cookies等
//            for (String key : map.keySet()) {
//                System.out.println(key + "--->" + map.get(key));
//            }
            // 定义 BufferedReader输入流来读取URL的响应
            read = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(),"UTF-8"));
            String line;//循环读取
            while ((line = read.readLine()) != null) {
                result.append(line);
            }

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(read!=null){//关闭流
                try {
                    read.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return new String(result);
    }
}
