package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {
    Button One,Two,Three,Four,Five,Six,Sev,Eig,Nine,Zero,Del,Mul,Div,Add,Sub,Equal,AC;
    TextView Text,Symbol,Text2,Ans;
    String str,sym,str2;
    Double Str,Str2,Res=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        One=findViewById(R.id.one);
        Two=findViewById(R.id.two);
        Three=findViewById(R.id.three);
        Four=findViewById(R.id.four);
        Five=findViewById(R.id.five);
        Six=findViewById(R.id.six);
        Sev=findViewById(R.id.sev);
        Eig=findViewById(R.id.eight);
        Nine=findViewById(R.id.nine);
        Zero=findViewById(R.id.zero);
        Del=findViewById(R.id.del);
        Mul=findViewById(R.id.x);
        Sub=findViewById(R.id.sub);
        Add=findViewById(R.id.sum);
        Div=findViewById(R.id.div);
        Text=findViewById(R.id.text);
        AC=findViewById(R.id.ac);
        Equal=findViewById(R.id.equal);
        Symbol=findViewById(R.id.symbol);
        Text2=findViewById(R.id.text2);
        Ans=findViewById(R.id.ans);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="1";
                sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();
            }}});
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="2";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="3";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="4";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="5";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="6";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Sev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="7";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Eig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="8";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="9";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Text.getText().toString();
                if(str.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter num1", Toast.LENGTH_SHORT).show();
                else {
                    Symbol.setText("x");
                }
                    }});
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Text.getText().toString();
                if(str.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter num1", Toast.LENGTH_SHORT).show();
                else
                    Symbol.setText("/");}});
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Text.getText().toString();
                if(str.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter num1", Toast.LENGTH_SHORT).show();
                else
                    Symbol.setText("+");}});
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Text.getText().toString();
                if(str.isEmpty())
                    Toast.makeText(MainActivity.this, "Enter num1", Toast.LENGTH_SHORT).show();
                else
                    Symbol.setText("-");}});
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {str="0";sym=Symbol.getText().toString();
                if(sym.isEmpty())
                    Text.append(str);
                else{
                    Text2.append(str);
                    calculator();}}});
        Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sym=Symbol.getText().toString();
                if(sym.isEmpty()) {
                    str = Text.getText().toString();
                    if (!str.isEmpty())
                        Text.setText(str.substring(0, str.length() - 1));
                }
                else{
                    str=Text2.getText().toString();
                    if(!(str.isEmpty())) {
                        Text2.setText(str.substring(0, str.length() - 1));
                        calculator();
                    }
                    else{
                        Symbol.setText("");
                    }
                }
            }});
        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text.setText("");
                Symbol.setText("");
                Text2.setText("");
                Ans.setHint("");
                Res=null;
            }});
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str=Text.getText().toString();
                str2=Text2.getText().toString();
//                str=Text.getText().toString();
                if(str.isEmpty() || str2.isEmpty())
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                else if(Res==null)
                        Text.setText("");
                else{
                    Text.setText(Res.toString());
                    Symbol.setText("");
                    Text2.setText("");
                    Ans.setHint("");
                }
            }
        });
    }
    public void calculator(){
        int a;
        str=Text.getText().toString();
        str2=Text2.getText().toString();
        sym=Symbol.getText().toString();
        if(!str2.isEmpty()){
            Str=Double.parseDouble(str);
            Str2=Double.parseDouble(str2);
            switch(sym){
                case "x":
                    Res=Str*Str2;
                    Ans.setHint(Res.toString());
                    break;
                case "/":
                    if(Str2==0.0)
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                    else{
                    Res=Str/Str2;
                    Ans.setHint(Res.toString());
                    }
                    break;
                case "+":Res=Str+Str2;
                        Ans.setHint(Res.toString());
                        break;
                case "-":Res=Str-Str2;
                        Ans.setHint(Res.toString());
                        break;
            }
        }
        else if(str2.isEmpty())
            Toast.makeText(this, "Enter num2", Toast.LENGTH_SHORT).show();
    }
}