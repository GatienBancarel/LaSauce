package com.gbancarel.lasauce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.ColumnScope.weight
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gbancarel.lasauce.ui.LaSauceTheme
import com.gbancarel.lasauce.ui.typography

class RulePage : AppCompatActivity() {
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
                        Row (
                                modifier = Modifier.weight(1f)
                        ) {
                            ButtonAddPlayer()
                            ButtonAddRule()
                        }
                        Row (
                                modifier = Modifier.weight(4f)
                        ) {

                        }
                        Row (
                                modifier = Modifier.weight(4f)
                        ) {

                        }
                        Row (
                                modifier = Modifier.weight(2f)
                        ) {
                            ButtonHomePage()
                            ButtonNextRule()
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun ButtonAddPlayer() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
                onClick = {},
                modifier = Modifier.fillMaxHeight()
        ) {
            Text(
                    text = "aJ",
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
    fun ButtonAddRule() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
                onClick = {},
                modifier = Modifier.fillMaxHeight()
        ) {
            Text(
                    text = "aR",
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
    fun ButtonNextRule() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
                onClick = {},
                modifier = Modifier.fillMaxHeight().weight(2f)
        ) {
            Text(
                    text = "-->",
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
    fun ButtonHomePage() {
        Spacer(modifier = Modifier.preferredHeight(20.dp))
        Button(
                onClick = {},
                modifier = Modifier.fillMaxHeight().weight(1f)
        ) {
            Text(
                    text = "Menu",
                    style = typography.h2.merge(
                            TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                            )
                    )
            )
        }
    }
}