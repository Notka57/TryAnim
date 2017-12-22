package com.example.student2.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by student2 on 22.12.17.
 */

public class MyDraw extends View {

Bitmap pic;

    public MyDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
       pic = BitmapFactory.decodeResource(getResources(), R.drawable.sprites);
        this.human = new Human(200, 200, 20, 20, pic);

    }

    public MyDraw(Context context) {
        super(context);
        pic = BitmapFactory.decodeResource(getResources(), R.drawable.sprites);
        this.human = new Human(200, 200, 20, 20, pic);

    }

   Human human;

    Paint paint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {

        human.draw(canvas);
        human.move();
        invalidate();
    }


}