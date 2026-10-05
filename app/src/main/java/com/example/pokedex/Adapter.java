package com.example.pokedex;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private ArrayList<Pokemon> list;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
        void onItemLongClick(int position);
    }

    public Adapter(ArrayList<Pokemon> list) {
        this.list = list;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pokemon, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtNome.setText(list.get(position).getNome());
        holder.textType.setText(list.get(position).getTipo());
        holder.textDescription.setText(list.get(position).getDescricao());

        Glide.with(holder.itemView)
                .load(list.get(position).getImagem())
                .placeholder(R.drawable.symbol)
                .error(R.drawable.symbol)
                .into(holder.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtNome;
        TextView textType;
        TextView textDescription;
        ImageView imgAvatar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNome = itemView.findViewById(R.id.txtNome);
            textType = itemView.findViewById(R.id.textType);
            textDescription = itemView.findViewById(R.id.textDescription);
            imgAvatar = itemView.findViewById(R.id.imgAvatar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getBindingAdapterPosition();

                    if (position == RecyclerView.NO_POSITION) {
                        return;
                    }

                    if (listener != null) {
                        listener.onItemClick(position);
                    }

                    Intent intent = new Intent(view.getContext(), Description.class);
                    intent.putExtra("Nome", list.get(position).getNome());
                    intent.putExtra("Tipo", list.get(position).getTipo());
                    intent.putExtra("Imagem", list.get(position).getImagem());
                    intent.putExtra("Descricao", list.get(position).getDescricao());
                    view.getContext().startActivity(intent);
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    int position = getBindingAdapterPosition();

                    if (position == RecyclerView.NO_POSITION) {
                        return false;
                    }

                    Pokemon pokemon = list.get(position);

                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

                    builder.setTitle("Excluir");
                    builder.setMessage("Você tem certeza que deseja excluir o Pokémon " + pokemon.getNome() + "?");

                    builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            int currentPosition = getBindingAdapterPosition();

                            if (currentPosition != RecyclerView.NO_POSITION) {
                                list.remove(currentPosition);
                                notifyItemRemoved(currentPosition);
                            }
                        }
                    });

                    builder.setNegativeButton("Não", null);
                    builder.show();

                    return true;
                }
            });
        }
    }
}