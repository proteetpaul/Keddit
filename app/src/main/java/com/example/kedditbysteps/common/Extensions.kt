package com.example.kedditbysteps.common

import android.content.Context
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.kedditbysteps.R
import com.squareup.picasso.Picasso

fun ViewGroup.inflate(layoutId: Int, attachRoot: Boolean = false): View {
    val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    return layoutInflater.inflate(layoutId, this, attachRoot)
}

fun ImageView.loadImage(imageUrl: String?) {
    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.get().load(R.mipmap.ic_launcher).into(this)
    }
    else {
        Picasso.get().load(imageUrl).into(this)
    }
}