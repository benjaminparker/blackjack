package com.needstyping.blackjack

object Dealer {
  def deal: Set[Card] => (Card, Set[Card]) = deck => (deck.head, deck.tail)
}
