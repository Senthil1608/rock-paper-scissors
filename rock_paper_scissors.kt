package com.example.basics_001

fun main()
{
    var userPoints = 0 //initializing user  point to 0
    var computerPoints = 0 //initializing computer point to 0
   //check if both user and computer has not reached max target
    while(userPoints < 5 && computerPoints< 5) {
        println("Rock Paper or Scissors ? \n 1. Rock \n 2. Paper \n 3. Scissors")
        //input user choice here
        val userInput = readln().toInt()
        //generate random choice for computer ranging 1 to 3
        val computerInput = (1..3).random()
        println("computer's choice $computerInput")
        //if rock over paper , paper wins
        if(computerInput == 1 && userInput == 2) {
            userPoints += 1
            println("User Scores")
        }  //if paper over scissors , scissor wins
        else if(computerInput == 2 && userInput == 3)
        {
            userPoints+=1
            println("User Scores")
        } //if scissors over rock,rock wins
        else if(computerInput == 3 && userInput == 1)
        {
            userPoints+=1
            println("User Scores")
        } //if scissors over paper, scissors wins
        else if(computerInput - userInput == 0){
            println("Same choices no points")
        } //if no valid input , ranging outside 1 to 3 an error message thrown
        else{
            println("Computer Scores")
            computerPoints+=1
        }

    }
    //find if user win
    if(userPoints == 5)
    {
        println("User wins over computer") //user win message
        println("user points $userPoints") //user points
        println("computer points $computerPoints") //computer points
    }
    // if computer wins
    else
    {
        println("Computer wins over user") //computer win message
        println("computer points $computerPoints") // computer points
        println("user points $userPoints") // user points
    }
}
