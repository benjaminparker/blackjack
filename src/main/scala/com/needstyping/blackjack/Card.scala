package com.needstyping.blackjack

sealed trait Suit
case object Hearts extends Suit
case object Diamonds extends Suit
case object Spades extends Suit
case object Clubs extends Suit

sealed trait Value{
  def score: Int
}

case object King extends Value { val score = 10 }
case object Queen extends Value { val score = 10 }
case object Jack extends Value { val score = 10 }
case object Ten extends Value { val score = 10 }
case object Nine extends Value { val score = 9 }
case object Eight extends Value { val score = 8 }
case object Seven extends Value { val score = 7 }
case object Six extends Value { val score = 6 }
case object Five extends Value { val score = 5 }
case object Four extends Value { val score = 4 }
case object Three extends Value { val score = 3 }
case object Two extends Value { val score = 2 }
case object Ace extends Value { val score = 1 }

case class Card(value: Value, suit: Suit)
