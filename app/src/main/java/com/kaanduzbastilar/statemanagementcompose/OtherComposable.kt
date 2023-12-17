package com.kaanduzbastilar.statemanagementcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherScreen(modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray) {
        Column(
            modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var myString = remember { mutableStateOf("Compose") }

            TextField(value = myString.value, onValueChange = {
                myString.value = it
                println(myString)
            })

            Spacer(modifier.padding(7.dp))

            var text = remember {
                mutableStateOf("Test!")
            }
            Text(text = text.value,
                fontSize = 26.sp
            )

            Spacer(modifier.padding(7.dp))

            Button(onClick = { text.value = "Degisti" }) {
                Text(text = "text")
                Text(text = "test")
            }
            Spacer(modifier.padding(7.dp))
            Image(bitmap = ImageBitmap.imageResource(R.drawable.eiffeltower), contentDescription = "eiffel")
            Spacer(modifier.padding(7.dp))
            Image(imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_background), contentDescription = null)
            Spacer(modifier.padding(7.dp))
            Image(painter = ColorPainter(Color.Cyan), contentDescription = null, modifier.size(20.dp, 20.dp))

        }
    }
}