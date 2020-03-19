package com.example.utsproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.daftar_detail.*

class dataDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_detail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

           var gambarfak = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var namafak = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskfak = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskkk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)

           gambarfakdel.setImageResource(gambarfak)
            nama_f.text = namafak
            deskrip_f.text = deskfak
            deksdel.text = deskkk

        }
    }
}