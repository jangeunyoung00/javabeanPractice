package com.example.demo;

public class BeanTest {
    private String name="you";
    public String getName(){    // name 멤버 변수의 get 메소드의 이름은 get+변수이름으로 지정하되 멤버 변수 이름의 첫 문자는 대문자로 지정
        return name;
    }
    public void setName(String name){
        this.name=name;   // name 멤버 변수의 set 메소드의 이름은 get+변수이름으로 지정하되 멤버 변수 이름의 첫 문자는 대문자로 지정
    }
}
// return 문 알아보기
// private 알아보기