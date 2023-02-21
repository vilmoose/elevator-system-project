/*
 * interface class that contains the method to update the gui view 
 * @z
 */
public interface ElevatorDashboardView {

	void updateView(int elevatorID, int floor, int error, String state);

}