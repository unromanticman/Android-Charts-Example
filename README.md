# Android-Charts-Example
練習在Android上繪製圖表，使用 https://github.com/PhilJay/MPAndroidChart 套件

1.在build.gradle中加入maven 
<pre>
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}</pre>
2.在dependencies中加入'com.github.PhilJay:MPAndroidChart:v3.0.3'  
<pre>
dependencies {
    implementation 'com.github.PhilJay:MPAndroidChart:v3.0.3'
}
</pre>
3.在conetent_main.xml加上

    <com.github.mikephil.charting.charts.LineChart
        android:id="@+id/chart_line"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
4.請參考MainActivity.java內容說明繪製出圖型 <a href="https://github.com/unromanticman/Android-Charts-Example/blob/master/AndroidChartsExample/app/src/main/java/androidchartsexample/androidchartsexample/MainActivity.java">請點我</a>  
5.繪製出圖表  
<img src="https://github.com/unromanticman/Android-Charts-Example/blob/master/demo.png?raw=true" width="300">
