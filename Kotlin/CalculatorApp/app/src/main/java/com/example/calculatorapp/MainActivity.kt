package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var isNewOp=true
    var oldNum=""
    var op="+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        var buClick=findViewById<EditText>(R.id.editText)
        if(isNewOp)
            buClick.setText("")
        isNewOp=false

        var a=buClick.text.toString()
        var b1=findViewById<Button>(R.id.bu1)
        var b2=findViewById<Button>(R.id.bu2)
        var b3=findViewById<Button>(R.id.bu3)
        var b4=findViewById<Button>(R.id.bu4)
        var b5=findViewById<Button>(R.id.bu5)
        var b6=findViewById<Button>(R.id.bu6)
        var b7=findViewById<Button>(R.id.bu7)
        var b8=findViewById<Button>(R.id.bu8)
        var b9=findViewById<Button>(R.id.bu9)
        var b0=findViewById<Button>(R.id.bu0)
        var bD=findViewById<Button>(R.id.buDot)
        var bPM=findViewById<Button>(R.id.buPlusMinus)

        var buselect=view as Button
        when(buselect.id){
            b1.id->{a+="1"}
            b2.id->{a+="2"}
            b3.id->{a+="3"}
            b4.id->{a+="4"}
            b5.id->{a+="5"}
            b6.id->{a+="6"}
            b7.id->{a+="7"}
            b8.id->{a+="8"}
            b9.id->{a+="9"}
            b0.id->{a+="0"}
            bD.id->{a+="."}
            bPM.id->{a="-$a"}

        }
        buClick.setText(a)
    }

    fun operatorEvent(view: View) {
        var buC=findViewById<EditText>(R.id.editText)
        var buM=findViewById<Button>(R.id.buMultiply)
        var buP=findViewById<Button>(R.id.buPlus)
        var buMi=findViewById<Button>(R.id.buMinus)
        var diV=findViewById<Button>(R.id.buDivide)
        isNewOp=true
        oldNum=buC.text.toString()
        var buSelect=view as Button
        when(buSelect.id){
            buM.id->{op="*"}
            buP.id->{op="+"}
            buMi.id->{op="-"}
            diV.id->{op="/"}

        }
    }

    fun equalEvent(view: View) {
        var buC = findViewById<EditText>(R.id.editText)
        var newNumber = buC.text.toString()
        var result=0.0
        when(op){
            "+"->{result=oldNum.toDouble()+newNumber.toDouble()}
            "*"->{result=oldNum.toDouble()*newNumber.toDouble()}
            "/"->{result=oldNum.toDouble()/newNumber.toDouble()}
            "-"->{result=oldNum.toDouble()-newNumber.toDouble()}

        }
        buC.setText(result.toString())
    }

    fun acEvent(view: View) {
        var buC = findViewById<EditText>(R.id.editText)
        buC.setText("0")
        isNewOp=true
    }

    fun percentEvent(view: View) {
        var buC = findViewById<EditText>(R.id.editText)
        var no=buC.text.toString().toDouble()/100
        buC.setText(no.toString())
        isNewOp=true

    }
}