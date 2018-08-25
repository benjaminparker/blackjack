package com.needstyping.blackjack

trait BlackjackTable {

  def bet: (Int, Set[Card]) => (List[Card], List[Card], Int, Set[Card]) = (bet, deck) => {
    val (playerCard1, d1) = Dealer.deal(deck)
    val (dealerCard, d2) = Dealer.deal(d1)
    val (playerCard2, d3) = Dealer.deal(d2)
    (List(dealerCard), List(playerCard1, playerCard2), bet, d3)
  }

  def card(hand: List[Card], deck: Set[Card]): (List[Card], Set[Card]) = {
    val (newCard, newDeck) = Dealer.deal(deck)
    (hand :+ newCard, newDeck)
  }
}
