package co.edu.sena.jetpackcristianarango

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import co.edu.sena.jetpackcristianarango.ui.theme.JetpackCristianArangoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        MessageCard(Message("Cristian Arango","Oleee a que hora jugamos Fall guys"))
            }//setContent
        }//onCreate
    }//class

data class Message(val author:String, val body:String)



@Composable
fun MessageCard(msg:Message){
    Column {
        Text(text = msg.author)//Para copiar y pegar control D
        Text(text = msg.body)
    }
}









@Preview(showBackground = true)
@Composable
fun PreviewMessageCard(){
    MessageCard(msg = Message("Cristian Arango","Oleee a que hora jugamos Fall guys"))
}




