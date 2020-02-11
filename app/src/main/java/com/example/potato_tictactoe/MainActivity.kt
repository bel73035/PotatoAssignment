package com.example.potato_tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun potatoItems (view: View){
        view as CheckBox
        if (view == Hat){
            if ( view.isChecked){
                hat.visibility = View.VISIBLE
            }
            else
                hat.visibility = View.INVISIBLE

        }
        if (view == Eyes){
            if ( view.isChecked){
                eyes.visibility = View.VISIBLE
            }
            else
                eyes.visibility = View.INVISIBLE
        }
        if (view == Arms) {
            if (view.isChecked) {
                arms.visibility = View.VISIBLE
            } else
                arms.visibility = View.INVISIBLE
        }
        if (view == Eyebrows) {
            if (view.isChecked) {
                eyesbrows.visibility = View.VISIBLE
            } else
                eyesbrows.visibility = View.INVISIBLE
        }
        if (view == Shoes) {
            if (view.isChecked) {
                shoes.visibility = View.VISIBLE
            } else
                shoes.visibility = View.INVISIBLE
        }
        if (view == Glasses) {
            if (view.isChecked) {
                glasses.visibility = View.VISIBLE
            } else
                glasses.visibility = View.INVISIBLE
        }
        if (view == Mouth) {
            if (view.isChecked) {
                mouth.visibility = View.VISIBLE
            } else
                mouth.visibility = View.INVISIBLE
        }
        if (view == Mustache) {
            if (view.isChecked) {
                mustache.visibility = View.VISIBLE
            } else
                mustache.visibility = View.INVISIBLE
        }
        if (view == Nose) {
            if (view.isChecked) {
                nose.visibility = View.VISIBLE
            } else
                nose.visibility = View.INVISIBLE
        }
        if (view == Ears) {
            if (view.isChecked) {
                ears.visibility = View.VISIBLE
            } else
                ears.visibility = View.INVISIBLE
        }
    }}
