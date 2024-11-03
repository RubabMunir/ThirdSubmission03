package com.example.darazapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.darazapp.R

data class MessageItem(val title: String, val description: String, val date: String)

class MessagesAdapter(private val messages: List<MessageItem>) :
    RecyclerView.Adapter<MessagesAdapter.MessageViewHolder>() {

    inner class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val messageTitle: TextView = view.findViewById(R.id.messageTitle)
        val messageDescription: TextView = view.findViewById(R.id.messageDescription)
        val messageDate: TextView = view.findViewById(R.id.messageDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]
        holder.messageTitle.text = message.title
        holder.messageDescription.text = message.description
        holder.messageDate.text = message.date
    }

    override fun getItemCount() = messages.size
}
