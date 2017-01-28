package jp.techacademy.hato.yasuhiko.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Dog dog = new Dog("ポチ", 3);
//        dog.move();
        Human tom = new Human("Tom", 54, "movie");
        tom.say();
        tom.think();

    }
}
