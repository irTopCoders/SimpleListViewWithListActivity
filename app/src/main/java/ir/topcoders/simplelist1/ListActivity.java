package ir.topcoders.simplelist1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends android.app.ListActivity {

    private static final String[] ITEMS = {"Ramin", "Ali", "Reza", "Sahar", "Amir", "Bahar",
                                            "Mahdi", "Kambiz", "Somayeh", "Sara", "Hossein", "Mohammad",
                                            "Parvaneh", "Solmaz", "Maryam", "Zahra", "Pedram", "Nader"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ITEMS));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        String clickedItem = ITEMS[position];

        Toast.makeText(this, clickedItem, Toast.LENGTH_SHORT).show();
    }
}
