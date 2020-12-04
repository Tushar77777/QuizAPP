package com.example.myquizzapp



object Constant{



fun getQuestion():ArrayList<Question>{
    val questionList=ArrayList<Question>()
    val que1=Question(1,"Guess The Name Of the Player",R.drawable.oip,"Chutya",":Gandu","bhosdika","Loda",1)
    questionList.add(que1)
    val que2=Question(1,"Guess The Name Of the Player",R.drawable.oip,"Chutya",":Gandu","bhosdika","Loda",1)
    questionList.add(que2)

    val que3=Question(1,"Guess The Name Of the Player",R.drawable.oip,"Chutya",":Gandu","bhosdika","Loda",1)
    questionList.add(que3)
    return questionList

}}