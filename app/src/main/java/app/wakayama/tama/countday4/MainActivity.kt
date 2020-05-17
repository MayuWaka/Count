package app.wakayama.tama.countday4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number:Int = 0

        button.setOnClickListener {
            number = number + 1
            text.text = number.toString()


        }
    }
}
