package com.example.jnitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public native String JNIString();
    public native String JNISound(int value);
    static {System.loadLibrary("JNIString");}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btn_led = findViewById(R.id.btn_led);
        btn_led.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNIString(), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_no = findViewById(R.id.btn_sound_no);
        sound_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(0), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_c = findViewById(R.id.btn_sound_c);
        sound_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(1), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_d = findViewById(R.id.btn_sound_d);
        sound_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(2), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_e = findViewById(R.id.btn_sound_e);
        sound_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(3), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_f = findViewById(R.id.btn_sound_f);
        sound_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(4), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_g = findViewById(R.id.btn_sound_g);
        sound_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(5), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_a = findViewById(R.id.btn_sound_a);
        sound_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(6), Snackbar.LENGTH_LONG);
            }
        });

        FloatingActionButton sound_b = findViewById(R.id.btn_sound_b);
        sound_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, JNISound(7), Snackbar.LENGTH_LONG);
            }
        });

        Button ToKepPad = (Button) findViewById(R.id.btn_keypad);
        ToKepPad.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), KeyPad.class);
                startActivityForResult(intent, 0);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
