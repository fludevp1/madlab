Prog 1: Create an application to design a Visiting Card. The Visiting card should have a company logo at the top right corner. The company name should be displayed in Capital letters, aligned to the centre.
Information like the name of the employee, job title, phone number, address, email, fax and the
website address are to be displayed. Insert a horizontal line between the job title and the phone
number.
XML Code
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#FFFFFF"
tools:context=".MainActivity">
<TextView
android:id="@+id/textView4"
android:layout_width="371dp"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="22dp"
android:layout_marginLeft="22dp"
android:layout_marginEnd="18dp"
android:layout_marginRight="18dp"
android:layout_marginBottom="294dp"
android:text="Address: Amrita School of Computing, Bogadi 2nd Stage, Mysuru"
android:textAlignment="center"
android:textSize="24sp" />
<TextView
android:id="@+id/textView5"
android:layout_width="250dp"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="80dp"
android:layout_marginLeft="80dp"
android:layout_marginEnd="80dp"
android:layout_marginRight="80dp"
android:layout_marginBottom="215dp"
android:text="Ph No: 9717620165"
android:textAlignment="center"
android:textSize="24sp" />
<TextView
android:id="@+id/textView6"
android:layout_width="367dp"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="22dp"
android:layout_marginLeft="22dp"
android:layout_marginEnd="22dp"
android:layout_marginRight="22dp"
android:layout_marginBottom="151dp"
android:text="Email Id: thanjanm@gmail.com"
android:textAlignment="center"
android:textSize="24sp" />
<TextView
android:id="@+id/textView3"
android:layout_width="367dp"
android:layout_height="66dp"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="25dp"
android:layout_marginLeft="25dp"
android:layout_marginEnd="19dp"
android:layout_marginRight="19dp"
android:layout_marginBottom="401dp"
android:text="Student - Amrita"
android:textAlignment="center"
android:textSize="24sp" />
<ImageView
android:id="@+id/imageView1"
android:layout_width="140dp"
android:layout_height="44dp"
android:layout_above="@+id/textView2"
android:layout_alignEnd="@+id/textView6"
android:layout_alignRight="@+id/textView6"
android:layout_marginEnd="-18dp"
android:layout_marginRight="-18dp"
android:layout_marginBottom="41dp"
app:srcCompat="@drawable/amrita1" />
<View
android:id="@+id/view"
android:layout_width="wrap_content"
android:layout_height="4dp"
android:layout_alignParentBottom="true"
android:layout_marginBottom="566dp"
android:background="#4444" />
<TextView
android:id="@+id/textView2"
android:layout_width="wrap_content"
android:layout_height="47dp"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginLeft="123dp"
android:layout_marginEnd="124dp"
android:layout_marginRight="124dp"
android:layout_marginBottom="492dp"
android:text="Michelle B Thanjan"
android:textAlignment="center"
android:textSize="24sp"
android:textStyle="bold" />
<TextView
android:id="@+id/textView1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="AMRITA" android:textColor="#E91E63"
android:textSize="36sp"
android:textStyle="bold"
android:layout_alignBottom="@+id/view"
android:layout_alignLeft="@+id/textView6"
android:layout_alignStart="@+id/textView6" />
</RelativeLayout>
Prog2: Develop an Android application using controls like Button, TextView, EditText for designing a calculator having basic functionality like Addition, Subtraction, Multiplication, and Division.
XML Code
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<TextView
android:layout_width="wrap_content"
android:layout_height="71dp"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="64dp"
android:layout_marginRight="64dp"
android:layout_marginBottom="535dp"
android:text="Simple Calculator"
android:textSize="36sp"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintRight_toRightOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<EditText
android:id="@+id/et1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="114dp"
android:layout_marginRight="114dp"
android:layout_marginBottom="438dp"
android:ems="10"
android:hint="Enter Number 1"
android:inputType="textPersonName"
android:text=""
android:textColorHighlight="#FFFFFF" />
<EditText
android:id="@+id/et2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="115dp"
android:layout_marginRight="115dp"
android:layout_marginBottom="364dp"
android:ems="10"
android:hint="Enter Number 2"
android:inputType="textPersonName"
android:text=""
android:textColorHighlight="#FFFFFF"/>
<Button
android:id="@+id/b1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="260dp"
android:layout_marginTop="260dp"
android:layout_marginEnd="264dp"
android:layout_marginRight="264dp"
android:layout_marginBottom="165dp"
android:backgroundTint="#E8F381"
android:onClick="add"
android:text="ADD"
android:textStyle="bold" />
<Button
android:id="@+id/b2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="105dp"
android:layout_marginRight="105dp"
android:layout_marginBottom="165dp"
android:backgroundTint="#ECA9A9"
android:onClick="sub"
android:text="SUB"
android:textStyle="bold" />
<Button
android:id="@+id/b3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="263dp"
android:layout_marginRight="263dp"
android:layout_marginBottom="85dp"
android:backgroundTint="#A1FAA4"
android:onClick="mul"
android:text="MUL"
android:textStyle="bold" />
<Button
android:id="@+id/b4"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="105dp"
android:layout_marginRight="105dp"
android:layout_marginBottom="80dp"
android:backgroundTint="#E6C28C"
android:onClick="div"
android:text="DIV"
android:textStyle="bold" />
<TextView
android:id="@+id/tv1"
android:layout_width="wrap_content"
android:layout_height="71dp"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="202dp"
android:layout_marginRight="202dp"
android:layout_marginBottom="274dp"
android:text="0"
android:textSize="36sp"/>
</RelativeLayout>
JAVA Code
package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
EditText e1, e2;
TextView tv;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
e1 = findViewById(R.id.et1);
e2 = findViewById(R.id.et2);
tv = findViewById(R.id.tv1);
}
public void add(View v){
int a = Integer.parseInt(e1.getText().toString());
int b = Integer.parseInt(e2.getText().toString());
int res = a+b;
tv.setText("" + res);
}
public void sub(View v){
int a = Integer.parseInt(e1.getText().toString());
int b = Integer.parseInt(e2.getText().toString());
int res = a-b;
tv.setText("" + res);
}
public void mul(View v){
int a = Integer.parseInt(e1.getText().toString());
int b = Integer.parseInt(e2.getText().toString());
int res = a*b;
tv.setText("" + res);
}
public void div(View v){
int a = Integer.parseInt(e1.getText().toString());
int b = Integer.parseInt(e2.getText().toString());
int res = a/b;
tv.setText("" + res);
}
}
Prog3:Develop an application to set an image as wallpaper. On click of a button, the wallpaper image should start to change randomly every 30 seconds.
Prog4: Develop an Android app to count the total number of clicks of a button. On each click, a toast message "hurrah!" is displayed as well as the total number of clicks in the text view.
XML Code
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<TextView
android:id="@+id/textView1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />
<Button
android:id="@+id/button1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Click"
app:layout_constraintBottom_toTopOf="@+id/textView1"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
JAVA Code
package com.example.toasts;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
int count = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
Button b = (Button) findViewById(R.id.button1);
TextView t = (TextView) findViewById(R.id.textView1);
b.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
Toast.makeText(MainActivity.this,
"Hurrah!!",
Toast.LENGTH_SHORT).show();
count++;
t.setText("Button is clicked " + count + " times.");
}
});
}
}
Prog5: Write a program to create an activity with two buttons START and STOP. On pressing START, the activity must start the counter by displaying the numbers from One and the counter must keep on counting until the STOP button is pressed. Display the counter value in a TextViewControl.
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<TextView android:id="@+id/textView1"
android:layout_width="332dp"
android:layout_height="wrap_content"
android:layout_alignParentStart="true"
android:layout_alignParentLeft="true"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginStart="41dp"
android:layout_marginLeft="41dp"
android:layout_marginRight="38dp"
android:layout_marginBottom="516dp"
android:text="Counter Application"
android:textSize="36sp"
android:textStyle="bold" />
<Button
android:id="@+id/button1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="41dp"
android:layout_marginRight="38dp"
android:layout_marginBottom="89dp"
android:text="Start"
android:textSize="30sp"
app:backgroundTint="4CAF50"/>
<Button
android:id="@+id/button2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="55dp"
android:layout_marginRight="55dp"
android:layout_marginBottom="92dp"
android:text="Stop"
android:textSize="30sp"
app:backgroundTint="EC5449"/>
<TextView
Android:id="@+id/textView2"
android:layout_width= "wrap_content"
android:layout_height="wrap_content”
android:layout_alignParentEnd="true"
android:layout_alignParentRight="true"
android:layout_alignParentBottom=”true”
android:layout_marginEnd="165"
android:layout_marginRight="165dp"
android:layout_marginBottom="434dp"
android:text="counter value"
android:textSize=”18sp" android:textStyle="bold"/>
</RelativeLayout>
Java Code:
package com.example.counterapplication;
import android.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity{
TextView txtCounter;
Button btn=start, btn_stop;
int count=0;
Handler customHandler= new Handler();
@Override
protected void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
txtCounter=(TextView) findViewById(R.id.textView2);
btn_start=(Button) findViewById(R.id.button1);
btn_stop=(Button)findViewById(R.id.button2);
btn.start.setOnClickListener(new view.OnClickListener()){
@Override
public void onClick(View v){
customHandler.removeCallbacks(updateTimerThread);
});
btn_stop.setOnClickListener(new View.OnClickListener()){
@Override
public void onClick(View v){
customHandler.removeCallbacks(updateTimerThread);}
});}
private final Runnable updateTimerThread= new Runnable(){
@Override
public void run(){
txtCounter.setText(""+count);
customHandler.postDelayed(this,1000);
count++;
}};
Prog6: Develop a simple application with one EditText so that the user can write some text in it. Create a button called text in it. Create a button called "Convert Text to Speech" that converts the user input text into voice.
XML CODE: <?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">
<TextView
android:id="@+id/textView"
android:layout_width="335dp"
android:layout_height="wrap_content"
android:layout_alignParentRight="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="21dp"
android:layout_marginBottom="486dp"
android:text="text2speech"
android:textSize="30sp"/>
<EditText
android:id="@+id/editText"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="142dp"
android:layout_marginBottom="377dp"
android:cms="10"
android:hint="enter text here"
android:inputType="textPersonName"/>
<Button
android:id="@+id/convert"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_alignParentEnd="true"
android:layout_alignParentBottom="true"
android:layout_marginEnd="196dp"
android:layout_marginBottom="236dp"
android:onClick="convert"
android:background="#6CEC71"
android:text="convert"/>
</RelativeLayout>
JAVA CODE:
package com.example.text2speech;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import java.util.Locale;
public class MainActivity extends AppCompatActivity {
EditText e1;
TextToSpeech t1;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
e1=findViewById(R.id.editText);
t1=new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener(){
@Override
public void onInit(int status){
if(status!=TextToSpeech.ERROR){
t1.setLanguage(Locale.UK);
}
}
});
}
public void convert(View V){
String tospeak=e1.getText().toString();
t1.speak(tospeak,TextToSpeech.QUEUE_FLUSH,null);
}
}
