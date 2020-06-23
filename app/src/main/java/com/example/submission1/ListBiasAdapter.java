package com.example.submission1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListBiasAdapter extends RecyclerView.Adapter<ListBiasAdapter.ListViewHolder>{
    private ArrayList<Bias> listBias;

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListBiasAdapter(ArrayList<Bias> list){
        this.listBias = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Bias bias = listBias.get(position);
        Glide.with(holder.itemView.getContext())
             .load(bias.getPhoto())
             .apply(new RequestOptions().override(55,55))
             .into(holder.img);
        holder.nama.setText(bias.getName());
        holder.detail.setText(bias.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detail = new Intent(v.getContext(), Content.class);
                detail.putExtra(Content.imgImport, bias.getPhoto());
                detail.putExtra(Content.nameImport, bias.getName());
                detail.putExtra(Content.contentImport, bias.getDetail());
                detail.putExtra(Content.heightImport, bias.getHeight());
                detail.putExtra(Content.weightImport, bias.getWeight());
                detail.putExtra(Content.fullNameImport, bias.getFullName());
                detail.putExtra(Content.birthImport, bias.getBirth());
                v.getContext().startActivity(detail);

                Intent auth = new Intent(v.getContext(),Author.class);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBias.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView nama, detail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgList);
            nama = itemView.findViewById(R.id.nameList);
            detail = itemView.findViewById(R.id.detailList);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Bias data);
    }
}
