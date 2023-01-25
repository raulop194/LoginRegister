package es.nexcreep.testing.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import es.nexcreep.testing.loginregister.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setContentView(binding.root)
        binding = ActivityLoginBinding.inflate(layoutInflater)



    }
}