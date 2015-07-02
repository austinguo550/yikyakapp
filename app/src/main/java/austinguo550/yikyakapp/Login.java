package austinguo550.yikyakapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by James on 7/1/2015.
 */
public class Login extends Activity implements View.OnClickListener {

    Button bLogin;
    EditText etUsername, etPassword;
    TextView tvSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);
        tvSignUpLink = (TextView) findViewById(R.id.tvSignUpLink);

        bLogin.setOnClickListener(this);
        tvSignUpLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bLogin:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.tvSignUpLink:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
