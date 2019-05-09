package com.example.paymenttest;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"));

    int index = 0;
    private EditText mNameEdt,fNameEdt,dateEdt,enterEdt,enterEdt2;
    private TextView mNameTxt,fNameTxt,dateTxt,enterTxt,emailTxt;
    private Button submit;
    MediaController mediacontroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);

        mNameEdt = findViewById(R.id.male_name_edt);
        fNameEdt = findViewById(R.id.female_name_edt2);
        dateEdt = findViewById(R.id.date_edt);
        enterEdt = findViewById(R.id.she_spoke_edt);
        enterEdt2 = findViewById(R.id.he_was_edt);
        mNameTxt = findViewById(R.id.t3);
        fNameTxt = findViewById(R.id.t4);
        dateTxt = findViewById(R.id.t6);
        enterTxt = findViewById(R.id.t5);
        emailTxt = findViewById(R.id.t7);
        submit = findViewById(R.id.submit_btn);

        String str1 = mNameEdt.getText().toString();
        String str2 = fNameEdt.getText().toString();
        String str3 = dateEdt.getText().toString();
        String str4 = enterEdt.getText().toString();
        String str5 = enterEdt2.getText().toString();

        mNameTxt.setText(str1);
        fNameTxt.setText(str2);
        dateTxt.setText(str3);
        enterTxt.setText(str4);
        emailTxt.setText(str5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = mNameEdt.getText().toString();
                String str2 = fNameEdt.getText().toString();
                String str3 = dateEdt.getText().toString();
                String str4 = enterEdt.getText().toString();
                String str5 = enterEdt2.getText().toString();

                mNameTxt.setText(str1);
                fNameTxt.setText(str2);
                dateTxt.setText(str5);
                enterTxt.setText(str3);
                emailTxt.setText(str4);
            }
        });

        mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(videoView);


        videoView.setMediaController(mediacontroller);
        videoView.setVideoURI(Uri.parse(arrayList.get(index)));
        videoView.requestFocus();
        timerCounter();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(getApplicationContext(), "Video over", Toast.LENGTH_SHORT).show();
                if (index++ == arrayList.size()) {
                    index = 0;
                    mp.release();
                    Toast.makeText(getApplicationContext(), "Video over", Toast.LENGTH_SHORT).show();
                } else {
                    videoView.setVideoURI(Uri.parse(arrayList.get(index)));
                    videoView.start();

                    Log.e("index",""+index);
                }
            }
        });

        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Log.d("API123", "What " + what + " extra " + extra);
                return false;
            }
        });

    }

    private Timer timer;
    private void timerCounter(){
        timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        updateUI();
                    }
                });
            }
        };
        timer.schedule(task, 0, 1000);
    }

    private int duration = 0;

    private void setDuration(){
        duration = videoView.getDuration();
    }

    private void updateUI(){
        Log.e("current",""+videoView.getCurrentPosition());
        String timeD = String.valueOf(videoView.getCurrentPosition());
        if(timeD.length()==4){
            if(timeD.substring(0, 1).equals("4")){
                mNameTxt.setVisibility(View.VISIBLE);
                fNameTxt.setVisibility(View.VISIBLE);
            }
            else if(timeD.substring(0, 1).equals("9")){
                mNameTxt.setVisibility(View.GONE);
                fNameTxt.setVisibility(View.GONE);
            }
        }
        if(timeD.length()==5){
            if(timeD.substring(0, 2).equals("12")){
                enterTxt.setVisibility(View.VISIBLE);
                emailTxt.setVisibility(View.VISIBLE);
            }
            else if(timeD.substring(0, 2).equals("18")){
                enterTxt.setVisibility(View.GONE);
                emailTxt.setVisibility(View.GONE);
            }
        }
        if(timeD.length()==5){
            if(timeD.substring(0, 2).equals("20")){
                dateTxt.setVisibility(View.VISIBLE);
            }
            else if(timeD.substring(0, 2).equals("30")){
                dateTxt.setVisibility(View.GONE);
            }
        }
    }
    private void textFadeInOut(TextView txtView){
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f , 1.0f ) ;
        AlphaAnimation fadeOut = new AlphaAnimation( 1.0f , 0.0f ) ;
        txtView.startAnimation(fadeIn);
        txtView.startAnimation(fadeOut);
        fadeIn.setDuration(1200);
        fadeIn.setFillAfter(true);
        fadeOut.setDuration(1200);
        fadeOut.setFillAfter(true);
    }
}
