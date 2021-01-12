package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class MyGUI extends Frame implements MouseListener{
	private TextArea TXTAREA;
	private Button BTN_TOLOWER;
	private Button BTN_TOUPPER;
	private Button BTN_SWAP;
	private Button BTN_CENSOR;
	private List<String> blackList;
	
	public MyGUI() {
		super("Fenstername");
		setSize(250,300);							//erst Pixel nach rechts, dann Pixel nach unten
		setLayout(new BorderLayout());				//Anzahle Zeilen, Spalten
		
		TXTAREA = new TextArea("TextFeld");
		BTN_TOLOWER = new Button("Kleinbuchstaben");
		BTN_TOUPPER = new Button("Groﬂbuchstaben");
		BTN_SWAP = new Button("Groﬂ und Kleinschreibung tauschen");
		
		TXTAREA.setName("TXTAREA");
		BTN_TOLOWER.setName("BTN_TOLOWER");
		BTN_TOLOWER.addMouseListener(this);
		BTN_TOUPPER.setName("BTN_TOUPPER");
		BTN_TOUPPER.addMouseListener(this);
		BTN_SWAP.setName("BTN_SWAP");
		BTN_SWAP.addMouseListener(this);
		
		this.add(TXTAREA, BorderLayout.PAGE_START);
		this.add(BTN_TOLOWER, BorderLayout.LINE_START);
		this.add(BTN_TOUPPER, BorderLayout.CENTER);
		this.add(BTN_SWAP, BorderLayout.LINE_END);
		this.pack();
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);
				dispose();
			}
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	public MyGUI(List<String> blackList) {
		
		super("Fenstername");
		this.blackList= blackList;

		setSize(250,300);							//erst Pixel nach rechts, dann Pixel nach unten
		setLayout(new BorderLayout());				//Anzahle Zeilen, Spalten
		
		TXTAREA = new TextArea("TextFeld");
		BTN_TOLOWER = new Button("Kleinbuchstaben");
		BTN_TOUPPER = new Button("Groﬂbuchstaben");
		BTN_SWAP = new Button("Groﬂ und Kleinschreibung tauschen");
		BTN_CENSOR = new Button("Schimpfwˆrter zensieren");
		
		TXTAREA.setName("TXTAREA");
		TXTAREA.addMouseListener(this);
		
		BTN_TOLOWER.setName("BTN_TOLOWER");
		BTN_TOLOWER.addMouseListener(this);
		
		BTN_TOUPPER.setName("BTN_");
		BTN_TOUPPER.addMouseListener(this);
		
		BTN_SWAP.setName("BTN_SWAP");
		BTN_SWAP.addMouseListener(this);
		
		BTN_CENSOR.setName("BTN_CENSOR");
		BTN_CENSOR.addMouseListener(this);

		
		this.add(TXTAREA, BorderLayout.PAGE_START);
		this.add(BTN_TOLOWER, BorderLayout.LINE_START);
		this.add(BTN_TOUPPER, BorderLayout.CENTER);
		this.add(BTN_SWAP, BorderLayout.LINE_END);
		this.add(BTN_CENSOR, BorderLayout.SOUTH);
		this.pack();
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				setVisible(false);
				dispose();
			}
			public void windowClosed(WindowEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == BTN_TOLOWER) {TXTAREA.setText(TXTAREA.getText().toLowerCase());}
		if(arg0.getSource() == BTN_TOUPPER) {TXTAREA.setText(TXTAREA.getText().toUpperCase());}
		if(arg0.getSource() == BTN_SWAP) {
			char[] textzeichen = TXTAREA.getText().toCharArray();
			String[] textzeichenString = new String[textzeichen.length];
			
			TXTAREA.setText(null);
			
			for(int i = 0; i < textzeichen.length; i++) {
				String s = String.valueOf(textzeichen[i]);
				
				if(s.equals(s.toLowerCase())){
					textzeichenString[i] = s.toUpperCase();
				}else {
					textzeichenString[i] = s.toLowerCase();
				}
				
				TXTAREA.setText(TXTAREA.getText() + textzeichenString[i]);
			}
			
		}
			
		if(arg0.getSource() == BTN_CENSOR) {
			String text = TXTAREA.getText();
			char[] arrChar = text.toCharArray();
			
			for(int i = 0; i < blackList.size(); i++) {
				String badword = blackList.get(i).toLowerCase();
				
				for(int j = 0; j < text.length(); j++) {
					int pos = text.toLowerCase().indexOf(badword);
					if(pos >= 0) {
						for (int k = 0; k <  badword.length(); k++) {
							arrChar[pos+k] = 'x';
						}
						text = new String(arrChar);
					}
				}
			}
			TXTAREA.setText(text);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}