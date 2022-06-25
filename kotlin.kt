package com.example.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.R
import com.example.myapplication.user
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //    id 'kotlin-android'
        //    id 'kotlin-android-extensions'

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
        var b1 : Boolean = true

        //Array
        var list = arrayOf("Rıdvan","Musaoğlu")
        println(list.get(0))
        var arrayTest = Array(5, { i -> i*1 })

        list.set(0,"Akif")

        //Array list
        val nameList = arrayListOf<String>("test1","test2","test3")
        println(nameList.get(2))
        nameList.add("test3")

        val anyList = arrayListOf<Any>()
        anyList.add(1)
        anyList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(2)

        //Set
        val sampleArray = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${sampleArray[2]}")
        println(sampleArray.size)

        val sampleSet = setOf<Int>(7,8,9,9,9,8,10)
        println(sampleSet.size)
        sampleSet.forEach {
            println(it)
        }

        val otherSet = HashSet<String>()
        otherSet.add("Rıdvan")
        otherSet.add("Rıdvan")
        otherSet.add("Rıdvan")
        otherSet.add("Musaoğlu")

        otherSet.forEach {
            println(it)
        }

        //Map
        val foodCallorieMap = hashMapOf<String, Int>()
        foodCallorieMap.put("Meat", 300)
        foodCallorieMap.put("Apple", 100)
        foodCallorieMap.put("Chicken", 200)
        println(foodCallorieMap.get("Et"))

        val otherMap = HashMap<String, String>()
        otherMap.put("Test","Test")

        val testMap = hashMapOf<String, Int>("Test" to 1, "Test2" to 2)

        //Constant
        val d : Int
        d = 10

        //Transforming
        val number = 10
        val transformedNumber = number.toDouble()

        //If
        if(10>9){
            println("True")
        }
        else{
            println("False")
        }

        //When (Switch)
        var grade : Int = 4
        var result = ""
        when(grade){
            0 -> result = "FF"
            1 -> result = "DD"
            2 -> result = "CC"
            3 -> result = "BB"
            4 -> result = "AA"
        }
        println(result)


        //For Loop
        val anArray = arrayOf(5,6,7,8,9,12,13,14,15,16)

        for (i in anArray){
            println(i)
        }

        for(i in anArray.indices){
            println(i)
        }

        for(i in 1..10){
            println(i)
        }

        anArray.forEach {
            println(it)
        }

        //While Loop
        var j = 0
        while(j<10) {
            println(j)
            j+=1
        }

        //Function
        fun testFun(){
            println("testFun started!")
        }

        fun inputFun(x:Int, y:Int){
            println(x-y)
        }

        inputFun(10,5)

        //Function with return
        fun returnFunc(a:Int,b:Int) :Int{
            return a+b
        }
        var aNumber = returnFunc(10,20)
        println(aNumber)

        fun change(view : View){
            var resultA =  returnFunc(10,20)
            textView.text = "result: " + resultA
        }

        //class call
        var nameClass = user()


        //Nullibility
        var nullName : String? = null // null string

        //1
        if(nullName!= null){
            println(nullName)
        }
        else{
            println("null")
        }

        //2
        // !! -> it must not be null , ? -> it can be null
        println(nullName?.length)

        //3 elvis
        val mResult = nullName?.length ?: 10 // if nullName is null then set it do default value 10
        println(mResult)

        //4 let if is is null, let block will not execute
        nullName?.let {
            println("nullName is:" + it)
        }

    }
}