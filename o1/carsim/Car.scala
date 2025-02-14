package o1.carsim
import o1.Pos

class Car(val fuelConsumption: Double, val tankSize: Double, initialFuel: Double, initialLocation: Pos):
  private var currentLocation = initialLocation
  private var currentFuel = initialFuel - fuelConsumption * metersDriven
  private var distanceDriven = 0.0

  def location: Pos = currentLocation

  def fuel(toBeAdded: Double): Double =
    val fuelAdded = (currentFuel + toBeAdded).min(tankSize) - currentFuel
    currentFuel += fuelAdded
    fuelAdded

  def fuel(): Double = fuel(tankSize - currentFuel)

  def fuelRatio: Double = (currentFuel / tankSize) * 100.00

  def metersDriven: Double = distanceDriven

  def fuelRange: Double = (currentFuel / fuelConsumption) * 100000.00

  def drive(destination: Pos, metersToDestination: Double): Unit =
    if fuelRange >= metersToDestination then
      this.currentLocation = destination
      this.distanceDriven += metersToDestination
      this.currentFuel -= (metersToDestination / 100000.00) * fuelConsumption
    else
      val possibleDistance = (this.fuelRange / metersToDestination)
      val arrived = this.currentLocation.vectorTo(destination) * possibleDistance
      this.currentLocation += arrived
      this.distanceDriven += possibleDistance * metersToDestination
      currentFuel = 0


end Car

