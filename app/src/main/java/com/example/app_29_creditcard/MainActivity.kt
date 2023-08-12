package com.example.app_29_creditcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.app_29_creditcard.ui.theme.APP29_CreditCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            APP29_CreditCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards(){
    val cards = listOf(
        CardInfo ("1111 2222 3333 4444",
                " ABCD EFGH",
            R.drawable.img,
        R.drawable.img_2
        ),
        CardInfo ("5555 6666 3333 4444",
            " Jack Reacher",
            R.drawable.img_1,
            R.drawable.img_3
        ),
        CardInfo ("1111 2222 7777 8888",
            " John Smith",
            R.drawable.img,
            R.drawable.img_4
        ),
        CardInfo ("9999 2222 3333 0000",
            " LMNOP XYZ",
            R.drawable.img_1,
            R.drawable.img_5
        )
    )

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        items(cards){
            card -> CreditCard(cardInfo = card)
        }
    }
}
