package Listeners;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import Interfaces.RecyclerViewClickListener;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {
    private GestureDetector _gestureDetector;
    private RecyclerViewClickListener clickListener;

    public  RecyclerTouchListener(Context context, final RecyclerView recyclerView, final RecyclerViewClickListener clickListener){
        this.clickListener = clickListener;
        _gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener()){
            @Override
            public boolean onSingleTapUp(MotionEvent e){
                return true;
            }
        });
    }
    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e){
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        if(child != null && clickListener != null && _gestureDetector.onTouchEvent(e)){
            clickListener.onClick(child, rv.getChildAdapterPosition(child));
        }
        return false;
    }
    @Override
    public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e){
    }
    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept){
    }
}
