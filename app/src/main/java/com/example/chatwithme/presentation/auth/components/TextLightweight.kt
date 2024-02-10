package com.example.chatwithme.presentation.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatwithme.R
import com.example.chatwithme.ui.theme.spacing

@OptIn(ExperimentalTextApi::class)
@Composable
fun TextWithIcon(text:String = "Sky Chat") {



    Row() {
        val brush = Brush.horizontalGradient(
            colors = listOf(Color(0xFF0453AA), Color(0xFF0453AA))
        )
        Image(painter = painterResource(id = R.drawable.icskychat),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp),
            contentScale = ContentScale.FillBounds)
        Text(
            text = text,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF0453AA), Color(0xFF6CACF3), Color(0xFF06E7F8)
                )
            ), fontSize = 40.sp,
                fontWeight = FontWeight.SemiBold
            )
        )

    }


   /* Text(
        modifier = Modifier.padding(top = MaterialTheme.spacing.large),
        text = "Lightweight instant messaging",
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.SemiBold,
        color = MaterialTheme.colorScheme.outline
    )*/
}