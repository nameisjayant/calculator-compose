package com.nameisjayant.calculatorcompose.feature.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ButtonsComponent(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int? = null,
    text: String? = null,
    onClick: () -> Unit
) {

    Button(modifier = modifier, onClick = onClick, shape = CircleShape) {
        icon?.let {
            IconComponent(icon = it)
        }
        text?.let {
            Text(text = it)
        }
    }

}