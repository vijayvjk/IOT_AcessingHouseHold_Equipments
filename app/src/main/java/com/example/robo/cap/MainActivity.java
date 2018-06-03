package com.example.robo.cap;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new android.os.Handler().postDelayed(new Runnable(){
            @Override
                    public void run(){
                Intent i=new Intent (MainActivity.this, room.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        },SPLASH);

    }
}
