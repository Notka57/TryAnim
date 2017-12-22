package com.example.student2.myapplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;

/**
 * Created by student2 on 22.12.17.
 */

public class Human {

   private float x, y, vx, vy;
    Bitmap sprites;
    private float i = 0;



    public Human(float x, float y,float vx, float vy, Bitmap sprites) {

        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.sprites = sprites;
    }

    void move() {
        this.x = this.vx;
        this.y = this.vy;
        i += (Math.sqrt(vx*vx + vy*vy));
        if(Math.abs(i)>500) {
            i = 0;
            vx = -vx;
            vy = -vy;
        }

    }


    Paint paint = new Paint();

    nFrame = 0;
    void draw(Canvas canvas) {
        //Rect to (int)x - 2*54, (int)y - 2*70;
        Rect to = new Rect((int)x - 2*54, (int)y - 2*70, (int)x + 2*54, (int)y + 2*70);

       // Rect to = new Rect((int) x-54, (int) y-70, (int) x+54, (int) y+70); //куда помещать
        Rect frame = new Rect(nFrame*2*108, 0, nFrame*4*108, 4*140); //откуда
        nFrame++;
        nFrame%=8;
        canvas.drawBitmap(sprites, frame, to, paint);



      //  canvas.drawCircle(x, y, 50, paint);
    }
}

