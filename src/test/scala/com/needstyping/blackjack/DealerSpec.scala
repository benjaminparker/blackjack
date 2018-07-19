package com.needstyping.blackjack

import org.scalatest.{Matchers, WordSpec}

class DealerSpec extends WordSpec with Matchers {

  private val deck: Set[Card] = Set(
    Card(Ace, Diamonds), Card(Two, Diamonds), Card(Three, Diamonds), Card(Four, Diamonds), Card(Five, Diamonds), Card(Six, Diamonds), Card(Seven, Diamonds), Card(Eight, Diamonds), Card(Nine, Diamonds), Card(Ten, Diamonds), Card(Jack, Diamonds), Card(Queen, Diamonds), Card(King, Diamonds),
    Card(Ace, Hearts), Card(Two, Hearts), Card(Three, Hearts), Card(Four, Hearts), Card(Five, Hearts), Card(Six, Hearts), Card(Seven, Hearts), Card(Eight, Hearts), Card(Nine, Hearts), Card(Ten, Hearts), Card(Jack, Hearts), Card(Queen, Hearts), Card(King, Hearts),
    Card(Ace, Clubs), Card(Two, Clubs), Card(Three, Clubs), Card(Four, Clubs), Card(Five, Clubs), Card(Six, Clubs), Card(Seven, Clubs), Card(Eight, Clubs), Card(Nine, Clubs), Card(Ten, Clubs), Card(Jack, Clubs), Card(Queen, Clubs), Card(King, Clubs),
    Card(Ace, Spades), Card(Two, Spades), Card(Three, Spades), Card(Four, Spades), Card(Five, Spades), Card(Six, Spades), Card(Seven, Spades), Card(Eight, Spades), Card(Nine, Spades), Card(Ten, Spades), Card(Jack, Spades), Card(Queen, Spades), Card(King, Spades)
  )

  "deal a card and remove from deck" in {
    val (card, newDeck) = Dealer.deal(deck)

    newDeck shouldNot contain(card)
    newDeck.size shouldEqual 51
  }
}

