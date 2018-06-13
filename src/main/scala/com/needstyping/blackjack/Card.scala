package com.needstyping.blackjack

sealed trait Suit
case object Hearts extends Suit
case object Diamonds extends Suit
case object Spades extends Suit
case object Clubs extends Suit

sealed trait Value
case object King extends Value
case object Ace extends Value
case object Ten extends Value

case class Card(value: Value, suit: Suit)
