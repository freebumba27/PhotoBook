package com.my.photobook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.easyandroidanimations.library.TransferAnimation;

public class MainActivity extends AppCompatActivity {
    ImageView layout1image1;
    ImageView layout1image2;
    ImageView layout1image3;
    ImageView layout1image4;
    ImageView layout2image1;
    ImageView layout2image2;
    ImageView layout2image3;
    ImageView layout2image4;
    LinearLayout layout1;
    LinearLayout layout2;
    private FrameLayout coverLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coverLayout = (FrameLayout) findViewById(R.id.coverLayout);
        layout1image1 = (ImageView) findViewById(R.id.layout1image1);
        layout1image2 = (ImageView) findViewById(R.id.layout1image2);
        layout1image3 = (ImageView) findViewById(R.id.layout1image3);
        layout1image4 = (ImageView) findViewById(R.id.layout1image4);
        layout2image1 = (ImageView) findViewById(R.id.layout2image1);
        layout2image2 = (ImageView) findViewById(R.id.layout2image2);
        layout2image3 = (ImageView) findViewById(R.id.layout2image3);
        layout2image4 = (ImageView) findViewById(R.id.layout2image4);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);

        Log.d("AJTAG", "Width: " + layout1.getWidth());
        Log.d("AJTAG", "Height: " + layout1.getHeight());
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        //layout1image1.animate().scaleX(.5f).scaleY(.5f).translationX(layout1.getWidth()/2).setDuration(1000);
//        if (hasFocus) {
//
//
//            // Scaling image
//            ObjectAnimator scaleX = ObjectAnimator.ofFloat(img1, "scaleX", (float) img2.getWidth() / img1.getWidth());
//            ObjectAnimator scaleY = ObjectAnimator.ofFloat(img1, "scaleY", (float) img2.getHeight() / img1.getHeight());
//            scaleX.setDuration(2000);
//            scaleY.setDuration(2000);
//            AnimatorSet scale = new AnimatorSet();
//            scale.play(scaleX).with(scaleY);
//            scale.start();
//
        // Moving image
//        ObjectAnimator animX = ObjectAnimator.ofFloat(layout1image1, "x", layout1.getWidth() / 2);
//        //ObjectAnimator animY = ObjectAnimator.ofFloat(layout1image1, "y", layout1.getHeight()/2);
//        AnimatorSet animSetXY = new AnimatorSet();
//        animSetXY.setDuration(2000);
//        animSetXY.playTogether(animX);
//        animSetXY.start();
//        }
    }

    public void shuffling(View view) {

        new TransferAnimation(layout1image1)
                .setDestinationView(layout2image1)
                .setDuration(2000)
                .animate();

        new TransferAnimation(layout1image2)
                .setDestinationView(layout2image2)
                .setDuration(2000)
                .animate();

        new TransferAnimation(layout1image3)
                .setDestinationView(layout2image3)
                .setDuration(2000)
                .animate();

        new TransferAnimation(layout1image4)
                .setDestinationView(layout2image4)
                .setDuration(2000)
                .animate();

        //layout1image1.animate().scaleX(100).scaleY(40).setDuration(1000);
//        // Scaling image
//        ObjectAnimator scaleX = ObjectAnimator.ofFloat(layout1image1, "scaleX", (float) layout2image1.getWidth() / layout1image1.getWidth());
//        ObjectAnimator scaleY = ObjectAnimator.ofFloat(layout1image1, "scaleY", (float) layout2image1.getHeight() / layout1image1.getHeight());
//        scaleX.setDuration(2000);
//        scaleY.setDuration(2000);
//        AnimatorSet scale = new AnimatorSet();
//        scale.play(scaleX).with(scaleY);
//        scale.start();
//
//        // Moving image
//        ObjectAnimator animX = ObjectAnimator.ofFloat(layout1image1, "x", layout2image1.getX() + (layout2image1.getWidth() - layout1image1.getWidth()) / 2);
//        ObjectAnimator animY = ObjectAnimator.ofFloat(layout1image1, "y", layout2image1.getY() + (layout2image1.getHeight() - layout1image1.getHeight()) / 2);
//        AnimatorSet animSetXY = new AnimatorSet();
//        animSetXY.setDuration(2000);
//        animSetXY.playTogether(animX, animY);
//        animSetXY.start();


        //layout1.setVisibility(View.GONE);
//        layout2.setVisibility(View.VISIBLE);
//
//        YoYo.with(Techniques.FadeIn)
//                .duration(700)
//                .playOn(layout2);

//        layout2.setVisibility(View.VISIBLE);
//        layout1.setVisibility(View.GONE);


//        Animation fadeIn = new AlphaAnimation(0, 1);
//        fadeIn.setInterpolator(new DecelerateInterpolator()); //add this
//        fadeIn.setDuration(1000);
//
//        Animation fadeOut = new AlphaAnimation(1, 0);
//        fadeOut.setInterpolator(new AccelerateInterpolator()); //and this
//        fadeOut.setDuration(1000);
//
//        AnimationSet animation1 = new AnimationSet(false); //change to false
//        animation1.addAnimation(fadeIn);
//        layout1.setAnimation(animation1);
//
//        AnimationSet animation2 = new AnimationSet(false); //change to false
//        animation2.addAnimation(fadeOut);
//        layout2.setAnimation(animation2);


//        final Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }, 700);
    }
}
