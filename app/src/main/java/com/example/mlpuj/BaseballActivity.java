package com.example.mlpuj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BaseballActivity extends AppCompatActivity {

    private TextView judul,detail,detail2, tv_manager;
    private ImageView logo;

    private TextView tv_no_catcher,tv_n_catcher,tv_tgl_catcher,tv_berat_catcher,tv_tinggi_catcher,tv_t_cathcer,tv_b_catcher;
    private TextView tv_no_pitcher,tv_n_pitcher,tv_tgl_pitcher,tv_berat_pitcher,tv_tinggi_pitcher,tv_t_pitcher,tv_b_pitcher;
    private TextView tv_no_infielder,tv_n_infielder,tv_tgl_infielder,tv_berat_infielder,tv_tinggi_infielder,tv_t_infielder,tv_b_infielder;
    private TextView tv_no_outfielder,tv_n_outfielder,tv_tgl_outfielder,tv_berat_outfielder,tv_tinggi_outfielder,tv_t_outfielder,tv_b_outfielder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);

        judul = findViewById(R.id.teams);
        detail = findViewById(R.id.desk);
        detail2 = findViewById(R.id.desk2);
        logo = findViewById(R.id.logos);
        tv_manager = findViewById(R.id.manager);

        //catcher
        tv_no_catcher = findViewById(R.id.no_catcher);
        tv_n_catcher = findViewById(R.id.nama_catcher);
        tv_tgl_catcher = findViewById(R.id.tgl_catcher);
        tv_berat_catcher = findViewById(R.id.berat_catcher);
        tv_tinggi_catcher = findViewById(R.id.tinggi_cathcer);
        tv_t_cathcer = findViewById(R.id.t_catcher);
        tv_b_catcher = findViewById(R.id.b_catcher);

        //pitcher
        tv_no_pitcher = findViewById(R.id.no_pitcher);
        tv_n_pitcher = findViewById(R.id.nama_pitcher);
        tv_tgl_pitcher = findViewById(R.id.tgl_pitcher);
        tv_berat_pitcher = findViewById(R.id.berat_pitcher);
        tv_tinggi_pitcher = findViewById(R.id.tinggi_pitcher);
        tv_t_pitcher = findViewById(R.id.t_pitcher);
        tv_b_pitcher = findViewById(R.id.b_pitcher);

        //infielder
        tv_no_infielder = findViewById(R.id.no_infielder);
        tv_n_infielder = findViewById(R.id.nama_infielder);
        tv_tgl_infielder = findViewById(R.id.tgl_infielder);
        tv_berat_infielder = findViewById(R.id.berat_infielder);
        tv_tinggi_infielder = findViewById(R.id.tinggi_infielder);
        tv_t_infielder = findViewById(R.id.t_infielder);
        tv_b_infielder = findViewById(R.id.b_infielder);

        //outfielder
        tv_no_outfielder = findViewById(R.id.no_outfielder);
        tv_n_outfielder = findViewById(R.id.nama_outfielder);
        tv_tgl_outfielder = findViewById(R.id.tgl_outfielder);
        tv_berat_outfielder = findViewById(R.id.berat_outfielder);
        tv_tinggi_outfielder = findViewById(R.id.tinggi_outfielder);
        tv_t_outfielder = findViewById(R.id.t_outfielder);
        tv_b_outfielder = findViewById(R.id.b_outfielder);

        //Intent Data
        Intent intent = getIntent();
        String Team = intent.getExtras().getString("Team");

        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Team "+Team);
        }

        String Info = intent.getExtras().getString("Deskripsi");
        String Info2 = intent.getExtras().getString("Deskripsi2");
        int Logo = intent.getExtras().getInt("Logo");
        String Manager = intent.getExtras().getString("Manager");

        //catcher
        String NoCatcher = intent.getExtras().getString("NoCatcher");
        String NCatcher = intent.getExtras().getString("NCatcher");
        String LCatcher = intent.getExtras().getString("LCatcher");
        String GCathcer = intent.getExtras().getString("GCatcher");
        String ECathcer = intent.getExtras().getString("ECatcher");
        String TCatcher = intent.getExtras().getString("TCatcher");
        String BCatcher = intent.getExtras().getString("BCatcher");

        //Pitcher
        String NoPitcher = intent.getExtras().getString("NoPitcher");
        String NPitcher = intent.getExtras().getString("NPitcher");
        String LPitcher = intent.getExtras().getString("LPitcher");
        String GPitcher = intent.getExtras().getString("GPitcher");
        String EPitcher = intent.getExtras().getString("EPitcher");
        String TPitcher = intent.getExtras().getString("TPitcher");
        String BPitcher = intent.getExtras().getString("BPitcher");

        //Infielder
        String NoInfielder = intent.getExtras().getString("NoInfielder");
        String NInfielder = intent.getExtras().getString("NInfielder");
        String LInfielder = intent.getExtras().getString("LInfielder");
        String GInfielder = intent.getExtras().getString("GInfielder");
        String EInfielder = intent.getExtras().getString("EInfielder");
        String TInfielder = intent.getExtras().getString("TInfielder");
        String BInfielder = intent.getExtras().getString("BInfielder");

        //Outfielder
        String NoOutfielder = intent.getExtras().getString("NoOutfielder");
        String NOutfielder = intent.getExtras().getString("NOutfielder");
        String LOutfielder = intent.getExtras().getString("LOutfielder");
        String GOutfielder = intent.getExtras().getString("GOutfielder");
        String EOutfielder = intent.getExtras().getString("EOutfielder");
        String TOutfielder = intent.getExtras().getString("TOutfielder");
        String BOutfielder = intent.getExtras().getString("BOutfielder");

        logo.setImageResource(Logo);
        judul.setText(Team);
        detail.setText(Info);
        detail2.setText(Info2);
        tv_manager.setText(Manager);

        //catcher
        tv_no_catcher.setText(NoCatcher);
        tv_n_catcher.setText(NCatcher);
        tv_tgl_catcher.setText(LCatcher);
        tv_tinggi_catcher.setText(GCathcer);
        tv_berat_catcher.setText(ECathcer);
        tv_t_cathcer.setText(TCatcher);
        tv_b_catcher.setText(BCatcher);

        //Pitcher
        tv_no_pitcher.setText(NoPitcher);
        tv_n_pitcher.setText(NPitcher);
        tv_tgl_pitcher.setText(LPitcher);
        tv_berat_pitcher.setText(EPitcher);
        tv_tinggi_pitcher.setText(GPitcher);
        tv_t_pitcher.setText(TPitcher);
        tv_b_pitcher.setText(BPitcher);

        //Infielder
        tv_no_infielder.setText(NoInfielder);
        tv_n_infielder.setText(NInfielder);
        tv_tgl_infielder.setText(LInfielder);
        tv_berat_infielder.setText(EInfielder);
        tv_tinggi_infielder.setText(GInfielder);
        tv_t_infielder.setText(TInfielder);
        tv_b_infielder.setText(BInfielder);

        //Outfielder
        tv_no_outfielder.setText(NoOutfielder);
        tv_n_outfielder.setText(NOutfielder);
        tv_tgl_outfielder.setText(LOutfielder);
        tv_berat_outfielder.setText(EOutfielder);
        tv_tinggi_outfielder.setText(GOutfielder);
        tv_t_outfielder.setText(TOutfielder);
        tv_b_outfielder.setText(BOutfielder);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
