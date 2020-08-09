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

public class frm4 extends JFrame {

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
	
	ImageIcon icon_1 = new ImageIcon("C:\\Users\\MSÝ\\Desktop\\2.jpg");
	
	public frm4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(new Color(255, 204, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(70, 130, 180));
		panel.setBackground(new Color(255, 204, 51));
		panel.setBounds(36, 409, 296, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rb1 = new JRadioButton("A)");
		rb1.setForeground(new Color(255, 255, 255));
		rb1.setBounds(6, 5, 37, 23);
		rb1.setBackground(new Color(255, 204, 51));
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("B)");
		rb2.setForeground(new Color(255, 255, 255));
		rb2.setBounds(6, 43, 47, 23);
		rb2.setBackground(new Color(255, 204, 51));
		panel.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("C)");
		rb3.setForeground(new Color(255, 255, 255));
		rb3.setBounds(6, 80, 37, 23);
		rb3.setBackground(new Color(255, 204, 51));
		panel.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("D)");
		rb4.setForeground(new Color(255, 255, 255));
		rb4.setBounds(6, 120, 37, 23);
		rb4.setBackground(new Color(255, 204, 51));
		panel.add(rb4);
		
		ButtonGroup tektuslama = new ButtonGroup();
		tektuslama.add(rb1);
		tektuslama.add(rb2);
		tektuslama.add(rb3);
		tektuslama.add(rb4);
		
		JLabel lblGrafolok = new JLabel("Grafolok");
		lblGrafolok.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGrafolok.setForeground(new Color(255, 255, 255));
		lblGrafolok.setBounds(59, 6, 71, 22);
		panel.add(lblGrafolok);
		
		JLabel lblVantrilok = new JLabel("Vantrilok");
		lblVantrilok.setFont(new Font("Arial", Font.PLAIN, 14));
		lblVantrilok.setForeground(new Color(255, 255, 255));
		lblVantrilok.setBounds(59, 43, 73, 27);
		panel.add(lblVantrilok);
		
		JLabel lblNewLabel_1 = new JLabel("Sosyolog");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(61, 80, 69, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblFonolog = new JLabel("Fonolog");
		lblFonolog.setFont(new Font("Arial", Font.PLAIN, 14));
		lblFonolog.setForeground(new Color(255, 255, 255));
		lblFonolog.setBounds(61, 120, 71, 23);
		panel.add(lblFonolog);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 384, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BÝLGÝ YARIÞMASI");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(106, 11, 174, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblSoru = new JLabel("SORU 2:");
		lblSoru.setForeground(new Color(51, 51, 204));
		lblSoru.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoru.setBounds(26, 75, 96, 30);
		contentPane.add(lblSoru);
		
		JButton btnCevapla = new JButton("Cevapla");
		btnCevapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rb2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Tebrikler Doðru Cevap !",null ,JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, " DEVAM ETMEK ÝÇÝN TIKLA !   ",null ,JOptionPane.INFORMATION_MESSAGE);
					frm5 f5 = new frm5();
					f5.setVisible(true);				
					dispose();
					
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Yanlýþ Cevap verdiniz !!!",null,JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "1 DOÐRU 1 YANLIÞ ! ",null ,JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "TEKRAR DENEYÝN ! ",null ,JOptionPane.INFORMATION_MESSAGE);
					frm2 f2 = new frm2();
					f2.setVisible(true);
					dispose();
				}
				
			}
		});
		btnCevapla.setFont(new Font("Arial", Font.BOLD, 14));
		btnCevapla.setBounds(236, 575, 96, 23);
		contentPane.add(btnCevapla);
		
		JTextArea txtrResimdeGrlenTarzdaki = new JTextArea();
		txtrResimdeGrlenTarzdaki.setBackground(new Color(255, 204, 0));
		txtrResimdeGrlenTarzdaki.setForeground(new Color(255, 255, 255));
		txtrResimdeGrlenTarzdaki.setFont(new Font("Arial", Font.BOLD, 14));
		txtrResimdeGrlenTarzdaki.setText("Resimde g\u00F6r\u00FClen tarzdaki kuklalar\u0131 oynatan\r\nve konu\u015Fturan ki\u015Filere hangi isim verilir ?  ");
		txtrResimdeGrlenTarzdaki.setBounds(36, 367, 316, 50);
		contentPane.add(txtrResimdeGrlenTarzdaki);
		
		JLabel AnaJLabel_1 = new JLabel(icon_1);
		AnaJLabel_1.setBounds(36, 104, 316, 255);
		contentPane.add(AnaJLabel_1);
		 
		
		
		
	}
}
