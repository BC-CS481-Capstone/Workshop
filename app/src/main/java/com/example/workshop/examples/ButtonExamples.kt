package com.example.workshop.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Buttons() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally, //Aligns to center vertically
            verticalArrangement = Arrangement.Center, //Centers horizontally

    ){


        Button(
            onClick = { /* TODO */ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue, // This changes the background color of the button
                contentColor = Color.White // This is for the text or icon color inside the button
            ),
            modifier = Modifier
                .size(width = 300.dp, height = 80.dp)
                .padding(16.dp)

        ) {
            Text(text = "Click here")
        }



        Spacer(modifier = Modifier.height(16.dp))  // Adds space between buttons




        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
            ) {
                Text(text = "Submit")
        }


        Spacer(modifier = Modifier.height(32.dp))

        Row {

            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
            ) {
                Text(text = "Click here")
            }


            Spacer(modifier = Modifier.width(16.dp))  // Adds space between buttons


            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
            ) {
                Text(text = "Submit")
            }
        }
    }
}

