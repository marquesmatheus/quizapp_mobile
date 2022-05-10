package com.profdata.quiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.profdata.quiz.Adapter.CategoryAdapter
import com.profdata.quiz.Common.SpacesItemDecoration
import com.profdata.quiz.DBHelper.DBHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.title = "Quiz Prof. Matheus"
        setSupportActionBar(toolbar)


        recycler_category.setHasFixedSize(true)
        recycler_category.layoutManager = GridLayoutManager(this,2)

        val adapter = CategoryAdapter(this,DBHelper.getInstance(this).allcategories)
        recycler_category.addItemDecoration(SpacesItemDecoration(4))
        recycler_category.adapter = adapter
    }
}
