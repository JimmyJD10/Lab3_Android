package com.example.bienvenidoalcurso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BienvenidoAlCursoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Aquí se llama a la función BusinessCard para mostrar la tarjeta de Jennifer Doe
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDDEAD3)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Jennifer Doe",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 18.sp,
            color = Color(0xFF008C00),
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        ContactInfo(iconRes = R.drawable.telefono, info = "+11 (123) 444 555 666")
        Spacer(modifier = Modifier.height(16.dp))
        ContactInfo(iconRes = R.drawable.share, info = "@AndroidDev")
        Spacer(modifier = Modifier.height(16.dp))
        ContactInfo(iconRes = R.drawable.menzaje, info = "jen.doe@android.com")
    }
}

@Composable
fun ContactInfo(iconRes: Int, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = info, fontSize = 18.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BienvenidoAlCursoTheme {
        BusinessCard()
    }
}
