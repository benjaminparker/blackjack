package com.needstyping.blackjack

trait Blackjack {

//  def isBlackjack(firstCard: Card, secondCard: Card): Boolean = {
//    if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == King || secondCard.value == King)) true
//    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Queen || secondCard.value == Queen)) true
//    else if ((firstCard.value == Ace || secondCard.value == Ace) && (firstCard.value == Jack || secondCard.value == Jack)) true
//    else false
//  }

  //I wrote tests and they all pass everything works but I'm not sure this is what you meant.
    def isBlackjack(firstCard: Card, secondCard: Card): Boolean = (firstCard, secondCard) match {
      case (Card(Ace, _,false), Card(King, _,true)) => true
      case (Card(King, _,true), Card(Ace, _,false)) => true
      case (Card(Ace, _,false), Card(Ten, _,true)) => true
      case (Card(Ten, _,true), Card(Ace, _,false)) => true
      case _ => false
    }
}

