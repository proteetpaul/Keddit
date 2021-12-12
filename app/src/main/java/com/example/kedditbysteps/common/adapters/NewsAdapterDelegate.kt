package com.example.kedditbysteps.common.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kedditbysteps.R
import com.example.kedditbysteps.RedditNewsItem
import com.example.kedditbysteps.common.inflate
import com.example.kedditbysteps.common.loadImage
import com.example.kedditbysteps.getFriendlyTime
import kotlinx.android.synthetic.main.news_item.view.*

class NewsAdapterDelegate: AdapterDelegate {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }
    
    class TurnsViewHolder(parent: ViewGroup): RecyclerView.ViewHolder(parent.inflate(R.layout.news_item)) {
        fun bind(item: RedditNewsItem) {
            itemView.apply {
                image_thumbnail.loadImage((item.thumbnail))
                description.text = item.title
                author.text = item.author
                comments.text = "${item.numComments} comments"
                time.text = item.created.getFriendlyTime()
            }
        }
    }
}