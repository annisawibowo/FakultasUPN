package com.example.utsproject

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layoutwebview.*


class Towebview  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutwebview)
        setTitle("Website")

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_EMAIL)){
            var url = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_EMAIL)

        webview.loadUrl(url)

        webview.webViewClient = object : WebViewClient() {
            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
            }

            override fun onPageFinished(view: WebView, url: String) {
            }
        }

    }}

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        }
    }
}