package com.bobsgame.client.engine.game.gui.statusbar.buttons;



import java.io.File;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import com.bobsgame.GLUtils;
import com.bobsgame.client.ControlsManager;
import com.bobsgame.client.engine.Engine;
import com.bobsgame.client.engine.game.ClientGameEngine;
import com.bobsgame.client.engine.game.gui.statusbar.StatusBar;
import com.bobsgame.client.engine.game.nd.ND;
import com.bobsgame.shared.Utils;



//=========================================================================================================================
public class NDButton extends StatusBarButton
{// =========================================================================================================================


	//=========================================================================================================================
	public NDButton(ClientGameEngine g)
	{//=========================================================================================================================

		super(g);

		texture=GLUtils.loadTexture("res/statusbar/nDButton.png");


		offsetX0=20;
		offsetX1=0;// offset0+60;

		pressedOffsetY=0;
		offsetY0=0;
		offsetY1=2;

		dividerX=0;// offsetX1+20;

		glowX0=0;// offsetX0-60;
		glowX1=0;// offsetX1+60;

		glowY0=-40;
		glowY1=60;


		clickX0 = 0;
		clickX1 = dividerX;

	}

	//=========================================================================================================================
	public void init()
	{//=========================================================================================================================

		setOffsets();
	}


	//=========================================================================================================================
	public void setOffsets()
	{//=========================================================================================================================

		offsetX1=offsetX0+60;
		dividerX=offsetX1+20;
		glowX0=offsetX0-60;
		glowX1=offsetX1+60;

		clickX0 = 0;
		clickX1 = dividerX;

	}


	//=========================================================================================================================
	public void clicked()
	{//=========================================================================================================================

		if(PlayerEditMenu().isActivated()==true) return;

		ND().toggleActivated();
	}
	//=========================================================================================================================
	public boolean isAssociatedMenuActive()
	{//=========================================================================================================================

		return ND().isActivated();
	}


}
