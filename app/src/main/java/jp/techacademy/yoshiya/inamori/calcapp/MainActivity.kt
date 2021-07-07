package jp.techacademy.yoshiya.inamori.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import java.util.function.IntToDoubleFunction

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        when(v.id){
            R.id.button1 -> textView1.text = editText1.text.toString()
            R.id.button2 -> textView2.text = editText2.text.toString()
            R.id.button3 -> {
                val editText1 = findViewById<EditText>(R.id.editText1)
                val editText2 = findViewById<EditText>(R.id.editText2)
                textView1.text = editText1.text.toString()
                textView2.text = editText2.text.toString()
                val Str1 = editText1.text
                val Str2 = editText2.text
                val i :String =Str1.toString()
                val j :String =Str2.toString()
                if (i!="" && j!="") {
                    val k: Float = i.toFloat()
                    val l: Float = j.toFloat()
                    intent.putExtra("VALUE1", k+l)
                    startActivity(intent)
                }else if (i=="" || j==""){
                    Snackbar.make(v,"数値を入力して下さい" , Snackbar.LENGTH_LONG)
                    .show()
                }
            }
            R.id.button4 -> {
                val editText1 = findViewById<EditText>(R.id.editText1)
                val editText2 = findViewById<EditText>(R.id.editText2)
                textView1.text = editText1.text.toString()
                textView2.text = editText2.text.toString()
                val Str1 = editText1.text
                val Str2 = editText2.text
                val i :String =Str1.toString()
                val j :String =Str2.toString()
                if (i!="" && j!="") {
                    val k: Float = i.toFloat()
                    val l: Float = j.toFloat()
                    intent.putExtra("VALUE1", k-l)
                    startActivity(intent)
                }else if (i=="" || j==""){
                    Snackbar.make(v,"数値を入力して下さい" , Snackbar.LENGTH_LONG)
                        .show()
                }
            }
            R.id.button5 -> {
                val editText1 = findViewById<EditText>(R.id.editText1)
                val editText2 = findViewById<EditText>(R.id.editText2)
                textView1.text = editText1.text.toString()
                textView2.text = editText2.text.toString()
                val Str1 = editText1.text
                val Str2 = editText2.text
                val i :String =Str1.toString()
                val j :String =Str2.toString()
                if (i!="" && j!="") {
                    val k: Float = i.toFloat()
                    val l: Float = j.toFloat()
                    if (l==0.0F){
                        Snackbar.make(v,"0以外の数字を入れてください" , Snackbar.LENGTH_LONG)
                            .show()
                    }else {
                        intent.putExtra("VALUE1", k / l)
                        startActivity(intent)
                    }
                }else if (i=="" || j==""){
                    Snackbar.make(v,"数値を入力して下さい" , Snackbar.LENGTH_LONG)
                        .show()
                }
            }
            R.id.button6 -> {
                val editText1 = findViewById<EditText>(R.id.editText1)
                val editText2 = findViewById<EditText>(R.id.editText2)
                textView1.text = editText1.text.toString()
                textView2.text = editText2.text.toString()
                val Str1 = editText1.text
                val Str2 = editText2.text
                val i :String =Str1.toString()
                val j :String =Str2.toString()
                if (i!="" && j!="") {
                    val k: Float = i.toFloat()
                    val l: Float = j.toFloat()
                    intent.putExtra("VALUE1", k*l)
                    startActivity(intent)
                }else if (i=="" || j==""){
                    Snackbar.make(v,"数値を入力して下さい" , Snackbar.LENGTH_LONG)
                        .show()
                }
            }
        }
    }

}