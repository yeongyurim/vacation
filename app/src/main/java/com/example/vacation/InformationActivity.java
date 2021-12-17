package com.example.vacation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class InformationActivity extends Activity {

    Button btnG,btnB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Intent inIntent = getIntent();
        String TTinfo = "";
        btnB = (Button) findViewById(R.id.btnBinfo);

        switch (inIntent.getIntExtra("src",0)){
            case R.drawable.dc1:
                TTinfo="경복궁" ;
                break;
            case R.drawable.dc2:
                TTinfo="전주 한옥 마을" ;
                break;
            case R.drawable.dc3:
                TTinfo= "불국사" ;
                break;
            case R.drawable.dc4:
                TTinfo="북촌 한옥 마을" ;
                break;
            case R.drawable.dl1:
                TTinfo="명동" ;
                break;
            case R.drawable.dl2:
                TTinfo="부산" ;
                break;
            case R.drawable.dl3:
                TTinfo= "애버랜드" ;
                break;
            case R.drawable.dl4:
                TTinfo="홍대" ;
                break;
            case R.drawable.dm1:
                TTinfo="설악산 공룡능선" ;
                break;
            case R.drawable.dm2:
                TTinfo="소백산 상고대" ;
                break;
            case R.drawable.dm3:
                TTinfo= "순천만 갈대밭" ;
                break;
            case R.drawable.dm4:
                TTinfo="월정사 전나무 숲" ;
                break;
            case R.drawable.ds1:
                TTinfo="강릉 바다부채길" ;
                break;
            case R.drawable.ds2:
                TTinfo="삼척 장호항" ;
                break;
            case R.drawable.ds3:
                TTinfo= "여수 밤바다" ;
                break;
            case R.drawable.ds4:
                TTinfo="제주 성산일출봉" ;
                break;
            case R.drawable.fc1:
                TTinfo="마추픽추" ;
                break;
            case R.drawable.fc2:
                TTinfo="만리장성" ;
                break;
            case R.drawable.fc3:
                TTinfo= "콜로세움" ;
                break;
            case R.drawable.fc4:
                TTinfo="피사의 사탑" ;
                break;
            case R.drawable.fl1:
                TTinfo="뉴욕" ;
                break;
            case R.drawable.fl2:
                TTinfo="두바이" ;
                break;
            case R.drawable.fl3:
                TTinfo= "런던" ;
                break;
            case R.drawable.fl4:
                TTinfo="베니스" ;
                break;
            case R.drawable.fm1:
                TTinfo="베네수엘라 엔젤폭포" ;
                break;
            case R.drawable.fm2:
                TTinfo="스위스 마테호른" ;
                break;
            case R.drawable.fm3:
                TTinfo= "토레스 델 파이넬 국립공원" ;
                break;
            case R.drawable.fm4:
                TTinfo="후이카치나" ;
                break;
            case R.drawable.fs1:
                TTinfo="바이칼 호수" ;
                break;
            case R.drawable.fs2:
                TTinfo="보라보라 섬" ;
                break;
            case R.drawable.fs3:
                TTinfo= "서인도제도 바베이도스" ;
                break;
            case R.drawable.fs4:
                TTinfo="유우니 소금호수" ;
                break;
        }

        ImageView IVinfo = (ImageView) findViewById(R.id.IVinfo);
        TextView TVinfo = (TextView) findViewById(R.id.TVinfo);

        IVinfo.setImageResource(inIntent.getIntExtra("src",0));
        TVinfo.setText(TTinfo);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
