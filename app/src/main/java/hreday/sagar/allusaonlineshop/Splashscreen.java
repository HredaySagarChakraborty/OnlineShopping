package hreday.sagar.allusaonlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Splashscreen extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;


    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        //  this.setTitle("SplashScreen");
        getSupportActionBar().hide();


        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);


        /*
        progressBar=findViewById(R.id.progressbarId);


        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                Intent intent=new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent);
            }
        });
        thread.start();


    }

    private void doWork() {

        for(int progress=20;progress<=100;progress=progress+40){


            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

         */

    }
}
