package android.example.youtubequiz;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private AppBarConfiguration mAppBarConfiguration;
    private FrameLayout main_frame;
    private TextView drawer_Player_username, drawer_Player_Score;

    //Click listener for the bottom navigation bar. Each button opens a new fragment that replaces the main_frame
    //TODO mettre listener dans une interface? Regarder comment faire
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch(item.getItemId()){
                case R.id.home_navigation:
                    setFragment(new HomePageFragment());
                    return true;
                case R.id.leaderboard_navigation:
                     setFragment(new LeaderboardFragment());
                    return true;
                case R.id.account_navigation:
                    setFragment(new AccountFragment());
                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bottomNavigationView = findViewById(R.id.Bottom_navigation);
        main_frame = findViewById(R.id.main_frame);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_leaderboard, R.id.nav_account)
                .setDrawerLayout(drawer)
                .build();

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (this,
                        drawer,
                        toolbar,
                        R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close
                ){};
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        drawer_Player_username = navigationView.getHeaderView(0).findViewById(R.id.nav_drawer_username);
        drawer_Player_Score = navigationView.getHeaderView(0).findViewById(R.id.nav_drawer_rank);
        String username = FirebaseQuery.player.getUsername();
        drawer_Player_username.setText(username);

        FirebaseQuery.getPlayerData(new CustomCompleteListener() {
            @Override
            public void onSucess() {
                String player_score = String.valueOf(FirebaseQuery.player.getPlayerScore());
                drawer_Player_Score.setText( player_score + " points");
            }
            @Override
            public void onFailure() {

            }
        });

        //Menu Drawer listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        setFragment(new HomePageFragment());
                        drawer.closeDrawers();
                        return true;
                    case R.id.nav_leaderboard:
                        setFragment(new LeaderboardFragment());
                        drawer.closeDrawers();
                        return true;
                    case R.id.nav_account:
                        setFragment(new AccountFragment());
                        drawer.closeDrawers();
                        return true;
                }
                return false;
            }
        });
        setFragment(new HomePageFragment());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    private void setFragment(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(main_frame.getId(),fragment);
        transaction.commit();

    }

}