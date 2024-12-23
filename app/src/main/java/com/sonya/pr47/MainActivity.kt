package com.sonya.pr47

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sonya.pr47.ui.theme.PR47Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomTooltipExample()
        }
    }
}



@Composable
fun CustomTooltipExample() {
    var showTooltip by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
    Box(modifier = Modifier.fillMaxWidth().clickable { showTooltip = !showTooltip }) {
        Text("Нажми на меня", modifier = Modifier.padding(16.dp))

        Spacer(modifier = Modifier.height(26.dp))

        if (showTooltip) {
            Box(
                modifier = Modifier
                    .background(Color.Gray)
                    .padding(26.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Вы нажали", color = Color.White)
            }
        }
    }
}
}