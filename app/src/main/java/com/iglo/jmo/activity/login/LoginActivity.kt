package com.iglo.jmo.activity.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.iglo.jmo.R
import com.iglo.jmo.activity.MenuActivity
import com.iglo.jmo.databinding.LayoutLoginBinding


class LoginActivity :AppCompatActivity(){
    lateinit var binding: LayoutLoginBinding
    val layoutResourceId : Int  = R.layout.layout_login



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(this), layoutResourceId, null,false
        )
        binding.lifecycleOwner = this
        setContentView(binding.root)


        binding.loginButton.setOnClickListener{
            startActivity(Intent(this, MenuActivity::class.java ))
        }
    }
}