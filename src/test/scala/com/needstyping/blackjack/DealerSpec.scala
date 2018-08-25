package com.needstyping.blackjack

import org.scalatest.{Matchers, WordSpec}

class DealerSpec extends WordSpec with Matchers {

  "deal a card and remove from the deck" in {
    val (card, newDeck) = Dealer.deal(Card.completeDeck)

    newDeck shouldNot contain(card)
    newDeck.size shouldEqual 51
  }

  "deal two distinct cards from the deck" in {
    val (firstCard, newDeck) = Dealer.deal(Card.completeDeck)
    val (secondCard, newerDeck) = Dealer.deal(newDeck)

    firstCard shouldNot equal(secondCard)
    newerDeck.size shouldEqual 50
  }

  "deal to player and dealer" in {
    val (c1, d1) = Dealer.deal(Card.completeDeck)
    val (c2, d2) = Dealer.deal(d1)
    println(s"Player's cards : $c1 , $c2")

    val (c3, d3) = Dealer.deal(d2)
    println(s"Dealer's card : $c3")

    d3.size shouldBe 49
  }

}

