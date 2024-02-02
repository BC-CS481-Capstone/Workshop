package com.example.workshop

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workshop.ui.theme.WorkshopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkshopTheme {
                   AboutMe()
                }
            }
        }
    }

@Preview
@Composable
fun AboutMe() {

    LazyColumn(  // Allows the content to be  scrollable
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(16.dp),
    ){

        item { Title() }
        item { ProfilePic() }
        item { SelfDescription() }
        item { YourButton()}

    }

}

@Composable
fun Title() {

        Text(
            text = "Example",
            style = TextStyle(
                color = Color.White, // Text color
                fontSize = 20.sp, // Text size
                fontWeight = FontWeight.SemiBold, // Font weight
                textAlign = TextAlign.Center // Text alignment

            )
        )
    Spacer(modifier = Modifier.height(16.dp))  // adjust spacing
}
@Composable
fun ProfilePic() {

        Image(
            painter = painterResource(id = R.drawable.brutus), // Replace with your image
            contentDescription = "Profile picture",
            modifier = Modifier
                .size(100.dp) // Set the size of the image
                .clip(CircleShape) // Clip the image to a circle
                .border(2.dp, Color.Gray, CircleShape) // Add a border
                .padding(10.dp) // Add padding around the image
                .background(Color.LightGray) // Set a background color, good for pngs
                .shadow(10.dp, CircleShape) // Add a shadow effect
        )
    Spacer(modifier = Modifier.height(16.dp))  // adjust spacing
}

@Composable
fun SelfDescription() {

    Text(
        text ="Talk about yourself here"
    ) // Add in your own text about you
}

@Composable
fun YourButton() {
    val showCard = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { showCard.value = !showCard.value })
        {

            Text("Toggle Card")
        }

        // Show the card if the state is true
        if (showCard.value) {
            YourCard(onClose = { showCard.value = false })
        }
    }
}

    @Composable
    fun YourCard(onClose: () -> Unit) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(30.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Cyan),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Card Title")
                Text(text = "Card Content")
                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onClose
                ) {
                    Text("Close")
                }
            }
        }
    }
