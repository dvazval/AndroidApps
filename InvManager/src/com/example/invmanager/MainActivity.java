package com.example.invmanager;

import android.R.array;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends Activity {

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createSpinner(R.id.spinner1, R.array.Categorias);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void busquedaResultados(View view){
    	// Buscar en los excel
    	ReadExcel lector = new ReadExcel();
    	
    }
    
    
    public void createSpinner(int idSpinner, int idArregloSpinner){
    	Spinner spinner = (Spinner) findViewById(idSpinner);
	    // Crear un ArrayAdapter utilizando el string array seleccionado y el layout por default
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	     idArregloSpinner, android.R.layout.simple_spinner_item);
	    // Especificar el layout a utilizar cuando la lista de opciones aparece 
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    // Aplicar el adaptador al Spinner
	    spinner.setAdapter(adapter);
    }
    
    
    
    
    
}
