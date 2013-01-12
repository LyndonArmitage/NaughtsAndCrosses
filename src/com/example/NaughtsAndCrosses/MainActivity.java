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
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
}
