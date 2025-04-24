import java.util.ArrayList;
public class StepTracker
{
 private int daysTotal = 0;
 private int daysActive = 0;
 private int stepsTotal = 0;
 private int stepsGoal;
 public StepTracker(int steps) {
  stepsGoal = steps;
 }
 public int addDailySteps(int steps) {
  stepsTotal += steps;
  daysTotal++;
  if (steps >= stepsGoal) daysActive++;
 }
 public int activeDays() {
  return daysActive;
 }
 public double averageSteps() {
  if (daysTotal == 0) return 0.0;
  return (double) stepsTotal / daysTotal;
 }
} 
