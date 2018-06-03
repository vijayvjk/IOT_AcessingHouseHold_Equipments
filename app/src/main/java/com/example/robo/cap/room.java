package com.example.robo.cap;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class room extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
    }
    public void lvg(View v){
        Intent j=new Intent(room.this,living_room.class);
        startActivity(j);
    }
    public void bed(View v){
        Intent j=new Intent(room.this,bed_room.class);
        startActivity(j);
    }
}
