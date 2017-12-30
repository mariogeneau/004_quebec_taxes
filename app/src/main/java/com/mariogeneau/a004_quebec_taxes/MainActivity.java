package com.mariogeneau.a004_quebec_taxes;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬
public class MainActivity extends AppCompatActivity {
    //~~~~~~~~~~~~~~~~~~~~~~~~~
    EditText pst_tax;
    EditText gst_tax;
    EditText price;
    TextView pst_amount;
    TextView gst_amount;
    TextView total_taxes_amount;
    TextView price_with_taxes_amount;
    DecimalFormat precision;
    //~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------
        pst_tax = findViewById(R.id.pst_field);
        gst_tax = findViewById(R.id.gst_field);
        price = findViewById(R.id.price_field);
        pst_amount = findViewById(R.id.pst_label);
        gst_amount = findViewById(R.id.gst_label);
        total_taxes_amount = findViewById(R.id.total_taxes_label);
        price_with_taxes_amount = findViewById(R.id.price_with_taxes_label);
        precision = new DecimalFormat("0.00");
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~
    public void calculateTaxes(View v) {
        double the_pst_tax = Double.parseDouble(pst_tax.getText().toString());
        double the_gst_tax = Double.parseDouble(gst_tax.getText().toString());
        double the_price = Double.parseDouble(price.getText().toString());
        //------
        double the_pst_amount = the_price * the_pst_tax;
        double the_gst_amount = the_price * the_gst_tax;
        double the_total_taxes_amount = the_pst_amount + the_gst_amount;
        double the_price_with_taxes_amount = the_pst_amount + the_gst_amount + the_price;
        //------
        pst_amount.setText(precision.format(the_pst_amount) + "$");
        gst_amount.setText(precision.format(the_gst_amount) + "$");
        total_taxes_amount.setText(precision.format(the_total_taxes_amount) + "$");
        price_with_taxes_amount.setText(precision.format(the_price_with_taxes_amount) + "$");
        //------
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~
}
//¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬












