package jp.ac.titech.itpro.sdl.helloandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputName: EditText
    private lateinit var outputView: TextView
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.outputView = findViewById<TextView>(R.id.output_view)
        this.inputName = findViewById<EditText>(R.id.input_name)
        
    }

    fun greet(v: View?) {
        val name: String = inputName.text.toString().trim()
        if (name.isNotEmpty()) {
            val text = "Hello %s!\nNice to see you!".format(name)
            outputView.text = text
        }
    }
}
