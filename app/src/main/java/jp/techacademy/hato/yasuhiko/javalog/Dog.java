package jp.techacademy.hato.yasuhiko.javalog;

import android.util.Log;

/**
 * Created by hatoy37 on 1/28/17.
 */

class Dog extends Animal implements Movable{
    static String to_jp = "犬";

    // メンバ変数
    String name;  // 名前
    int age;    // 年齢

    // コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(hogehoge)");
    }
}
