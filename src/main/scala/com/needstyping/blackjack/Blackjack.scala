package com.needstyping.blackjack

trait Blackjack {
  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = {
    if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == King || secondCard.value == King)) true
    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Queen || secondCard.value == Queen)) true
    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Jack || secondCard.value == Jack)) true
    else false
  }
}
