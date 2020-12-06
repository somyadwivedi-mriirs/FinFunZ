package com.example.finfun.ui.play;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.finfun.Infant;
import com.example.finfun.MainActivity;
import com.example.finfun.NewBorn;
import com.example.finfun.R;
import com.example.finfun.SplashActivity;

public class PlayFragment extends Fragment  implements View.OnClickListener {
    public static int pocketBalance = 10000;
    public static int bankBalance = 0;


    private PlayViewModel playViewModel;
    private CardView new_born,infant;
    private  TextView pocketcash;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        playViewModel =
//                new ViewModelProvider(this).get(PlayViewModel.class);
        View root = inflater.inflate(R.layout.fragment_play, container, false);
        new_born = (CardView) root.findViewById(R.id.new_born);
        new_born.setOnClickListener(this);
        infant = (CardView) root.findViewById(R.id.new_born);
        infant.setOnClickListener(this);
        pocketcash = (TextView) root.findViewById(R.id.pocketcash);
        pocketcash.setText("Pocket Cash $" + pocketBalance);
    return root;
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.new_born:
                i = new Intent(v.getContext(), NewBorn.class);
                startActivity(i);
                break;

            case R.id.infant:
                i = new Intent(v.getContext(), Infant.class);
                startActivity(i);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }

    }
}