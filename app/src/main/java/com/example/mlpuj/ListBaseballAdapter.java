package com.example.mlpuj;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListBaseballAdapter extends RecyclerView.Adapter<ListBaseballAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Baseball> listBaseball;

    public ListBaseballAdapter(Context mContext, ArrayList<Baseball> list) {
        this.mContext = mContext;
        this.listBaseball = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_japan, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Baseball baseball = listBaseball.get(position);
        holder.tv_nama_team.setText(baseball.getTeam());
        holder.tv_desk_team.setText(baseball.getDetail());
        holder.img_team.setImageResource(baseball.getLogo());
        holder.img_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,BaseballActivity.class);
                intent.putExtra("Team",listBaseball.get(position).getTeam());
                intent.putExtra("Deskripsi",listBaseball.get(position).getDetail());
                intent.putExtra("Deskripsi2",listBaseball.get(position).getDetail2());
                intent.putExtra("Logo",listBaseball.get(position).getLogo());
                intent.putExtra("Manager",listBaseball.get(position).getManager());

                //Catcher
                intent.putExtra("NoCatcher",listBaseball.get(position).getNocatcher());
                intent.putExtra("NCatcher",listBaseball.get(position).getNcatcher());
                intent.putExtra("LCatcher",listBaseball.get(position).getLcatcher());
                intent.putExtra("GCatcher",listBaseball.get(position).getGcatcher());
                intent.putExtra("ECatcher",listBaseball.get(position).getEcatcher());
                intent.putExtra("TCatcher",listBaseball.get(position).getTcatcher());
                intent.putExtra("BCatcher",listBaseball.get(position).getBcatcher());

                //Pitcher
                intent.putExtra("NoPitcher",listBaseball.get(position).getNopitcher());
                intent.putExtra("NPitcher",listBaseball.get(position).getNpitcher());
                intent.putExtra("LPitcher",listBaseball.get(position).getLpitcher());
                intent.putExtra("GPitcher",listBaseball.get(position).getGpitcher());
                intent.putExtra("EPitcher",listBaseball.get(position).getEpitcher());
                intent.putExtra("TPitcher",listBaseball.get(position).getTpitcher());
                intent.putExtra("BPitcher",listBaseball.get(position).getBpitcher());

                //Infielder
                intent.putExtra("NoInfielder",listBaseball.get(position).getNoinfielder());
                intent.putExtra("NInfielder",listBaseball.get(position).getNinfielder());
                intent.putExtra("LInfielder",listBaseball.get(position).getLinfielder());
                intent.putExtra("GInfielder",listBaseball.get(position).getGinfielder());
                intent.putExtra("EInfielder",listBaseball.get(position).getEinfielder());
                intent.putExtra("TInfielder",listBaseball.get(position).getTinfielder());
                intent.putExtra("BInfielder",listBaseball.get(position).getBinfielder());
                //Outfielder
                intent.putExtra("NoOutfielder",listBaseball.get(position).getNooutfielder());
                intent.putExtra("NOutfielder",listBaseball.get(position).getNoutfielder());
                intent.putExtra("LOutfielder",listBaseball.get(position).getLoutfielder());
                intent.putExtra("GOutfielder",listBaseball.get(position).getGoutfielder());
                intent.putExtra("EOutfielder",listBaseball.get(position).getEoutfielder());
                intent.putExtra("TOutfielder",listBaseball.get(position).getToutfielder());
                intent.putExtra("BOutfielder",listBaseball.get(position).getBoutfielder());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBaseball.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama_team, tv_desk_team;
        ImageView img_team;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama_team = itemView.findViewById(R.id.tv_item_name);
            tv_desk_team = itemView.findViewById(R.id.tv_item_detail);
            img_team = itemView.findViewById(R.id.img_logo);
        }
    }
}
