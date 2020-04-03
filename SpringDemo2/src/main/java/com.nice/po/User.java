package com.nice.po;

public class User {
    private String name="yyy" ;
    private int age=12;
    private String sex="男" ;

    public void play(){
        System.out.println("我叫" +name+
                "是个" +sex+
                "孩子，" +
                "今年" +age+
                "岁了");
    }

}
