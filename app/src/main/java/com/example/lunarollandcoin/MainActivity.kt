package com.example.lunarollandcoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 . Codigo para cuando se le de click al boton Roll Dice:
        /*
        Primero busco el boton por el ID, para eso utilizo el findViewById y con eso que dice <Button> le estoy diciendo
        que el elemento que debe buscar es un boton, luego en el R.id.button_GoToRollDice le especifico el Id que le puse
        al boton en el layaout (en la parte del diseño). El setOnClickListener es como un evento que se ejecuta al dar click en el boton
        */
        findViewById<Button>(R.id.button_GoToRollDice).setOnClickListener(){
            //Aqui dentro va el codigo que se ejecutara cuando se le de click al boton Roll Dice:
            //Lo que pasara es que vamos a pasar al Activity de RollDice:
            startActivity(Intent(this, RollDiceActivity::class.java))
            //Lo que hice en la linea anterior fue iniciar un nuevo Activity con el StartActivity,
            //Luego creo un nuevo Intent y luego le especifico el Activity que se va a abrir,
            //Cuando se le de click al boton RollDice, se abrira el activity RollDiceActivity
        }


        //2 . Codigo para cuando se le de click al boton Coin Flipping:
        //Aplico la misma logica que utilice para el boton Roll dice:
        //(Busco el boton por Id, le pongo el setOnClickListener y luego abro el activity CoinFlippingActivity)
        findViewById<Button>(R.id.Button_GoToCoinFlipping).setOnClickListener(){
            startActivity(Intent(this, CoinFlippingActivity::class.java))
        }
    }
}