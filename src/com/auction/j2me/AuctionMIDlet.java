package com.auction.j2me;

import java.io.IOException;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ImageItem;
import javax.microedition.lcdui.StringItem;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public class AuctionMIDlet extends MIDlet implements CommandListener {
	
	private Form form;
	private Display display;
	private StringItem messageItem;
	private Command mExitCommand, mLoginCommand;

	public AuctionMIDlet() {
	form = new Form("Duke's Auction");
	messageItem = new StringItem(null, "");
	form.append(messageItem);
	
	mExitCommand = new Command("Exit", Command.EXIT, 0);
	mLoginCommand = new Command("Login", Command.SCREEN, 0);
	form.addCommand(mExitCommand);
	form.addCommand(mLoginCommand);
	form.setCommandListener(this);
	}


	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub

	}

	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		
		try {
			ImageItem logo =
			new ImageItem(
			"Duke",
			Image.createImage("/juggler.png"),
			ImageItem.LAYOUT_CENTER,
			"");
			form.append(logo);
			} catch (IOException ex) {
			form.append(
			new StringItem("Message: ", "Duke image unavailable " + ex));
			}
		
		messageItem.setText("Hello Duke's Auction!");
		display = Display.getDisplay(this);
		display.setCurrent(form);
	}


	public void commandAction(Command arg0, Displayable arg1) {
		// TODO Auto-generated method stub
		
	}

}
