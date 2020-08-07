package eu.rafaelsantiago.horizontallist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val list: List<String>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bindView(list[position])


    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(string: String) {
            view.findViewById<TextView>(R.id.textView).text = string
        }
    }
}