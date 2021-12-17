package com.example.vacation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Random;

public class choose extends Activity {

    Integer[] imgIDs1 = {
            R.drawable.dc3,R.drawable.dc4,
            R.drawable.dl1,R.drawable.dl2,
            R.drawable.dm1,R.drawable.dm2,
            R.drawable.ds1,R.drawable.ds2,
            R.drawable.fc1,R.drawable.fc2,
            R.drawable.fl1,R.drawable.fl2,
            R.drawable.fm1,R.drawable.fm2,
            R.drawable.fs1,R.drawable.fs2};

    Integer[] imgIDs2 = {
            R.drawable.dc1,R.drawable.dc2,
            R.drawable.dl3,R.drawable.dl4,
            R.drawable.dm3,R.drawable.dm4,
            R.drawable.ds3,R.drawable.ds4,
            R.drawable.fc3,R.drawable.fc4,
            R.drawable.fl3,R.drawable.fl4,
            R.drawable.fm3,R.drawable.fm4,
            R.drawable.fs3,R.drawable.fs4};

    Integer[] round2 = new Integer[16];
    Integer[] round3 = new Integer[8];
    Integer[] round4 = new Integer[4];
    Integer[] round5 = new Integer[2];

    int winner = 0;

    int i = 0;
    int k = 0;
    int r = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        TextView tvworld = (TextView) findViewById(R.id.TVworldcub);
        ImageButton ibUP = (ImageButton) findViewById(R.id.IBup);
        ImageButton ibDOWN = (ImageButton) findViewById(R.id.IBdown);

        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);

        ibUP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(i==round2.length){

                    for(i=0;i<round2.length;i++){
                        if(i>round3.length-1){
                            imgIDs2[k] = round2[i];
                            k++;
                        }
                        else{
                            imgIDs1[i] =  round2[i];
                        }

                    }
                    ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                    ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                    tvworld.setText("이상형 월드컵 16강");
                    i=0;
                    k=0;
                    r++;
                }
                else if(r==2){

                    if(i==round3.length){

                        for(i=0;i<round3.length;i++){
                            if(i>round4.length-1){
                                imgIDs2[k] = round3[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] =  round3[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 8강");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round3[i] = imgIDs1[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==3){

                    if(i==round4.length){

                        for(i=0;i<round4.length;i++){
                            if(i>round5.length-1){
                                imgIDs2[k] = round4[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] = round4[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 4강");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round4[i] = imgIDs1[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==4){

                    if(i==round5.length){

                        for(i=0;i<round5.length;i++){
                            if(i>0){
                                imgIDs2[k] = round5[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] =  round5[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 결승");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round5[i] = imgIDs1[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==5){

                    ibUP.setBackgroundResource(imgIDs1[i]);
                    ibDOWN.setBackgroundResource(imgIDs2[i]);

                }
                else if(r==6){
                    tvworld.setText("이상형 월드컵 우승");
                    ibUP.setBackgroundResource(imgIDs2[i]);
                    ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                }
                else{

                    round2[i] = imgIDs1[i];
                    ibUP.setBackgroundResource(imgIDs1[i]);
                    ibDOWN.setBackgroundResource(imgIDs2[i]);
                    i++;

                }
            }
        });

        ibDOWN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==round2.length){

                    for(i=0;i<round2.length;i++){
                        if(i>round3.length-1){
                            imgIDs2[k] = round2[i];
                            k++;
                        }
                        else{
                            imgIDs1[i] =  round2[i];
                        }
                    }
                    ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                    ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                    tvworld.setText("이상형 월드컵 16강");
                    i=0;
                    k=0;
                    r++;

                }
                else if(r==2){

                    if(i==round3.length){

                        for(i=0;i<round3.length;i++){
                            if(i>round4.length-1){
                                imgIDs2[k] = round3[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] = round3[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 8강");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round3[i] = imgIDs2[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==3){

                    if(i==round4.length){

                        for(i=0;i<round4.length;i++){
                            if(i>round5.length-1){
                                imgIDs2[k] = round4[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] = round4[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 4강");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round4[i] = imgIDs2[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==4){

                    if(i==round5.length){

                        for(i=0;i<round5.length;i++){
                            if(i>0){
                                imgIDs2[k] = round5[i];
                                k++;
                            }
                            else{
                                imgIDs1[i] =  round5[i];
                            }
                        }
                        ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                        ibDOWN.setBackgroundResource(R.drawable.ic_launcher_background);
                        tvworld.setText("이상형 월드컵 결승");
                        i=0;
                        k=0;
                        r++;

                    }
                    else{

                        round5[i] = imgIDs2[i];
                        ibUP.setBackgroundResource(imgIDs1[i]);
                        ibDOWN.setBackgroundResource(imgIDs2[i]);
                        i++;

                    }
                }
                else if(r==5){

                    ibUP.setBackgroundResource(imgIDs1[i]);
                    ibDOWN.setBackgroundResource(imgIDs2[i]);
                    r++;

                }
                else if(r==6){
                    tvworld.setText("이상형 월드컵 우승");
                    ibUP.setBackgroundResource(R.drawable.ic_launcher_background);
                    ibDOWN.setBackgroundResource(imgIDs2[i]);
                }
                else{

                    round2[i] = imgIDs2[i];
                    ibUP.setBackgroundResource(imgIDs1[i]);
                    ibDOWN.setBackgroundResource(imgIDs2[i]);
                    i++;

                }
            }
        });

    }
}