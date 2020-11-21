package com.example.project10_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화 선호도 투표");

        final int voteCount[] = new int[9];
        for(int i =0 ; i<9 ; i++) {
            voteCount[i]=0;

        }
        ImageView image[] = new ImageView[9];
        Integer imageId[] = {
                R.id.iv1,R.id.iv2,R.id.iv3,
                R.id.iv4,R.id.iv5,R.id.iv6,
                R.id.iv7,R.id.iv8,R.id.iv9
        };
        final String imgName[] = {
                "결백","어스","스파이더맨",
                "백두산","결백","걸캅스",
                "스파이더맨","1917","백두산"
        };

        for (int i =0 ; i<imageId.length;i++) {
            final int index;
            index = i;
            image[index] = findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view) {
                    voteCount[index]++;
                    Toast.makeText(getApplicationContext(),imgName[index]+": 총 "+
                            voteCount[index]+" 표",Toast.LENGTH_SHORT).show();
                }
            });
        }

        Button btnFinish = findViewById(R.id.btnResult);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.putExtra("VoteCount",voteCount);
                intent.putExtra("ImageName",imgName);

                startActivity(intent);
            }
        });
    }
}