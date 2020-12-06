package com.example.finfun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import static com.example.finfun.ui.play.PlayFragment.bankBalance;
import static com.example.finfun.ui.play.PlayFragment.pocketBalance;

public class level11 extends AppCompatActivity implements View.OnClickListener{
    private Button feedback;
    EditText withdrawAmount, depositAmount;
    TextView pocket, bank;
    Button withdraw, deposit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level11);
        withdrawAmount = findViewById(R.id.withdrawAmount);
        depositAmount = findViewById(R.id.depositAmount);
        pocket = findViewById(R.id.pocket);
        bank = findViewById(R.id.bank);
        withdraw = findViewById(R.id.withdraw);
        deposit = findViewById(R.id.deposit);

        withdraw.setOnClickListener(v -> {
            int w,ans;
            w = Integer.parseInt(withdrawAmount.getText().toString());
            ans = pocketBalance+w;
            pocketBalance = ans;
            bankBalance = bankBalance-w;
            pocket.setText("Pocket Cash: $"+ pocketBalance);
            bank.setText("Bank Balance: $" + bankBalance );

        });
        deposit.setOnClickListener(v -> {
            int  d,ans;

            d = Integer.parseInt(depositAmount.getText().toString());
            ans = bankBalance+d;
            bankBalance = ans;
            pocketBalance = pocketBalance-d;
            pocket.setText("Pocket Cash: $"+ pocketBalance);
            bank.setText("Bank Balance: $" + bankBalance );

        });

       feedback = findViewById(R.id.feedback);
       feedback.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.feedback){
            Intent i = new Intent(v.getContext(), Feedback1.class);
            startActivity(i);
        }

    }
}