package com.admin.bottomnavigation02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取顶部导航栏控件
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        //获取Navigation对象，即activity_main文件里面的fragment
        NavController controller= Navigation.findNavController(this,R.id.fragment);
        //这里有两种实现的方法两种写法都可以实现效果
        AppBarConfiguration configuration=new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();
        //这里可以直接使用ID来绑定
        //AppBarConfiguration configuration=new AppBarConfiguration.Builder(R.id.firstFragment,R.id.secondFragment,R.id.firstFragment,R.id.fourthFragment).build();
        NavigationUI.setupActionBarWithNavController(this,controller,configuration);
        NavigationUI.setupWithNavController(bottomNavigationView,controller);

    }
}
