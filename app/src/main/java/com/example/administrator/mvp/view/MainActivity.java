package com.example.administrator.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.mvp.R;
import com.example.administrator.mvp.bean.User;
import com.example.administrator.mvp.presenter.UserLoginPresenter;

public class MainActivity extends AppCompatActivity implements IUserLoginView {
    private EditText username;
    private EditText password;
    private Button load;
    private Button cancle;

    private UserLoginPresenter loginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymain);
        initView();
    }

    private void initView() {
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.password);
        load = (Button) findViewById(R.id.load);
        cancle = (Button) findViewById(R.id.cancel);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login();
            }
        });
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.clear();
            }
        });
    }

    @Override
    public String getUserName() {
        return username.getText().toString();
    }

    @Override
    public String getPassWord() {
        return password.getText().toString();
    }

    @Override
    public void clearUserName() {
        username.setText("");
    }

    @Override
    public void clearPassWord() {
        password.setText("");
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void toMainActivity(User user) {
        Toast.makeText(this, "go to main", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
