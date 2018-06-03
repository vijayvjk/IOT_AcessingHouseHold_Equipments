package com.example.robo.cap;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class bed_room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bed_room);
    }

    public void on(View v){
        Intent j=new Intent(this,ON.class);
        startActivity(j);
    }
    public void off(View v){
        Intent j=new Intent(this,OFF.class);
        startActivity(j);
    }
}
