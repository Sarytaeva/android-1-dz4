package com.example.android_1_dz4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Model> arrayList = new ArrayList<>();
    private OnClick onClick;

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void listSize(ArrayList<Model> arrayList) {
        this.arrayList.addAll(arrayList);
        notifyDataSetChanged();
    }

    public void setList(ArrayList<Model> arrayList) {
        this.arrayList.addAll(arrayList);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
         imageView=itemView.findViewById(R.id.eurasia);
         textView=itemView.findViewById(R.id.textEurasia);
         textView2=itemView.findViewById(R.id.t1);
        }

        public void onBind(Model model) {
            imageView.setImageResource(model.getImg());
            textView.setText(model.getEurasia());
            textView2.setText(model.getKg());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onClick.onClick(model);
                }
            });
        }
    }
}
