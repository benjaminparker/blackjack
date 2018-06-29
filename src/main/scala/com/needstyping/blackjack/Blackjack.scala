package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
    case (Card(_: TenValue, _), Card(Ace, _)) => true
    case (Card(Ace, _), Card(_: TenValue, _)) => true
    case _ => false
  }
}

