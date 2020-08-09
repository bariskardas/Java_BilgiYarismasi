import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class frm5 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm2 frame = new frm2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	ImageIcon icon_2 = new ImageIcon("C:\\Users\\MSÝ\\Desktop\\3.jpg");
	
	public frm5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(new Color(105, 105, 105));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(70, 130, 180));
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(41, 368, 296, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rb1 = new JRadioButton("A)");
		rb1.setForeground(new Color(255, 255, 255));
		rb1.setBounds(6, 5, 37, 23);
		rb1.setBackground(new Color(105, 105, 105));
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("B)");
		rb2.setForeground(new Color(255, 255, 255));
		rb2.setBounds(6, 43, 47, 23);
		rb2.setBackground(new Color(105, 105, 105));
		panel.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("C)");
		rb3.setForeground(new Color(255, 255, 255));
		rb3.setBounds(6, 80, 37, 23);
		rb3.setBackground(new Color(105, 105, 105));
		panel.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("D)");
		rb4.setForeground(new Color(255, 255, 255));
		rb4.setBounds(6, 120, 37, 23);
		rb4.setBackground(new Color(105, 105, 105));
		panel.add(rb4);
		
		ButtonGroup tektuslama = new ButtonGroup();
		tektuslama.add(rb1);
		tektuslama.add(rb2);
		tektuslama.add(rb3);
		tektuslama.add(rb4);
		
		JLabel lblNewLabel_1 = new JLabel("Balast");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(62, 5, 46, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Furgon");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(62, 43, 67, 23);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tender");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(62, 80, 67, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Katneri");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(62, 120, 67, 23);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 384, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BÝLGÝ YARIÞMASI");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(106, 11, 174, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblSoru = new JLabel("SORU 3:");
		lblSoru.setForeground(new Color(50, 205, 50));
		lblSoru.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoru.setBounds(26, 75, 96, 30);
		contentPane.add(lblSoru);
		
		JButton btnCevapla = new JButton("Cevapla");
		btnCevapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rb3.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Tebrikler Doðru Cevap !",null ,JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "3 DOÐRU\n0 YANLIÞ !   ",null ,JOptionPane.INFORMATION_MESSAGE);
									
					dispose();
					
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Yanlýþ Cevap verdiniz !!!",null,JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "2 DOÐRU\n1 YANLIÞ ! ",null ,JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "TEKRAR DENEYÝN ! ",null ,JOptionPane.INFORMATION_MESSAGE);
					frm2 f2 = new frm2();
					f2.setVisible(true);
					dispose();
				}
				
			}
		});
		btnCevapla.setFont(new Font("Arial", Font.BOLD, 14));
		btnCevapla.setBounds(241, 537, 96, 23);
		contentPane.add(btnCevapla);
		
		JLabel AnaJLabel_2 = new JLabel(icon_2);
		AnaJLabel_2.setBounds(26, 106, 327, 194);
		contentPane.add(AnaJLabel_2);
		
		JTextArea txtrResimdekiUlamAracnn = new JTextArea();
		txtrResimdekiUlamAracnn.setText("Resimdeki ula\u015F\u0131m arac\u0131n\u0131n en \u00F6n\u00FCndeki b\u00F6l\u00FCm\u00FCn\r\narkas\u0131na ba\u011Flanan , gerekli yak\u0131t\u0131 ve suyu ta\u015F\u0131yan\r\nb\u00F6l\u00FCme ne ad verilir ?");
		txtrResimdekiUlamAracnn.setForeground(new Color(255, 255, 255));
		txtrResimdekiUlamAracnn.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResimdekiUlamAracnn.setBackground(new Color(105, 105, 105));
		txtrResimdekiUlamAracnn.setBounds(20, 311, 364, 63);
		contentPane.add(txtrResimdekiUlamAracnn);
		
	}
}
