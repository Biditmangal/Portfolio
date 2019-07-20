package com.example.portfolio;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Database handler= new Database(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,ProfileScreen.class);
                startActivity(intent);
            }
        });

    }
    public void load(View view) {
        TextView showdata = findViewById(R.id.data);
        showdata.setText(handler.loadHandler());
    }

    public void adduser(View view){
        EditText nameid = findViewById(R.id.nme);
        EditText emailid = findViewById(R.id.emls);

        String email = emailid.getText().toString();
        String name = nameid.getText().toString();
        Username user = new Username(email,name);
        handler.addHandler(user);
        emailid.setText("");
        nameid.setText("");
        Context context = getApplicationContext();
        CharSequence text = "User Added";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
