# CarSim 🚗

**CarSim** is a Scala-based simulation application that visualizes car routes and movements on a live map. While the graphical user interface (GUI) is complete and functional, a crucial logic component is intentionally missing — offering an opportunity to implement and test the simulation’s decision-making and routing functionality.

## Overview

The application allows users to:
- Add cars to the map with a right-click
- Set destinations using textual addresses
- Watch cars navigate toward their destinations in real-time

It features:
- A map view powered by [HERE Maps](https://www.here.com/)
- A GUI built using `JMapViewer`
- A modular architecture that allows logic to be plugged into a ready-made visual interface



## What's Included

- `gui/`: Fully functional user interface for the map and controls
- `map/`: Classes and utilities for geolocation and visualization
- `simulation/`: The heart of the application — where the car behavior logic is to be implemented

## Your Task

The simulation logic component is **not yet implemented**. This includes:
- Car behavior: How cars determine their path
- Movement logic: How and when cars update position
- Routing algorithm (if desired): To find shortest or fastest paths

This makes CarSim an excellent learning or testbed environment for:
- Route planning algorithms
- Agent-based simulation
- Real-time map-based UI development

## How to Run

### Prerequisites
- [Scala](https://www.scala-lang.org/)
- [SBT (Scala Build Tool)](https://www.scala-sbt.org/)

### Instructions

```bash
git clone https://github.com/Mustafa0Alalawi/CarSim.git
cd CarSim
sbt run
```



## Demo

<img width="789" alt="Screenshot 2025-05-13 at 19 01 38" src="https://github.com/user-attachments/assets/af6269da-0c1f-4367-9419-47f544ae650f" />
