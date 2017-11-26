package jp4r7.simplelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvUsr = findViewById(R.id.tvUsr);
        TextView tvEmail = findViewById(R.id.tvEmail);
        Button btnLogout = findViewById(R.id.btnLogout);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");


        // Display user details
        tvName.setText("Name : " + name);
        tvUsr.setText("Username : " + username);
        tvEmail.setText("E-Mail : " + email);


        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserAreaActivity.this, LoginActivity.class);
                UserAreaActivity.this.startActivity(intent);
            }
        });
    }
}
