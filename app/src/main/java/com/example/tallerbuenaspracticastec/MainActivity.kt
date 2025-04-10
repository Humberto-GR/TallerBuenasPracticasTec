package com.example.tallerbuenaspracticastec

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tallerbuenaspracticastec.presentacion.MainContent
import com.example.tallerbuenaspracticastec.ui.theme.TallerBuenasPracticasTecTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerBuenasPracticasTecTheme {
                MainContent()

            }
        }
    }
}