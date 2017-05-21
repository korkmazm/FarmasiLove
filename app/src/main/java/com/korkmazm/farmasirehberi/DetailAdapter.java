package com.korkmazm.farmasirehberi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import static java.security.AccessController.getContext;

/**
 * Created by KorkmazM on 19/05/2017.
 */

class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

    private String[] mDataset;
    private Context mContext;
    private Random mRandom = new Random();

    public DetailAdapter(Context context, String[] dataSet) {
        mDataset = dataSet;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Create a new view
        View v = LayoutInflater.from(mContext).inflate(R.layout.custom_view, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mButton.setText(mDataset[position]);
        final int currentPossition = position;
        switch (currentPossition) {
            case 0://Farmasi Ürün Siparişi Nasıl Verilir
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_grouped_tasks, 0, 0);
                break;
            case 1://Farmasilove Sponsorluğu ile %30 Karlı Satış Nasıl Olur?
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_opportunity_cost, 0, 0);
                break;
            case 2://Farmasi Kazanç Sistemiyle Yıllık Kazancım Ne Olur?
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_feasability_study2, 0, 0);
                break;
            case 3://Farmasi İle Aylık %22 Prim Nasıl Kazanırım?
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_supplies, 0, 0);
                break;
            case 4://Farmasi'nin Bana Sağladığı Kazanımlar Nelerdir?
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_estimated_cost, 0, 0);
                break;
            case 5://Hediye ve Kampanyalardan Nasıl Faydalanırım?
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_vacation, 0, 0);
                break;
            default:
                holder.mButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                break;
        }

        holder.mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (currentPossition) {
                    case 0://Farmasi Ürün Siparişi Nasıl Verilir
                        Intent intent0 = new Intent(mContext, ScrollingActivity.class);
                        intent0.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent0.putExtra("URL", "http://www.bitkiselim.com/farmasi-urun-siparisi-nasil-verilir");
                        intent0.putExtra("Title", "Farmasi Ürün Siparişi Nasıl Verilir?");
                        mContext.startActivity(intent0);
                        break;
                    case 1://Farmasilove Sponsorluğu ile %30 Karlı Satış Nasıl Olur?
                        Intent intent1 = new Intent(mContext, ScrollingActivity.class);
                        intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent1.putExtra("URL", "http://www.bitkiselim.com/farmasilove-sponsorlugu-ile-0-karli-satis-nasil-olur");
                        intent1.putExtra("Title", "Farmasilove Sponsorluğu ile %30 Karlı Satış Nasıl Olur?");
                        mContext.startActivity(intent1);
                        break;
                    case 2://Farmasi Kazanç Sistemiyle Yıllık Kazancım Ne Olur?
                        Intent intent2 = new Intent(mContext, ScrollingActivity.class);
                        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent2.putExtra("URL", "http://www.bitkiselim.com/farmasi-kazanc-sistemiyle-yillik-kazancim-ne-olur");
                        intent2.putExtra("Title", "Farmasi Kazanç Sistemiyle Yıllık Kazancım Ne Olur?");
                        mContext.startActivity(intent2);
                        break;
                    case 3://Farmasi İle Aylık %22 Prim Nasıl Kazanırım?
                        Intent intent3 = new Intent(mContext, ScrollingActivity.class);
                        intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent3.putExtra("URL", "http://www.bitkiselim.com/farmasi-ile-aylik-prim-nasil-kazanirim");
                        intent3.putExtra("Title", "Farmasi İle Aylık %22 Prim Nasıl Kazanırım?");
                        mContext.startActivity(intent3);
                        break;
                    case 4://Farmasi'nin Bana Sağladığı Kazanımlar Nelerdir?
                        Intent intent4 = new Intent(mContext, ScrollingActivity.class);
                        intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent4.putExtra("URL", "http://www.bitkiselim.com/farmasinin-bana-sagladigi-kazanimlar-nelerdir");
                        intent4.putExtra("Title", "Farmasi'nin Bana Sağladığı Kazanımlar Nelerdir?");
                        mContext.startActivity(intent4);
                        break;
                    case 5://Hediye ve Kampanyalardan Nasıl Faydalanırım?
                        Intent intent5 = new Intent(mContext, ScrollingActivity.class);
                        intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        intent5.putExtra("URL", "http://www.bitkiselim.com/hediye-ve-kampanyalardan-nasil-faydalanirim");
                        intent5.putExtra("Title", "Hediye ve Kampanyalardan Nasıl Faydalanırım?");
                        mContext.startActivity(intent5);
                        break;
                    default:
                        break;
                }
            }
        });

        //holder.mButton.getLayoutParams().height = getRandomIntRange(200, 200);

        //holder.mButton.setBackgroundColor(getRandomHSVColor());
    }

    private int getRandomHSVColor() {

        int hue = mRandom.nextInt(361);
        float saturation = 1.0f;
        float value = 1.0f;
        int alpha = 255;

        int color = Color.HSVToColor(alpha, new float[]{hue, saturation, value});

        return color;

    }

    private int getRandomIntRange(int max, int min) {
        return mRandom.nextInt((max - min) + min) + min;
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public Button mButton;

        public ViewHolder(View v) {
            super(v);
            mButton = (Button) v.findViewById(R.id.buttondetail);
        }
    }
}
