package com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.Activityes

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.Adapters.HobbiesAdapter
import com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.modelClass.Hobby
import com.example.recyclerviewtutorialandcardviewtutorialusingkotlin.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerView_Activity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView_ID.layoutManager=linearLayoutManager

        val adapter= HobbiesAdapter(
            this,
            Hobby.Supplier.hobbies
        )
        recyclerView_ID.adapter=adapter
    }
}
