package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var botao: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.botao = findViewById(R.id.btnCliqueAqui)

        this.botao.setOnClickListener({clique(it)})

    }

    fun clique(view: View){

        var aleatorio = Random()
        var numeros = TreeSet<Int>()

        while(numeros.size < 6) {
            numeros.add(aleatorio.nextInt(60))
        }
        Log.i("MyApplication", numeros.toString())
    }
}