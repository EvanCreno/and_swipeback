package com.xbeats.swipebacksample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aitangba.swipeback.SwipeBackActivity;

import java.util.Random;

/**
 * Created by fhf11991 on 2016/7/25.
 */

public class SwipeActivity extends SwipeBackActivity {

    private int page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        RelativeLayout containerLayout = (RelativeLayout) findViewById(R.id.container);

        //随机色
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);

        containerLayout.setBackgroundColor(Color.argb(255, red, green, blue));

        TextView textView = (TextView) findViewById(R.id.text);
        page = MainActivity.Page;
        textView.setText("当前页" + page);

        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.Page ++;
                startActivity(new Intent(SwipeActivity.this, SwipeActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        MainActivity.Page --;
        super.onBackPressed();
    }

    @Override
    protected boolean supportSlideBack() {
        return super.supportSlideBack();
    }

    @Override
    protected boolean canBeSlideBack() {
        return super.canBeSlideBack();
    }
}
