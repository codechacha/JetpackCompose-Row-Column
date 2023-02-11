package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.ui.theme.TutorialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TutorialsTheme {
                MainUI()
            }
        }
    }
}

@Composable
fun MainUI() {
    Column {
        ArrangedRow()
        ArrangedColumn()
    }
}

@Composable
fun SimpleRow() {
    Row() {
        Text(text = "Row 1", Modifier.background(Color.Red))
        Text(text = "Row 2", Modifier.background(Color.Green))
        Text(text = "Row 3", Modifier.background(Color.Blue))
    }
}

@Composable
fun ArrangedRow() {
    Row(
        modifier = Modifier.fillMaxWidth().background(Color.Gray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Row 1", Modifier.background(Color.Red))
        Text(text = "Row 2", Modifier.background(Color.Green))
        Text(text = "Row 3", Modifier.background(Color.Blue))
    }
}

@Composable
fun SimpleColumn(){
    Column() {
        Text(text = "Column 1", Modifier.background(Color.Red))
        Text(text = "Column 2", Modifier.background(Color.Green))
        Text(text = "Column 3", Modifier.background(Color.Blue))
    }
}

@Composable
fun ArrangedColumn() {
    Column (
        modifier = Modifier.fillMaxWidth().fillMaxHeight().background(Color.LightGray),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.End)
    {
        Text(text = "Column 1", Modifier.background(Color.Red))
        Text(text = "Column 2", Modifier.background(Color.Green))
        Text(text = "Column 3", Modifier.background(Color.Blue))
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    TutorialsTheme {
        MainUI()
    }
}