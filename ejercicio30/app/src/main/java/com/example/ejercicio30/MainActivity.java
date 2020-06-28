package com.example.ejercicio30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Pintar pintar=new Pintar(this);
        setContentView(pintar);
    }
    class Pintar extends View {

        float x,y;
        int opc;
        Paint paint =new Paint();
        Path path = new Path();


        public Pintar(Context context) {
            super(context);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.BLUE);

        }
        protected void onDraw (Canvas canvas){
            canvas.drawColor(Color.WHITE);
            if(opc == 1){
                path.moveTo(x,y);
            }
            if(opc == 2){
                path.lineTo(x,y);
            }
            canvas.drawPath(path,paint);
        }
        public boolean onTouchEvent(MotionEvent event){

            int accion = event.getAction();
            x=event.getX();
            y=event.getY();
            if(accion == MotionEvent.ACTION_DOWN){
                opc=1;
            }
            if(accion == MotionEvent.ACTION_MOVE){
                opc=2;
            }
            invalidate();
            return true;
        }

    }
}