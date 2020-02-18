package com.app.customfontsexample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val textView = findViewById<TextView>(R.id.text_view_1)
        val typeface = ResourcesCompat.getFont(this, R.font.architects_daughter)
        //        Typeface t = Typeface.create(typeface, 200, false);
        textView.setOnClickListener { textView.typeface = typeface }
    }
}