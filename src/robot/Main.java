package robot;

public class Main {

    public static void main(String[] args) {

        // Initialize robot with default row and col coordinates, and set the default direction
        Robot robot = new Robot(5, 3, 0);

        // Draw the "starter-state-table" (grid)
        robot.drawRoom();

        // Turn on the robot, and let it clean the entire room
        robot.run();

    }
}