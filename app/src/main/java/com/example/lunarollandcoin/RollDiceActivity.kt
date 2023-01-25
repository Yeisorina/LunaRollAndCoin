package com.example.lunarollandcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class RollDiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)

        //Guardo el ImageView en una variable (el ImageView contiene la imagen de las caras del dado):
        //(Con el findViewById busco por el Id y con el <ImageView> especifico que debe buscar un elemento de tipo ImageView, luego en el R.id especifico en Id que le puse al imageView en el layout)
        val ImagenCaraActual = findViewById<ImageView>(R.id.imageViewCaraActual)

        //Codigo para Cuando se de Click al boton Roll:
        //(Busco el boton por el Id usando el findViewById<Button> en el R.id.Button_RollD le especifico el ID que le puse al boton en el layout)
        //Luego le pongo el setOnClickListener para que se ejecute algo cuando le de click:
        findViewById<Button>(R.id.Button_RollD).setOnClickListener(){
            //Lo que se ejecutara cuando le den click al boton Roll:

            //Con la siguiente linea saco un numero ramdom del 1 al 6 (utilizo del 1 al 6 porque el dado tiene 6 caras)
            val randomNumber = Random().nextInt(6)+1

            //Utilizo un Case When para saber que numero Random obtuve y con esa numero mostrar una cara del dado,
            //Ejemplo si en la variable randomNumber se guarda un 5 la cara que se debe mostrar es  la 5 (alea5)
            when(randomNumber){
                1 -> ImagenCaraActual.setImageResource(R.drawable.alea_1)
                2 -> ImagenCaraActual.setImageResource(R.drawable.alea_2)
                3 -> ImagenCaraActual.setImageResource(R.drawable.alea_3)
                4 -> ImagenCaraActual.setImageResource(R.drawable.alea_4)
                5 -> ImagenCaraActual.setImageResource(R.drawable.alea_5)
                6 -> ImagenCaraActual.setImageResource(R.drawable.alea_6)
            }
        }
    }
}