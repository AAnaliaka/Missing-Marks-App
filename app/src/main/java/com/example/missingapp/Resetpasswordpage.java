package com.example.missingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Resetpasswordpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resetpasswordpage);
        
        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views
        TextView backBtn = findViewById(R.id.backBtn);
        TextView signupText = findViewById(R.id.signupText);
        ImageView facebookIcon = findViewById(R.id.facebookIcon);
        ImageView googleIcon = findViewById(R.id.googleIcon);
        ImageView appleIcon = findViewById(R.id.appleIcon);

        // Set click listener for Back button to navigate to Sign-in page
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resetpasswordpage.this, Signinpage.class);
                startActivity(intent);
                finish(); // Close current activity
            }
        });

        // Set click listener for Signup text to navigate to Sign-up page
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resetpasswordpage.this, Signuppage.class);
                startActivity(intent);
            }
        });

        // Social login listeners - Navigate to respective websites
        facebookIcon.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
            startActivity(intent);
        });

        googleIcon.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
            startActivity(intent);
        });

        appleIcon.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com"));
            startActivity(intent);
        });
    }
}