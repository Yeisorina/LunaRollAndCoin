package com.example.lunarollandcoin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class CoinFlippingActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flipping)

        //Guardo el ImageView en una variable (el ImageView contiene la imagen de los lados de la moneda):
        //(Con el findViewById busco por el Id y con el <ImageView> especifico que debe buscar un elemento de tipo ImageView, luego en el R.id especifico en Id que le puse al imageView en el layout)
        val ImagenLadoActual = findViewById<ImageView>(R.id.imageView_LadoActualM)

        //Codigo para Cuando se de Click al boton Flip Coin:
        findViewById<Button>(R.id.Button_FlipCoin).setOnClickListener(){
            //Con la siguiente linea saco un numero ramdom del 1 al 2 (utilizo del 1 al 2 porque la moneda tiene dos ldos)
            val randomNumber = Random().nextInt(2)+1

            //Utilizo un Case When para saber que numero Random obtuve y con esa numero mostrar un lado de la moneda,
            //Ejemplo si en la variable randomNumber se guarda un 1 el lado de la moneda que voy a mostrar es el cross)
            when(randomNumber){
                1 -> ImagenLadoActual.setImageResource(R.drawable.cross)
                2 -> ImagenLadoActual.setImageResource(R.drawable.face)
            }
        }

    }
}