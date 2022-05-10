package com.profdata.quiz.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.profdata.quiz.QuestionFragment

@Suppress("DEPRECATION")
class MyFragmentAdapter(fm:FragmentManager, var context: Context,
                        var fragmentList: List<QuestionFragment>):FragmentPagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
        return fragmentList[p0]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }
    //TITULO DO SLIDES DE QUESTOES

    override fun getPageTitle(position: Int): CharSequence? {
        return StringBuilder("Questão ").append(position+1).toString()
    }

    internal var instance:MyFragmentAdapter?=null


}