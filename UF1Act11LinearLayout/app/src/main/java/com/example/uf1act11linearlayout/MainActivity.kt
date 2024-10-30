package com.example.uf1act11linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

/*
Amplía l’activitat 10 anterior per afegir el camp de gènere amb un radio button, el telèfon i l’email
fes servir els TextView addients perque el teclat que aparegui sigui l’adequat.
Afegeix un scroll vertical per poder visualitzar tota la pantalla
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNom = findViewById<EditText>(R.id.editTextText)
        val editTextCognom = findViewById<EditText>(R.id.editTextText2)
        val editNumberEdat = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextUsuari = findViewById<EditText>(R.id.editTextText3)
        val passwordAuthentication = findViewById<EditText>(R.id.editTextTextPassword)
        val editPhoneTelefon = findViewById<EditText>(R.id.editTextPhone)
        val editEmailCorreu = findViewById<EditText>(R.id.editTextTextEmailAddress)

        val button = findViewById<Button>(R.id.button)

        val genere = findViewById<RadioGroup>(R.id.radioGroup)



        button.setOnClickListener {

            if (editTextNom.text.isNotBlank() && editTextCognom.text.isNotBlank() && editNumberEdat.text.isNotBlank() && editTextUsuari.text.isNotBlank() && passwordAuthentication.text.isNotBlank() && genere.checkedRadioButtonId != -1 && editPhoneTelefon.text.isNotBlank() && editEmailCorreu.text.isNotBlank()) {

                Toast.makeText(this, "Registre Complet", Toast.LENGTH_SHORT).show()


            } else {

                Toast.makeText(this, "No s'han omplert tots els camps", Toast.LENGTH_SHORT).show()
            }

        }


    }
}