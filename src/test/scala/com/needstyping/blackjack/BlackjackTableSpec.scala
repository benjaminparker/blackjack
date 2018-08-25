package com.needstyping.blackjack

import org.scalatest.{Matchers, WordSpec}

class BlackjackTableSpec extends WordSpec with Matchers {

  val game = new BlackjackTable {}

  "Placing a bet" should {

    "give dealer one card and the player two cards along with the bet" in {
      val (dh, ph, bet, deck) = game.bet(10, Card.completeDeck)

      dh.size shouldBe 1
      ph.size shouldBe 2
      bet shouldEqual 10
      deck.size shouldBe 49
    }
  }

  "Asking for a card" should {

    "give the player an extra card" in {
      val playerHand = List(Card(King, Diamonds), Card(Seven, Clubs))
      val (ph, deck) = game.card(playerHand, Card.completeDeck)

      ph.size shouldBe 3
      deck.size shouldBe 51
    }
  }

}
