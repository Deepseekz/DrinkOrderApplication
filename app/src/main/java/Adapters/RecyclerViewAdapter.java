package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gestiondeboissons.R;

import java.util.List;

import Models.Drink;
import Models.Order;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<Drink> dataModelList;

    public RecyclerViewAdapter(List<Drink> dataModelList){
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_drinks, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position){
        holder.tvName.setText(dataModelList.get(position).get_nom());
        holder.tvPrice.setText(String.valueOf(dataModelList.get(position).get_prix());
        holder.tvSize.setText(String.valueOf(dataModelList.get(position).get_volumeCl());
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount(){
        return dataModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvSize;
        TextView tvPrice;
        ImageView ivDrink;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            ivDrink = itemView.findViewById(R.id.ivDrink);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvSize = itemView.findViewById(R.id.tvSize);
        }

    }
}
