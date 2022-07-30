package com.bobsgame.client;

import org.lwjgl.input.Controller;
import org.lwjgl.input.Controllers;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;



//=========================================================================================================================
public class ControlsManager
{//=========================================================================================================================








	//------------------------------------
	//keyboard
	//------------------------------------

	private boolean KEY_UP_HELD=false;
	private boolean KEY_DOWN_HELD=false;
	private boolean KEY_LEFT_HELD=false;
	private boolean KEY_RIGHT_HELD=false;

	private boolean KEY_TAB_HELD=false;//was START
	private boolean KEY_RETURN_HELD=false;//was SELECT

	private boolean KEY_LBRACKET_HELD=false;//was L
	private boolean KEY_RBRACKET_HELD=false;//was R

	private boolean KEY_SPACE_HELD=false;//was A
	private boolean KEY_LSHIFT_HELD=false;//was B
	private boolean KEY_LCTRL_HELD=false;
	private boolean KEY_F1_HELD=false;


	//private boolean KEY_Y_HELD=false;
	//private boolean KEY_X_HELD=false;


	private boolean KEY_MINUS_HELD=false;//zoom in
	private boolean KEY_PLUS_HELD=false;//zoom out

	private boolean KEY_H_HELD=false;
	private boolean KEY_TILDE_HELD=false;
	private boolean KEY_1_HELD=false;
	private boolean KEY_2_HELD=false;
	private boolean KEY_3_HELD=false;
	private boolean KEY_4_HELD=false;
	private boolean KEY_5_HELD=false;
	private boolean KEY_6_HELD=false;

	private boolean KEY_NUM2_HELD=false;
	private boolean KEY_NUM3_HELD=false;
	private boolean KEY_NUM5_HELD=false;
	private boolean KEY_NUM6_HELD=false;
	private boolean KEY_NUM8_HELD=false;
	private boolean KEY_NUM9_HELD=false;

	private boolean KEY_NUM1_HELD=false;
	private boolean KEY_NUM4_HELD=false;
	private boolean KEY_NUM0_HELD=false;

	private boolean KEY_RSHIFT_HELD=false;//quickzoom
	private boolean KEY_RCTRL_HELD=false;//quickzoom
	private boolean KEY_BACKSPACE_HELD=false;//reset zoom



	//------------------------------------
	//joystick
	//------------------------------------

	private boolean JOY_UP_HELD = false;
	private boolean JOY_DOWN_HELD = false;
	private boolean JOY_LEFT_HELD = false;
	private boolean JOY_RIGHT_HELD = false;
	private boolean JOY_ACTION_HELD = false;
	private boolean JOY_RUN_HELD = false;
	private boolean JOY_ND_HELD = false;
	private boolean JOY_STUFF_HELD = false;
	private boolean JOY_ZOOMIN_HELD = false;
	private boolean JOY_ZOOMOUT_HELD = false;



	//------------------------------------
	//buttons set from either joystick or keyboard
	//------------------------------------

		//------------------------------------
		//pressed
		//------------------------------------

			public boolean MOUSEBUTTON_0_PRESSED=false;

			public boolean BUTTON_ACTION_PRESSED=false;//A or ACTION or L or SPACE
			public boolean BUTTON_CANCEL_PRESSED=false;//B or ??


			public boolean BUTTON_UP_PRESSED=false;
			public boolean BUTTON_DOWN_PRESSED=false;
			public boolean BUTTON_LEFT_PRESSED=false;
			public boolean BUTTON_RIGHT_PRESSED=false;

			public boolean BUTTON_SPACE_PRESSED=false;//was A
			public boolean BUTTON_LSHIFT_PRESSED=false;//was B
			public boolean BUTTON_LCTRL_PRESSED=false;
			public boolean BUTTON_F1_PRESSED=false;

			//public boolean BUTTON_X_PRESSED=false;
			//public boolean BUTTON_Y_PRESSED=false;

			public boolean BUTTON_TAB_PRESSED=false;//was START
			public boolean BUTTON_RETURN_PRESSED=false;//was SELECT

			public boolean BUTTON_LBRACKET_PRESSED=false;//was L
			public boolean BUTTON_RBRACKET_PRESSED=false;//was R

			public boolean BUTTON_MINUS_PRESSED=false;//zoom in
			public boolean BUTTON_PLUS_PRESSED=false;//zoom out

			public boolean BUTTON_H_PRESSED=false;
			public boolean BUTTON_TILDE_PRESSED=false;
			public boolean BUTTON_1_PRESSED=false;
			public boolean BUTTON_2_PRESSED=false;
			public boolean BUTTON_3_PRESSED=false;
			public boolean BUTTON_4_PRESSED=false;
			public boolean BUTTON_5_PRESSED=false;
			public boolean BUTTON_6_PRESSED=false;

			public boolean BUTTON_NUM2_PRESSED=false;
			public boolean BUTTON_NUM3_PRESSED=false;
			public boolean BUTTON_NUM5_PRESSED=false;
			public boolean BUTTON_NUM6_PRESSED=false;
			public boolean BUTTON_NUM8_PRESSED=false;
			public boolean BUTTON_NUM9_PRESSED=false;

			public boolean BUTTON_NUM1_PRESSED=false;
			public boolean BUTTON_NUM4_PRESSED=false;
			public boolean BUTTON_NUM0_PRESSED=false;

			public boolean BUTTON_RSHIFT_PRESSED=false;//quickzoom
			public boolean BUTTON_RCTRL_PRESSED=false;//quickzoom
			public boolean BUTTON_BACKSPACE_PRESSED=false;//reset zoom


		//------------------------------------
		//held
		//------------------------------------

			public boolean MOUSEBUTTON_0_HELD=false;

			public boolean BUTTON_ACTION_HELD=false;//A or ACTION or L or SPACE
			public boolean BUTTON_CANCEL_HELD=false;//B or ??

			public boolean BUTTON_UP_HELD=false;
			public boolean BUTTON_DOWN_HELD=false;
			public boolean BUTTON_LEFT_HELD=false;
			public boolean BUTTON_RIGHT_HELD=false;

			public boolean BUTTON_SPACE_HELD=false;//was A
			public boolean BUTTON_LSHIFT_HELD=false;//was B
			public boolean BUTTON_LCTRL_HELD=false;
			public boolean BUTTON_F1_HELD=false;

			//public boolean BUTTON_X_HELD=false;
			//public boolean BUTTON_Y_HELD=false;
			public boolean BUTTON_TAB_HELD=false;//was START
			public boolean BUTTON_RETURN_HELD=false;//was SELECT

			public boolean BUTTON_LBRACKET_HELD=false;//was L
			public boolean BUTTON_RBRACKET_HELD=false;//was R

			public boolean BUTTON_MINUS_HELD=false;//zoom in
			public boolean BUTTON_PLUS_HELD=false;//zoom out

			public boolean BUTTON_H_HELD=false;
			public boolean BUTTON_TILDE_HELD=false;
			public boolean BUTTON_1_HELD=false;
			public boolean BUTTON_2_HELD=false;
			public boolean BUTTON_3_HELD=false;
			public boolean BUTTON_4_HELD=false;
			public boolean BUTTON_5_HELD=false;
			public boolean BUTTON_6_HELD=false;

			public boolean BUTTON_NUM2_HELD=false;
			public boolean BUTTON_NUM3_HELD=false;
			public boolean BUTTON_NUM5_HELD=false;
			public boolean BUTTON_NUM6_HELD=false;
			public boolean BUTTON_NUM8_HELD=false;
			public boolean BUTTON_NUM9_HELD=false;

			public boolean BUTTON_NUM1_HELD=false;
			public boolean BUTTON_NUM4_HELD=false;
			public boolean BUTTON_NUM0_HELD=false;

			public boolean BUTTON_RSHIFT_HELD=false;//quickzoom
			public boolean BUTTON_RCTRL_HELD=false;//quickzoom
			public boolean BUTTON_BACKSPACE_HELD=false;//reset zoom





	//=========================================================================================================================
	public ControlsManager()
	{//=========================================================================================================================




	}



	//=========================================================================================================================
	public void update()
	{//=========================================================================================================================

		//------------------------------------
		//reset pressed
		//------------------------------------
			MOUSEBUTTON_0_PRESSED=false;

			BUTTON_ACTION_PRESSED=false;
			BUTTON_CANCEL_PRESSED=false;


			BUTTON_SPACE_PRESSED=false;//was A
			BUTTON_LSHIFT_PRESSED=false;//was B
			BUTTON_LCTRL_PRESSED=false;
			BUTTON_F1_PRESSED=false;

			//BUTTON_Y_PRESSED=false;
			//BUTTON_X_PRESSED=false;

			BUTTON_TAB_PRESSED=false;//was START
			BUTTON_RETURN_PRESSED=false;//was SELECT

			BUTTON_LBRACKET_PRESSED=false;//was L
			BUTTON_RBRACKET_PRESSED=false;//was R

			BUTTON_MINUS_PRESSED=false;
			BUTTON_PLUS_PRESSED=false;

			BUTTON_UP_PRESSED=false;
			BUTTON_DOWN_PRESSED=false;
			BUTTON_LEFT_PRESSED=false;
			BUTTON_RIGHT_PRESSED=false;

			BUTTON_H_PRESSED=false;
			BUTTON_TILDE_PRESSED=false;
			BUTTON_1_PRESSED=false;
			BUTTON_2_PRESSED=false;
			BUTTON_3_PRESSED=false;
			BUTTON_4_PRESSED=false;
			BUTTON_5_PRESSED=false;
			BUTTON_6_PRESSED=false;

			BUTTON_NUM2_PRESSED=false;
			BUTTON_NUM3_PRESSED=false;
			BUTTON_NUM5_PRESSED=false;
			BUTTON_NUM6_PRESSED=false;
			BUTTON_NUM8_PRESSED=false;
			BUTTON_NUM9_PRESSED=false;

			BUTTON_NUM1_PRESSED=false;
			BUTTON_NUM4_PRESSED=false;
			BUTTON_NUM0_PRESSED=false;

			BUTTON_RSHIFT_PRESSED=false;
			BUTTON_RCTRL_PRESSED=false;
			BUTTON_BACKSPACE_PRESSED=false;



		//------------------------------------
		//see if button was held last frame
		//if it wasnt, pressed = 1
		//------------------------------------
			//------------------------------------
			//store held
			//------------------------------------

				boolean LAST_MOUSEBUTTON_0_HELD=MOUSEBUTTON_0_HELD;

				boolean LAST_BUTTON_SPACE_HELD=BUTTON_SPACE_HELD;//was A
				boolean LAST_BUTTON_LSHIFT_HELD=BUTTON_LSHIFT_HELD;//was B
				boolean LAST_BUTTON_LCTRL_HELD=BUTTON_LCTRL_HELD;
				boolean LAST_BUTTON_F1_HELD=BUTTON_F1_HELD;
				//boolean LAST_BUTTON_Y_HELD=BUTTON_Y_HELD;
				//boolean LAST_BUTTON_X_HELD=BUTTON_X_HELD;

				boolean LAST_BUTTON_TAB_HELD=BUTTON_TAB_HELD;//was START
				boolean LAST_BUTTON_RETURN_HELD=BUTTON_RETURN_HELD;//was SELECT

				boolean LAST_BUTTON_LBRACKET_HELD=BUTTON_LBRACKET_HELD;//was L
				boolean LAST_BUTTON_RBRACKET_HELD=BUTTON_RBRACKET_HELD;//was R

				boolean LAST_BUTTON_MINUS_HELD=BUTTON_MINUS_HELD;
				boolean LAST_BUTTON_PLUS_HELD=BUTTON_PLUS_HELD;

				boolean LAST_BUTTON_UP_HELD=BUTTON_UP_HELD;
				boolean LAST_BUTTON_DOWN_HELD=BUTTON_DOWN_HELD;
				boolean LAST_BUTTON_LEFT_HELD=BUTTON_LEFT_HELD;
				boolean LAST_BUTTON_RIGHT_HELD=BUTTON_RIGHT_HELD;

				boolean LAST_BUTTON_H_HELD=BUTTON_H_HELD;
				boolean LAST_BUTTON_TILDE_HELD=BUTTON_TILDE_HELD;
				boolean LAST_BUTTON_1_HELD=BUTTON_1_HELD;
				boolean LAST_BUTTON_2_HELD=BUTTON_2_HELD;
				boolean LAST_BUTTON_3_HELD=BUTTON_3_HELD;
				boolean LAST_BUTTON_4_HELD=BUTTON_4_HELD;
				boolean LAST_BUTTON_5_HELD=BUTTON_5_HELD;
				boolean LAST_BUTTON_6_HELD=BUTTON_6_HELD;

				boolean LAST_BUTTON_NUM2_HELD=BUTTON_NUM2_HELD;
				boolean LAST_BUTTON_NUM3_HELD=BUTTON_NUM3_HELD;
				boolean LAST_BUTTON_NUM5_HELD=BUTTON_NUM5_HELD;
				boolean LAST_BUTTON_NUM6_HELD=BUTTON_NUM6_HELD;
				boolean LAST_BUTTON_NUM8_HELD=BUTTON_NUM8_HELD;
				boolean LAST_BUTTON_NUM9_HELD=BUTTON_NUM9_HELD;

				boolean LAST_BUTTON_NUM1_HELD=BUTTON_NUM1_HELD;
				boolean LAST_BUTTON_NUM4_HELD=BUTTON_NUM4_HELD;
				boolean LAST_BUTTON_NUM0_HELD=BUTTON_NUM0_HELD;

				boolean LAST_BUTTON_RSHIFT_HELD=BUTTON_RSHIFT_HELD;
				boolean LAST_BUTTON_RCTRL_HELD=BUTTON_RCTRL_HELD;
				boolean LAST_BUTTON_BACKSPACE_HELD=BUTTON_BACKSPACE_HELD;

			//------------------------------------
			//reset held
			//------------------------------------
				MOUSEBUTTON_0_HELD=false;

				BUTTON_ACTION_HELD=false;
				BUTTON_CANCEL_HELD=false;

				BUTTON_SPACE_HELD=false;//was A
				BUTTON_LSHIFT_HELD=false;//was B
				BUTTON_LCTRL_HELD=false;
				BUTTON_F1_HELD=false;
				//BUTTON_Y_HELD=false;
				//BUTTON_X_HELD=false;


				BUTTON_TAB_HELD=false;//was START
				BUTTON_RETURN_HELD=false;//was SELECT

				BUTTON_LBRACKET_HELD=false;//was L
				BUTTON_RBRACKET_HELD=false;//was R

				BUTTON_MINUS_HELD=false;
				BUTTON_PLUS_HELD=false;

				BUTTON_UP_HELD=false;
				BUTTON_DOWN_HELD=false;
				BUTTON_LEFT_HELD=false;
				BUTTON_RIGHT_HELD=false;

				BUTTON_H_HELD=false;
				BUTTON_TILDE_HELD=false;
				BUTTON_1_HELD=false;
				BUTTON_2_HELD=false;
				BUTTON_3_HELD=false;
				BUTTON_4_HELD=false;
				BUTTON_5_HELD=false;
				BUTTON_6_HELD=false;

				BUTTON_NUM2_HELD=false;
				BUTTON_NUM3_HELD=false;
				BUTTON_NUM5_HELD=false;
				BUTTON_NUM6_HELD=false;
				BUTTON_NUM8_HELD=false;
				BUTTON_NUM9_HELD=false;

				BUTTON_NUM1_HELD=false;
				BUTTON_NUM4_HELD=false;
				BUTTON_NUM0_HELD=false;

				BUTTON_RSHIFT_HELD=false;
				BUTTON_RCTRL_HELD=false;
				BUTTON_BACKSPACE_HELD=false;


		//------------------------------------
		//set key held
		//------------------------------------
			if(Mouse.isButtonDown(0))MOUSEBUTTON_0_HELD=true;else MOUSEBUTTON_0_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)
					//||Keyboard.isKeyDown(Keyboard.KEY_D)
					)KEY_RIGHT_HELD=true;else KEY_RIGHT_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)
					//||Keyboard.isKeyDown(Keyboard.KEY_A)
					)KEY_LEFT_HELD=true;else KEY_LEFT_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_UP)
					//||Keyboard.isKeyDown(Keyboard.KEY_W)
					)KEY_UP_HELD=true;else KEY_UP_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)
					//||Keyboard.isKeyDown(Keyboard.KEY_S)
					)KEY_DOWN_HELD=true;else KEY_DOWN_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_SPACE))KEY_SPACE_HELD=true;else KEY_SPACE_HELD=false;//was A
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))KEY_LSHIFT_HELD=true;else KEY_LSHIFT_HELD=false;//was B
			if(Keyboard.isKeyDown(Keyboard.KEY_LCONTROL))KEY_LCTRL_HELD=true;else KEY_LCTRL_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_F1))KEY_F1_HELD=true;else KEY_F1_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_TAB))KEY_TAB_HELD=true;else KEY_TAB_HELD=false;//was START
			if(Keyboard.isKeyDown(Keyboard.KEY_RETURN))KEY_RETURN_HELD=true;else KEY_RETURN_HELD=false;//was SELECT

			if(Keyboard.isKeyDown(Keyboard.KEY_LBRACKET))KEY_LBRACKET_HELD=true;else KEY_LBRACKET_HELD=false;//was L
			if(Keyboard.isKeyDown(Keyboard.KEY_RBRACKET))KEY_RBRACKET_HELD=true;else KEY_RBRACKET_HELD=false;//was R



			if(Keyboard.isKeyDown(Keyboard.KEY_MINUS))KEY_MINUS_HELD=true;else KEY_MINUS_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_EQUALS))KEY_PLUS_HELD=true;else KEY_PLUS_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_GRAVE))KEY_TILDE_HELD=true;else KEY_TILDE_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_H))KEY_H_HELD=true;else KEY_H_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_1))KEY_1_HELD=true;else KEY_1_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_2))KEY_2_HELD=true;else KEY_2_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_3))KEY_3_HELD=true;else KEY_3_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_4))KEY_4_HELD=true;else KEY_4_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_5))KEY_5_HELD=true;else KEY_5_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_6))KEY_6_HELD=true;else KEY_6_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD2))KEY_NUM2_HELD=true;else KEY_NUM2_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD3))KEY_NUM3_HELD=true;else KEY_NUM3_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD5))KEY_NUM5_HELD=true;else KEY_NUM5_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD6))KEY_NUM6_HELD=true;else KEY_NUM6_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD8))KEY_NUM8_HELD=true;else KEY_NUM8_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD9))KEY_NUM9_HELD=true;else KEY_NUM9_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD1))KEY_NUM1_HELD=true;else KEY_NUM1_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD4))KEY_NUM4_HELD=true;else KEY_NUM4_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_NUMPAD0))KEY_NUM0_HELD=true;else KEY_NUM0_HELD=false;

			if(Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))KEY_RSHIFT_HELD=true;else KEY_RSHIFT_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_RCONTROL))KEY_RCTRL_HELD=true;else KEY_RCTRL_HELD=false;
			if(Keyboard.isKeyDown(Keyboard.KEY_BACK))KEY_BACKSPACE_HELD=true;else KEY_BACKSPACE_HELD=false;


		//------------------------------------
		//set joystick held
		//------------------------------------

			if(isJoystickButtonHeld(JOY_UP))JOY_UP_HELD=true;else JOY_UP_HELD=false;
			if(isJoystickButtonHeld(JOY_DOWN))JOY_DOWN_HELD=true;else JOY_DOWN_HELD=false;
			if(isJoystickButtonHeld(JOY_LEFT))JOY_LEFT_HELD=true;else JOY_LEFT_HELD=false;
			if(isJoystickButtonHeld(JOY_RIGHT))JOY_RIGHT_HELD=true;else JOY_RIGHT_HELD=false;
			if(isJoystickButtonHeld(JOY_ACTION))JOY_ACTION_HELD=true;else JOY_ACTION_HELD=false;
			if(isJoystickButtonHeld(JOY_RUN))JOY_RUN_HELD=true;else JOY_RUN_HELD=false;
			if(isJoystickButtonHeld(JOY_ND))JOY_ND_HELD=true;else JOY_ND_HELD=false;
			if(isJoystickButtonHeld(JOY_STUFF))JOY_STUFF_HELD=true;else JOY_STUFF_HELD=false;
			if(isJoystickButtonHeld(JOY_ZOOMIN))JOY_ZOOMIN_HELD=true;else JOY_ZOOMIN_HELD=false;
			if(isJoystickButtonHeld(JOY_ZOOMOUT))JOY_ZOOMOUT_HELD=true;else JOY_ZOOMOUT_HELD=false;


		//------------------------------------
		//combine keyboard input and joystick input into BUTTON_STATE
		//------------------------------------

			//------------------------------------
			//set buttons from keys (so keyboard and gameController input are treated as the same but don't cancel each other out)
			//------------------------------------

				if(KEY_SPACE_HELD==true)BUTTON_SPACE_HELD=true;//was A
				if(KEY_LSHIFT_HELD==true)BUTTON_LSHIFT_HELD=true;//was B
				if(KEY_LCTRL_HELD==true)BUTTON_LCTRL_HELD=true;
				if(KEY_F1_HELD==true)BUTTON_F1_HELD=true;
				//if(KEY_Y_HELD==true)BUTTON_Y_HELD=true;
				//if(KEY_X_HELD==true)BUTTON_X_HELD=true;


				if(KEY_UP_HELD==true)BUTTON_UP_HELD=true;
				if(KEY_DOWN_HELD==true)BUTTON_DOWN_HELD=true;
				if(KEY_LEFT_HELD==true)BUTTON_LEFT_HELD=true;
				if(KEY_RIGHT_HELD==true)BUTTON_RIGHT_HELD=true;

				if(KEY_TAB_HELD==true)BUTTON_TAB_HELD=true;//was START
				if(KEY_RETURN_HELD==true)BUTTON_RETURN_HELD=true;//was SELECT

				if(KEY_LBRACKET_HELD==true)BUTTON_LBRACKET_HELD=true;//was L
				if(KEY_RBRACKET_HELD==true)BUTTON_RBRACKET_HELD=true;//was R

				if(KEY_MINUS_HELD==true)BUTTON_MINUS_HELD=true;
				if(KEY_PLUS_HELD==true)BUTTON_PLUS_HELD=true;

				if(KEY_TILDE_HELD==true)BUTTON_TILDE_HELD=true;
				if(KEY_H_HELD==true)BUTTON_H_HELD=true;
				if(KEY_1_HELD==true)BUTTON_1_HELD=true;
				if(KEY_2_HELD==true)BUTTON_2_HELD=true;
				if(KEY_3_HELD==true)BUTTON_3_HELD=true;
				if(KEY_4_HELD==true)BUTTON_4_HELD=true;
				if(KEY_5_HELD==true)BUTTON_5_HELD=true;
				if(KEY_6_HELD==true)BUTTON_6_HELD=true;

				if(KEY_NUM2_HELD==true)BUTTON_NUM2_HELD=true;
				if(KEY_NUM3_HELD==true)BUTTON_NUM3_HELD=true;
				if(KEY_NUM5_HELD==true)BUTTON_NUM5_HELD=true;
				if(KEY_NUM6_HELD==true)BUTTON_NUM6_HELD=true;
				if(KEY_NUM8_HELD==true)BUTTON_NUM8_HELD=true;
				if(KEY_NUM9_HELD==true)BUTTON_NUM9_HELD=true;

				if(KEY_NUM1_HELD==true)BUTTON_NUM1_HELD=true;
				if(KEY_NUM4_HELD==true)BUTTON_NUM4_HELD=true;
				if(KEY_NUM0_HELD==true)BUTTON_NUM0_HELD=true;

				if(KEY_RSHIFT_HELD==true)BUTTON_RSHIFT_HELD=true;
				if(KEY_RCTRL_HELD==true)BUTTON_RCTRL_HELD=true;
				if(KEY_BACKSPACE_HELD==true)BUTTON_BACKSPACE_HELD=true;


			//------------------------------------
			//set buttons from joystick
			//------------------------------------
				if(JOY_ACTION_HELD==true)BUTTON_SPACE_HELD=true;
				if(JOY_RUN_HELD==true)BUTTON_LSHIFT_HELD=true;
				if(JOY_UP_HELD==true)BUTTON_UP_HELD=true;
				if(JOY_DOWN_HELD==true)BUTTON_DOWN_HELD=true;
				if(JOY_LEFT_HELD==true)BUTTON_LEFT_HELD=true;
				if(JOY_RIGHT_HELD==true)BUTTON_RIGHT_HELD=true;
				if(JOY_ND_HELD==true)BUTTON_RETURN_HELD=true;
				if(JOY_STUFF_HELD==true)BUTTON_TAB_HELD=true;
				if(JOY_ZOOMIN_HELD==true)BUTTON_RSHIFT_HELD=true;
				if(JOY_ZOOMOUT_HELD==true)BUTTON_RCTRL_HELD=true;


		//------------------------------------
		//set whether button was just pressed
		//------------------------------------

			if(MOUSEBUTTON_0_HELD==true&&LAST_MOUSEBUTTON_0_HELD==false)MOUSEBUTTON_0_PRESSED=true;

			if(BUTTON_SPACE_HELD==true&&LAST_BUTTON_SPACE_HELD==false)BUTTON_SPACE_PRESSED=true;//was A
			if(BUTTON_LSHIFT_HELD==true&&LAST_BUTTON_LSHIFT_HELD==false)BUTTON_LSHIFT_PRESSED=true;//was B
			if(BUTTON_LCTRL_HELD==true&&LAST_BUTTON_LCTRL_HELD==false)BUTTON_LCTRL_PRESSED=true;
			if(BUTTON_F1_HELD==true&&LAST_BUTTON_F1_HELD==false)BUTTON_F1_PRESSED=true;
			//if(BUTTON_Y_HELD==true&&LAST_BUTTON_Y_HELD==false)BUTTON_Y_PRESSED=true;
			//if(BUTTON_X_HELD==true&&LAST_BUTTON_X_HELD==false)BUTTON_X_PRESSED=true;


			if(BUTTON_TAB_HELD==true&&LAST_BUTTON_TAB_HELD==false)BUTTON_TAB_PRESSED=true;//was START
			if(BUTTON_RETURN_HELD==true&&LAST_BUTTON_RETURN_HELD==false)BUTTON_RETURN_PRESSED=true;//was SELECT

			if(BUTTON_LBRACKET_HELD==true&&LAST_BUTTON_LBRACKET_HELD==false)BUTTON_LBRACKET_PRESSED=true;//was L
			if(BUTTON_RBRACKET_HELD==true&&LAST_BUTTON_RBRACKET_HELD==false)BUTTON_RBRACKET_PRESSED=true;//was R


			if(BUTTON_MINUS_HELD==true&&LAST_BUTTON_MINUS_HELD==false)BUTTON_MINUS_PRESSED=true;
			if(BUTTON_PLUS_HELD==true&&LAST_BUTTON_PLUS_HELD==false)BUTTON_PLUS_PRESSED=true;

			if(BUTTON_UP_HELD==true&&LAST_BUTTON_UP_HELD==false)BUTTON_UP_PRESSED=true;
			if(BUTTON_DOWN_HELD==true&&LAST_BUTTON_DOWN_HELD==false)BUTTON_DOWN_PRESSED=true;
			if(BUTTON_LEFT_HELD==true&&LAST_BUTTON_LEFT_HELD==false)BUTTON_LEFT_PRESSED=true;
			if(BUTTON_RIGHT_HELD==true&&LAST_BUTTON_RIGHT_HELD==false)BUTTON_RIGHT_PRESSED=true;

			if(BUTTON_H_HELD==true&&LAST_BUTTON_H_HELD==false)BUTTON_H_PRESSED=true;
			if(BUTTON_TILDE_HELD==true&&LAST_BUTTON_TILDE_HELD==false)BUTTON_TILDE_PRESSED=true;
			if(BUTTON_1_HELD==true&&LAST_BUTTON_1_HELD==false)BUTTON_1_PRESSED=true;
			if(BUTTON_2_HELD==true&&LAST_BUTTON_2_HELD==false)BUTTON_2_PRESSED=true;
			if(BUTTON_3_HELD==true&&LAST_BUTTON_3_HELD==false)BUTTON_3_PRESSED=true;
			if(BUTTON_4_HELD==true&&LAST_BUTTON_4_HELD==false)BUTTON_4_PRESSED=true;
			if(BUTTON_5_HELD==true&&LAST_BUTTON_5_HELD==false)BUTTON_5_PRESSED=true;
			if(BUTTON_6_HELD==true&&LAST_BUTTON_6_HELD==false)BUTTON_6_PRESSED=true;

			if(BUTTON_NUM2_HELD==true&&LAST_BUTTON_NUM2_HELD==false)BUTTON_NUM2_PRESSED=true;
			if(BUTTON_NUM3_HELD==true&&LAST_BUTTON_NUM3_HELD==false)BUTTON_NUM3_PRESSED=true;
			if(BUTTON_NUM5_HELD==true&&LAST_BUTTON_NUM5_HELD==false)BUTTON_NUM5_PRESSED=true;
			if(BUTTON_NUM6_HELD==true&&LAST_BUTTON_NUM6_HELD==false)BUTTON_NUM6_PRESSED=true;
			if(BUTTON_NUM8_HELD==true&&LAST_BUTTON_NUM8_HELD==false)BUTTON_NUM8_PRESSED=true;
			if(BUTTON_NUM9_HELD==true&&LAST_BUTTON_NUM9_HELD==false)BUTTON_NUM9_PRESSED=true;

			if(BUTTON_NUM1_HELD==true&&LAST_BUTTON_NUM1_HELD==false)BUTTON_NUM1_PRESSED=true;
			if(BUTTON_NUM4_HELD==true&&LAST_BUTTON_NUM4_HELD==false)BUTTON_NUM4_PRESSED=true;
			if(BUTTON_NUM0_HELD==true&&LAST_BUTTON_NUM0_HELD==false)BUTTON_NUM0_PRESSED=true;

			if(BUTTON_RSHIFT_HELD==true&&LAST_BUTTON_RSHIFT_HELD==false)BUTTON_RSHIFT_PRESSED=true;
			if(BUTTON_RCTRL_HELD==true&&LAST_BUTTON_RCTRL_HELD==false)BUTTON_RCTRL_PRESSED=true;
			if(BUTTON_BACKSPACE_HELD==true&&LAST_BUTTON_BACKSPACE_HELD==false)BUTTON_BACKSPACE_PRESSED=true;


			//------------------------------------
			//set ACTION state from other button pressed states
			//------------------------------------
			if(BUTTON_SPACE_HELD==true||BUTTON_LBRACKET_HELD==true)BUTTON_ACTION_HELD=true;else BUTTON_ACTION_HELD=false;
			if(BUTTON_SPACE_PRESSED==true||BUTTON_LBRACKET_PRESSED==true)BUTTON_ACTION_PRESSED=true;

			if(BUTTON_LSHIFT_HELD==true)BUTTON_CANCEL_HELD=true;else BUTTON_CANCEL_HELD=false;
			if(BUTTON_LSHIFT_PRESSED==true)BUTTON_CANCEL_PRESSED=true;



	}







	//------------------------------------
	//gameController enum
	//------------------------------------

	public int gameController_LeftAnalog_XAxis_Negative = -1;
	public int gameController_LeftAnalog_XAxis_Positive = -2;
	public int gameController_LeftAnalog_YAxis_Negative = -3;
	public int gameController_LeftAnalog_YAxis_Positive = -4;
	public int gameController_LeftAnalog_ZAxis_Negative = -5;
	public int gameController_LeftAnalog_ZAxis_Positive = -6;
	public int gameController_POV_X_Negative = -7;
	public int gameController_POV_X_Positive = -8;
	public int gameController_POV_Y_Negative = -9;
	public int gameController_POV_Y_Positive = -10;
	public int gameController_RightAnalog_XAxis_Negative = -11;
	public int gameController_RightAnalog_XAxis_Positive = -12;
	public int gameController_RightAnalog_YAxis_Negative = -13;
	public int gameController_RightAnalog_YAxis_Positive = -14;
	public int gameController_RightAnalog_ZAxis_Negative = -15;
	public int gameController_RightAnalog_ZAxis_Positive = -16;

	int notSet = -17;

	public int JOY_UP = notSet;
	public int JOY_DOWN = notSet;
	public int JOY_LEFT = notSet;
	public int JOY_RIGHT = notSet;
	public int JOY_ACTION = notSet;
	public int JOY_RUN = notSet;
	public int JOY_ND = notSet;
	public int JOY_STUFF = notSet;
	public int JOY_ZOOMIN = notSet;
	public int JOY_ZOOMOUT = notSet;

	public Controller controller=null;

	float minVal=0.9f;

	//=========================================================================================================================
	public boolean isJoystickButtonHeld(int id)
	{//=========================================================================================================================

		if(controller==null)return false;
		if(id==notSet)return false;

		if(id==gameController_LeftAnalog_XAxis_Negative)
		{
			float val = controller.getXAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_LeftAnalog_XAxis_Positive)
		{
			float val = controller.getXAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_LeftAnalog_YAxis_Negative)
		{
			float val = controller.getYAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_LeftAnalog_YAxis_Positive)
		{
			float val = controller.getYAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_LeftAnalog_ZAxis_Negative)
		{
			float val = controller.getZAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_LeftAnalog_ZAxis_Positive)
		{
			float val = controller.getZAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_POV_X_Negative)
		{
			float val = controller.getPovX();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_POV_X_Positive)
		{
			float val = controller.getPovX();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_POV_Y_Negative)
		{
			float val = controller.getPovY();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_POV_Y_Positive)
		{
			float val = controller.getPovY();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_XAxis_Negative)
		{
			float val = controller.getRXAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_XAxis_Positive)
		{
			float val = controller.getRXAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_YAxis_Negative)
		{
			float val = controller.getRYAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_YAxis_Positive)
		{
			float val = controller.getRYAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_ZAxis_Negative)
		{
			float val = controller.getRZAxisValue();
			if(val<0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		if(id==gameController_RightAnalog_ZAxis_Positive)
		{
			float val = controller.getRZAxisValue();
			if(val>0.0f&&Math.abs(val)>minVal)return true;
			return false;
		}

		//must be a button

		if(controller.isButtonPressed(id))return true;
		return false;

	}








}
