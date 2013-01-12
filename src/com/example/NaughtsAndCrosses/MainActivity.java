package com.example.NaughtsAndCrosses;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

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
		setupOnClickListeners();
	}

	/**
	 * This will add the OnClickListener to each button inside out TableLayout
	 */
	private void setupOnClickListeners() {
		TableLayout T = (TableLayout) findViewById(R.id.tableLayout);
		for (int y = 0; y < T.getChildCount(); y++) {
			if (T.getChildAt(y) instanceof TableRow) {
				TableRow R = (TableRow) T.getChildAt(y);
				for (int x = 0; x < R.getChildCount(); x++) {
					View V = R.getChildAt(x); // In our case this will be each button on the grid
					V.setOnClickListener(new PlayOnClick(x, y));
				}
			}
		}
	}

	/**
	 * Custom OnClickListener for Noughts and Crosses<br />
	 * Each Button for Noughts and Crosses has a position we need to take into account
	 *
	 * @author Lyndon Armitage
	 */
	private class PlayOnClick implements View.OnClickListener {

		private int x = 0;
		private int y = 0;

		public PlayOnClick(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public void onClick(View view) {
			if (view instanceof Button) {
				Button B = (Button) view;
				board[x][y] = noughtsTurn ? 'O' : 'X';
				B.setText(noughtsTurn ? "O" : "X");
				B.setEnabled(false);
				noughtsTurn = !noughtsTurn;
			}
		}
	}
}
