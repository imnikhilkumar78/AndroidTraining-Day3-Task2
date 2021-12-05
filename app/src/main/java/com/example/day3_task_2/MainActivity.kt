package com.example.day3_task_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var count =12
        val userClick=findViewById<Button>(R.id.checkbutton)
        val userGuess=findViewById<TextInputLayout>(R.id.userGuessNumber)
        val view=findViewById<TextView>(R.id.Result)
        val num= Random.nextInt(0,1000)

        //val randomNumber=findViewById<TextView>(R.id.randomValue)
        //randomNumber.setText(Integer.toString(num))

        userClick.setOnClickListener{
            val enteredNumber=userGuess.editText?.text.toString().toInt()
            try{
                if(count!=0)
                {
                    view.setText("")
                    if (num==enteredNumber) {
                        //view.setText("You are right")
                        val newScreenIntent = Intent(this, Win::class.java)
                        newScreenIntent.putExtra("RandomNumber",num)
                        startActivity(newScreenIntent)
                    }
                    else if (num>enteredNumber) {
                        view.setText("No, the number is bigger")
                        count--
                        if(count==0)
                        {
                            val newScreenIntent = Intent(this, AttemptFinished::class.java)
                            newScreenIntent.putExtra("RandomNumber",num)
                            startActivity(newScreenIntent)
                        }


                    } else {
                        view.setText("No, the number is smaller")
                        count--
                        if(count==0)
                        {
                            val newScreenIntent = Intent(this, AttemptFinished::class.java)
                            newScreenIntent.putExtra("RandomNumber",num)
                            startActivity(newScreenIntent)
                        }

                    }
                }
                else
                {
                    val newScreenIntent = Intent(this, AttemptFinished::class.java)
                    newScreenIntent.putExtra("RandomNumber",num)
                    startActivity(newScreenIntent)
                }

            }
            catch (e:Exception){
                view.setText("Please Enter a number")
            }


                }



                }

        }


