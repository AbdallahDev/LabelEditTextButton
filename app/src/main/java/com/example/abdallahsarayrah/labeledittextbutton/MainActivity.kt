package com.example.abdallahsarayrah.labeledittextbutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPlaceOrder.setOnClickListener {
            var smallPizza = editTextSmallPizza.text.toString().trim().toInt()
            var mediumPizza = editTextMediumPizza.text.toString().trim().toInt()
            var largePizza = editTextLargePizza.text.toString().trim().toInt()
            var salad = editTextSalad.text.toString().trim().toInt()

            var total: Int = smallPizza + mediumPizza + largePizza + salad //here i'll count all the ordered pizzas and salads
            textViewTotal.text = total.toString() //here i'll print the total on the total textview

            var cost: Int = smallPizza * 5 + mediumPizza * 10 + largePizza * 15 + salad * 5 // here i want to calculate the total cost of the placed order
            textViewCost.text = cost.toString() //here i'll print the total cost on the total textview
        }
    }
}
