package com.needstyping.blackjack

object BlackjackGame extends BlackjackTable with BlackjackRules {

  def main(args: Array[String]): Unit = {
    println("Please enter a bet amount: ")
    val betAmount = scala.io.StdIn.readInt()
    println(s"Betting ... £$betAmount")

    val (dealerHand, playerHand, _, deck) = bet(betAmount, Card.completeDeck)

    println("Dealer has: " + dealerHand.mkString(","))
    println("You have: " + playerHand.mkString(","))


  }
}
