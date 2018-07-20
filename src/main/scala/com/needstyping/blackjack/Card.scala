package com.needstyping.blackjack

sealed trait Suit
case object Hearts extends Suit
case object Diamonds extends Suit
case object Spades extends Suit
case object Clubs extends Suit

sealed trait Name{
  def score: Int
}

case object King extends Name { val score = 10 }
case object Queen extends Name { val score = 10 }
case object Jack extends Name { val score = 10 }
case object Ten extends Name { val score = 10 }
case object Nine extends Name { val score = 9 }
case object Eight extends Name { val score = 8 }
case object Seven extends Name { val score = 7 }
case object Six extends Name { val score = 6 }
case object Five extends Name { val score = 5 }
case object Four extends Name { val score = 4 }
case object Three extends Name { val score = 3 }
case object Two extends Name { val score = 2 }
case object Ace extends Name { val score = 1 }

case class Card(name: Name, suit: Suit) {
  override def toString: String = s"$name of $suit"
}
