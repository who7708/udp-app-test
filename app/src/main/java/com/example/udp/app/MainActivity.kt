package com.example.udp.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.udp.app.ui.theme.UdpapptestTheme

class MainActivity : ComponentActivity() {

    private val viewModel: CreditCardViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        // setContent {
        //     UdpapptestTheme {
        //         Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        //             Greeting(
        //                 name = "Android",
        //                 modifier = Modifier.padding(innerPadding)
        //             )
        //         }
        //     }
        // }

        setContent {
            CreditCardScreen(viewModel)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UdpapptestTheme {
        Greeting("Android")
    }
}