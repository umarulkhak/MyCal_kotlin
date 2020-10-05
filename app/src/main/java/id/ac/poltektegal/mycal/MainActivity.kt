package id.ac.poltektegal.mycal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val Logikane=Logika()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = id_num1.text
        val num2 = id_num2.text

        btn_kali.setOnClickListener {
            id_hasil.text = "Area = ${Logikane.kali(num1.toString().toDouble(), num2.toString().toDouble())}"
        }
         btn_tambah.setOnClickListener{
             id_hasil.text="Area = ${Logikane.tambah(num1.toString().toDouble(), num2.toString().toDouble())}"
         }

        btn_kurang.setOnClickListener{
            id_hasil.text="Area = ${Logikane.kurang(num1.toString().toDouble(), num2.toString().toDouble())}"
        }

        btn_bagi.setOnClickListener{
            id_hasil.text="Area = ${Logikane.bagi(num1.toString().toDouble(), num2.toString().toDouble())}"
        }

        btn_keluar.setOnClickListener {
            System.exit(-1)
        }

    }
}
