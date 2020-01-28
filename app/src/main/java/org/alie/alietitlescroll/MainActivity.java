package org.alie.alietitlescroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
    }

    private void initView(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

    }

    private void initListener(){
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(this,ScrollingActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this,MineScrollingActivity.class));
                break;
        }
    }
}
