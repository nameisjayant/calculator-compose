package com.nameisjayant.calculatorcompose.feature.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource


@Composable
fun IconComponent(
    modifier: Modifier = Modifier,
    @DrawableRes icon: Int? = null,
    imageVector: ImageVector? = null,
    tint: Color = Color.Unspecified
) {

    imageVector?.let {
        Icon(imageVector = it, contentDescription = null, modifier, tint)
    }
    icon?.let {
        Icon(painter = painterResource(id = it), contentDescription = null, modifier, tint)
    }

}