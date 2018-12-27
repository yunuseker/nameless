package com.younuseker.nameless.ui.main

import com.younuseker.nameless.R
import com.younuseker.nameless.base.BaseFragment
import com.younuseker.nameless.databinding.ActivityMainBinding
import com.younuseker.nameless.viewmodel.VMMainAct

/**
 * Created by yunuseker on 06.12.2018.
 * github.com/yunuseker
 * younuseker@gmail.com
 */
class MainFrg:BaseFragment<VMMainAct,ActivityMainBinding>(){
    override val getLayoutId: Int = R.layout.activity_main
    override val viewModelClass: Class<VMMainAct> =VMMainAct::class.java

}