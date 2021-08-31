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


-------------------------------------------------------
# Proposal Cover:
- Pong iteration phase I
- #NS-P1
- To the casual reader of the internet.
- Contact us on: noireuniverse@gmail.com
- St Ives, 31st September 2021

# Proposal executive Summary:
## Intro:
The Pong game in its current state is a nice demo for very simple game mechanics and how these mechanics can be implementd in Java on a very basic level. But in its current state the game is extremely predictable and is getting boring very quickly. The first iteration phase's intention is to make the game less predictable and therefore more engaging with the player.

## The Challenge:
Player feedback most often stated that the 'game was nice' but getting very boring. And indeed playing this particular version of Pong is barely more than a walk down meory lane. The main reason for this appears to be in the behaviour of the ball which becomse very predictable very early on after starting the game, which leads to the game failing capturing and the player and keeping the player interested. Both of which (capturing and keeping the interest) are vital for a game to appear interesting.

## The Solution:
The trick to keep player interested for longer lies in a less predictable behaviour of the ball itself. A simple randomizer on impact, that affects the direction and the speed of the ball itself, will generate enough unpredictability to force the player to concentrate more, which will natrually require a higher level of engagement. The randomizer can be implemented to support a sliding scale of the severity of randomization, which could be used on a later stage to further refine the game itself. But for this stage the randomizer shall be enough to increase player capturing and therefore keeping them interested for longer.

## The Proof:
Noire-Universe has been involved in very similar recent project where this kind of randomization achieved exactly the desired effect. Further experiance with the fine tuning and scaling of the randimization effects based on the previous project will be a perfect starting point for a swift and homogenous implementation of the feature.

## Call to Action:
From the recoginition to the solution of the problem, this project is perfectly suited to the Noire-Universe's current skill sets and expertise. Polishing an old school Pong without sacrificing its essence by heavy compteporization, was something Noire-Universe wanted to do for a long time and is therefore excited to finally given the chance to take a shot on it.

# Our Approach and Solution:
Noire-Universe intends to leave the essence of the game primarily as it is. No changes to the graphical apperance are planned. We find it important to leave the experiance as close to the original Pong as possible. The main challenge of this project is to implement very subltle changes that force the player to focus more on the game by reducing the predictability of the game. We intend to achive this by adding subtle speed and directional randomizers on impact of the ball on the player. Further we will have a speed and directional randomizer on restart of the ball as well as a very slight directional randomizer on collision of the ball and the upper or the lower bounds of the playing field.

# Project Deliverables:
The sole deliverable of this iteration is an upgraded ball behaviour that is more felt by the player rather than seen.

# Project Milestones:
There are three main areas which will be affected by the changes and we intend tackling them one after another so
## First Milestone:
The ball will slightly have randomized speed and direction on implact with the player bar or the AI bar. Noire-Universe will deliver this milestone after one week.
## Second Milestone:
The bell will have a randomized reset after the player or the AI scorees a point (the direction still will be towards the scoring entity). Noire-Universe will deliver this milestone one week after reaching the first milestone
## Third Milestone:
The ball will slightly change the angle on impact with the top or the bottom border of the playing field. The general direction will not change but the out going angle will no longer equal the incomming angle. Noire-Universe will deliver this deliverable one week after reaching the previous milestone.
## Fourth (and final) Milestone:
Adjusting and ballancing will be done to make sure the three different areas will have a gaming feel that feels genuine and that the different impacts of the ball appear to happen in the same frame of physics. Noire-Universe will deliver the ballancing one week after the third milestone has been delivered.

# Budget:
Time is the only investment that will have to be done in this iteration.

# About us:
We are Noire-Universe!

# Case studies:
No case studies are aplicable for this particular project.

# Clients / References:
N/A

# Terms and Conditions:
N/A

### Temporary proposal structure guide:
- [x]  Proposal Cover
- [x] Proposal executive Summary
- [x] My approach/Solution
- [x] Project Deliverables
- [x] Project Milestones
- [x] Budget / Investement
- [x] About me
- [x] Case studies / Testimonials
- [x] Clients / References
- [x] Terms and Conditions / Next steps
