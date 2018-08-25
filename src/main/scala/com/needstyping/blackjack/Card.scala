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

case object Card {
  val completeDeck: Set[Card] = Set(
    Card(Ace, Diamonds), Card(Two, Diamonds), Card(Three, Diamonds), Card(Four, Diamonds), Card(Five, Diamonds), Card(Six, Diamonds), Card(Seven, Diamonds), Card(Eight, Diamonds), Card(Nine, Diamonds), Card(Ten, Diamonds), Card(Jack, Diamonds), Card(Queen, Diamonds), Card(King, Diamonds),
    Card(Ace, Hearts), Card(Two, Hearts), Card(Three, Hearts), Card(Four, Hearts), Card(Five, Hearts), Card(Six, Hearts), Card(Seven, Hearts), Card(Eight, Hearts), Card(Nine, Hearts), Card(Ten, Hearts), Card(Jack, Hearts), Card(Queen, Hearts), Card(King, Hearts),
    Card(Ace, Clubs), Card(Two, Clubs), Card(Three, Clubs), Card(Four, Clubs), Card(Five, Clubs), Card(Six, Clubs), Card(Seven, Clubs), Card(Eight, Clubs), Card(Nine, Clubs), Card(Ten, Clubs), Card(Jack, Clubs), Card(Queen, Clubs), Card(King, Clubs),
    Card(Ace, Spades), Card(Two, Spades), Card(Three, Spades), Card(Four, Spades), Card(Five, Spades), Card(Six, Spades), Card(Seven, Spades), Card(Eight, Spades), Card(Nine, Spades), Card(Ten, Spades), Card(Jack, Spades), Card(Queen, Spades), Card(King, Spades)
  )
}