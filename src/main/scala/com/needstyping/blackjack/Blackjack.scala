package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(Ace, _), Card(King, _)) => true
    case (Card(King, _), Card(Ace, _)) => true
    case (Card(Ace, _), Card(Ten, _)) => true
    case (Card(Ten, _), Card(Ace, _)) => true
    case _ => false
  }
}
