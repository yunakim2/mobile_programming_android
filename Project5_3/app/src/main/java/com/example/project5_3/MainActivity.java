package com.example.project5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.WHITE);
        setContentView(baseLayout,params);


        final EditText edt = new EditText(this);
        baseLayout.addView(edt);
        Button btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.YELLOW);
        baseLayout.addView(btn);

        final TextView tvBtn = new TextView(this);
        baseLayout.addView(tvBtn);
        tvBtn.setTextColor(Color.MAGENTA);
        tvBtn.setTextSize(20f);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String str = edt.getText().toString();
               tvBtn.setText(str);

            }
        });




    }
}