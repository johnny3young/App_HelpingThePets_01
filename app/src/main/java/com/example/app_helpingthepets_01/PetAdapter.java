package com.example.app_helpingthepets_01;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.ViewHolder> {

    List<Pet> pets;
    Context context;

    //Creamos el constructor
    public PetAdapter (Context context, List<Pet> pets) {
        this.context = context;
        this.pets = pets;
    }

    @NonNull
    @Override
    public PetAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pet_layout,viewGroup,false);
        RecyclerView.ViewHolder viewHolder = new ViewHolder(view);
        return (ViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtViewName.setText(pets.get(i).name); //Para STRING
        viewHolder.txtViewBreed.setText(pets.get(i).breed); //Para STRING
        viewHolder.txtViewAge.setText(String.valueOf(pets.get(i).age)); //Para INT
        viewHolder.txtViewState.setText(pets.get(i).color); //Para STRING
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardViewPet;
        ImageView imageView;
        TextView txtViewName, txtViewBreed, txtViewAge, txtViewState;

        public ViewHolder(View view) {
            super(view);

            cardViewPet = view.findViewById(R.id.cardViewPet);
            imageView = view.findViewById(R.id.imageView);
            txtViewName = view.findViewById(R.id.txtViewName);
            txtViewBreed = view.findViewById(R.id.txtViewBreed);
            txtViewAge = view.findViewById(R.id.imageView);
            txtViewState = view.findViewById(R.id.txtViewState);

        }
    }
}
