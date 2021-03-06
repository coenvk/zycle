package com.coenvk.android.zycle.eventhook.drag

import android.view.DragEvent
import androidx.recyclerview.widget.RecyclerView
import com.coenvk.android.zycle.eventhook.EventHook

abstract class DragEvent<E : Any, VH : RecyclerView.ViewHolder> : EventHook<E, VH>() {

    abstract fun onDrag(holder: VH, item: E, position: Int, e: DragEvent): Boolean

    final override fun attach(holder: VH, item: E, position: Int) {
        holder.itemView.setOnDragListener { _, e -> onDrag(holder, item, position, e) }
    }

}