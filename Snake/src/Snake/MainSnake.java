package Snake;

import javax.swing.JFrame;

public class MainSnake {

	public MainSnake() {
		JFrame frame = new JFrame();

		Gamepanel gamepanel = new Gamepanel();

		frame.add(gamepanel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SnakeBoi");

		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

	public static void main(String[] args) {
		new MainSnake();
	}

}
