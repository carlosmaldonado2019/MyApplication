package com.mgtic.dapm.practica6

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.mgtic.dapm.practica6.modelo.Book

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    lateinit var context: Context
     var bookList: List<Book> = ArrayList()

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }

    fun RecyclerAdapter(mContext:Context,bookList:List<Book> ){
        this.context = mContext;
        this.bookList = bookList;
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
      return  bookList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}