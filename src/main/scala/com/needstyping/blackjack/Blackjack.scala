package com.needstyping.blackjack

trait Blackjack {
<<<<<<< HEAD
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = {
    if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == King || secondCard.value == King)) true
    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Queen || secondCard.value == Queen)) true
    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Jack || secondCard.value == Jack)) true
    else false
=======
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(Ace, _), Card(King, _)) => true
    case (Card(King, _), Card(Ace, _)) => true
    case (Card(Ace, _), Card(Ten, _)) => true
    case (Card(Ten, _), Card(Ace, _)) => true
    case _ => false
>>>>>>> 5c0a4ff1f890e56e8c9c24253a835fa0d0ad56bc
  }
}
