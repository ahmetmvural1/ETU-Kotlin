package com.ahmetmvural.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.AbsListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.ahmetmvural.lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupBinding()
        //countDown()
        oopKotlin()

        //toast message kullanımı
        //Toast.makeText(this, "Welcome ETU Class", Toast.LENGTH_LONG).show()
        //applicationContext
        //this
        //this@Göstermek istediğin class adı

    }

    fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun showAction(view: View) {

        //Alert Gösterimi
        /*
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes") { dialog, which ->
            //onClick Listener kısmı
            Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show()
        }

        alert.setNegativeButton("No") { dialog, which ->
            //onClick Listener kısmı
            Toast.makeText(this, "Not Saved", Toast.LENGTH_LONG).show()
        }

        alert.show()

         */
    }

    fun countDown() {
        object : CountDownTimer(10000,1000) {
            override fun onFinish() {
                binding.counter.text = "End Counter"
            }

            override fun onTick(p0: Long) {
                binding.counter.text = "Left: ${(p0/1000 + 1)}"
            }
        }.start()
    }

    fun oopKotlin() {
        var name : String = "myString"


        /*
        val myUser = User()
        myUser.name = "Sibel"
        myUser.gender = "Female"
        myUser.age = 22

        println(myUser.age.toString())
        println(myUser.gender.toString())
        println(myUser.name)

        myUser.name = "Fatma"

        println(myUser.name)

         */

/*
        val myUser = User(nameInput = "Ahmet", ageInput = 31, genderInput = "Male")
        println(myUser.age.toString())
        println(myUser.gender.toString())
        println(myUser.name)

        myUser.age = 22
        println(myUser.age.toString())

 */
        /*
        val myMusician = Musician("Ahmet", "Piano",32)
        //println(myMusician.instrument)
        println(myMusician.name)
        println(myMusician.age)
        myMusician.age = 21
        println(myMusician.age)
        //setter methodu private olduğu için setleme işmi yapılamaz
      //  myMusician.name = "Samet"
        println(myMusician.name)

        val isQueen = myMusician.returnBandName("Fredy")

        ç



         */
        /*
        val myUser = User(nameInput = "Ahmet", ageInput = 31, genderInput = "Male")
       // val myEmployee = Employee("Fırat", 12,"Male","Scholl")
        val myEmployee = Employee(myUser.name.toString(),myUser.age.hashCode(),myUser.gender.toString(),"Engineer")
        myEmployee.myUser()
*/
/*
        val mySuperEmployee = Employees("İbrahim", 23,"Male")
        mySuperEmployee.myUser()

 */

        val myMath = Math()

        println(myMath.sum())
        println(myMath.sum(1,2))
        println(myMath.sum(23,23,333))
        println(myMath.getPiNumber() * 476)


    }


}