package com.needstyping.blackjack

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class BlackjackSpec extends WordSpec {

  val blackjack = new Blackjack {}

  "Blackjack" should {

    "return true when an Ace and a picture card are dealt" in {
      blackjack.isBlackjack(Card(Ace, Clubs), Card(King, Spades)) shouldBe true
    }

    "return true when an Ace and a 10 are dealt" in {
      blackjack.isBlackjack(Card(Ten, Diamonds), Card(Ace, Hearts)) shouldBe true
    }
  }

}
