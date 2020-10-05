package gaur.himanshu.august.customdialogvisionandroidtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button=findViewById<Button>(R.id.open_dialog)
        button.setOnClickListener {

            val inflater=layoutInflater.inflate(R.layout.custom_dialog_view,null)

            AlertDialog.Builder(this@MainActivity).setView(inflater).show()
        }


    }
}