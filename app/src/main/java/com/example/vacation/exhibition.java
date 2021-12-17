package com.example.vacation;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class exhibition extends Activity {

    ImageButton[] IBS = new ImageButton[32];

    Integer[] ibIDs = {R.id.IB1,R.id.IB2,R.id.IB3,R.id.IB4,R.id.IB5,R.id.IB6,R.id.IB7,R.id.IB8,
            R.id.IB9,R.id.IB10,R.id.IB11,R.id.IB12,R.id.IB13,R.id.IB14,R.id.IB15,R.id.IB16,R.id.IB17,
            R.id.IB18,R.id.IB19,R.id.IB20,R.id.IB21,R.id.IB22,R.id.IB23,R.id.IB24,R.id.IB25,
            R.id.IB26,R.id.IB27,R.id.IB28,R.id.IB29,R.id.IB30,R.id.IB31,R.id.IB32};

    Integer[] imgIDs = {R.drawable.dc1,R.drawable.dc2,R.drawable.dc3,R.drawable.dc4,
            R.drawable.dl1,R.drawable.dl2,R.drawable.dl3,R.drawable.dl4,
            R.drawable.dm1,R.drawable.dm2,R.drawable.dm3,R.drawable.dm4,
            R.drawable.ds1,R.drawable.ds2,R.drawable.ds3,R.drawable.ds4,
            R.drawable.fc1,R.drawable.fc2,R.drawable.fc3,R.drawable.fc4,
            R.drawable.fl1,R.drawable.fl2,R.drawable.fl3,R.drawable.fl4,
            R.drawable.fm1,R.drawable.fm2,R.drawable.fm3,R.drawable.fm4,
            R.drawable.fs1,R.drawable.fs2,R.drawable.fs3,R.drawable.fs4};

    int i;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhibition);

        for(i=0;i<ibIDs.length;i++){
            IBS[i] = (ImageButton) findViewById(ibIDs[i]);
            IBS[i].setBackgroundResource(imgIDs[i]);
        }

        for(i=0;i<ibIDs.length;i++){
            final int index;
            index = i;

            IBS[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }
}
