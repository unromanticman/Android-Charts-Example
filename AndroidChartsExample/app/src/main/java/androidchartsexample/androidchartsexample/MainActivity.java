package androidchartsexample.androidchartsexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //取得LineChart物件
        LineChart chart_line = (LineChart)findViewById(R.id.chart_line);
        //設定LineChart物件內容
        chart_line.setData(getLineDataLine());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //設定LineChart物件
    private LineData getLineDataLine(){

        //dataSets資料集合物件
        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();

        LineDataSet d1 = new LineDataSet(getChartDataLine1(), "DataSet1");
        d1.setColor(Color.RED);
        d1.setCircleColor(Color.RED);
        dataSets.add(d1);//增加資料到dataSets集合物件



        LineDataSet d2 = new LineDataSet(getChartDataLine2(), "DataSet2");
        d2.setColor(Color.parseColor("#ffa500"));
        d2.setCircleColor(Color.parseColor("#ffa500"));
        dataSets.add(d2);//增加資料到dataSets集合物件

        LineDataSet d3 = new LineDataSet(getChartDataLine3(), "DataSet3");
        d3.setColor(Color.parseColor("#ffff00"));
        d3.setCircleColor(Color.parseColor("#ffff00"));
        dataSets.add(d3);//增加資料到dataSets集合物件

        LineDataSet d4 = new LineDataSet(getChartDataLine4(), "DataSet4");
        d4.setColor(Color.GREEN);
        d4.setCircleColor(Color.GREEN);
        dataSets.add(d4);//增加資料到dataSets集合物件

        LineDataSet d5 = new LineDataSet(getChartDataLine5(), "DataSet5");
        d5.setColor(Color.BLUE);
        d5.setCircleColor(Color.BLUE);
        dataSets.add(d5);//增加資料到dataSets集合物件

        LineDataSet d6 = new LineDataSet(getChartDataLine6(), "DataSet6");
        d6.setColor(Color.parseColor("#1A5F83"));
        d6.setCircleColor(Color.parseColor("#1A5F83"));
        dataSets.add(d6);//增加資料到dataSets集合物件

        LineDataSet d7 = new LineDataSet(getChartDataLine7(), "DataSet7");
        d7.setColor(Color.parseColor("#70239F"));
        d7.setCircleColor(Color.parseColor("#70239F"));
        dataSets.add(d7);//增加資料到dataSets集合物件

        //繪製到圖上
        return new LineData(dataSets);
    }

    //產生Line1假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,7), (2,14), (3,21), (4,28)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine1(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*7));
        }
        return chartData;
    }


    //產生Line2假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,6), (2,12), (3,18), (4,24)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine2(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*6));
        }
        return chartData;
    }

    //產生Line3假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,5), (2,10), (3,15), (4,20)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine3(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*5));
        }
        return chartData;
    }

    //產生Line4假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,4), (2,8), (3,12), (4,16)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine4(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*4));
        }
        return chartData;
    }

    //產生Line5假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,3), (2,6), (3,9), (4,12)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine5(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*3));
        }
        return chartData;
    }

    //產生Line6假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,2), (2,4), (3,6), (4,8)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine6(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i*2));
        }
        return chartData;
    }

    //產生Line7假資料
    //每一個資料點就是一個Entry(y, x)，其中y的型態是float，x為int。以下範產生出(0,0), (1,1), (2,2), (3,3), (4,4)五個點
    private List<com.github.mikephil.charting.data.Entry> getChartDataLine7(){
        final int DATA_COUNT = 5;
        List<com.github.mikephil.charting.data.Entry> chartData = new ArrayList<>();
        for(int i=0;i<DATA_COUNT;i++){
            chartData.add(new com.github.mikephil.charting.data.Entry(i, i));
        }
        return chartData;
    }


}
