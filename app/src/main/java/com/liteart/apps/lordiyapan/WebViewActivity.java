package com.liteart.apps.lordiyapan;

import android.os.Bundle;
import android.webkit.WebView;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WebViewActivity extends AppCompatActivity{
    WebView web;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

       MobileAds.initialize(getApplicationContext(), "ca-app-pub-1439926476174790~1806655511");
        AdView mAdView = (AdView) findViewById(R.id.adview_web);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        web = (WebView) findViewById(R.id.webview);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setDisplayZoomControls(true);
        final String url_webview=getIntent().getStringExtra("url");
        String type=getIntent().getStringExtra("title");
        setTitle(type);
        web.loadUrl(url_webview);
    }
}