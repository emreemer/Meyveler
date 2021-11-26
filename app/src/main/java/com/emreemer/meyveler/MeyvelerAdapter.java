package com.emreemer.meyveler;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.emreemer.meyveler.databinding.RecyclerRowBinding;

import java.io.Serializable;
import java.util.ArrayList;

public class MeyvelerAdapter extends RecyclerView.Adapter<MeyvelerAdapter.MeyvelerHolder> {

    ArrayList<Meyveler> meyvelerArrayList;

    public MeyvelerAdapter(ArrayList<Meyveler> meyvelerArrayList) {
        this.meyvelerArrayList = meyvelerArrayList;
    }

    @NonNull
    @Override
    public MeyvelerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MeyvelerHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull MeyvelerHolder holder, int position) {
        int myPosition = holder.getAdapterPosition();
        holder.binding.recyclerViewTextView.setText(meyvelerArrayList.get(myPosition ).name);
        holder.binding.recyclerViewImageView.setImageResource(meyvelerArrayList.get(myPosition).image);
        holder.binding.recyclerViewTextView2.setText(meyvelerArrayList.get(myPosition).calori);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("meyveler" , (Serializable) meyvelerArrayList.get(myPosition));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return meyvelerArrayList.size();
    }

    public class MeyvelerHolder extends RecyclerView.ViewHolder {

        public int getAdapterPosition;
        private RecyclerRowBinding binding;


        public MeyvelerHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
