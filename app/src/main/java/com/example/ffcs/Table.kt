package com.example.ffcs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun Table(view:MainViewModel, iii:Int?){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.r3),
            contentDescription ="hi",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
    }


    Column(modifier = Modifier
        .fillMaxSize()
    ) {

        val OpMon= remember {
            mutableStateOf(false)
        }
        val OpTue= remember {
            mutableStateOf(false)
        }
        val Opwed= remember {
            mutableStateOf(false)
        }
        val OpThur= remember {
            mutableStateOf(false)
        }
        val OpFri= remember {
            mutableStateOf(false)
        }
        var bb=ro("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","")

        val days= listOf<String>("Mon","Tues","Wed","Thur","Fri")


    if(iii !=null){
        if(iii >=0 ){
            var ind:Int=1
            view.allinfo.forEach {
                    cls->
                if(cls.id==iii){
                    cls.datas.forEach {
                            da->
                        view.isCont(da,bb)
                        view.isCont(da,cls.r)

                    }
                    ind++

                }

            }

        }

    }else{
        view.allinfo.forEach {
                cls->
            cls.datas.forEach {
                    da->
                view.isCont(da,bb)
                view.isCont(da,cls.r)
            }
            bb=cls.r

        }
    }





        val Mo= listOf("A1/L1 -${
            if(bb.A1!=""){
                bb.A1
            }else{
                bb.L1
            }
        }","F1/L2 -${
            if(bb.F1!=""){
                bb.F1
            }else{
                bb.L2
            }
        }","D1/L3 -${
            if(bb.D1!=""){
                bb.D1
            }else{
                bb.L3
            }
        }","TB1/L4 -${
            if(bb.TB1!=""){
                bb.TB1
            }else{
                bb.L4
            }
        }", "TG1/L5 -${
            if(bb.TG1!=""){
                bb.TG1
            }else{
                bb.L5
            }
        }","None","A2/L31 -${if(bb.A2!=""){
            bb.A2
        }else{
            bb.L31
        }}","F2/L32-${
            if(bb.F2!=""){
                bb.F2
            }else{
                bb.L32
                
            }
        }","D2/L33-${
            if(bb.D2!=""){
                bb.D2
            }else{
                bb.L33
            }
        }","TB2/L34-${
            if(bb.TB2!=""){
                bb.TB2
            }else{
                bb.L34
            }
        }","TG2/L35-${
            if(bb.TG2!=""){
                bb.TG2
            }else{
                bb.L35
            }
        }")
        val Tue= listOf("B1/L7 -${
            if(bb.B1!=""){
                bb.B1
            }else{
                bb.L7
            }
        }","G1/L8 -${
            if(bb.G1!=""){
                bb.G1
            }else{
                bb.L8
            }
        }","E1/L9 -${
            if(bb.E1!=""){
                bb.E1
            }else{
                bb.L9
            }
        }","TC1/L10 -${
            if(bb.TE1!=""){
                bb.TE1
            }else{
                bb.L10
            }
        }","TAA1/L11 -${
            if(bb.TAA1!=""){
                bb.TAA1
            }else{
                bb.L11
            }
        }","None/L12-${
            bb.L12
        }","B2/L37-${
            if(bb.B2!=""){
                bb.B2
            }else{
                bb.L37
            }
        }","G2/L38-${
            if(bb.G2!=""){
                bb.G2
            }else{
                bb.L38
            }
        }","E2/L39-${
            if(bb.E2!=""){
                bb.E2
            }else{
                bb.L39
            }
        }","TC2/L40-${
            if(bb.TC2!=""){
                bb.TC2
            }else{
                bb.L40
            }
        }","TAA2/L41-${
            if(bb.TAA2!=""){
                bb.TAA2
            }else{
                bb.L41
            }
        }","None/L42-${
            bb.L42
        }","V4/None")
        val Wed= listOf("C1/L13 -${
            if(bb.C1!=""){
                bb.C1
            }else{
                bb.L13
            }
        }","A1/L14 -${
            if(bb.A1!=""){
                bb.A1
            }else{
                bb.L14
            }
        }","F1/L15 -${
            if(bb.F1!=""){
                bb.F1
            }else{
                bb.L15
            }
        }","V1/L16 -${bb.L16} ","V2/L17-${bb.L17}","None/L18-${
            bb.L18
        }","Lunch","C2/L43-${
            if(bb.C2!=""){
                bb.C2
            }else{
                bb.L43
            }
        }","A2/L44-${
            if(bb.A2!=""){
                bb.A2
            }else{
                bb.L44
            }
        }","F2/L45-${
            if(bb.F2!=""){
                bb.F2
            }else{
                bb.L45
            }
        }","TD2/L46-${
            if(bb.TD2!=""){
                bb.TD2
            }else{
                bb.L46
            }
        }","TBB2/L47-${
            if(bb.TBB2!=""){
                bb.TBB2
            }else{
                bb.L47
            }
        }","None/L48-${
            bb.L48
        }","V5/None")
        val Thu= listOf("D1/L19 -${
            if(bb.D1!=""){
                bb.D1
            }else{
                bb.L19
            }
        }","B1/L20 -${
            if(bb.B1!=""){
                bb.B1
            }else{
                bb.L20
            }
        }","G1/L21 -${
            if(bb.G1!=""){
                bb.G1
            }else{
                bb.L21
            }
        }","TE1/L22 -${
            if(bb.TE1!=""){
                bb.TE1
            }else{
                bb.L22
            }
        }","TCC1/L23 -${
            if(bb.TCC1!=""){
                bb.TCC1
            }else{
                bb.L23
            }
        }","None/L24-${bb.L24}","D2/L49-${
            if(bb.D2!=""){
                bb.D2
            }else{
                bb.L49
            }
        }","B2/L50-${
            if(bb.B2!=""){
                bb.B2
            }else{
                bb.L50
            }
        }","G2/L51-${
            if(bb.G2!=""){
                bb.G2
            }else{
                bb.L51
            }
        }","TE2/L52-${
            if(bb.TE2!=""){
                bb.TE2
            }else{
                bb.L52
            }
        }","TCC2/L53-${
            if(bb.TCC2!=""){
                bb.TCC2
            }else{
                bb.L53
            }
        }","None/L54-${bb.L54}","V6/None")
        val Fri = listOf("E1/L25 -${
            if(bb.E1!=""){
                bb.E1
            }else{
                bb.L25
            }
        }","C1/L26 -${
            if(bb.C1!=""){
                bb.C1
            }else{
                bb.L26
            }
        }","TA1/L27 -${
            if(bb.TA1!=""){
                bb.TA1
            }else{
                bb.L27
            }
        }","TF1/L28 -${
            if(bb.TF1!=""){
                bb.TF1
            }else{
                bb.L28
            }
        }","TD1/L29 -${
            if(bb.TD1!=""){
                bb.TD1
            }else{
                bb.L29
            }
        }","None/L30-${
            bb.L30
        }","Lunch","E2/L55-${
            if(bb.E2!=""){
                bb.E2
            }else{
                bb.L55
            }
        }","C2/L56-${
            if(bb.C2!=""){
                bb.C2
            }else{
                bb.L56
            }
        }","TA2/L57-${
            if(bb.TA2!=""){
                bb.TA2
            }else{
                bb.L57
            }
        }","TF2/L58-${
            if(bb.TF2!=""){
                bb.TF2
            }else{
                bb.L58
            }
        }","TDD2/L59 -${
            if(bb.TDD2!=""){
                bb.TDD2
            }else{
                bb.L59
            }
        }","None/L60-${bb.L60}","V7/None")
        LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            items(days){day->
                Button(onClick = {
                                 when(day){
                                     "Mon"->{OpMon.value=true
                                     Opwed.value=false
                                         OpTue.value=false
                                         OpThur.value=false
                                         OpFri.value=false
                                     }
                                     "Tues"->{OpTue.value=true
                                     OpMon.value=false
                                         Opwed.value=false
                                         OpThur.value=false
                                         OpFri.value=false
                                     }
                                     "Wed"->{Opwed.value=true
                                     OpMon.value=false
                                         OpTue.value=false
                                         OpThur.value=false
                                         OpFri.value=false
                                     }
                                     "Thur"->{OpThur.value=true
                                         Opwed.value=false
                                         OpMon.value=false
                                         OpTue.value=false
                                         OpFri.value=false
                                     }
                                     "Fri"->{OpFri.value=true
                                         Opwed.value=false
                                         OpMon.value=false
                                         OpTue.value=false
                                         OpThur.value=false

                                     }
                                 }
                }, colors = ButtonDefaults.buttonColors(Color.Black), shape = CutCornerShape(12.dp)) {
                    Text(day)
                }
            }

        }

            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)) {
                if(OpMon.value){
                    items(Mo){
                            s->
                        val l=s.split("-")
                        Row(modifier = Modifier
                            .border(
                                border = BorderStroke(2.dp, color = Color.Black),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            var i1:Int=0
                            l.forEach{
                                i->

                                var str=""
                                when(i1){
                                    0->{str="Slot:"}
                                    1->{str="Subject:"}
                                    2->{str="Faculty:"}
                                    3->{str="Venue:"}
                                }
                                Column {
                                    Text(text = str, modifier = Modifier.padding(4.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                    Text(text = i, modifier = Modifier.padding(8.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                }
                                i1++

                            }

                        }
                        Spacer(modifier = Modifier.padding(4.dp))
                    }
                }
                if(OpTue.value){
                    items(Tue){
                            s->
                        val l=s.split("-")
                        Row(modifier = Modifier
                            .border(
                                border = BorderStroke(2.dp, color = Color.Black),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            var i1:Int=0
                            l.forEach{
                                    i->
                                var str=""
                                when(i1){
                                    0->{str="Slot:"}
                                    1->{str="Subject:"}
                                    2->{str="Faculty:"}
                                    3->{str="Venue:"}
                                }
                                Column {
                                    Text(text = str, modifier = Modifier.padding(4.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                    Text(text = i, modifier = Modifier.padding(8.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                }
                                i1++

                            }

                        }
                        Spacer(modifier = Modifier.padding(4.dp))
                    }


                }
                if(Opwed.value){
                    items(Wed){
                            s->
                        val l=s.split("-")
                        Row(modifier = Modifier
                            .border(
                                border = BorderStroke(2.dp, color = Color.Black),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            var i1:Int=0
                            l.forEach{
                                    i->

                                var str=""
                                when(i1){
                                    0->{str="Slot:"}
                                    1->{str="Subject:"}
                                    2->{str="Faculty:"}
                                    3->{str="Venue:"}
                                }
                                Column {
                                    Text(text = str, modifier = Modifier.padding(4.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                    Text(text = i, modifier = Modifier.padding(8.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                }
                                i1++

                            }
                        }
                        Spacer(modifier = Modifier.padding(4.dp))
                    }
                }
                if(OpThur.value){
                    items(Thu){
                            s->
                        val l=s.split("-")
                        Row(modifier = Modifier
                            .border(
                                border = BorderStroke(2.dp, color = Color.Black),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            var i1:Int=0
                            l.forEach{
                                    i->

                                var str=""
                                when(i1){
                                    0->{str="Slot:"}
                                    1->{str="Subject:"}
                                    2->{str="Faculty:"}
                                    3->{str="Venue:"}
                                }
                                Column {
                                    Text(text = str, modifier = Modifier.padding(4.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                    Text(text = i, modifier = Modifier.padding(8.dp), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
                                }
                                i1++

                            }

                        }
                        Spacer(modifier = Modifier.padding(4.dp))
                    }
                }
                if(OpFri.value){
                    items(Fri){
                            s->
                        val l=s.split("-")
                        Row(modifier = Modifier
                            .border(
                                border = BorderStroke(2.dp, color = Color.Black),
                                shape = RoundedCornerShape(20)
                            )
                            .fillMaxWidth()
                            .padding(16.dp)) {
                            var i1:Int=0
                            l.forEach{
                                    i->

                                var str=""
                                when(i1){
                                    0->{str="Slot:"}
                                    1->{str="Subject:"}
                                    2->{str="Faculty:"}
                                    3->{str="Venue:"}
                                }
                                Column {
                                    Text(text = str, modifier = Modifier.padding(4.dp), fontWeight = FontWeight.Bold)
                                    Text(text = i, modifier = Modifier.padding(8.dp), fontWeight = FontWeight.Bold)
                                }
                                i1++

                            }

                        }
                        Spacer(modifier = Modifier.padding(4.dp))
                    }
                }



            }





    }
}


data class hi(val name:String,val id:Int)
@Preview(showBackground = true)
@Composable
fun p(){
    val n:MainViewModel= viewModel()
    Table(view = n,null)
}