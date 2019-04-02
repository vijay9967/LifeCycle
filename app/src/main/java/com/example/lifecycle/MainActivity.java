package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"OnCreate method is created", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
    }
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart method is Called", Toast.LENGTH_SHORT).show();

    }
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart method is Called", Toast.LENGTH_SHORT).show();

    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume method is Called", Toast.LENGTH_SHORT).show();

    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause method is Called", Toast.LENGTH_SHORT).show();

    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop method is Called", Toast.LENGTH_SHORT).show();

    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy method is Called", Toast.LENGTH_SHORT).show();

    }
}
