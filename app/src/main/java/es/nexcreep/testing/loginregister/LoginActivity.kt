package es.nexcreep.testing.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import es.nexcreep.testing.loginregister.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTexts = arrayListOf(binding.editTextUser, binding.editTextContra)


        editTexts.forEach {
            it.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                }

                override fun afterTextChanged(s: Editable?) {
                    binding.ButtonLogin.isEnabled = login(editTexts)
                    binding.ButtonLogin.isVisible = login(editTexts)
                }
            })

        }

        binding.ButtonLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtra("LOGGED_IN", true))
        }

        binding.BotonRegistro.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }

    fun login(eT : ArrayList<EditText>) : Boolean {
        return binding.editTextContra.text.toString().equals(binding.editTextUser.text.toString())
                && eT.all { it.text.isNotEmpty() && it.text.isNotBlank() }
    }
}