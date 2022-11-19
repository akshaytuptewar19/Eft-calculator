package design;

import rectCords.*;
import sphCords.sphCords;
import unit.unit;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cycCords.cycCords;
import electricField.electricField;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Project extends JFrame {
	private JTextField inpx;
	private JTextField inpy;
	private JTextField inpz;
	private JTextField locx;
	private JTextField locy;
	private JTextField locz;
	private JTextField ansField;
	private JTextField chargeText;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	JComboBox comboBox ;
	JComboBox power=new JComboBox();
	private JTextField magText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 600);
		getContentPane().setLayout(null);
		
		JRadioButton ef = new JRadioButton("Electric Feild");
		buttonGroup_2.add(ef);
		ef.setFont(new Font("Arial", Font.BOLD, 16));
		ef.setBounds(33, 7, 156, 53);
		getContentPane().add(ef);
		
		JRadioButton mf = new JRadioButton("Magnetic Feild");
		buttonGroup_2.add(mf);
		mf.setFont(new Font("Arial", Font.BOLD, 16));
		mf.setBounds(267, 12, 156, 42);
		getContentPane().add(mf);
		
		inpx = new JTextField();
		inpx.setFont(new Font("Arial", Font.PLAIN, 14));
		inpx.setBounds(41, 158, 148, 31);
		getContentPane().add(inpx);
		inpx.setColumns(10);
		
		inpy = new JTextField();
		inpy.setFont(new Font("Arial", Font.PLAIN, 14));
		inpy.setBounds(235, 158, 156, 31);
		getContentPane().add(inpy);
		inpy.setColumns(10);
		
		JRadioButton rec1 = new JRadioButton("Rectangular");
		buttonGroup.add(rec1);
		rec1.setFont(new Font("Arial", Font.PLAIN, 14));
		rec1.setBounds(60, 128, 109, 23);
		getContentPane().add(rec1);
		
		JRadioButton cyc1 = new JRadioButton("Cylindrical");
		buttonGroup.add(cyc1);
		cyc1.setFont(new Font("Arial", Font.PLAIN, 14));
		cyc1.setBounds(267, 128, 109, 23);
		getContentPane().add(cyc1);
		
		JRadioButton sph1 = new JRadioButton("Spherical");
		buttonGroup.add(sph1);
		sph1.setFont(new Font("Arial", Font.PLAIN, 14));
		sph1.setBounds(457, 128, 109, 23);
		getContentPane().add(sph1);
		
		inpz = new JTextField();
		inpz.setFont(new Font("Arial", Font.PLAIN, 14));
		inpz.setColumns(10);
		inpz.setBounds(438, 158, 156, 31);
		getContentPane().add(inpz);
		
		JRadioButton rec2 = new JRadioButton("Rectangular");
		buttonGroup_1.add(rec2);
		rec2.setFont(new Font("Arial", Font.PLAIN, 14));
		rec2.setBounds(60, 225, 109, 23);
		getContentPane().add(rec2);
		
		JRadioButton cyc2 = new JRadioButton("Cylindrical");
		buttonGroup_1.add(cyc2);
		cyc2.setFont(new Font("Arial", Font.PLAIN, 14));
		cyc2.setBounds(267, 225, 109, 23);
		getContentPane().add(cyc2);
		
		JRadioButton sph2 = new JRadioButton("Spherical");
		buttonGroup_1.add(sph2);
		sph2.setFont(new Font("Arial", Font.PLAIN, 14));
		sph2.setBounds(457, 225, 109, 23);
		getContentPane().add(sph2);
		
		locx = new JTextField();
		locx.setFont(new Font("Arial", Font.PLAIN, 14));
		locx.setColumns(10);
		locx.setBounds(41, 255, 148, 31);
		getContentPane().add(locx);
		
		locy = new JTextField();
		locy.setFont(new Font("Arial", Font.PLAIN, 14));
		locy.setColumns(10);
		locy.setBounds(235, 255, 156, 31);
		getContentPane().add(locy);
		
		locz = new JTextField();
		locz.setFont(new Font("Arial", Font.PLAIN, 14));
		locz.setColumns(10);
		locz.setBounds(438, 255, 156, 31);
		getContentPane().add(locz);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				electricField E=new electricField();
				rectCords r = null;
				cycCords c;
				sphCords sph;
				
				rectCords at = null;
				double x = 0,y=0,z=0,x1=0,y1=0,z1=0;
				unit charge=null;
				String sx=inpx.getText();
				if(comboBox.getSelectedItem()=="Line"||comboBox.getSelectedItem()=="Volume" )
				if(inpx.getText().equals("INF")) {
					
					x=1000000;
					
				}
				if(inpy.getText().equals("INF")) {
					y=1000000;
					
					
				}
				if(inpz.getText()=="INF") {
					z=1000000;
					
					
				}
					System.out.print(x);
				
				
				try {
					
				if(x==0) {
					x=Double.parseDouble(inpx.getText());
					
				}
				if(y==0) {
					
				}
				if(z==0) {
					z=Double.parseDouble(inpz.getText());
				}
				 
				 
				 
				 x1=Double.parseDouble(locx.getText());
				 y1=Double.parseDouble(locy.getText());
				 z1=Double.parseDouble(locz.getText());
				 
				 
				
				
				
				
				
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Enter a valid number");
				}
				
				
				double q=Double.parseDouble(chargeText.getText());
				charge=new unit(q,0);
				
				if(power.getSelectedItem()=="m"){
					charge.p=-3;
				}else if(power.getSelectedItem()=="u") {
				charge.p=-6;
				}else if(power.getSelectedItem()=="n") {
					charge.p=-9;
				}else if((power.getSelectedItem()=="p")) {
					charge.p=-12;
				}
				
				if(rec1.isSelected()==true) {
					r=new rectCords(x,y,z);
				}else if(cyc1.isSelected()==true) {
					c=new cycCords(x,y,z);
					r=c.convertToRect(c);
					
					
				}else if(sph1.isSelected()==true) {
					sph=new sphCords(x,y,z);
					r=sph.convertToRect(sph);
					
					
				}
				
				if(rec2.isSelected()==true) {
					at=new rectCords(x1,y1,z1);
				}else if(cyc2.isSelected()==true) {
					c=new cycCords(x1,y1,z1);
					at=c.convertToRect(c);
					
					
				}else if(sph2.isSelected()==true) {
					sph=new sphCords(x1,y1,z1);
					at=sph.convertToRect(sph);
					
					
				}
				
				
				
				 
				
				
				
				
				
				
				
				if(ef.isSelected()==true) {
					
					
					if(comboBox.getSelectedItem()=="Point") {
						 
						
						
						
						E.pointEf(r,at,charge);
//						ansField.setText("done");
						ansField.setText("("+(float)E.ef.x+ ")ax + ("+ (float)E.ef.y + ")ay + ("+(float)E.ef.z+")az "+"x 10^"+E.p);
						magText.setText(E.magnitude.x+" x 10^"+E.p);
					}else if(comboBox.getSelectedItem()=="Line") {
						if((r.x!=1000000 && r.y!=1000000 && r.z==1000000)|| (r.x==1000000 && r.y!=1000000 && r.z!=1000000)||(r.x!=1000000 && r.y==1000000 && r.z!=1000000)) {
						E.inflineEf(r,at,charge);
//						ansField.setText("done");
						ansField.setText("("+(float)E.ef.x+ ")ax + ("+ (float)E.ef.y + ")ay + ("+(float)E.ef.z+")az "+"x 10^"+E.p);
						magText.setText(E.magnitude.x+" x 10^"+E.p);
						System.out.print("("+(float)E.ef.x+ ")ax + ("+ (float)E.ef.y + ")ay + ("+(float)E.ef.z+")az "+"x 10^"+E.p);
						}else {
//							JOptionPane jOptionPane = new JOptionPane();
							JOptionPane.showMessageDialog(null,"Enter valid dimensions of a line");
						}
						
						
					}else if(comboBox.getSelectedItem()=="Volume") {
						if((r.x!=0 && r.y==1000000 && r.z==1000000)|| (r.x==1000000 && r.y!=0 && r.z==1000000)||(r.x==1000000&& r.y==0 && r.z!=1000000)) {
						E.infsurfaceEf(r,at,charge);
//						ansField.setText("done");
						ansField.setText("("+(float)E.ef.x+ ")ax + ("+ (float)E.ef.y + ")ay + ("+(float)E.ef.z+")az "+"x 10^"+E.p);
						magText.setText(E.magnitude.x+" x 10^"+E.p);
						System.out.print("button clicked");
						}else {
							JOptionPane.showMessageDialog(null,"Enter valid dimensions of a Surface");

						}
					}
					
					
				}else if(mf.isSelected()==true){
					
					
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setBounds(158, 334, 93, 44);
		getContentPane().add(btnNewButton);
		
		ansField = new JTextField();
		ansField.setFont(new Font("Arial", Font.PLAIN, 16));
		ansField.setBounds(60, 415, 546, 44);
		getContentPane().add(ansField);
		ansField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("At");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 200, 46, 14);
		getContentPane().add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Point", "Line", "Volume"}));
		comboBox.setBounds(49, 67, 120, 31);
		getContentPane().add(comboBox);
		
		
		power.setFont(new Font("Arial", Font.PLAIN, 14));
		power.setModel(new DefaultComboBoxModel(new String[] {"m", "u", "n", "p"}));
		power.setBounds(512, 67, 54, 31);
		getContentPane().add(power);
		
		chargeText = new JTextField();
		chargeText.setFont(new Font("Arial", Font.PLAIN, 14));
		chargeText.setColumns(10);
		chargeText.setBounds(370, 68, 70, 31);
		getContentPane().add(chargeText);
		
		JButton btnNewButton_1 = new JButton("Convert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x=0,y=0,z=0;
				try {
				 x=Double.parseDouble(inpx.getText());
				  y=Double.parseDouble(inpy.getText());
				  z=Double.parseDouble(inpz.getText());
				}catch(Exception e2) {
					JOptionPane.showMessageDialog(null,"Enter a valid number");
				}
				rectCords r;
				sphCords s;
				cycCords c;
				
				if(rec1.isSelected()==true) {
					if(rec2.isSelected()==true) {
						locx.setText(inpx.getText());
						locy.setText(inpy.getText());
						locz.setText(inpz.getText());
					}else if(cyc2.isSelected()==true) {
						r=new rectCords(x,y,z);
						c=r.convertToCyc(r);
						locx.setText(Double.toString(c.r));
						locy.setText(Double.toString(c.t));
						locz.setText(Double.toString(c.z));
						
					}else if(sph2.isSelected()==true) {
						r=new rectCords(x,y,z);
						s=r.convertToSph(r);
						locx.setText(Double.toString(s.r));
						locy.setText(Double.toString(s.t));
						locz.setText(Double.toString(s.p));
					}
				}else if(cyc1.isSelected()==true) {
					if(cyc2.isSelected()==true) {
						locx.setText(inpx.getText());
						locy.setText(inpy.getText());
						locz.setText(inpz.getText());
					}else if(rec2.isSelected()==true) {
						c=new cycCords(x,y,z);
						r=c.convertToRect(c);
						locx.setText(Double.toString(r.x));
						locy.setText(Double.toString(r.y));
						locz.setText(Double.toString(r.z));
						
					}else if(sph2.isSelected()==true) {
						c=new cycCords(x,y,z);
						s=c.convertToSph(c);
						locx.setText(Double.toString(s.r));
						locy.setText(Double.toString(s.t));
						locz.setText(Double.toString(s.p));
					}
				}else if(sph1.isSelected()==true) {
					if(sph2.isSelected()==true) {
						locx.setText(inpx.getText());
						locy.setText(inpy.getText());
						locz.setText(inpz.getText());
					}else if(rec2.isSelected()==true) {
						s=new sphCords(x,y,z);
						r=s.convertToRect(s);
						locx.setText(Double.toString(r.x));
						locy.setText(Double.toString(r.y));
						locz.setText(Double.toString(r.z));
						
					}else if(cyc2.isSelected()==true) {
						s=new sphCords(x,y,z);
						c=s.convertToCyc(s);
						locx.setText(Double.toString(s.r));
						locy.setText(Double.toString(s.t));
						locz.setText(Double.toString(s.p));
					}
					
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_1.setBounds(55, 334, 93, 44);
		getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Charge =");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(267, 67, 93, 31);
		getContentPane().add(lblNewLabel_1);
		
		magText = new JTextField();
		magText.setFont(new Font("Arial", Font.PLAIN, 14));
		magText.setBounds(394, 336, 212, 42);
		getContentPane().add(magText);
		magText.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("| E |=");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(345, 333, 46, 44);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Cross");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rectCords r = null;
				cycCords c;
				sphCords sph;
				
				rectCords at = null;
				double x = 0,y=0,z=0,x1=0,y1=0,z1=0;
				unit charge=null;
				
				try {
				 x=Double.parseDouble(inpx.getText());
				 y=Double.parseDouble(inpy.getText());
				 z=Double.parseDouble(inpz.getText());
				 x1=Double.parseDouble(locx.getText());
				 y1=Double.parseDouble(locy.getText());
				 z1=Double.parseDouble(locz.getText());
				
				
				
				
				
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Enter a valid number");
				}
				r=new rectCords(x,y,z);
				at=new rectCords(x1,y1,z1);
				rectCords ans=r.crossp(r,at);
				ansField.setText("("+(float)ans.x+ ")ax + ("+ (float)ans.y + ")ay + ("+(float)ans.z+")az ");
				
				
			}
			
		});
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_2.setBounds(267, 355, 70, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Dot");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rectCords r = null;
				cycCords c;
				sphCords sph;
				
				rectCords at = null;
				double x = 0,y=0,z=0,x1=0,y1=0,z1=0;
				unit charge=null;
				
				try {
				 x=Double.parseDouble(inpx.getText());
				 y=Double.parseDouble(inpy.getText());
				 z=Double.parseDouble(inpz.getText());
				 x1=Double.parseDouble(locx.getText());
				 y1=Double.parseDouble(locy.getText());
				 z1=Double.parseDouble(locz.getText());
				
				
				
				
				
					
					
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Enter a valid number");
				}
				r=new rectCords(x,y,z);
				at=new rectCords(x1,y1,z1);
				rectCords ans=r.dotp(r,at);
				ansField.setText("("+(float)ans.x+ ")ax + ("+ (float)ans.y + ")ay + ("+(float)ans.z+")az ");
				
				
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton_3.setBounds(267, 334, 70, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel charge_unit = new JLabel("C");
		charge_unit.setFont(new Font("Arial", Font.PLAIN, 14));
		charge_unit.setBounds(456, 76, 46, 14);
		getContentPane().add(charge_unit);
		
	
		
		
		
	}
}
