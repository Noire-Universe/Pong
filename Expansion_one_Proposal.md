# Proposal:
The main idea of this Pong project is getting the game from a very generic demo mode to an interesting game to play,
which has some sort of AI that keeps the player challenged. To achieve this we will iterate the game in several steps.
This document outlines the first iteration.

## What do I want to do
In this first iteration of the Pong project, the focus (next to learing how to work with branches in GitHub) will be having
a more randomizied behaviour of the ball. Instead of just reversing the x axis on impact, I would like it to be a bit more
eratic and versatile in speed.

## Why do I want to do it
The way the ball is currently moving serves the purpose of the game, but it does not do anyting byond this. In other words
playing the game more than a couple of minutes gets boring. To keep the player a bit more interested, I would like the ball
to be a little less predictable on impact and on restart.

## How am I going to do it
Mainly I will use a range of randomizers for x axis, y axis, vertical speed and horizontal speed that gets reset on impact
on a player or on impact on the left or right border. Impact on the top or bottom of the screen should NOT change the 
current behaviour of the ball.

## Requirements:
### Requirements Gathering:
#### Questions to be answered:
1 Is a new technology needed to development the upgrade of the game?
2 What is the impact in all aspects if we not do the upgrade?
3 What are the current problems the game has?
4 How will the upgrade alleviate the above concerns?
5 What will be some of the development and integration problems e3ncountered  by the system's update

#### Requirements formulated in prose text: