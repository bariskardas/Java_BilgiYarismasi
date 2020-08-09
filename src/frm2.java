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

public class frm2 extends JFrame {

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
	
	ImageIcon icon = new ImageIcon("C:\\Users\\MSÝ\\Desktop\\1.jpg");
	
	public frm2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setBackground(new Color(70, 130, 180));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(70, 130, 180));
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(31, 394, 318, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rb1 = new JRadioButton("A)");
		rb1.setForeground(new Color(255, 255, 255));
		rb1.setBounds(6, 5, 37, 23);
		rb1.setBackground(new Color(70, 130, 180));
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("B)");
		rb2.setForeground(new Color(255, 255, 255));
		rb2.setBounds(6, 43, 37, 23);
		rb2.setBackground(new Color(70, 130, 180));
		panel.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("C)");
		rb3.setForeground(new Color(255, 255, 255));
		rb3.setBounds(6, 80, 37, 23);
		rb3.setBackground(new Color(70, 130, 180));
		panel.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("D)");
		rb4.setForeground(new Color(255, 255, 255));
		rb4.setBounds(6, 120, 37, 23);
		rb4.setBackground(new Color(70, 130, 180));
		panel.add(rb4);
		
		ButtonGroup tektuslama = new ButtonGroup();
		tektuslama.add(rb1);
		tektuslama.add(rb2);
		tektuslama.add(rb3);
		tektuslama.add(rb4);
		
		JLabel lblNewLabel_1 = new JLabel("Anemometre\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(49, 0, 231, 34);
		panel.add(lblNewLabel_1);
		
		JLabel lblBarometre = new JLabel("Barometre");
		lblBarometre.setForeground(new Color(255, 255, 255));
		lblBarometre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblBarometre.setBounds(49, 46, 101, 20);
		panel.add(lblBarometre);
		
		JLabel lblNewLabel_2 = new JLabel("Termometre");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(49, 84, 101, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblDinamometre = new JLabel("Dinamometre");
		lblDinamometre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDinamometre.setForeground(new Color(255, 255, 255));
		lblDinamometre.setBounds(49, 123, 94, 14);
		panel.add(lblDinamometre);
		
		JPanel baslikPanel = new JPanel();
		baslikPanel.setBounds(0, 0, 384, 43);
		contentPane.add(baslikPanel);
		baslikPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BÝLGÝ YARIÞMASI");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(106, 11, 174, 25);
		baslikPanel.add(lblNewLabel);
		
		JLabel lblSoru = new JLabel("SORU 1:");
		lblSoru.setForeground(new Color(255, 215, 0));
		lblSoru.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSoru.setBounds(26, 75, 96, 30);
		contentPane.add(lblSoru);
		
		JButton btnCevapla = new JButton("Cevapla");
		btnCevapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(rb1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Tebrikler Doðru Cevap !",null ,JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, " DEVAM ETMEK ÝÇÝN TIKLA !   ",null ,JOptionPane.INFORMATION_MESSAGE);
					frm4 f4 = new frm4();
					f4.setVisible(true);
					dispose();
					
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Yanlýþ Cevap verdiniz !!!",null,JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "TEKRAR DENEYÝN ! ",null ,JOptionPane.INFORMATION_MESSAGE);
					frm2 f2 = new frm2();
					f2.setVisible(true);
					dispose();
				}
				
			}
		});
		btnCevapla.setFont(new Font("Arial", Font.BOLD, 14));
		btnCevapla.setBounds(225, 563, 96, 23);
		contentPane.add(btnCevapla);
		
		JTextArea txtSoru = new JTextArea();
		txtSoru.setBackground(new Color(70, 130, 180));
		txtSoru.setForeground(Color.WHITE);
		txtSoru.setFont(new Font("Arial", Font.BOLD, 15));
		txtSoru.setText("R\u00FCzgar\u0131n h\u0131z\u0131n\u0131 \u00F6l\u00E7meye yarayan , resimde\r\n g\u00F6r\u00FClen alete ne ad verilir ?");
		txtSoru.setBounds(31, 345, 353, 54);
		contentPane.add(txtSoru);
		
		
		JLabel AnaJLabel = new JLabel(icon);
		AnaJLabel.setBounds(10, 101, 361, 244);
		contentPane.add(AnaJLabel);
		
		
	}
}
