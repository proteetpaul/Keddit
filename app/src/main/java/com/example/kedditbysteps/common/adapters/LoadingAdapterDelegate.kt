package com.example.kedditbysteps.common.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kedditbysteps.R
import com.example.kedditbysteps.common.inflate

class LoadingAdapterDelegate: AdapterDelegate {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return LoadingViewHolder(parent)
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }
    class LoadingViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(parent.inflate(R.layout.news_item_loading)){
    }

}