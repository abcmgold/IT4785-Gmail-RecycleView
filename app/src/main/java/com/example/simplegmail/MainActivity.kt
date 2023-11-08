package com.example.simplegmail

import MessageAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messages = arrayListOf<MessageModel>()
        messages.add(MessageModel("Bùi Anh Tuấn", "Bài tập clone giao diện gmail", "20:00 PM", true))
        messages.add(MessageModel("Edurila.com", "$19 Only (First 10 spots) - Bestselling", "20:01 PM", false))
        messages.add(MessageModel("Chris Abad", "Help make Campaign Monitor better Let us know your thoughts! NO images", "20:02 PM", false))
        messages.add(MessageModel("Tuto.com", "8h de formation gratuite et les nouvea Photoshop, SEO, Blender, CSS, WordPress", "11:04 AM", false))
        messages.add(MessageModel("support", "Announcing the all-new", "10:26 AM", false))
        messages.add(MessageModel("Matt from lonic", "The New lonic Creator is here", "9:23 AM", false))
        messages.add(MessageModel("Matt from lonic", "The New lonic Creator is here", "9:23 AM", false))

        findViewById<RecyclerView>(R.id.recycler_view).adapter = MessageAdapter(messages)
    }
}