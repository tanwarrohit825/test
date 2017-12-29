package com.example.tanwa.exp21gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView rohittext;
    private GestureDetectorCompat gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rohittext = (TextView) findViewById(R.id.rohittext);
         this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        rohittext.setText("single tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        rohittext.setText("Double tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        rohittext.setText("double tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        rohittext.setText(" go down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        rohittext.setText("press");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        rohittext.setText("single tap");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        rohittext.setText("on scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        rohittext.setText("long press");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        rohittext.setText("turn the page");
        return true;
    }


    //end gesture


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
