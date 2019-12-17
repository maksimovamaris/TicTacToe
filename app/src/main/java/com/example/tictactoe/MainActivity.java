package com.example.tictactoe;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TicTacToeField model;
    private ViewGroup buttonGrid;
    private View winnerPlayerViewGroup;
    private View winnerPlayerCount;
    private TextView winnerPlayerCircle;
    private TextView winnerPlayerCross;
    private boolean flag_cross=true;
    private boolean flag_circle=false;
    private int crossCount=0;
    private int circleCount=0;
    private int count=0;
    private GridLayout gridLayout;
    private  WinnerView winnerView;
    private Button btn_exit;
    private Button btn_restart;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_exit=findViewById(R.id.exit_button);
        btn_restart=findViewById(R.id.restart_button);
        winnerPlayerCross = findViewById(R.id.crossCount);
        winnerPlayerCircle = findViewById(R.id.circleCount);
        winnerPlayerViewGroup = findViewById(R.id.winnerPlayerViewText);
        winnerPlayerCount=findViewById(R.id.winerPlayerViewCount);
        winnerPlayerCount.setVisibility(View.VISIBLE);
        winnerView=findViewById(R.id.win_view);
//        winnerPlayerCircle.setText(""+circleCount);
//        winnerPlayerCross.setText(""+crossCount);
        winnerPlayerViewGroup.setVisibility(View.VISIBLE);
        buttonGrid = (ViewGroup) findViewById(R.id.buttonGrid);
        model=new TicTacToeField(3);
       btn_restart.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               reset();
           }
       });
       btn_exit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

    }



    public void onCellClicked(View v)
    {
        count++;

        Button button = (Button) v;

        String tag = button.getTag().toString();

        int row = Integer.valueOf(tag.substring(0,1));
        int col = Integer.valueOf(tag.substring(1,2));

        if(flag_cross)
        {
            ((Button) (buttonGrid.getChildAt(col + 3 * row))).setBackgroundResource(R.drawable.cross);
            if(model.setFigure(row,col, TicTacToeField.Figure.CROSS))
                buttonGrid.getChildAt(col + 3 * row).setClickable(false);

        }
        else
            if (flag_circle)
            {
                model.setFigure(row,col, TicTacToeField.Figure.CIRCLE);
                ((Button) (buttonGrid.getChildAt(col + 3 * row))).setBackgroundResource(R.drawable.circle);
                buttonGrid.getChildAt(col + 3 * row).setClickable(false);
            }

        flag_cross=!flag_cross;
        flag_circle=!flag_circle;

        if (model.getWinner()== TicTacToeField.Figure.CIRCLE)
        {
            winnerView.setVisibility(View.VISIBLE);
            winnerView.setAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
            circleCount=circleCount+1;
            winnerPlayerCircle.setText(""+circleCount);
        }
else
        if (model.getWinner()== TicTacToeField.Figure.CROSS)
        {
            winnerView.setVisibility(View.VISIBLE);
            winnerView.setAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
            crossCount=crossCount+1;
            winnerPlayerCross.setText(""+crossCount);
        }
        else
        if (count==9)
        {crossCount=crossCount+1;
        circleCount=circleCount+1;
            winnerPlayerCross.setText(""+crossCount);
            winnerPlayerCircle.setText(""+circleCount);}

    }

    private void reset()

    {   winnerView.setVisibility(View.GONE);
        count=0;
        flag_cross=true;
        flag_circle=false;
        model=new TicTacToeField(3);
        for (int i = 0; i < buttonGrid.getChildCount(); i++) {
            ((Button) buttonGrid.getChildAt(i)).setBackgroundResource(R.drawable.square);
            buttonGrid.getChildAt(i).setClickable(true);
        }
    }
}

