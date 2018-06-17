package com.liteart.apps.lordiyapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Timer;

public class ArupadaiVeedugalAcivity extends AppCompatActivity implements View.OnClickListener {
Intent i;
    Button btn_news,
            pooja_timings,
            shcedule,
            poojaiweekly,
            pricetag,
            generalnews,
            phoneno,
            photo,
            transport,
            medicalhelp,
            service,
            structure;
    int currentPage = 0;
    Timer timer;
    final long DELAY_MS = 500;//delay in milliseconds before task is to be executed
    final long PERIOD_MS = 3000; // time in milliseconds between successive task executions.

    int images[] = {R.drawable.murugan_image, R.drawable.murugan,R.drawable.image3};
    MyCustomPagerAdapter myCustomPagerAdapter;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arupadai_veedugal);
        setTitle(getString(R.string.arupadai_veedugal));
      //  MobileAds.initialize(getApplicationContext(), "ca-app-pub-1439926476174790~9143120480");
        AdView mAdView = (AdView) findViewById(R.id.adView_arupadai_veedugal);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn_news=(Button)findViewById(R.id.btn_news);
        pooja_timings=(Button)findViewById(R.id.btn_pooja);
        shcedule =(Button)findViewById(R.id.btn_schedule);
        poojaiweekly =(Button)findViewById(R.id.btn_poojaiweekly);
        pricetag  =(Button)findViewById(R.id.btn_pricelist);
        generalnews   =(Button)findViewById(R.id.btn_generalnews);
        phoneno     =(Button)findViewById(R.id.btn_phoneno);
        photo     =(Button)findViewById(R.id.btn_photo);
        transport      =(Button)findViewById(R.id.btn_travel);
        medicalhelp =(Button)findViewById(R.id.btn_medicalhelp);
        service =(Button)findViewById(R.id.btn_service);
        structure =(Button)findViewById(R.id.structure);


        pooja_timings.setOnClickListener(this);
        shcedule.setOnClickListener(this);
        poojaiweekly.setOnClickListener(this);
        pricetag.setOnClickListener(this);
         generalnews.setOnClickListener(this);
        phoneno.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        transport.setOnClickListener(this);
        photo.setOnClickListener(this);
        medicalhelp .setOnClickListener(this);
        service .setOnClickListener(this);
        structure .setOnClickListener(this);

    }
     @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_pooja:
                i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=75&Itemid=114");
                i.putExtra("title","பூஜை & நேரங்கள்");
                startActivity(i);
                break;

            case R.id.btn_schedule:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=61&Itemid=62");
                i.putExtra("title","தர்சனுக்கான அட்டவணை");
                startActivity(i);
                break;

            case R.id.btn_poojaiweekly:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=95&Itemid=97");
                i.putExtra("title","மண்டல பூஜா");
                startActivity(i);
                break;
            case R.id.btn_pricelist:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=96&Itemid=99");
                i.putExtra("title","விலைப்பட்டியல்");
                startActivity(i);
                break;

            case R.id.btn_generalnews:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=55&Itemid=57");
                i.putExtra("title","பொதுவான செய்தி");
                startActivity(i);
                break;

            case R.id.btn_phoneno:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=53&Itemid=59");
                i.putExtra("title","தொலைபேசி எண்கள்");
                startActivity(i);
                break;
            case R.id.btn_news:
                // do your code
                Intent in_news=new Intent(getApplicationContext(),NewsListActivity.class);
                startActivity(in_news);
                break;
            case R.id.btn_travel:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=52&Itemid=60");
                i.putExtra("title","சாலை போக்குவரத்து வசதிகள்");
                startActivity(i);
                break;
            case R.id.btn_photo:
                // do your code
                i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=49&Itemid=55");
                i.putExtra("title","தூரம் விளக்கப்படம்");
                startActivity(i);
                break;
                case R.id.btn_medicalhelp:
                // do your code
                     i=new Intent(getApplicationContext(),WebViewActivity.class);
                    i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=85&Itemid=87");
                    i.putExtra("title","மருத்துவ வசதிகள்");
                    startActivity(i);
                break;

            case R.id.btn_service:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=84&Itemid=86");
                i.putExtra("title","சேவைகள் பட்டியல்");
                startActivity(i);
                break;
            case R.id.structure:
                // do your code
                 i=new Intent(getApplicationContext(),WebViewActivity.class);
                i.putExtra("url","http://sabarimala.kerala.gov.in/index.php?option=com_content&view=article&id=89&Itemid=91");
                i.putExtra("title","கட்டமைப்புகள்");
                startActivity(i);
                break;
            default:
                break;
        }}


}
