/*
  James Ni
  2017.2.23
 */

package main;

// ********************* All imports ***********************
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
// *********************************************************


public class Main implements NativeKeyListener {

	public static void main(String[] args) {
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}

		GlobalScreen.getInstance().addNativeKeyListener(new Main());
	}

	// ******************* Memorize the pressed keys ********************
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Pressed "
				+ NativeKeyEvent.getKeyText(e.getKeyCode()));
	}

	public void nativeKeyReleased(NativeKeyEvent e) {
		System.out.println("Released "
				+ NativeKeyEvent.getKeyText(e.getKeyCode()));
	}
	//*******************************************************************
	
	

	public void nativeKeyTyped(NativeKeyEvent arg0) {

	}
}
