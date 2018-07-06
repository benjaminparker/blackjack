package com.needstyping.blackjack

trait BlackjackGame {

  def bet:  Int => (List[Card], List[Card], Int) = b => {
    (List(Card(Seven, Diamonds)), List(Card(Queen, Spades), Card(Three, Hearts)), b)
  }
}
