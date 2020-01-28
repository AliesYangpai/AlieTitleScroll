package org.alie.alietitlescroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

/**
 * https://www.cnblogs.com/ldq2016/p/10690231.html
 */
public class MineScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_scrolling);
        Toolbar toolbar = findViewById(R.id.toolbarx);
        setSupportActionBar(toolbar);

    }
}
