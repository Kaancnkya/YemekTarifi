package com.example.yemektarifi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class YemekTarifAdapter extends RecyclerView.Adapter<YemekTarifViewHolder> {

    private ArrayList<YemekTarif> yemekTarifArrayList;
    private ArrayList<Baslik> baslikArrayList;

    public YemekTarifAdapter( ArrayList<Baslik> baslikArrayList,ArrayList<YemekTarif> yemekTarifArrayList) {
        this.yemekTarifArrayList = yemekTarifArrayList;
        this.baslikArrayList = baslikArrayList;
    }

    @NonNull
    @Override
    public YemekTarifViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new YemekTarifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YemekTarifViewHolder holder, int position) {
        TextView textViewBaslik = holder.getBaslikText();
        TextView textView = holder.getContentText();
        String textBaslik = baslikArrayList.get(position).getBaslikText();
        String text = yemekTarifArrayList.get(position).getContentText();
        textViewBaslik.setText(textBaslik);
        textView.setText(text);
    }

    @Override
    public int getItemCount() {
        return yemekTarifArrayList.size();
    }
}

class YemekTarifViewHolder extends RecyclerView.ViewHolder{
    private TextView baslikText;
    private TextView contentText;
    public YemekTarifViewHolder(@NonNull View itemView) {
        super(itemView);
        baslikText = itemView.findViewById(R.id.textView_baslik);
        contentText = itemView.findViewById(R.id.textView_content);
    }

    public TextView getBaslikText() {
        return baslikText;
    }
    public void setBaslikText(TextView baslikText) {
        this.baslikText = baslikText;
    }

    public TextView getContentText() {
        return contentText;
    }

    public void setContentText(TextView contentText) {
        this.contentText = contentText;
    }
}