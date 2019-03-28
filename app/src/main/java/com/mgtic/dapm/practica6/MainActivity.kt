package com.mgtic.dapm.practica6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mgtic.dapm.practica6.modelo.Book
import org.json.JSONArray;
import org.json.JSONObject;
import org.jetbrains.anko.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val bookFetchUrl = "https://www.googleapis.com/books/v1/volumes"
    var bookList: ArrayList<Book>? = null

    private val BOOKS_LOADER_ID = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
