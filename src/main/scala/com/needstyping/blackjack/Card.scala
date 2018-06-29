package com.needstyping.blackjack

sealed trait Suit
case object Hearts extends Suit
case object Diamonds extends Suit
case object Spades extends Suit
case object Clubs extends Suit

trait Value
trait TenValue extends Value

case object King extends TenValue
case object Queen extends TenValue
case object Jack extends TenValue
case object Ten extends TenValue
case object Nine extends Value
case object Eight extends Value
case object Seven extends Value
case object Six extends Value
case object Five extends Value
case object Four extends Value
case object Three extends Value
case object Two extends Value
case object Ace extends Value

case class Card(value: Value, suit: Suit)
