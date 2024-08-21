package com.example.ffcs

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val b1:ro=ro("","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","")
    var info:ClsDatas= ClsDatas(emptyList<ClsData>(),"",b1,null)
    var allinfo:List<ClsDatas> = listOf<ClsDatas>()
    val eachinfo:ClsData=ClsData("","",)
    /*val con =this
    val db = RoomDb.getDatabase(this)
    val userDao = db.taDao()
    fun insert(i:ClsDatas){
        viewModelScope.launch {
            userDao.insert(i)
        }

    }
    fun getda(){
        viewModelScope.launch {
            allinfo=userDao.getAllUsers()
        }
    }*/
fun isCont(a:ClsData,r:ro){
    val aa=a.slot.split("+")
    aa.forEach{
        sl->
        if(sl=="A1"){
            r.A1=a.fac
        }
        if(sl=="B1"){
            r.B1=a.fac
        }
        if(sl=="C1"){
            r.C1=a.fac
        }
        if(sl=="D1"){
            r.D1=a.fac
        }
        if (sl=="E1"){
            r.E1=a.fac
        }
        if(sl=="F1"){
            r.F1=a.fac
        }
        if(sl=="G1"){
            r.G1=a.fac
        }
        if(sl=="TA1" ){
            r.TA1=a.fac
        }
        if(sl=="TB1"){
            r.TB1=a.fac
        }
        if(sl=="TC1"){
            r.TC1=a.fac
        }
        if(sl=="TD1"){
            r.TD1=a.fac
        }
        if(sl=="TE1"){
            r.TE1=a.fac
        }
        if(sl=="TF1"){
            r.TF1=a.fac
        }
        if(sl=="TG1"){
            r.TG1=a.fac
        }
        if(sl=="TAA1"){
            r.TAA1=a.fac
        }
        if(sl=="TCC1"){
            r.TCC1=a.fac
        }
        if(sl=="A2"){
            r.A2=a.fac
        }
        if(sl=="B2"){
            r.B2=a.fac
        }
        if(sl=="C2"){
            r.C2=a.fac
        }
        if(sl=="D2"){
            r.D2=a.fac
        }
        if (sl=="E2"){
            r.E2=a.fac
        }
        if(sl=="F2"){
            r.F2=a.fac
        }
        if(sl=="G2"){
            r.G2=a.fac
        }
        if(sl=="TA2" ){
            r.TA2=a.fac
        }
        if(sl=="TB2"){
            r.TB2=a.fac
        }
        if(sl=="TC2"){
            r.TC2=a.fac
        }
        if(sl=="TD2"){
            r.TD2=a.fac
        }
        if(sl=="TE2"){
            r.TE2=a.fac
        }
        if(sl=="TF2"){
            r.TF2=a.fac
        }
        if(sl=="TG2"){
            r.TG2=a.fac
        }
        if(sl=="TAA2"){
            r.TAA2=a.fac
        }
        if(sl=="TCC2"){
            r.TCC1=a.fac
        }
        if(sl=="TDD2"){
            r.TDD2=a.fac
        }
        if(sl=="L1"){
            r.L1=a.fac
        }
        if(sl=="L2"){
            r.L2=a.fac
        }
        if(sl=="L3"){
            r.L3=a.fac
        }
        if(sl=="L4"){
            r.L4=a.fac
        }
        if (sl=="L5"){
            r.L5=a.fac
        }
        if(sl=="L6"){
            r.L6=a.fac
        }
        if(sl=="L7"){
            r.L7=a.fac
        }
        if(sl=="L8" ){
            r.L8=a.fac
        }
        if(sl=="L9"){
            r.L9=a.fac
        }
        if(sl=="L10"){
            r.L10=a.fac
        }
        if(sl=="L11"){
            r.L11=a.fac
        }
        if(sl=="L12"){
            r.L12=a.fac
        }
        if(sl=="L13"){
            r.L13=a.fac
        }
        if(sl=="L14"){
            r.L14=a.fac
        }
        if(sl=="L15"){
            r.L15=a.fac
        }
        if(sl=="L16"){
            r.L16=a.fac
        }
        if(sl=="L17"){
            r.L17=a.fac
        }
        if(sl=="L18"){
            r.L18=a.fac
        }
        if(sl=="L19"){
            r.L19=a.fac
        }
        if(sl=="L20"){
            r.L20=a.fac
        }
        if(sl=="L21"){
            r.L21=a.fac
        }
        if (sl=="L22"){
            r.L22=a.fac
        }
        if(sl=="L23"){
            r.L23=a.fac
        }
        if(sl=="L24"){
            r.L24=a.fac
        }
        if(sl=="L25" ){
            r.L25=a.fac
        }
        if(sl=="L26"){
            r.L26=a.fac
        }
        if(sl=="L27"){
            r.L27=a.fac
        }
        if(sl=="L28"){
            r.L28=a.fac
        }
        if(sl=="L29"){
            r.L29=a.fac
        }
        if(sl=="L30"){
            r.L30=a.fac
        }
        if(sl=="L31"){
            r.L31=a.fac
        }
        if(sl=="L32"){
            r.L32=a.fac
        }
        if(sl=="L33"){
            r.L33=a.fac
        }
        if(sl=="L34"){
            r.L34=a.fac
        }
        if (sl=="L35"){
            r.L35=a.fac
        }
        if(sl=="L36"){
            r.L36=a.fac
        }
        if(sl=="L37"){
            r.L37=a.fac
        }
        if(sl=="L38" ){
            r.L38=a.fac
        }
        if(sl=="L39"){
            r.L39=a.fac
        }
        if(sl=="L40"){
            r.L40=a.fac
        }
        if(sl=="L41"){
            r.L41=a.fac
        }
        if(sl=="L42"){
            r.L42=a.fac
        }
        if(sl=="L43"){
            r.L43=a.fac
        }
        if(sl=="L44"){
            r.L44=a.fac
        }
        if(sl=="L45"){
            r.L45=a.fac
        }
        if(sl=="L46"){
            r.L46=a.fac
        }
        if(sl=="L47"){
            r.L47=a.fac
        }
        if(sl=="L48"){
            r.L48=a.fac
        }
        if(sl=="L49"){
            r.L49=a.fac
        }
        if(sl=="L50"){
            r.L50=a.fac
        }
        if(sl=="L51"){
            r.L51=a.fac
        }
        if (sl=="L52"){
            r.L52=a.fac
        }
        if(sl=="L53"){
            r.L53=a.fac
        }
        if(sl=="L54"){
            r.L54=a.fac
        }
        if(sl=="L55" ){
            r.L55=a.fac
        }
        if(sl=="L56"){
            r.L56=a.fac
        }
        if(sl=="L57"){
            r.L57=a.fac
        }
        if(sl=="L58"){
            r.L58=a.fac
        }
        if(sl=="L59"){
            r.L59=a.fac
        }
        if(sl=="L60"){
            r.L60=a.fac
        }
        if(sl=="TBB2"){
            r.TBB2=a.fac
        }



    }

}

}