package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R


class FragmentThree: Fragment(R.layout.fragment_three) {

    private lateinit var editTextFullName: EditText
    private lateinit var buttonSend2: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextFullName = view.findViewById(R.id.editTextTextFullName)
        buttonSend2 = view.findViewById(R.id.buttonSend2)

        val navController = Navigation.findNavController(view)

        buttonSend2.setOnClickListener{
            val fullNameText = editTextFullName.text

            if(fullNameText.isEmpty()){
                return@setOnClickListener
            }

            val action = FragmentOneDirections.actionNotificationFragmentToAccountFragment2(fullNameText)
        }


    }
}