package com.needstyping.blackjack

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class BlackjackSpec extends WordSpec {

  val blackjack = new Blackjack {}

  "isBlackjack" should {

    "return true when an Ace and a King are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an King and a Ace are dealt" in {
      blackjack.isBlackjack(Card(King, Diamonds), Card(Ace, Spades)) shouldBe true
    }

    "return true when an Ace and a Jack are dealt" in {
      blackjack.isBlackjack(Card(Ace, Hearts), Card(Ten, Hearts)) shouldBe true
    }

    "return true when an Ace and a picture card are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an Ace and a 10 are dealt" in {
      blackjack.isBlackjack(Card(Ten, Diamonds), Card(Ace, Hearts)) shouldBe true
    }

  }

  "winner" should {
      "return dealer when the dealer wins the hand" in {
        blackjack.winner(
          dealersHand = List(Card(Seven, Clubs), Card(Two, Hearts), Card(Jack, Diamonds)),
          playersHand = List(Card(Ten, Clubs), Card(Eight, Spades))
        ) shouldEqual "Dealer"
    }
  }
}

