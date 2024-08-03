package com.example.cardapp

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cardapp.ui.theme.CardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CardPractice(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun CardPractice(name: String, modifier: Modifier = Modifier) {
    Card(modifier = Modifier
        .fillMaxSize()
        .padding(50.dp)
    , elevation = CardDefaults.elevatedCardElevation()) {
        Column {
            ExtendedFloatingActionButton(
                onClick = {}) {
                Icon(Icons.Default.Face, contentDescription = "PFP")
                Text(text = "This is my card, i am $name")
            }
            Text(text = "Lorem Ipsum dolor sit amet, adispiscing ledum et all...")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CardAppTheme {
        CardPractice("Android")
    }
}