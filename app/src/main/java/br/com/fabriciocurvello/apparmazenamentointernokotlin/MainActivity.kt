package br.com.fabriciocurvello.apparmazenamentointernokotlin

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private val FILE_NAME = "user_text.txt"

    private lateinit var etTextoEntrada: EditText
    private lateinit var btSalvarTexto: Button
    private lateinit var btCarregarTexto: Button
    private lateinit var tvTextoSaida: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etTextoEntrada = findViewById(R.id.et_texto_entrada)
        btSalvarTexto = findViewById(R.id.bt_salvar_texto)
        btCarregarTexto = findViewById(R.id.bt_carregar_texto)
        tvTextoSaida = findViewById(R.id.tv_texto_saida)

        btSalvarTexto.setOnClickListener { view: View? ->
            saveTextToFile(
                etTextoEntrada.text.toString()
            )
        }

        btCarregarTexto.setOnClickListener { view: View? ->
            var text = loadTextFromFile()

            if (text.isNullOrEmpty()) {
                text = "Nenhum texto encontrado"
            }

            tvTextoSaida.text = text

            //tvTextoSaida.text = text ?: "Nenhum texto encontrado"
        }

    } // fim do onCreate()

    private fun saveTextToFile(text: String) {
        val fileOutputStream: FileOutputStream = openFileOutput(FILE_NAME, Context.MODE_PRIVATE)
        fileOutputStream.write(text.toByteArray())
        fileOutputStream.close()
    }

    private fun loadTextFromFile(): String? {
        try {
            openFileInput(FILE_NAME).use { fis ->
                val buffer = ByteArray(fis.available())
                fis.read(buffer)
                return String(buffer)
            }
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
    }
}