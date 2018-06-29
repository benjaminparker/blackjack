package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(v: Value, _), Card(Ace, _)) => v.score == 10
    case (Card(Ace, _), Card(v: Value, _)) => v.score == 10
    case _ => false
  }

  def winner(dealersHand: List[Card], playersHand: List[Card]): String = {
    val dealersScore = dealersHand.map(_.value.score).sum
    val playersScore = playersHand.map(_.value.score).sum
    if (dealersScore > playersScore) "Dealer" else "foo"
  }
}

