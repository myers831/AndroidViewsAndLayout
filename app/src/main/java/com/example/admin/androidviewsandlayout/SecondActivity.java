package com.example.admin.androidviewsandlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private WebView wvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wvView = (WebView) findViewById(R.id.wvView);

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();

        WebSettings webSettings = wvView.getSettings();
        WebViewClient client = new WebViewClient();
        webSettings.setJavaScriptEnabled(true);
        wvView.setWebViewClient(client);

        wvView.loadUrl("http://mekonah.com/");
    }
}
