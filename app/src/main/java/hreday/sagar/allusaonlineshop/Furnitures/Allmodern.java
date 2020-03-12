package hreday.sagar.allusaonlineshop.Furnitures;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import hreday.sagar.allusaonlineshop.R;

public class Allmodern extends AppCompatActivity {
    private WebView webView;


    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allmodern);


        getSupportActionBar().hide();


        progressBar=findViewById(R.id.progress);


        //   mInterstitialAd = new InterstitialAd(this);
        //     mInterstitialAd.setAdUnitId("ca-app-pub-4248114886151875/2595314880");

        //    mInterstitialAd.loadAd(new AdRequest.Builder().build());


        webView = findViewById(R.id.webviewId);
        webView.loadUrl("https://www.allmodern.com/");


        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient()
        {

            @Override public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(ProgressBar.VISIBLE);
                webView.setVisibility(View.INVISIBLE);
            }

            @Override public void onPageCommitVisible(WebView view, String url) {
                super.onPageCommitVisible(view, url);
                progressBar.setVisibility(ProgressBar.GONE);
                webView.setVisibility(View.VISIBLE);

            }
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                Allmodern.this.webView.loadUrl("file:///android_asset/errors.html");

                super.onReceivedError(view, request, error);
            }
        });
        webSettings.setJavaScriptEnabled(true);
    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

/*
    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        } else {
            super.onBackPressed();
        }
    }

 */
}

