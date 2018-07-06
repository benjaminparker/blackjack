package com.needstyping.blackjack

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class BlackjackRulesSpec extends WordSpec {

  val rules = new BlackjackRules {}

  "isBlackjack" should {

    "return true when an Ace and a King are dealt" in {
      rules.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an King and a Ace are dealt" in {
      rules.isBlackjack(Card(King, Diamonds), Card(Ace, Spades)) shouldBe true
    }

    "return true when an Ace and a Jack are dealt" in {
      rules.isBlackjack(Card(Ace, Hearts), Card(Ten, Hearts)) shouldBe true
    }

    "return true when an Ace and a picture card are dealt" in {
      rules.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an Ace and a 10 are dealt" in {
      rules.isBlackjack(Card(Ten, Diamonds), Card(Ace, Hearts)) shouldBe true
    }

  }

  "winner" should {
      "return dealer when the dealer wins the hand" in {
        rules.winner(
          dealersHand = List(Card(Seven, Clubs), Card(Two, Hearts), Card(Jack, Diamonds)),
          playersHand = List(Card(Ten, Clubs), Card(Eight, Spades))
        ) shouldEqual "Dealer"
    }
  }
}

