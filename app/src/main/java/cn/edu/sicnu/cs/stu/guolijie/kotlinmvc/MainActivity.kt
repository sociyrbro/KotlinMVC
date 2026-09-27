package cn.edu.sicnu.cs.stu.guolijie.kotlinmvc

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var textViewCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonAddTextView: Button = findViewById(R.id.buttonAddTextView)
        val textViewContainer: LinearLayout = findViewById(R.id.textViewContainer)
        val button: Button = findViewById(R.id.button)
        val spinner: Spinner = findViewById(R.id.spinner)
        val textView: TextView = findViewById(R.id.textView)

        val expert = ProgramExpert()

        buttonAddTextView.setOnClickListener {
            textViewCount++
            val newTextView = TextView(this)
            newTextView.text = getString(R.string.new_textview, textViewCount)
            textViewContainer.addView(newTextView)
        }

        button.setOnClickListener {
            textView.text = getString(expert.getLanguage(spinner.selectedItemPosition))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
