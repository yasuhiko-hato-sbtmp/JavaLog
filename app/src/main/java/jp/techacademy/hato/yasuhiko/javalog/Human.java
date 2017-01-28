package jp.techacademy.hato.yasuhiko.javalog;

import android.util.Log;

/**
 * Created by hatoy37 on 1/28/17.
 */

public class Human extends Animal implements Thinkable{
    private String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "My name is " + this.name + ", " + "I'm " + this.age + " years old.");
    }

    @Override
    public void think() {
        Log.d("javatest",  "I'm thinking about " + this.hobby + ".");
    }
}
