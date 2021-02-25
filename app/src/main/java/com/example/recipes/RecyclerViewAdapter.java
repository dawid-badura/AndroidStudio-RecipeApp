package com.example.recipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//Klasa ktora przechowuje dane, odpowiada za ich prezentowanie na poszczegolnych aktywnosciach w postaci listy dla ktorej kazdy element bedzie wysiwetlany jako popularny cardview, utworzony zostal layout do kazdego wyswietlanego obiektu z listy
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context mContext;
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview,parent,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyHolder holder, final int position) {
        holder.recipeTitle.setText(mData.get(position).getRecipeName());
        holder.recipeImg.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipeActivity.class);

                intent.putExtra("RecipeName",mData.get(position).getRecipeName());
                intent.putExtra("RecipeIngredients",mData.get(position).getRecipeIngredients());
                intent.putExtra("RecipeMethodTitle",mData.get(position).getRecipeMethodTitle());
                intent.putExtra("Recipe",mData.get(position).getRecipe());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder{
        TextView recipeTitle;
        CardView cardView;
        ImageView recipeImg;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = (TextView)itemView.findViewById(R.id.recipe_text);
            recipeImg = (ImageView)itemView.findViewById(R.id.recipe_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);
        }
    }
}
