package com.nice.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//创建对象的工厂（模拟IOC）
public class BeanFactory {
    //从工厂获得一个对象
     //初始化beans.properties文件
     private  static Properties props=new Properties();
     static {
         InputStream in= BeanFactory.class.getResourceAsStream("/beans.properties");
         try {
             props.load(in);
         }
         catch (IOException e)
         {
             e.printStackTrace();
             System.out.print("加载属性文件失败");
         }
     }

    public static  Object getBean(String name)
        // 根据不同的名字来构建不同的对象
    {

     String className= props.getProperty(name);
     //通过反射构造类的对象
        try {
           return  Class.forName(className).newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            return  null;
    }


}
