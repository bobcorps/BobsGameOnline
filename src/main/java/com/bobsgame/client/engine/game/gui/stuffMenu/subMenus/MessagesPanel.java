package com.bobsgame.client.engine.game.gui.stuffMenu.subMenus;

import com.bobsgame.client.engine.game.gui.stuffMenu.SubPanel;

import de.matthiasmann.twl.Label;


//=========================================================================================================================
public class MessagesPanel extends SubPanel
{//=========================================================================================================================



	//=========================================================================================================================
	public MessagesPanel()
	{//=========================================================================================================================

		super();


		Label label = new Label("Messages");
		label.setCanAcceptKeyboardFocus(false);

		insideLayout.setHorizontalGroup
		(
				insideLayout.createParallelGroup(label)
		);

		insideLayout.setVerticalGroup
		(
				insideLayout.createSequentialGroup(label)
		);



	}




}
