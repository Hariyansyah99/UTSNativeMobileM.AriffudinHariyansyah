package com.example.mariffudinhariyansyahuts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailPahlawanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pahlawan)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val pahlawan = intent.getParcelableExtra<Pahlawan>(MainActivity.INTENT_PARCELABLE)

        val imgPahlawan = findViewById<ImageView>(R.id.img_item_photo)
        val namePahlawan = findViewById<TextView>(R.id.tv_item_name)
        val descPahlawan = findViewById<TextView>(R.id.tv_item_description)

        imgPahlawan.setImageResource(pahlawan?.imgPahlawan!!)
        namePahlawan.text = pahlawan.namePahlawan
        descPahlawan.text = pahlawan.descPahlawan
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}