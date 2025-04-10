package com.example.tallerbuenaspracticastec.presentacion

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tallerbuenaspracticastec.ui.theme.TallerBuenasPracticasTecTheme

@Composable
fun MainContent() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            MainTitle(
                modifier = Modifier.padding(innerPadding)
            )

            Button(
                modifier = Modifier,

                onClick = {
                    Log.d("HumbertoTest", "El borton se esta haciendo Clic")
                }
            ) {
                Text("Humberto")
            }
        }
    }
}

@Composable
private fun MainTitle(modifier: Modifier = Modifier) {
    Text(
        text = "Taller de seguridad y buenas prácticas en el desarrollo de software",
        modifier = modifier
            .padding(10.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun MainContentPreview() {
    TallerBuenasPracticasTecTheme {
        MainContent()
    }
}