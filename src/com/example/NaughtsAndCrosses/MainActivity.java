package com.example.NaughtsAndCrosses;

import android.app.Activity;
import android.os.Bundle;

/**
 * Tic Tac Toe Game
 * ---
 * <p/>
 * Code by Lyndon Armitage<br />
 * For learning purposes<br />
 *
 * @author Lyndon Armitage
 * @see <a href='http://en.wikipedia.org/wiki/Tic-tac-toe'>Wikipedia Page</a>
 */
public class MainActivity extends Activity {

	// Representing the game state:
	private boolean noughtsTurn = false; // Who's turn is it? false=X true=O
	private char board[][] = new char[3][3]; // for now we will represent the board as an array of characters

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
