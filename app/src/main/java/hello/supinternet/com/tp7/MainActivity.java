package hello.supinternet.com.tp7;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                textView = (TextView) findViewById(R.id.activity_main_text);

                Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade);
                textView.startAnimation(animationFadeIn);


    }

    public void onClickScale(View v) {
        Animation animationScale = AnimationUtils.loadAnimation(this, R.anim.scale);
        textView.startAnimation(animationScale);
    }

    public void onClickRotate(View v) {
        Animation animationScale = AnimationUtils.loadAnimation(this, R.anim.rotate);
        textView.startAnimation(animationScale);
    }

    public void onClickTranslate(View v) {
        Animation animationScale = AnimationUtils.loadAnimation(this, R.anim.translate);
        textView.startAnimation(animationScale);
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.clearAnimation();
    }
}
