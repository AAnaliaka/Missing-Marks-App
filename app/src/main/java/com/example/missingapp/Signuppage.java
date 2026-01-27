package com.example.missingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Signuppage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signuppage);
        
        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI components
        TextView backBtn = findViewById(R.id.backBtn);
        TextView loginText = findViewById(R.id.loginText);
        ImageView facebookIcon = findViewById(R.id.facebookIcon);
        ImageView googleIcon = findViewById(R.id.googleIcon);
        ImageView appleIcon = findViewById(R.id.appleIcon);

        // Back button listener - Navigate to Sign-in page
        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Signuppage.this, Signinpage.class);
            startActivity(intent);
        });

        // Login text listener - Navigate to Sign-in page
        loginText.setOnClickListener(v -> {
            Intent intent = new Intent(Signuppage.this, Signinpage.class);
            startActivity(intent);
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