package com.example.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variables

        var a = 8
        var b = 10
        var c = a+b

        //Int
        var a1 : Int = 21

        //Long
        var a2 : Long = 22342395

        //Float
        var a4 : Float = 2341.2324f

        //Double
        var a3 : Double = 3445435.000000000000000

        //String
        var s1 : String = "Rıdvan Musaoğlu"

        //Boolean
        var b1 :Boolean = true

        //Array
        var list = arrayOf("Rıdvan","Musaoğlu")
        println(list.get(0))
        var arrayTest = Array(5, { i -> i*1 })

        list.set(0,"Akif")


        //Constant
        val d : Int
        d = 10

        //Transforming
        val number = 10
        val transformedNumber = number.toDouble()

    }
}