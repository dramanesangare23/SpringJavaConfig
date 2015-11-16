package com.tutorialspoint;

public class TextEditor {
	private SpellChecker spellChecker; 
	
	/**
	 * @param spellChecker
	 */
	public TextEditor(SpellChecker spellChecker) {
		super();
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() { 
		return spellChecker; 
	} 

	public void spellCheck() { 
		spellChecker.checkSpelling(); 
	}
}
