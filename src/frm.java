import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;


public class frm extends JFrame {

	private JPanel contentPane;
	private JTextField txtkullaniciadi;
	private JPasswordField sifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm frame = new frm();
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
	public frm() {
		
		setBounds(400, 300, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblsifre = new JLabel("Þifre:");
		lblsifre.setForeground(new Color(255, 255, 255));
		lblsifre.setFont(new Font("Arial", Font.BOLD, 14));
		lblsifre.setBounds(116, 109, 50, 25);
		contentPane.add(lblsifre);
		
		JLabel lblkullaniciadi = new JLabel("Kullanýcý adý : ");
		lblkullaniciadi.setForeground(new Color(255, 255, 255));
		lblkullaniciadi.setFont(new Font("Arial", Font.BOLD, 14));
		lblkullaniciadi.setBounds(67, 43, 99, 31);
		contentPane.add(lblkullaniciadi);
		
		JButton btngiris = new JButton("Giriþ");
		btngiris.setForeground(new Color(0, 0, 0));
		btngiris.setFont(new Font("Arial", Font.BOLD, 14));
		btngiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String a= txtkullaniciadi.getText();				
				String b = sifre.getText();
				if(a.equals("bariskardas") && b.equals("baris.146")){
					
					JOptionPane.showMessageDialog(null, "Baþarýyla giriþ yapýldý !",null ,JOptionPane.INFORMATION_MESSAGE);
			        dispose();
					
			        
					frm2 f2= new frm2();
					f2.setVisible(true);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Yanlýþ girildi !!!",null,
							JOptionPane.ERROR_MESSAGE);
					
				}
				txtkullaniciadi.setText(null);
		        sifre.setText(null);
			}
		});
		btngiris.setBounds(210, 165, 89, 23);
		contentPane.add(btngiris);
		
		txtkullaniciadi = new JTextField();
		txtkullaniciadi.setBounds(191, 49, 108, 20);
		contentPane.add(txtkullaniciadi);
		txtkullaniciadi.setColumns(10);
		
		sifre = new JPasswordField();
		sifre.setBounds(191, 112, 108, 20);
		contentPane.add(sifre);
		
		JButton btnkayitol = new JButton("Yeni Kayýt ol ");
		btnkayitol.setForeground(new Color(255, 204, 0));
		btnkayitol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frm3 f3 = new frm3();
				f3.setVisible(true);
				 dispose();  //diðer formu kapatýr.
			}
		});
		btnkayitol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnkayitol.setBackground(new Color(0, 128, 128));
		btnkayitol.setBounds(62, 212, 237, 23);
		contentPane.add(btnkayitol);
		
		JButton btnk = new JButton("Çýkýþ");
		btnk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);	
			}
		});
		btnk.setFont(new Font("Arial", Font.BOLD, 14));
		btnk.setBounds(65, 165, 89, 23);
		contentPane.add(btnk);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 384, 32);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblKullancGirii = new JLabel("KULLANICI GÝRÝÞÝ");
		lblKullancGirii.setForeground(new Color(0, 0, 128));
		lblKullancGirii.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKullancGirii.setBounds(99, 0, 191, 32);
		panel.add(lblKullancGirii);
		
	
	}
}
