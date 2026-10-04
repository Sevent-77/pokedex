package com.example.pokedex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter
        extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private final ArrayList<Pokemon> list;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);

        void onItemLongClick(int position);
    }

    public Adapter(ArrayList<Pokemon> list) {
        this.list = list;
    }

    public void setOnItemClickListener(
            OnItemClickListener listener
    ) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType
    ) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(
                        R.layout.item_pokemon,
                        parent,
                        false
                );

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(
            @NonNull MyViewHolder holder,
            int position
    ) {
        Pokemon pokemon = list.get(position);

        holder.txtNome.setText(pokemon.getNome());
        holder.textType.setText(pokemon.getTipo());
        holder.textDescription.setText(
                pokemon.getDescricao()
        );

        Glide.with(holder.itemView)
                .load(pokemon.getImagem())
                .placeholder(R.drawable.symbol)
                .error(R.drawable.symbol)
                .into(holder.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView txtNome;
        final TextView textType;
        final TextView textDescription;
        final ImageView imgAvatar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(
                    R.id.txtNome
            );

            textType = itemView.findViewById(
                    R.id.textType
            );

            textDescription = itemView.findViewById(
                    R.id.textDescription
            );

            imgAvatar = itemView.findViewById(
                    R.id.imgAvatar
            );

            itemView.setOnClickListener(view -> {
                if (listener == null) {
                    return;
                }

                int position =
                        getBindingAdapterPosition();

                if (position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position);
                }
            });

            itemView.setOnLongClickListener(view -> {
                if (listener == null) {
                    return false;
                }

                int position =
                        getBindingAdapterPosition();

                if (position == RecyclerView.NO_POSITION) {
                    return false;
                }

                listener.onItemLongClick(position);
                return true;
            });
        }
    }
}