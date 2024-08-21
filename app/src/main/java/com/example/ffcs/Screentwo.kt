package com.example.ffcs

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SCtwo(viewmodel:MainViewModel,toTabl:(MainViewModel)->Unit){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.r3),
            contentDescription ="hi",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
    val f1= remember {
        mutableStateOf("")
    }
    val s1= remember {
        mutableStateOf("")
    }

    val l1= remember {
        mutableStateOf("")
    }
    val l11= remember {
        mutableStateOf("")
    }
    val f2= remember {
        mutableStateOf("")
    }
    val s2= remember {
        mutableStateOf("")
    }
    val s21= remember {
        mutableStateOf("")
    }
    val l2= remember {
        mutableStateOf("")
    }
    val l21= remember {
        mutableStateOf("")
    }
    val f3= remember {
        mutableStateOf("")
    }
    val s3= remember {
        mutableStateOf("")
    }
    val s31= remember {
        mutableStateOf("")
    }
    val l3= remember {
        mutableStateOf("")
    }
    val l31= remember {
        mutableStateOf("")
    }
    val f4= remember {
        mutableStateOf("")
    }
    val s4= remember {
        mutableStateOf("")
    }
    val s41= remember {
        mutableStateOf("")
    }
    val l4= remember {
        mutableStateOf("")
    }
    val l41= remember {
        mutableStateOf("")
    }
    val f5= remember {
        mutableStateOf("")
    }
    val s5= remember {
        mutableStateOf("")
    }
    val s51= remember {
        mutableStateOf("")
    }
    val l5= remember {
        mutableStateOf("")
    }
    val l51= remember {
        mutableStateOf("")
    }
    val f6= remember {
        mutableStateOf("")
    }
    val s6= remember {
        mutableStateOf("")
    }
    val s61= remember {
        mutableStateOf("")
    }
    val l6= remember {
        mutableStateOf("")
    }
    val l61= remember {
        mutableStateOf("")
    }
    val f7= remember {
        mutableStateOf("")
    }
    val s7= remember {
        mutableStateOf("")
    }
    val f8= remember {
        mutableStateOf("")
    }
    val f9= remember {
        mutableStateOf("")
    }
    val f10= remember {
        mutableStateOf("")
    }
    val f11= remember {
        mutableStateOf("")
    }
    val f12= remember {
        mutableStateOf("")
    }
    val f13= remember {
        mutableStateOf("")
    }
    val f14= remember {
        mutableStateOf("")
    }
    val s8= remember {
        mutableStateOf("")
    }
    val s9= remember {
        mutableStateOf("")
    }
    val s10= remember {
        mutableStateOf("")
    }
    val s11= remember {
        mutableStateOf("")
    }
    val s12= remember {
        mutableStateOf("")
    }
    val s13= remember {
        mutableStateOf("")
    }
    val s14= remember {
        mutableStateOf("")
    }
Column(modifier = Modifier
    .fillMaxSize()
    .verticalScroll(rememberScrollState())) {
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        Text("Sub-Faculty-Venue", modifier = Modifier
            .padding(8.dp)
            .width(200.dp), fontStyle = FontStyle.Italic, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, color = Color.Black, fontSize = 16.sp)
        Text("Slot", modifier = Modifier.padding(8.dp), fontStyle = FontStyle.Italic, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.Bold, color = Color.Black, fontSize = 16.sp)

    }
    Row (modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceEvenly
        ){
        OutlinedTextField(value =f1.value, onValueChange ={
            f1.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
            OutlinedTextField(value = s1.value, onValueChange = {
                s1.value=it
            }, modifier = Modifier
                .padding(8.dp)
                , singleLine = true
                )


    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f2.value, onValueChange ={
            f2.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s2.value, onValueChange = {
            s2.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f3.value, onValueChange ={
            f3.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s3.value, onValueChange = {
            s3.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f4.value, onValueChange ={
            f4.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s4.value, onValueChange = {
            s4.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f5.value, onValueChange ={
            f5.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s5.value, onValueChange = {
            s5.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f6.value, onValueChange ={
            f6.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s6.value, onValueChange = {
            s6.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f7.value, onValueChange ={
            f7.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s7.value, onValueChange = {
            s7.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f8.value, onValueChange ={
            f8.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s8.value, onValueChange = {
            s8.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f9.value, onValueChange ={
            f9.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s9.value, onValueChange = {
            s9.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f10.value, onValueChange ={
            f10.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s10.value, onValueChange = {
            s10.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f11.value, onValueChange ={
            f11.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s11.value, onValueChange = {
            s11.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f12.value, onValueChange ={
            f12.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s12.value, onValueChange = {
            s12.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f13.value, onValueChange ={
            f13.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s13.value, onValueChange = {
            s13.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        OutlinedTextField(value =f14.value, onValueChange ={
            f14.value=it
        } , modifier = Modifier
            .padding(8.dp)
            .width(200.dp))
        OutlinedTextField(value = s14.value, onValueChange = {
            s14.value=it
        }, modifier = Modifier.padding(8.dp), singleLine = true)

    }
    val title= remember {
        mutableStateOf("")
    }
    OutlinedTextField(value = title.value, onValueChange = {
        title.value=it
    }, modifier = Modifier.padding(8.dp), label = {
        Text(text = "Title", color = Color.DarkGray)
    })

Button(onClick = {
    var b=ro("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","")
                 val d1:ClsData=ClsData(f1.value,s1.value)
    val d2:ClsData=ClsData(f2.value,s2.value)
    val d3:ClsData=ClsData(f3.value,s3.value)
    val d4:ClsData=ClsData(f4.value,s4.value)
    val d5:ClsData=ClsData(f5.value,s5.value)
    val d6:ClsData=ClsData(f6.value,s6.value)
    val d7:ClsData=ClsData(f7.value,s7.value)
    val d8:ClsData=ClsData(f8.value,s8.value)
    val d9:ClsData=ClsData(f9.value,s9.value)
    val d10:ClsData=ClsData(f10.value,s10.value)
    val d11:ClsData=ClsData(f11.value,s11.value)
    val d12:ClsData=ClsData(f12.value,s12.value)
    val d13:ClsData=ClsData(f13.value,s13.value)
    val d14:ClsData=ClsData(f14.value,s14.value)
    val da:List<ClsData> = listOf<ClsData>(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14)
    viewmodel.info= ClsDatas(da,title.value,b,viewmodel.allinfo.size+1)
    viewmodel.allinfo += viewmodel.info
    toTabl(viewmodel)

                 }, modifier = Modifier.align(Alignment.CenterHorizontally),
    colors = ButtonDefaults.buttonColors(Color.Cyan)
) {
    Text(text = "Next", color = Color.Black)
    
}

}

}


@Preview(showBackground = true)
@Composable
fun Sctwo(){
    val m:MainViewModel= viewModel()
    SCtwo(m,{})
}