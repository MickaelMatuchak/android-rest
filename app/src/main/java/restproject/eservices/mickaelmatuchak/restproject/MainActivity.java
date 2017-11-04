package restproject.eservices.mickaelmatuchak.restproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.AlertDialog;
import android.widget.LinearLayout;
import android.content.DialogInterface;
import android.text.InputType;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import restproject.eservices.mickaelmatuchak.restproject.client.RetrofitClient;
import restproject.eservices.mickaelmatuchak.restproject.services.APIService;
import restproject.eservices.mickaelmatuchak.restproject.models.Post;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    /*
    private Retrofit retrofit = RetrofitClient.getClient("https://sleepy-everglades-62123.herokuapp.com");
    */

    /*
    private APIService service = retrofit.create(APIService.class);
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.actualizePosts(null);
    }

    public void actualizePosts(View v) {
        /*
        this.service.getPosts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                List<Post> posts = response.body();

                String afficherMessages[] = new String[posts.size()];

                for (int i = 0; i < posts.size(); i++)
                    afficherMessages[i] = posts.get(i).getName() + " : \r\n" + posts.get(i).getMessage();

                ListView mListView = (ListView) findViewById(R.id.listView);

                ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, afficherMessages);

                mListView.setAdapter(adapter);

                System.out.println("Données reçues...");
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                System.out.println("Erreur...");
            }
        });
        */
    }

    public void addPost(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Formulaire nouveau Post");

        LinearLayout layout = new LinearLayout(getApplicationContext());

        final EditText inputName = new EditText(this);
        inputName.setInputType(InputType.TYPE_CLASS_TEXT);
        inputName.setHint("Pseudo");

        final EditText inputMessage = new EditText(this);
        inputMessage.setInputType(InputType.TYPE_CLASS_TEXT);
        inputMessage.setHint("Message");

        layout.addView(inputName);
        layout.addView(inputMessage);

        builder.setView(layout);

        builder.setPositiveButton("Ajouter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String name = inputName.getText().toString();
                String message = inputMessage.getText().toString();

                if (!name.isEmpty() && !message.isEmpty()) {
                    sendPost(name, message);
                    Toast toast = Toast.makeText(getApplicationContext(), "Post ajouté", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Renseignez tous les champs", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }

    public void sendPost(String name, String message) {
         /*
        this.service.addPost(name, message).enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if (response.isSuccessful()) {
                    System.out.println("Données envoyées");
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                System.out.println("Erreur...");
            }
        });
        */
    }
}
