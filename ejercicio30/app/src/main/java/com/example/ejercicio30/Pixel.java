package com.example.ejercicio30;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.graphics.Canvas;

public class Pixel extends View {

    Paint pintar = new Paint();
    Rect cuadrado = new Rect(100,100,300,300);
    public Pixel(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawRGB(300,302,213);
        pintar.setColor(Color.RED);
        canvas.drawRect(cuadrado,pintar);
        pintar.setStyle(Paint.Style.STROKE);
        pintar.setStrokeWidth(5);
        pintar.setColor(Color.YELLOW);
        canvas.drawRect(cuadrado,pintar);
        pintar.setStyle(Paint.Style.FILL);
        pintar.setColor(Color.BLACK);
        canvas.drawCircle(500,300,100,pintar);

    }
}
