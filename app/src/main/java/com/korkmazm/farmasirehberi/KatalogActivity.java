package com.korkmazm.farmasirehberi;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/**
 * Created by KorkmazM on 21/05/2017.
 */

public class KatalogActivity extends AppCompatActivity {

    WebView webViewKatalog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_catalog);

        webViewKatalog=(WebView)findViewById(R.id.katalogWebView);
        webViewKatalog.getSettings().setJavaScriptEnabled(true);

        webViewKatalog.loadUrl("http://katalog.farmasiint.com/OnlineKatalog/201705/default.aspx");
        webViewKatalog.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                //Required functionality here
                return super.onJsAlert(view, url, message, result);
            }

        });
    }
}
