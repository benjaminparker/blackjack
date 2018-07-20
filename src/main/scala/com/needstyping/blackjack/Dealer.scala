package com.needstyping.blackjack

object Dealer {
  def deal: Set[Card] => (Card, Set[Card]) = deck => {
    def randomCard: Card = {
      val r = new scala.util.Random().nextInt(deck.size)
      deck.toList(r)
    }

    val c = randomCard
    (c, deck - c)
  }
}
