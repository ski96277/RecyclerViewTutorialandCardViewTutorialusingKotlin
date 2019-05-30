package com.example.recyclerviewtutorialandcardviewtutorialusingkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class HobbiesAdapter(val context: Context, val hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiesAdapter.myViewAdapter>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewAdapter {

        val view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview, parent, false);

        return myViewAdapter(view)
    }

    override fun getItemCount(): Int {

        return hobbies.size
    }

    override fun onBindViewHolder(holder: myViewAdapter, position: Int) {

        val hobby = hobbies[position]
        holder.setData(hobby, position)

    }


    inner class myViewAdapter(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var current_hobbies: Hobby? = null
        var current_position: Int = 0

        fun setData(hobby: Hobby?, pos: Int) {
            itemView.txvTitle.text = hobby!!.title
            this.current_hobbies = hobby
            this.current_position = pos
        }

        init {
            itemview.setOnClickListener {
                Toast.makeText(
                    context,
                    current_hobbies!!.title + " clicked position " + current_position,
                    Toast.LENGTH_SHORT
                ).show();
            }
        }

    }

}

/*
1. Create Adapter Class
2. create inner call that extends Recyclerview.Adapter class
3. extends RecyclerView.Adapter<HobbiesAdapter.myViewAdapter>() in main Class
4. implement the all class
5. pass the pramatter in adapter class
6.
 */
