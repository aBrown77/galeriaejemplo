package cr.ac.unadeca.galeria.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import cr.ac.unadeca.galeria.R;
import cr.ac.unadeca.galeria.subclases.RunImage;
import cr.ac.unadeca.galeria.util.Functions;

public class ImagenGrande extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagengrande);

        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        ImageView imageView = findViewById(R.id.image);
        TextView textView = findViewById(R.id.descripcion);

        RunImage image = new RunImage();
        if(!getIntent().getExtras().isEmpty()) {
            image.name = getIntent().getStringExtra("name");
            image.author = getIntent().getStringExtra("author");
            image.url = getIntent().getStringExtra("url");

            Functions.loadImage(image.url, imageView, this);
            textView.setText("Autor : "+ image.author +"\n" + "Nombre: "+ image.name );
        }else{
            Functions.loadImage( imageView, this);
            textView.setText("No se envio ninguna información" );
        }
    }
}