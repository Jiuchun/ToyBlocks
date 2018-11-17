package mainc;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Game extends JFrame {

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Game() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnStart = new JButton("start");
		
		JButton btnEnd = new JButton("End");
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEnd, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(362, Short.MAX_VALUE)
					.addComponent(btnEnd)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStart)
					.addGap(39))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 417, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
