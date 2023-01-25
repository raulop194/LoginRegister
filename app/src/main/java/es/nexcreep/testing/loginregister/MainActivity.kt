package es.nexcreep.testing.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import es.nexcreep.testing.loginregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var loggedIn: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loggedIn = intent.getBooleanExtra("LOGGED_IN", false)

    }

    override fun onResume() {
        super.onResume()
        if (!loggedIn)
            startActivity(Intent(this, LoginActivity::class.java))
    }
}