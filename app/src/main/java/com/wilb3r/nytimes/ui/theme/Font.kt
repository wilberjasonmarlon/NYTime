package com.wilb3r.nytimes.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.sp
import com.wilb3r.nytimes.R


val quicksand = FontFamily(
    Font(R.font.quicksand_regular, FontWeight.Normal),
    Font(R.font.quicksand_light, FontWeight.Light),
    Font(R.font.quicksand_semibold, FontWeight.SemiBold),
    Font(R.font.quicksand_bold, FontWeight.ExtraBold)
)


val TitleStyle = TextStyle(
    fontFamily = quicksand,
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold
)
val SubSubTitleStyle = TextStyle(
    fontFamily = quicksand,
    fontSize = 14.sp,
    fontWeight = FontWeight.Normal,
    color = Color.Gray
)

@Preview(showBackground = true)
@Composable
fun test() {
    Column {
//        LoremIpsum().values.forEach {
//            Text(text = it, fontFamily = quicksand, fontWeight = FontWeight.SemiBold)
//        }
        LoremIpsum().values.forEach {
            Text(text = it, style = SubSubTitleStyle)
        }
    }


}