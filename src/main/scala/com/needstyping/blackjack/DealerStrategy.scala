package com.needstyping.blackjack

trait DealerStrategy {
  def shouldTakeCard: List[Card] => Boolean = hand => hand.map(_.name.score).sum < 17
}
