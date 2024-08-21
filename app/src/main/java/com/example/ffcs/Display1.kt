package com.example.ffcs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.BottomAppBarDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FirstScreen(viewModel: MainViewModel,oneToTwo:()->Unit,oneToThree:(Int)->Unit){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.r3),
            contentDescription ="hi",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }
    var a= remember {
     mutableStateOf(viewModel.allinfo)
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Button(onClick = { oneToTwo() }, colors = ButtonDefaults.buttonColors(Color.Cyan),
            modifier = Modifier.padding(8.dp)
                ) {
            Text(text = "Add Time table",
                color = Color.Black
                )

            Icon(imageVector = Icons.Default.ArrowForward, contentDescription ="Next",
                tint = Color.Black, modifier = Modifier.padding(8.dp)
            )

        }
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)) {
            items(a.value){
                cc->
                EachTT(clsdata = cc,viewModel, { a.value-=cc
                viewModel.allinfo-=cc
                },{ oneToThree(cc.id!!) } )
                Spacer(modifier = Modifier.padding(4.dp))

            }

        }

    }

}

@Composable
fun EachTT(clsdata:ClsDatas,vm:MainViewModel,onCl:()->Unit,onv:(ClsDatas)->Unit){
    Row (modifier = Modifier
        .fillMaxWidth()
        .border(
            BorderStroke(2.dp, color = Color.Black),
            shape = RoundedCornerShape(20)
        )
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
        ){
        Text(text = clsdata.title, modifier = Modifier
            .padding(8.dp)
            .align(Alignment.CenterVertically), fontWeight = FontWeight.Bold, fontFamily = FontFamily.Cursive, fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(16.dp))
        IconButton(onClick = {
            onv(clsdata)

        }) {
            Icon(imageVector = Icons.Default.Build, contentDescription = "View Time table")

        }
        Spacer(modifier = Modifier.padding(16.dp))
        IconButton(onClick = {
                onCl()
        }) {
            Icon(imageVector = Icons.Default.Delete, contentDescription = "Delete")

        }



    }
}
@Preview(showBackground = true)
@Composable
fun pr(){
    val vm:MainViewModel= viewModel()
    //EachTT(clsdata = ClsDatas(emptyList(),"TT1") )
    FirstScreen(vm,{},{})
}