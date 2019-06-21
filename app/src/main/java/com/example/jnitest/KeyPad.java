package com.example.jnitest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;

import static android.view.KeyEvent.KEYCODE_1;


public class KeyPad extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_pad);

        Button ToBack = (Button) findViewById(R.id.btn_back);
        ToBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        editText = (EditText) findViewById(R.id.txt_editchange);

        editText.setOnKeyListener( new OnKeyListener(){
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event){
                if((event.getAction() == KeyEvent.ACTION_DOWN)) {
                    if (keyCode == KEYCODE_1) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_2) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_3) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_O) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_4) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_5) {
                        Snackbar.make(v, "" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_6) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_P) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_7) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_8) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_9) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_MINUS) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_EQUALS) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_0) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else if(keyCode == KeyEvent.KEYCODE_Q) {
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }else{
                        Snackbar.make(v, "'" + getText(keyCode) + "' inputted", Snackbar.LENGTH_LONG).show();
                    }
                }
                return true;
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case KEYCODE_1:
                Toast toast=Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT); toast.setMargin(50,50); toast.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
