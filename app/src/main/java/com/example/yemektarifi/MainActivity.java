package com.example.yemektarifi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<YemekTarif> yemekTarifArrayList;
    ArrayList<Baslik> baslikArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yemekTarifArrayList = new ArrayList<>();
        yemekTarifArrayList.add(new YemekTarif("Mercimek çorbası, ana malzemesi mercimek olan bir çorbadır; vejetaryen olabilir veya et içerebilir ve kabuklu veya kabuksuz kahverengi, kırmızı, sarı, yeşil veya siyah mercimek kullanabilir. Kabuğu ayıklanmış sarı ve kırmızı mercimekler pişerken parçalanarak koyu bir çorba olur." ));
        yemekTarifArrayList.add(new YemekTarif("Margarita pizza, domates, mozarella, fesleğen, zeytinyağı ve tuzla yapılan Napoli pizzasıdır."));
        yemekTarifArrayList.add(new YemekTarif(  "Fettuccine, İtalyan mutfağında popüler olan bir makarna türüdür. Geleneksel olarak yumurta ve undan yapılan düz, kalın bir makarnadır. Yaklaşık 6.4 milimetre kalınlığındadır. "));
        yemekTarifArrayList.add(new YemekTarif("cafe'de paris sos,bonfile dilimleri, eşsiz köftesi ile sunulur"));
        yemekTarifArrayList.add(new YemekTarif(  "Yanında kaymak ile servis edilir"));

        baslikArrayList = new ArrayList<>();
        baslikArrayList.add(new Baslik("Mercimek Çorbası"));
        baslikArrayList.add(new Baslik("Margarita Pizza"));
        baslikArrayList.add(new Baslik("Fettucine Alfredo"));
        baslikArrayList.add(new Baslik("Orhan Köfte"));
        baslikArrayList.add(new Baslik("Kabak Tatlısı"));



        YemekTarifAdapter yemekTarifAdapter = new YemekTarifAdapter(baslikArrayList,yemekTarifArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(yemekTarifAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}