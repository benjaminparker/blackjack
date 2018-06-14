package com.needstyping.blackjack

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class BlackjackSpec extends WordSpec {

  val blackjack = new Blackjack {}

  "Blackjack" should {

<<<<<<< HEAD
    "return YES when an Ace and a King are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return YES when an Ace and a Queen are dealt" in {
      blackjack.isBlackjack(Card(Ace, Diamonds), Card(Queen, Clubs)) shouldBe true
    }

    "return YES when an Ace and a Jack are dealt" in {
      blackjack.isBlackjack(Card(Jack, Diamonds), Card(Ace, Diamonds)) shouldBe true
    }

    "return NO when an Ace and a 10 are dealt" in {
      blackjack.isBlackjack(Card(Ten, Diamonds), Card(Ace, Hearts)) shouldBe false
=======
    "return true when an Ace and a picture card are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an Ace and a 10 are dealt" in {
      blackjack.isBlackjack(Card(Ten, Diamonds), Card(Ace, Hearts)) shouldBe true
>>>>>>> 5c0a4ff1f890e56e8c9c24253a835fa0d0ad56bc
    }
  }

}
