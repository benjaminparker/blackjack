package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard.value == Ace || secondCard.value == Ace) && ((firstCard.value == King || secondCard.value == King) || (firstCard.value == Queen || secondCard.value == Queen) || (firstCard.value == Jack || secondCard.value == Jack))
}
