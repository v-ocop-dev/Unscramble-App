package com.example.unscramble

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.unscramble.ui.theme.UnscrambleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            UnscrambleTheme {
                GameScreen()
            }
        }
    }
}

@Composable
fun GameScreen() {

    // Phase 2: Store the user's answer
    var userAnswer by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Game title
        Text(
            text = "UNSCRAMBLE",
            fontSize = 30.sp
        )

        // Scrambled word
        Text(
            text = "TAC",
            fontSize = 40.sp
        )

        // Instruction
        Text(
            text = "Unscramble the word!"
        )

        // User input
        OutlinedTextField(
            value = userAnswer,
            onValueChange = {
                userAnswer = it
            },
            label = {
                Text("Enter your answer")
            }
        )

        // Submit button
        // This will be functional in Phase 3
        Button(
            onClick = { }
        ) {
            Text("SUBMIT")
        }

        // Score
        Text(
            text = "Score: 0"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    UnscrambleTheme {
        GameScreen()
    }
}