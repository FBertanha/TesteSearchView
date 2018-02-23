package bertanha.com.br.testesearchview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.SearchView;

import bertanha.com.br.testesearchview.util.SearchViewFormatter;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        //Carrega o arquivo de menu.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        //Pega o Componente.
        SearchView mSearchView = (SearchView) menu.findItem(R.id.search).getActionView();

        new SearchViewFormatter()
                .setSearchTextColorResource(R.color.colorAccent)
                .setSearchCloseIconResource(R.drawable.ic_close_black_24dp)
                .setSearchIconResource(R.drawable.ic_location_searching_24dp, true, true)
                .setSearchVoiceIconResource(R.drawable.ic_location_searching_24dp)
                .format(mSearchView);

        return true;

    }
}
