package com.example.myapplication.page1

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class GridDecoration(private var spancount:Int,private var spacing:Int,private var includeEdge :Boolean) : RecyclerView.ItemDecoration() {


    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        var position :Int=parent.getChildAdapterPosition(view)    //item Position
        var column:Int=position%spancount
        if (includeEdge) {
            outRect.left =
                spacing - column * spacing / spancount // spacing - column * ((1f / spanCount) * spacing)
            outRect.right =
                (column + 1) * spacing / spancount  // (column + 1) * ((1f / spanCount) * spacing)

//            if (position < spancount) { // top edge
//                outRect.top = spacing
//            }
            outRect.bottom = spacing  //item Bottom
        }
        else{
            outRect.left = column * spacing / spancount // column * ((1f / spanCount) * spacing)
            outRect.right = spacing - (column + 1) * spacing / spancount // spacing - (column + 1) * ((1f /    spanCount) * spacing)
            if (position >= spancount) {
                outRect.top = spacing // item top
            }
        }
    }
}

