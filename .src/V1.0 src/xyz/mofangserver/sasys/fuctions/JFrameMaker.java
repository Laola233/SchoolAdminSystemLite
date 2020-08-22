package xyz.mofangserver.sasys.fuctions;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * <code> 弃坑,不推荐使用!</code>
 * 
 * @deprecated
 * @author z_yu
 * @since 2.0
 * @version 0.1B
 */
public final class JFrameMaker extends JFrame {
	private static final long serialVersionUID = 1L;

	public final void create(String Windowname, int boundx, int boundy, int width, int height, boolean show) {
		JFrame jnew = new JFrame(Windowname);
		@SuppressWarnings("unused")
		Container con = jnew.getContentPane();
		jnew.setBounds(boundx, boundy, width, height);
		jnew.setVisible(show);
	}

	public final void closeOperation(int a, JFrame fname) {
		switch (a) {
		case 0:
			fname.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
	}

	public final void setJLabel(JFrame fname, String in, Container con) {
		JLabel jlab1 = new JLabel(in);
		con.add(jlab1);
	}
}
