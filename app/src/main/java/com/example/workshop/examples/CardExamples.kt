package com.example.workshop.examples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun Cards() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                containerColor = Color.Blue
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            border = null
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Card Title")
                Text(text = "Card Content")
            }
        }




        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),

            shape = RoundedCornerShape(30.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Magenta
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            border = null
        ) {

                Column(
                    modifier = Modifier
                        .padding(16.dp),

                ) {
                    Text(text = "Card Title")
                    Text(text = "Card Content")

            }
        }
    }
}
