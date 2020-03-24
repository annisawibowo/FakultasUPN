package com.example.utsproject

import android.content.Intent
import android.graphics.Paint.UNDERLINE_TEXT_FLAG
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.daftar_detail.*


class dataDetail : AppCompatActivity() {
    val listlink = ArrayList<linkjurusan>()
    val listdatalink = arrayOf(
        "http://tekindustri.upnjatim.ac.id/",//0
        "http://tekkimia.upnjatim.ac.id/",//1
        "http://teksipil.upnjatim.ac.id/",//2
        "http://tekpangan.upnjatim.ac.id/",//3
        "http://teklingk.upnjatim.ac.id/",//4
        "http://akuntansi.upnjatim.ac.id/",//5
        "http://manajemen.upnjatim.ac.id/",//6
        "http://ekbang.upnjatim.ac.id/",//7
        "https://adbis.upnjatim.ac.id/",//8
        "http://adneg.upnjatim.ac.id/",//9
        "https://github.com/annisawibowo",//10
        "http://ilkom.upnjatim.ac.id/",//11
        "http://hubint.upnjatim.ac.id/",//12
        "http://arsitektur.upnjatim.ac.id/",//13
        "http://dkv.upnjatim.ac.id/",//14
        "http://agrotek.upnjatim.ac.id/",//15
        "https://agribis.upnjatim.ac.id/",//16
        "https://if.upnjatim.ac.id/",//17
        "http://sisfo.upnjatim.ac.id/"//18

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_detail)


        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

           var gambarfak = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var namafak = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskfak = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskkk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            var link = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_CC)

           gambarfakdel.setImageResource(gambarfak)
            nama_f.text = namafak
            deskrip_f.text = deskfak
            deksdel.text = deskkk


            if (namafak=="Fakultas Ilmu Komputer") {

                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[17])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[18])
                    startActivity(showDetailActivityIntent)
                   // Towebview()
                }
            }
            if(namafak=="Fakultas Teknik"){
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }


                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[1])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[0])
                    startActivity(showDetailActivityIntent)
                    // Towebview()
                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[2])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[4])
                    startActivity(showDetailActivityIntent)
                }
                imageButton5.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[3])
                    startActivity(showDetailActivityIntent)
                }


            }
            if (namafak=="Fakultas Ekonomi dan Bisnis"){
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }


                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[7])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[5])
                    startActivity(showDetailActivityIntent)
                    // Towebview()
                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[6])
                    startActivity(showDetailActivityIntent)
                }

            }
            if (namafak=="Fakultas Pertanian"){
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[15])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[16])
                    startActivity(showDetailActivityIntent)
                    // Towebview()
                }


            }
            if (namafak=="Fakultas Hukum"){
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }
                imageButton.visibility = View.GONE
                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton2.visibility = View.GONE



            }
            if(namafak=="Fakultas Ilmu Sosial dan Politik"){
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)
                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[8])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[9])
                    startActivity(showDetailActivityIntent)
                    // Towebview()
                }
                imageButton3.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[11])
                    startActivity(showDetailActivityIntent)
                }
                imageButton4.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[12])
                    startActivity(showDetailActivityIntent)
                }
                imageButton5.visibility = View.GONE


            }
            if (namafak=="Fakultas Arsitektur dan Desain") {
                setTitle(namafak)
                nama_f.setPaintFlags(UNDERLINE_TEXT_FLAG)

                nama_f.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)
                }

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE

                imageButton.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[13])
                    startActivity(showDetailActivityIntent)

                    //Towebview()

                }
                imageButton2.setOnClickListener{

                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, listdatalink[14])
                    startActivity(showDetailActivityIntent)
                    // Towebview()
                }
            }
            if (namafak=="Annisa Raudya Wibowo") {
                setTitle(namafak)

                imageButton3.visibility = View.GONE
                imageButton4.visibility = View.GONE
                imageButton5.visibility = View.GONE
                imageButton.visibility = View.GONE
                imageButton2.visibility = View.GONE
                deksdel.text = link
                deksdel.setOnClickListener{
                    val showDetailActivityIntent = Intent (this, Towebview::class.java)
                    showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, link)
                    startActivity(showDetailActivityIntent)

                }
            }
        }
    }
}