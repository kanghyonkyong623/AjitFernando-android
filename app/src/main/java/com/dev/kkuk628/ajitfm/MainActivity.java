package com.dev.kkuk628.ajitfm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final Map<String, String> assetFolders = new HashMap<String, String>() {{
        put("Anim1.json", "images");
    }};

    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationView = (LottieAnimationView) findViewById(R.id.animation_view);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void anim1_click(View view){
//        animationView.setImageAssetsFolder("images");
        animationView.setAnimation("New_Anim1.json");
        animationView.loop(true);
        animationView.playAnimation();
    }

    public void anim2_click(View view){
        animationView.setAnimation("New_Anim2.json");
        animationView.loop(true);
        animationView.playAnimation();
    }

    public void stop_click(View view){
        animationView.cancelAnimation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
