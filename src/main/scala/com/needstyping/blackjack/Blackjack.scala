package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(_, _, true), Card(Ace, _, _)) => true
    case (Card(Ace, _, false), Card(_, _, true)) => true
    case _ => false
  }
}

