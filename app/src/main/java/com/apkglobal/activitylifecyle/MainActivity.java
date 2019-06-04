package com.apkglobal.activitylifecyle;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements  TextToSpeech.OnInitListener{
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onCreate", Toast.LENGTH_SHORT).show();
        tts.speak("on create",TextToSpeech.QUEUE_ADD,null);
    }

    @Override
    protected void onStart() {
        super.onStart();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onStart", Toast.LENGTH_SHORT).show();
        tts.speak("on start",TextToSpeech.QUEUE_ADD,null);

    }

    @Override
    protected void onStop() {
        super.onStop();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onStop", Toast.LENGTH_SHORT).show();
        tts.speak("on stop",TextToSpeech.QUEUE_ADD,null);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onresume", Toast.LENGTH_SHORT).show();
        tts.speak("on resume",TextToSpeech.QUEUE_ADD,null);
    }

    @Override
    protected void onPause() {
        super.onPause();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onpause", Toast.LENGTH_SHORT).show();
        tts.speak("on pause",TextToSpeech.QUEUE_ADD,null);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its ondestroy", Toast.LENGTH_SHORT).show();
        tts.speak("on destroy",TextToSpeech.QUEUE_ADD,null);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tts=new TextToSpeech(MainActivity.this,this);
        Toast.makeText(this, "its onrestart", Toast.LENGTH_SHORT).show();
        tts.speak("on restart",TextToSpeech.QUEUE_ADD,null);
    }
    @Override
    public void onInit(int status) {
        tts.setLanguage(Locale.ENGLISH);
        tts.setSpeechRate(0.8f);
    }
}
