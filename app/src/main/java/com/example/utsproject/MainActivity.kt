package com.example.utsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createdataupn()
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.setHasFixedSize(true)
        rv_list.adapter = dataFadapter(data,{upnItem : data_upn -> upnItemClicked(upnItem) })

    }
    private fun upnItemClicked(upnItem : data_upn){
        val showDetailActivityIntent = Intent (this, dataDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, upnItem.gambarF)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, upnItem.namaF)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, upnItem.deskF)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, upnItem.deskdetail)
        startActivity(showDetailActivityIntent)
    }
    private fun createdataupn() : List<data_upn>{
        val rvlist = ArrayList<data_upn>()
        rvlist.add(data_upn(R.drawable.logoupn,
            "Fakultas Ilmu Komputer",
            "Fakultas Ilmu Komputer\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ",
            "1.     Teknik Informatika\n"+
                    "2.     Sistem Informasi")
        )
        rvlist.add(data_upn(R.drawable.logoupn,
            "Fakultas Teknik",
            "Fakultas Teknik\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ",
            "1.     Teknik Kimia\n"+
                    "2.     Teknik Industri\n"+
                    "3.     Teknik Sipil\n"+
                    "4.     Teknik Lingkungan\n"+
                    "5.     Teknologi Pangan")
        )
        rvlist.add(data_upn(R.drawable.logoupn,
            "Fakultas Ekonomi dan Bisnis",
            "Fakultas Ekonomi dan Bisnis\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ",
            "1.     Ekonomi Pembangunan\n"+
                    "2.     Akuntansi\n"+"3.     Manajemen")
        )
        rvlist.add(data_upn(R.drawable.logoupn,
            "Fakultas Pertanian",
            "Fakultas Pertanian\n"+
                    "merupakan salah satu dari 7\n"+
                    "Fakultas 'Veteran' Jawa\n"+
                    "Timur. Yang terdiri dari program\n"+
                    "studi: ",
            "1.     Agroteknologi\n"+
                    "2.     Agribisnis")

        )
        rvlist.add(data_upn(R.drawable.fotogue,
            "Annisa Raudya Wibowo",
            " Profil Singkat",
            "NAMA       \n" +
                    "Annisa Raudya Wibowo\n" +
                    "\nTTL       \n" +
                    "Malang, 01 Desember 1998\n" +
                    "\nALAMAT     \n" +
                    "Taman Pinang Indah B5 no.2 Sidoarjo\n" +
                    "\nEMAIL   \n" +
                    "annisa.raudya98@gmail.com\n" +
                    "\nURL GITHUB \n" +
                    "https://github.com/annisawibowo\n" +
                    "\nPENDIDIKAN \n" +
                    "SDIT Al Fatih       (2011)\n" +
                    "SMP Citra Islamic   (2011-2014)\n" +
                    "SMAN 2 SIdoarjo     (2014-2017)\n" +
                    "Fakultas Ilmu Komputer UPN V Jatim\n" +
                    "\nPENGHARGAAN  \n" +
                    "Medali Emas POPDA BANTEN CabOr Bola Basket  2014\n" +
                    "Juara Favorit Duta Peduli AIDS Sidoarjo     2015\n" +
                    "Juara II Lomba Cipta Lagu                   2016\n" +
                    "Peringkat III FLS2N Sidoarjo                2016\n" +
                    "Penerima Beasiswa Bank Indonesia            2019\n")
        )
        return rvlist



    }
}
