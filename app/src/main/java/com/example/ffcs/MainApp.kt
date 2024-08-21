package com.example.ffcs

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

@SuppressLint("SuspiciousIndentation")
@Composable
fun MainApp(navCont:NavHostController){
    val vm:MainViewModel= viewModel()
    //vm.getda()
        NavHost(navController = navCont, startDestination = "one"){

            composable("one"){
                FirstScreen(viewModel = vm,{
                                           navCont.navigate("two")

                },{
                    navCont.currentBackStackEntry?.savedStateHandle?.set("K1",it)
                    navCont.navigate("three")
                })
            }
            composable("two"){
            SCtwo(viewmodel = vm) {
                navCont.navigate("three")
                
            }
            }
            composable("three"){
                val y= navCont.previousBackStackEntry?.savedStateHandle?.get<Int>("K1")
                Table(view = vm,y)
            }

        }


}