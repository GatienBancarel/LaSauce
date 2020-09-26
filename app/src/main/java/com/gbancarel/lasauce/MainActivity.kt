package com.gbancarel.lasauce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.gbancarel.lasauce.ui.LaSauceTheme
import com.gbancarel.lasauce.ui.typography
import androidx.compose.ui.text.font.Font as Font

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaSauceTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalGravity = Alignment.CenterHorizontally
                    ) {
                        Logo()
                        ButtonPlayer()
                        ButtonNewGame()
                    }
                }
            }
        }
    }

    @Composable
    fun Logo() {

    }

    @Composable
    fun ButtonPlayer() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
            onClick = {},
            modifier = Modifier.preferredWidth(250.dp).preferredHeight(75.dp)
        ) {
            Text(
                text = "Ajouter des joueurs",
                style = typography.h2.merge(
                    TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            )
        }
    }

    @Composable
    fun ButtonNewGame() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
            onClick = {},
            modifier = Modifier.preferredWidth(250.dp).preferredHeight(100.dp)
        ) {
            Text(
                text = "C'est parti",
                style = typography.h2.merge(
                    TextStyle(
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            )
        }
    }
}

