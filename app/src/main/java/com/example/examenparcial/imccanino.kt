package com.example.examenparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_imccanino.*
import kotlinx.android.synthetic.main.activity_imcfinal.*


class imccanino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imccanino)

        val btn_cal =findViewById<Button>(R.id.btncal)
        var sniper: Spinner=findViewById(R.id.spinner)



        btn_cal.setOnClickListener{
            try {
                var peso:String= pe.text.toString()
                var pes=Integer.parseInt(peso)
                var altura:String=icm_alt.text.toString()
                var alt=Integer.parseInt(altura)
                //var edad=Integer.parseInt() //convirtiendo a entero Edad
                var oci:String=imc_oci.text.toString()
                var oc=Integer.parseInt(oci)
                var snip:String=spinner.toString()
                var na:String=icm_nombre.text.toString()
                var snip2:String=spinner2.toString()

                val icmfi =pes/(alt*oc)


                val saltar: Intent = Intent(this, imcfinal::class.java)
                //envío de variables
                val fin="El ICM de $na es:"+icmfi
                saltar.putExtra("",fin)
                startActivity(saltar)
            }catch (e: NumberFormatException){

            }

        }


    }
}