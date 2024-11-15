package io.soynet.rnd.yhkim.jet04modifier

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.soynet.rnd.yhkim.jet04modifier.ui.theme.Jet04ModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jet04ModifierTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//            .background(Color.Blue)
//            .padding(30.dp),
//        color = Color.Yellow,
//        fontSize = 50.sp,
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//    )
    val context = LocalContext.current
    Image(
        modifier = Modifier
            .padding(30.dp)
            .size(300.dp)
            //.clip(CircleShape)
            .clip(RoundedCornerShape(16.dp))
            .clickable{
                Toast.makeText(
                    context,
                    "이미지 클릭됨",
                    Toast.LENGTH_LONG
                ).show()
            },
        painter= painterResource(id=R.drawable.gundam),
        contentDescription = "건담 이미지",
        contentScale = ContentScale.FillHeight,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Jet04ModifierTheme {
        Greeting("Android")
    }
}