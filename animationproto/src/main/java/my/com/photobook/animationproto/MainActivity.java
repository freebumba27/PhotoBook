package my.com.photobook.animationproto;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        layout1 = (LinearLayout) findViewById(R.id.layout1);
    }

    public void shuffling(final View view) {

        new TransferAnimation(layout1image1)
                .setDestinationView(layout1image2)
                .setDuration(500)
                .animate();

//        view.setLayerType(View.LAYER_TYPE_HARDWARE, null);
//
//        // Moving image
//        ObjectAnimator animX = ObjectAnimator.ofFloat(layout1image1, "x", layout1.getWidth() / 2);
//        //ObjectAnimator animY = ObjectAnimator.ofFloat(layout1image1, "y", layout1.getHeight()/2);
//        AnimatorSet animSetXY = new AnimatorSet();
//        animSetXY.setDuration(2000);
//        animSetXY.playTogether(animX);
//        animSetXY.start();
    }
}
