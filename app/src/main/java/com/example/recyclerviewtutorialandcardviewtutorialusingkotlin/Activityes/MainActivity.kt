package com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.Activityes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_recyclerView_Show.setOnClickListener {
            var intent:Intent = Intent(this,
                RecyclerView_Activity::class.java);
            startActivity(intent)
        }
    }
}
