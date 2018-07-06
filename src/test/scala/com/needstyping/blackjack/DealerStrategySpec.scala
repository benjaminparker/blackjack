package com.needstyping.blackjack

import org.scalatest.{Matchers, WordSpec}

class DealerStrategySpec extends WordSpec with Matchers {

  val strategy = new DealerStrategy{}

  "Dealer strategy" should {

    "take a card when hand is worth less than 17" in {
      val handWorth14 =  List(Card(Jack, Spades), Card(Four, Diamonds))
      strategy.shouldTakeCard(handWorth14) shouldBe true
    }

    "don't take a card for hand worth more than 16" in {
      val handWorth19 = List(Card(Two, Hearts), Card(Queen, Spades), Card(Seven, Diamonds))
      strategy.shouldTakeCard(handWorth19) shouldBe false
    }
  }
}
