package com.example.burgerprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener{
            val checkedMeatRbId=rgMeat.checkedRadioButtonId
            val meat=findViewById<RadioButton>(checkedMeatRbId)
            val cheese=cbcheese.isChecked
            val onions=cbOnions.isChecked
            val salad=cbSalad.isChecked
            val orderString="You ordered the burger with>\n"+
                    "${meat.text}"+
                    (if (cheese) "\nCheese" else "") +
                    (if(onions) "\nOnion" else "")+
                    (if (salad) "\nSalad" else "")
            tvOrderDetails.text=orderString.toString()


        }
    }
}