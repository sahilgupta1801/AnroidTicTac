package com.sahilgupta.connect3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    int arr[][]=new int[3][3];
    int redwins;
    int yellowwins;
    public void fade1 (View view)
    {
        ImageView imageView22= (ImageView)findViewById(R.id.imageView22);
        imageView22.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[0][0]=1;
            ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
            imageView2.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[0][0]=2;
            ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
            imageView3.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade2 (View view)
    {
        ImageView imageView24= (ImageView)findViewById(R.id.imageView24);
        imageView24.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[0][1]=1;
            ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
            imageView4.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[0][1]=2;
            ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
            imageView5.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade3 (View view)
    {
        ImageView imageView25= (ImageView)findViewById(R.id.imageView25);
        imageView25.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[0][2]=1;
            ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
            imageView14.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[0][2]=2;
            ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
            imageView15.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade4 (View view)
    {
        ImageView imageView23= (ImageView)findViewById(R.id.imageView23);
        imageView23.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[1][0]=1;
            ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
            imageView6.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[1][0]=2;
            ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
            imageView7.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade5 (View view)
    {
        ImageView imageView26= (ImageView)findViewById(R.id.imageView26);
        imageView26.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[1][1]=1;
            ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
            imageView10.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[1][1]=2;
            ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
            imageView13.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade6 (View view)
    {
        ImageView imageView27= (ImageView)findViewById(R.id.imageView27);
        imageView27.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[1][2]=1;
            ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
            imageView16.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[1][2]=2;
            ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
            imageView17.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade9 (View view)
    {
        ImageView imageView30= (ImageView)findViewById(R.id.imageView30);
        imageView30.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[2][0]=1;
            ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
            imageView8.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[2][0]=2;
            ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
            imageView9.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade8 (View view)
    {
        ImageView imageView29= (ImageView)findViewById(R.id.imageView29);
        imageView29.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[2][1]=1;
            ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
            imageView21.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[2][1]=2;
            ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
            imageView20.animate().alpha(1).setDuration(100);
            check();
        }
    }
    public void fade7 (View view)
    {
        ImageView imageView28= (ImageView)findViewById(R.id.imageView28);
        imageView28.animate().alpha(0).setDuration(100);
        count++;
        if(count%2==1)
        {
            arr[2][2]=1;
            ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
            imageView18.animate().alpha(1).setDuration(100);
            check();
        }
        else
        {
            arr[2][2]=2;
            ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
            imageView19.animate().alpha(1).setDuration(100);
            check();
        }
    }

    public void check()
    {
        if(arr[0][1]==arr[0][2] && arr[0][0]==1 && arr[0][1]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][0]==arr[2][0] && arr[0][0]==1 && arr[1][0]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[1][2] && arr[1][0]==1 && arr[1][1]==arr[1][0]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[2][1]==arr[2][2] && arr[2][0]==1 && arr[2][1]==arr[2][0]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][1] && arr[0][1]==1 && arr[1][1]==arr[0][1]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][2]==arr[2][2] && arr[0][2]==1 && arr[1][2]==arr[0][2]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][2] && arr[0][0]==1 && arr[1][1]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][0] && arr[0][2]==1 && arr[1][1]==arr[0][2]) {
            Toast.makeText(MainActivity.this, "Red Wins", Toast.LENGTH_LONG).show();
            redwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }


        //YELLOW
        if(arr[0][1]==arr[0][2] && arr[0][0]==2 && arr[0][1]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][0]==arr[2][0] && arr[0][0]==2 && arr[1][0]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[1][2] && arr[1][0]==2 && arr[1][1]==arr[1][0]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[2][1]==arr[2][2] && arr[2][0]==2 && arr[2][1]==arr[2][0]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][1] && arr[0][1]==2 && arr[1][1]==arr[0][1]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][2]==arr[2][2] && arr[0][2]==2 && arr[1][2]==arr[0][2]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][2] && arr[0][0]==2 && arr[1][1]==arr[0][0]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: "+redwins + " Yellow : "+yellowwins , Toast.LENGTH_LONG).show();
            resetboard();
        }
        else if(arr[1][1]==arr[2][0] && arr[0][2]==2 && arr[1][1]==arr[0][2]) {
            Toast.makeText(MainActivity.this, "Yellow Wins", Toast.LENGTH_LONG).show();
            yellowwins++;
            Toast.makeText(MainActivity.this, "Red: " + redwins + " Yellow : " + yellowwins, Toast.LENGTH_LONG).show();
            resetboard();
        }
            int c=0;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    if(arr[i][j]==0)
                        c++;
                }
            }
            if(c==0)
                resetboard();

    }
    public void resetboard()
    {
            count=0;
            for(int i=0;i<3;i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    arr[i][j] = 0;
                }
            }
            ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
            imageView2.animate().alpha(0).setDuration(10);
            ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
            imageView3.animate().alpha(0).setDuration(10);
            ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
            imageView4.animate().alpha(0).setDuration(10);
            ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
            imageView5.animate().alpha(0).setDuration(10);
            ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
            imageView6.animate().alpha(0).setDuration(10);
            ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
            imageView7.animate().alpha(0).setDuration(10);
            ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
            imageView8.animate().alpha(0).setDuration(10);
            ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
            imageView9.animate().alpha(0).setDuration(10);
            ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);
            imageView10.animate().alpha(0).setDuration(10);
            ImageView imageView13 = (ImageView)findViewById(R.id.imageView13);
            imageView13.animate().alpha(0).setDuration(10);
            ImageView imageView14 = (ImageView)findViewById(R.id.imageView14);
            imageView14.animate().alpha(0).setDuration(10);
            ImageView imageView15 = (ImageView)findViewById(R.id.imageView15);
            imageView15.animate().alpha(0).setDuration(10);
            ImageView imageView16 = (ImageView)findViewById(R.id.imageView16);
            imageView16.animate().alpha(0).setDuration(10);
            ImageView imageView17 = (ImageView)findViewById(R.id.imageView17);
            imageView17.animate().alpha(0).setDuration(10);
            ImageView imageView18 = (ImageView)findViewById(R.id.imageView18);
            imageView18.animate().alpha(0).setDuration(10);
            ImageView imageView19 = (ImageView)findViewById(R.id.imageView19);
            imageView19.animate().alpha(0).setDuration(10);
            ImageView imageView20 = (ImageView)findViewById(R.id.imageView20);
            imageView20.animate().alpha(0).setDuration(10);
            ImageView imageView21 = (ImageView)findViewById(R.id.imageView21);
            imageView21.animate().alpha(0).setDuration(10);
            ImageView imageView22 = (ImageView)findViewById(R.id.imageView22);
            imageView22.animate().alpha(1).setDuration(10);
            ImageView imageView23 = (ImageView)findViewById(R.id.imageView23);
            imageView23.animate().alpha(1).setDuration(10);
            ImageView imageView24 = (ImageView)findViewById(R.id.imageView24);
            imageView24.animate().alpha(1).setDuration(10);
            ImageView imageView25 = (ImageView)findViewById(R.id.imageView25);
            imageView25.animate().alpha(1).setDuration(10);
            ImageView imageView26 = (ImageView)findViewById(R.id.imageView26);
            imageView26.animate().alpha(1).setDuration(10);
            ImageView imageView27 = (ImageView)findViewById(R.id.imageView27);
            imageView27.animate().alpha(1).setDuration(10);
            ImageView imageView28 = (ImageView)findViewById(R.id.imageView28);
            imageView28.animate().alpha(1).setDuration(10);
            ImageView imageView29 = (ImageView)findViewById(R.id.imageView29);
            imageView29.animate().alpha(1).setDuration(10);
            ImageView imageView30 = (ImageView)findViewById(R.id.imageView30);
            imageView30.animate().alpha(1).setDuration(10);
    }
    public void wincounter(View view)
    {
        redwins=0;
        yellowwins=0;
    }
    public void resetboard1(View view)
    {
        count=0;
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = 0;
            }
        }
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.animate().alpha(0).setDuration(10);
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.animate().alpha(0).setDuration(10);
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.animate().alpha(0).setDuration(10);
        ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView5.animate().alpha(0).setDuration(10);
        ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView6.animate().alpha(0).setDuration(10);
        ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView7.animate().alpha(0).setDuration(10);
        ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView8.animate().alpha(0).setDuration(10);
        ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        imageView9.animate().alpha(0).setDuration(10);
        ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);
        imageView10.animate().alpha(0).setDuration(10);
        ImageView imageView13 = (ImageView)findViewById(R.id.imageView13);
        imageView13.animate().alpha(0).setDuration(10);
        ImageView imageView14 = (ImageView)findViewById(R.id.imageView14);
        imageView14.animate().alpha(0).setDuration(10);
        ImageView imageView15 = (ImageView)findViewById(R.id.imageView15);
        imageView15.animate().alpha(0).setDuration(10);
        ImageView imageView16 = (ImageView)findViewById(R.id.imageView16);
        imageView16.animate().alpha(0).setDuration(10);
        ImageView imageView17 = (ImageView)findViewById(R.id.imageView17);
        imageView17.animate().alpha(0).setDuration(10);
        ImageView imageView18 = (ImageView)findViewById(R.id.imageView18);
        imageView18.animate().alpha(0).setDuration(10);
        ImageView imageView19 = (ImageView)findViewById(R.id.imageView19);
        imageView19.animate().alpha(0).setDuration(10);
        ImageView imageView20 = (ImageView)findViewById(R.id.imageView20);
        imageView20.animate().alpha(0).setDuration(10);
        ImageView imageView21 = (ImageView)findViewById(R.id.imageView21);
        imageView21.animate().alpha(0).setDuration(10);
        ImageView imageView22 = (ImageView)findViewById(R.id.imageView22);
        imageView22.animate().alpha(1).setDuration(10);
        ImageView imageView23 = (ImageView)findViewById(R.id.imageView23);
        imageView23.animate().alpha(1).setDuration(10);
        ImageView imageView24 = (ImageView)findViewById(R.id.imageView24);
        imageView24.animate().alpha(1).setDuration(10);
        ImageView imageView25 = (ImageView)findViewById(R.id.imageView25);
        imageView25.animate().alpha(1).setDuration(10);
        ImageView imageView26 = (ImageView)findViewById(R.id.imageView26);
        imageView26.animate().alpha(1).setDuration(10);
        ImageView imageView27 = (ImageView)findViewById(R.id.imageView27);
        imageView27.animate().alpha(1).setDuration(10);
        ImageView imageView28 = (ImageView)findViewById(R.id.imageView28);
        imageView28.animate().alpha(1).setDuration(10);
        ImageView imageView29 = (ImageView)findViewById(R.id.imageView29);
        imageView29.animate().alpha(1).setDuration(10);
        ImageView imageView30 = (ImageView)findViewById(R.id.imageView30);
        imageView30.animate().alpha(1).setDuration(10);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
