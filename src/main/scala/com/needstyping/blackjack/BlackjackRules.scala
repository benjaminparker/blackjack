package com.needstyping.blackjack

trait BlackjackRules {

  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(v: Name, _), Card(Ace, _)) => v.score == 10
    case (Card(Ace, _), Card(v: Name, _)) => v.score == 10
    case _ => false
  }

  def winner(dealersHand: List[Card], playersHand: List[Card]): String = {
    val dealersScore = dealersHand.map(_.name.score).sum
    val playersScore = playersHand.map(_.name.score).sum
    if (dealersScore > playersScore) "Dealer" else "Player"
  }
}

