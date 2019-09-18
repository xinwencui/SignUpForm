package temple.edu.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        EditText nameEditText = findViewById(R.id.editTextName);
        if(TextUtils.isEmpty(nameEditText.getText())){
            Toast.makeText(this, "You need to enter the information",Toast.LENGTH_SHORT).show();
            return;
        }

        EditText emailEditText = findViewById(R.id.editTextEmail);
        if(TextUtils.isEmpty(emailEditText.getText())) {
            Toast.makeText(this, "You need to enter the information", Toast.LENGTH_SHORT).show();
            return;
        }

        EditText passwordEditText = findViewById(R.id.editTextPassword);
        if(TextUtils.isEmpty(passwordEditText.getText())){
            Toast.makeText(this, "You need to enter the information",Toast.LENGTH_SHORT).show();
            return;
        }

        EditText rePassEditText = findViewById(R.id.editTextRePassword);
        if(TextUtils.isEmpty(rePassEditText.getText())){
            Toast.makeText(this, "You need to enter the information",Toast.LENGTH_SHORT).show();
            return;
        }

        if(!(passwordEditText.getText().equals(rePassEditText.getText()))){
            Toast.makeText(this, "The passwords are not matched. ",Toast.LENGTH_SHORT).show();

        }
        else{
            Toast.makeText(this, "Welcome to the SignUpForm App", Toast.LENGTH_SHORT).show();
        }


    }
}
