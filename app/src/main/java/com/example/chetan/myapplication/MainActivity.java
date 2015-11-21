package com.example.chetan.myapplication;


import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.SmartAnimation;
import com.podcopic.animationlib.library.attention.Flash;

import java.util.logging.Handler;
import java.util.logging.LogRecord;


public class MainActivity extends Activity {


    public int count=0;
    protected AlertDialog.Builder dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final RelativeLayout t = (RelativeLayout) findViewById(R.id.disp1);
        final TextView tv1 = (TextView) findViewById(R.id.tv1);
        final TextView tv2 = (TextView) findViewById(R.id.tv2);
        final RelativeLayout t2 = (RelativeLayout) findViewById(R.id.disp2);
        final RelativeLayout l1 = (RelativeLayout) findViewById(R.id.l1);
        //layout l1
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        //layout l2
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        //layout l3
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        //layout l4
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        Button button15 = (Button) findViewById(R.id.button15);
        Button button16 = (Button) findViewById(R.id.button16);
        //layout l5
        Button button17 = (Button) findViewById(R.id.button17);
        Button button18 = (Button) findViewById(R.id.button18);
        Button button19 = (Button) findViewById(R.id.button19);
        Button button20 = (Button) findViewById(R.id.button20);
        //layout l6
        Button button21 = (Button) findViewById(R.id.button21);
        Button button22 = (Button) findViewById(R.id.button22);
        Button button23 = (Button) findViewById(R.id.button23);
        Button button24 = (Button) findViewById(R.id.button24);
        //layout l7
        Button button25 = (Button) findViewById(R.id.button25);
        Button button26 = (Button) findViewById(R.id.button26);
        Button button27 = (Button) findViewById(R.id.button27);
        Button button28 = (Button) findViewById(R.id.button28);
        //layout l8
        Button button29 = (Button) findViewById(R.id.button29);
        Button button30 = (Button) findViewById(R.id.button30);
        Button button31 = (Button) findViewById(R.id.button31);
        Button button32 = (Button) findViewById(R.id.button32);
        //layout l9
        Button button33 = (Button) findViewById(R.id.button33);
        Button button34 = (Button) findViewById(R.id.button34);
        Button button35 = (Button) findViewById(R.id.button35);
        Button button36 = (Button) findViewById(R.id.button36);
        //layout l10
        Button button37 = (Button) findViewById(R.id.button37);
        Button button38 = (Button) findViewById(R.id.button38);
        Button button39 = (Button) findViewById(R.id.button39);
        Button button40 = (Button) findViewById(R.id.button40);

        tv1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                t.setVisibility(v.GONE);
                t2.setVisibility(v.VISIBLE);
                SmartAnimation.with(AnimationType.Flash).duration(2999).delay(100).playOn(findViewById(R.id.tv2));
            }
        });

        tv2.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v) {
                t2.setVisibility(v.GONE);
                l1.setVisibility(v.VISIBLE);

            }
        });


        //layout l1
        button1.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l1 = (RelativeLayout) findViewById(R.id.l1);
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);

            public void onClick(View v) {

                l1.setVisibility(l1.GONE);
                l2.setVisibility(l2.VISIBLE);

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l1 = (RelativeLayout) findViewById(R.id.l1);
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);


            public void onClick(View v)
            {
                count++;
                l1.setVisibility(l1.GONE);
                l2.setVisibility(l2.VISIBLE);
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {

            RelativeLayout l1 = (RelativeLayout) findViewById(R.id.l1);
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);

            public void onClick(View v) {
                l1.setVisibility(l1.GONE);
                l2.setVisibility(l2.VISIBLE);
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l1 = (RelativeLayout) findViewById(R.id.l1);
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);

            public void onClick(View v) {
                l1.setVisibility(l1.GONE);
                l2.setVisibility(l2.VISIBLE);
            }

        });

        //layout l2
        button5.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l2.setVisibility(l2.GONE);
                l3.setVisibility(l3.VISIBLE);
            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                count++;
                l2.setVisibility(l2.GONE);
                l3.setVisibility(l3.VISIBLE);
            }

        });

        button7.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l2.setVisibility(l2.GONE);
                l3.setVisibility(l3.VISIBLE);
            }

        });

        button8.setOnClickListener(new View.OnClickListener() {

            RelativeLayout l2 = (RelativeLayout) findViewById(R.id.l2);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l2.setVisibility(l2.GONE);
                l3.setVisibility(l3.VISIBLE);
            }

        });


        //layout l3
        button9.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l3.setVisibility(l3.GONE);
                l4.setVisibility(l4.VISIBLE);
            }

        });

        button10.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l3.setVisibility(l3.GONE);
                l4.setVisibility(l4.VISIBLE);
            }

        });

        button11.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l3.setVisibility(l3.GONE);
                l4.setVisibility(l4.VISIBLE);
            }

        });

        button12.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l3 = (RelativeLayout) findViewById(R.id.l3);

            public void onClick(View v) {
                l3.setVisibility(l3.GONE);
                l4.setVisibility(l4.VISIBLE);
                count++;
            }

        });


        //layout l4
        button13.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l4.setVisibility(l4.GONE);
                l5.setVisibility(l5.VISIBLE);
                count++;
            }

        });

        button14.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l4.setVisibility(l4.GONE);
                l5.setVisibility(l5.VISIBLE);
            }

        });

        button15.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l4.setVisibility(l4.GONE);
                l5.setVisibility(l5.VISIBLE);
            }

        });

        button16.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l4 = (RelativeLayout) findViewById(R.id.l4);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l4.setVisibility(l4.GONE);
                l5.setVisibility(l5.VISIBLE);
            }

        });

        //layout l5
        button17.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l6.setVisibility(l6.VISIBLE);
                l5.setVisibility(l5.GONE);
                count++;
            }

        });

        button18.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l5.setVisibility(l5.GONE);
                l6.setVisibility(l6.VISIBLE);
            }

        });

        button19.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l5.setVisibility(l5.GONE);
                l6.setVisibility(l6.VISIBLE);
            }

        });

        button20.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l5 = (RelativeLayout) findViewById(R.id.l5);

            public void onClick(View v) {
                l5.setVisibility(l5.GONE);
                l6.setVisibility(l6.VISIBLE);
            }

        });


        //layout l6
        button21.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l7.setVisibility(l7.VISIBLE);
                l6.setVisibility(l6.GONE);
            }

        });

        button22.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l6.setVisibility(l6.GONE);
                l7.setVisibility(l7.VISIBLE);
                count++;
            }

        });

        button23.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l6.setVisibility(l6.GONE);
                l7.setVisibility(l7.VISIBLE);
            }

        });

        button24.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l6 = (RelativeLayout) findViewById(R.id.l6);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l6.setVisibility(l6.GONE);
                l7.setVisibility(l7.VISIBLE);
            }

        });


        //layout l7
        button25.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l8.setVisibility(l8.VISIBLE);
                l7.setVisibility(l7.GONE);
            }

        });

        button26.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l7.setVisibility(l7.GONE);
                l8.setVisibility(l8.VISIBLE);
            }

        });

        button27.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l7.setVisibility(l7.GONE);
                l8.setVisibility(l8.VISIBLE);
                count++;
            }

        });

        button28.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l7 = (RelativeLayout) findViewById(R.id.l7);

            public void onClick(View v) {
                l7.setVisibility(l7.GONE);
                l8.setVisibility(l8.VISIBLE);
            }

        });


        //layout l8
        button29.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l9.setVisibility(l9.VISIBLE);
                l8.setVisibility(l8.GONE);
            }

        });

        button30.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l8.setVisibility(l8.GONE);
                l9.setVisibility(l9.VISIBLE);
                count++;
            }

        });

        button31.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l8.setVisibility(l8.GONE);
                l9.setVisibility(l9.VISIBLE);
            }

        });

        button32.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l8 = (RelativeLayout) findViewById(R.id.l8);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l8.setVisibility(l8.GONE);
                l9.setVisibility(l9.VISIBLE);
            }

        });
        //layout l9
        button33.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);

            public void onClick(View v) {
                l9.setVisibility(l9.GONE);
                l10.setVisibility(l10.VISIBLE);
            }

        });
        button34.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l9.setVisibility(l9.GONE);
                l10.setVisibility(l10.VISIBLE);
                count++;
            }

        });
        button35.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l9.setVisibility(l9.GONE);
                l10.setVisibility(l10.VISIBLE);
            }

        });
        button36.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout l9 = (RelativeLayout) findViewById(R.id.l9);

            public void onClick(View v) {
                l9.setVisibility(l9.GONE);
                l10.setVisibility(l10.VISIBLE);
            }

        });

        //layout l10
        button37.setOnClickListener(new View.OnClickListener() {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout end = (RelativeLayout) findViewById(R.id.end);

            public void onClick(View v) {
                l10.setVisibility(l10.GONE);
                end.setVisibility(end.VISIBLE);
                message();
            }

        });
        button38.setOnClickListener(new View.OnClickListener()
        {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout end = (RelativeLayout) findViewById(R.id.end);

            public void onClick(View v) {
                l10.setVisibility(l10.GONE);
                end.setVisibility(end.VISIBLE);
                message();
            }

        });
        button39.setOnClickListener(new View.OnClickListener()
        {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout end = (RelativeLayout) findViewById(R.id.end);

            public void onClick(View v)
            {
                l10.setVisibility(l10.GONE);
                end.setVisibility(end.VISIBLE);
                count++;
                message();
            }

        });

        button40.setOnClickListener(new View.OnClickListener()
        {
            RelativeLayout l10 = (RelativeLayout) findViewById(R.id.l10);
            RelativeLayout end = (RelativeLayout) findViewById(R.id.end);

            public void onClick(View v)
            {
                l10.setVisibility(l10.GONE);
                end.setVisibility(end.VISIBLE);
                message();

            }

        });
    }

        public void message()
        {
            String text;
            final TextView endtv = (TextView) findViewById(R.id.endtv);
            if(count==10||count==9)
            {
                text="Excellent\nYour Score is "+count;
                endtv.setText(text);
            }
            else if(count==8)
            {
                text = "Well Done\nYour Score is " + count;
                endtv.setText(text);
            }
            else
            {
                text="Your Score is "+count;
                endtv.setText(text);
            }


        }






    //@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

