package com.example.robo.cap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void log(View v){

        a=(EditText)findViewById(R.id.usr);
        b=(EditText)findViewById(R.id.pass);
        String c=a.getText().toString();
        String d=b.getText().toString();


        if(c=="xyz"&&d=="123"){
            Intent j=new Intent(login.this,room.class);
            startActivity(j);
        }
        else{
            Toast.makeText(this, "Username and password dosent match please try again", Toast.LENGTH_LONG);
        }
    }
}
