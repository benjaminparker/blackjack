package com.needstyping.blackjack

import org.scalatest.{Matchers, WordSpec}

class BlackjackGameSpec extends WordSpec with Matchers {

  val game = new BlackjackGame {}

  "Placing a bet" should {

    "give dealers and players hand with the bet" in {
      val (d, p, b)  = game.bet(10)

      d should not be empty
      p should not be empty
      b shouldEqual 10
    }
  }

}
