import java.awt.EventQueue;
/*
 * created by Alemseged setie
 * ....
 * MAIN CLASS
 */
//start application and the first frame(camera bodies)

public class Main extends CameraBodies{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CameraBodies window = new CameraBodies();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
