package com.tanphuoc.laysongaunhien;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtshow,txtshow1;
    Button btnEvent;
    int a,b,c,kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControl();
        addEvent();
    }

    private void addEvent() {

        btnEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = rand(5, 10);
                    b = rand(5, 10);
                    c = rand(5, 10);
                    kq = a + b + c;
                    txtshow1.setText(a + "  " + b + "  " + c + "  " + " = " + kq);
                    while (true) {
                        if (kq > 20) {

                                    a = rand(5, 10);
                                    b = rand(5, 10);

                                    c = rand(5, 10);

                                kq = a + b + c;

                        } else if (kq < 20 || kq == 20) {
                            txtshow.setText(a + "  " + b + "  " + c + "  " + " = " + kq);
                            break;
                        }
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

    }

    private void addControl() {
        txtshow = (TextView) findViewById(R.id.txtshow);
        txtshow1 = (TextView) findViewById(R.id.txtshow1);
        btnEvent = (Button) findViewById(R.id.btnEvent);
    }

    public static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
