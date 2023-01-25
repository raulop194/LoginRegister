package es.nexcreep.testing.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import es.nexcreep.testing.loginregister.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.nacionalidades,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)

        binding.nacionalidadesSpinner.adapter = adapter

        binding.button3.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
                    .putExtra("LOGGED_IN", true)
            )
        }

        binding.button2.setOnClickListener {
            startActivity(
                Intent(this, MainActivity::class.java)
            )
        }

    }
}