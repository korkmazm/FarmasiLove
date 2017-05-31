package com.korkmazm.farmasirehberi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setIcon(R.drawable.logolips);
        getSupportActionBar().setTitle("Hoş Geldiniz");
        //getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.side_nav_bar));
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intentKayitOl = new Intent(MainActivity.this, ScrollingActivity.class);
                intentKayitOl.putExtra("URL",
                        "file:///android_asset/farmasiuyelik.html");
                intentKayitOl.putExtra("Title",
                        "Farmasi Kayıt");
                startActivity(intentKayitOl);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setStatusBarTranslucent(true);

        Button btnKatalog = (Button) findViewById(R.id.btn_katalog);
        btnKatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(MainActivity.this, KatalogActivity.class);
                startActivity(intentDetail);
            }
        });

        Button btnSistem= (Button)findViewById(R.id.btn_sistem);
        btnSistem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDetail = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intentDetail);
            }
        });


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_uyeol) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            intent.putExtra("URL", "file:///android_asset/farmasiuyelik.html");
            intent.putExtra("Title", "Farmasi Kayıt");
            startActivity(intent);
        } else if (id == R.id.nav_hakkimizda) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            intent.putExtra("URL", "http://www.bitkiselim.com/hikayemiz");
            intent.putExtra("Title", "Hikayemiz");
            startActivity(intent);
        } else if (id == R.id.nav_networkmarketing) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            intent.putExtra("URL", "http://www.bitkiselim.com/network-marketing");
            intent.putExtra("Title", "Network Marketing");
            startActivity(intent);
        } else if (id == R.id.nav_sss) {
            Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
            intent.putExtra("URL", "http://www.bitkiselim.com/sikca-sorulan-sorular");
            intent.putExtra("Title", "Sıkça Sorulan Sorular");
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.korkmazm.farmasirehberi");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);
        } else if (id == R.id.nav_site) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.farmasilove.com/"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_facebook) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/Farmasilove-147167725732527/"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_instagram) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/farmasi_love/"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_twitter) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/farmasi_love"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_googleplus) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/111306979844784160358"));
            startActivity(browserIntent);
        } else if (id == R.id.nav_youtube) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/channel/UCY4zrzHKm-SSHFNPyoVX6mQ"));
            startActivity(browserIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    protected void setStatusBarTranslucent(boolean makeTranslucent) {
        if (makeTranslucent) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
}
