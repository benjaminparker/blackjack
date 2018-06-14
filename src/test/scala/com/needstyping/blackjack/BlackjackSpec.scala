package com.needstyping.blackjack

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class BlackjackSpec extends WordSpec {

  val blackjack = new Blackjack {}

  "Blackjack" should {

    "return true when an Ace and a King are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs, false), Card(King, Spades, true)) shouldBe true
    }

    "return true when an King and a Ace are dealt" in {
      blackjack.isBlackjack(Card(King, Diamonds, true), Card(Ace, Spades,false)) shouldBe true
    }

    "return true when an Ace and a Jack are dealt" in {
      blackjack.isBlackjack(Card(Ace, Hearts, false), Card(Ten, Hearts ,true)) shouldBe true
    }

    "return true when an Ace and a picture card are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs, false), Card(King, Spades, true)) shouldBe true
    }

    "return true when an Ace and a 10 are dealt" in {
      blackjack.isBlackjack(Card(Ten, Diamonds,true), Card(Ace, Hearts, false)) shouldBe true
    }

  }
}
