package com.example.buildagrid.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class Topic (
    @StringRes val stringResource: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResources: Int
)