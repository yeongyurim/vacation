package com.example.vacation;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class keyword extends Activity {

    String[] items = {"국내","해외","바다","산","번화가","도심","국내 바다","국산","국내 전통가옥","국내 번화가",
    "해외 바다","해외 산","해외 번화가","해외 도심"};

    Integer[] imgIDs = new Integer[16];

    Integer pointer = 0;
    Integer max = 0;
    Integer min = 0;
    Integer x = 0;

    LinearLayout baseLayout;

    Button btnS,btnB,btnG,btnI,btnM;

    View toastView;
    TextView toastText;

    int now;

    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyword);

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);

        btnS = (Button) findViewById(R.id.btnS);
        btnB = (Button) findViewById(R.id.btnB);
        btnG = (Button) findViewById(R.id.btnG);
        btnI = (Button) findViewById(R.id.btnI);
        btnM = (Button) findViewById(R.id.btnM);

        ImageView IV = (ImageView) findViewById(R.id.IV);

        AutoCompleteTextView auto = (AutoCompleteTextView) findViewById(R.id.at);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,items);
        auto.setAdapter(adapter);

        registerForContextMenu(btnM);
        registerForContextMenu(btnS);
        registerForContextMenu(btnB);
        registerForContextMenu(btnG);
        registerForContextMenu(btnI);

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (auto.getText().toString()) {
                    case "국내" :
                        imgIDs[0] = R.drawable.dc1;
                        imgIDs[1] = R.drawable.dc2;
                        imgIDs[2] = R.drawable.dc3;
                        imgIDs[3] = R.drawable.dc4;
                        imgIDs[4] = R.drawable.dl1;
                        imgIDs[5] = R.drawable.dl2;
                        imgIDs[6] = R.drawable.dl3;
                        imgIDs[7] = R.drawable.dl4;
                        imgIDs[8] = R.drawable.dm1;
                        imgIDs[9] = R.drawable.dm2;
                        imgIDs[10] = R.drawable.dm3;
                        imgIDs[11] = R.drawable.dm4;
                        imgIDs[12] = R.drawable.ds1;
                        imgIDs[13] = R.drawable.ds1;
                        imgIDs[14] = R.drawable.ds1;
                        imgIDs[15] = R.drawable.ds1;
                        pointer = 0;
                        max = 15;
                        break;

                    case "해외" :
                        imgIDs[0] = R.drawable.fc1;
                        imgIDs[1] = R.drawable.fc2;
                        imgIDs[2] = R.drawable.fc3;
                        imgIDs[3] = R.drawable.fc4;
                        imgIDs[4] = R.drawable.fl1;
                        imgIDs[5] = R.drawable.fl2;
                        imgIDs[6] = R.drawable.fl3;
                        imgIDs[7] = R.drawable.fl4;
                        imgIDs[8] = R.drawable.fm1;
                        imgIDs[9] = R.drawable.fm2;
                        imgIDs[10] = R.drawable.fm3;
                        imgIDs[11] = R.drawable.fm4;
                        imgIDs[12] = R.drawable.fs1;
                        imgIDs[13] = R.drawable.fs1;
                        imgIDs[14] = R.drawable.fs1;
                        imgIDs[15] = R.drawable.fs1;
                        pointer = 0;
                        max = 15;
                        break;

                    case "산" :
                        imgIDs[0] = R.drawable.dm1;
                        imgIDs[1] = R.drawable.dm2;
                        imgIDs[2] = R.drawable.dm3;
                        imgIDs[3] = R.drawable.dm4;
                        imgIDs[4] = R.drawable.fm1;
                        imgIDs[5] = R.drawable.fm2;
                        imgIDs[6] = R.drawable.fm3;
                        imgIDs[7] = R.drawable.fm4;
                        pointer = 0;
                        max = 7;
                        break;

                    case "바다" :
                        imgIDs[0] = R.drawable.ds1;
                        imgIDs[1] = R.drawable.ds2;
                        imgIDs[2] = R.drawable.ds3;
                        imgIDs[3] = R.drawable.ds4;
                        imgIDs[4] = R.drawable.fs1;
                        imgIDs[5] = R.drawable.fs2;
                        imgIDs[6] = R.drawable.fs3;
                        imgIDs[7] = R.drawable.fs4;
                        pointer = 0;
                        max = 7;
                        break;

                    case "번화가" :
                        imgIDs[0] = R.drawable.dl1;
                        imgIDs[1] = R.drawable.dl2;
                        imgIDs[2] = R.drawable.dl3;
                        imgIDs[3] = R.drawable.dl4;
                        imgIDs[4] = R.drawable.fl1;
                        imgIDs[5] = R.drawable.fl2;
                        imgIDs[6] = R.drawable.fl3;
                        imgIDs[7] = R.drawable.fl4;
                        pointer = 0;
                        max = 7;
                        break;

                    case "전통가옥" :
                        imgIDs[0] = R.drawable.dc1;
                        imgIDs[1] = R.drawable.dc2;
                        imgIDs[2] = R.drawable.dc3;
                        imgIDs[3] = R.drawable.dc4;
                        imgIDs[4] = R.drawable.fc1;
                        imgIDs[5] = R.drawable.fc2;
                        imgIDs[6] = R.drawable.fc3;
                        imgIDs[7] = R.drawable.fc4;
                        pointer = 0;
                        max = 7;
                        break;

                    case "해외 전통가옥" :
                        imgIDs[0] = R.drawable.fc1;
                        imgIDs[1] = R.drawable.fc2;
                        imgIDs[2] = R.drawable.fc3;
                        imgIDs[3] = R.drawable.fc4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "해외 번화가" :
                        imgIDs[0] = R.drawable.fl1;
                        imgIDs[1] = R.drawable.fl2;
                        imgIDs[2] = R.drawable.fl3;
                        imgIDs[3] = R.drawable.fl4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "해외 산" :
                        imgIDs[0] = R.drawable.fm1;
                        imgIDs[1] = R.drawable.fm2;
                        imgIDs[2] = R.drawable.fm3;
                        imgIDs[3] = R.drawable.fm4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "해외 바다" :
                        imgIDs[0] = R.drawable.fs1;
                        imgIDs[1] = R.drawable.fs2;
                        imgIDs[2] = R.drawable.fs3;
                        imgIDs[3] = R.drawable.fs4;
                        pointer = 0;
                        max = 3;
                        break;


                    case "국내 전통가옥" :
                        imgIDs[0] = R.drawable.dc1;
                        imgIDs[1] = R.drawable.dc2;
                        imgIDs[2] = R.drawable.dc3;
                        imgIDs[3] = R.drawable.dc4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "국내 번화가" :
                        imgIDs[0] = R.drawable.dl1;
                        imgIDs[1] = R.drawable.dl2;
                        imgIDs[2] = R.drawable.dl3;
                        imgIDs[3] = R.drawable.dl4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "국내 산" :
                        imgIDs[0] = R.drawable.dm1;
                        imgIDs[1] = R.drawable.dm2;
                        imgIDs[2] = R.drawable.dm3;
                        imgIDs[3] = R.drawable.dm4;
                        pointer = 0;
                        max = 3;
                        break;

                    case "국내 바다" :
                        imgIDs[0] = R.drawable.ds1;
                        imgIDs[1] = R.drawable.ds2;
                        imgIDs[2] = R.drawable.ds3;
                        imgIDs[3] = R.drawable.ds4;
                        pointer = 0;
                        max = 3;
                        break;
                }
                IV.setImageResource(imgIDs[pointer]);
                now = imgIDs[pointer];
                x++;
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(x>0){
                    if(pointer==max){
                        IV.setImageResource(imgIDs[pointer]);
                        now = imgIDs[pointer];
                    }
                    else{
                        pointer++;
                        IV.setImageResource(imgIDs[pointer]);
                        now = imgIDs[pointer];
                    }
                }
                else{
                    Toast toast = new Toast(keyword.this);
                    toastView = (View) View.inflate(keyword.this,R.layout.inform,null);
                    toastText = toastView.findViewById(R.id.textView);
                    toastText.setText("검색을 완료해주세요!");
                    toast.setView(toastView);
                    toast.show();
                }
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (x > 0) {
                    if(pointer==min){
                        IV.setImageResource(imgIDs[pointer]);
                        now = imgIDs[pointer];
                    }
                    else{
                        pointer--;
                        IV.setImageResource(imgIDs[pointer]);
                        now = imgIDs[pointer];
                    }
                }
                else{
                    Toast toast = new Toast(keyword.this);
                    toastView = (View) View.inflate(keyword.this,R.layout.inform,null);
                    toastText = toastView.findViewById(R.id.textView);
                    toastText.setText("검색을 완료해주세요!");
                    toast.setView(toastView);
                    toast.show();
                }
            }
        });

        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(keyword.this);
                toastView = (View) View.inflate(keyword.this,R.layout.inform,null);
                toast.setView(toastView);
                toast.show();
            }
        });

        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final PopupMenu popupMenu = new PopupMenu(getApplicationContext(),view);
                getMenuInflater().inflate(R.menu.popup,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        switch(item.getItemId()){

                            case R.id.l_inform:
                                switch (now) {
                                    case R.drawable.dc1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dc1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dc2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dc2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dc3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dc3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dc4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dc4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dl1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dl1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dl2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dl2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dl3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dl3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dl4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dl4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dm1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dm1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dm2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dm2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dm3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dm3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.dm4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.dm4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.ds1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.ds1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.ds2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.ds2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.ds3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.ds3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.ds4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.ds4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fc1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fc1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fc2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fc2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fc3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fc3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fc4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fc4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fl1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fl1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fl2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fl2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fl3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fl3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fl4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fl4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fm1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fm1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fm2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fm2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fm3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fm3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fm4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fm4);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fs1 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fs1);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fs2 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fs2);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fs3 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fs3);
                                        startActivityForResult(intent,0);
                                        break;
                                    case R.drawable.fs4 :
                                        intent = new Intent(getApplicationContext(),InformationActivity.class);
                                        intent.putExtra("src",R.drawable.fs4);
                                        startActivityForResult(intent,0);
                                        break;
                                }
                                break;
                            case R.id.l_date :
                                intent = new Intent(getApplicationContext(),date.class);
                                startActivityForResult(intent,0);
                                break;

                        }
                        return false;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v==btnM){
            mInflater.inflate(R.menu.menu,menu);
        }
        if(v==btnG){
            mInflater.inflate(R.menu.menu,menu);
        }
        if(v==btnB){
            mInflater.inflate(R.menu.menu,menu);
        }
        if(v==btnS){
            mInflater.inflate(R.menu.menu,menu);
        }
        if(v==btnI){
            mInflater.inflate(R.menu.menu,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemWhite:
                baseLayout.setBackgroundColor(Color.WHITE);
                return true;
        }
        return false;
    }
}
