package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor textEditor = (TextEditor)applicationContext.getBean(TextEditor.class);

		textEditor.spellCheck();
		
		((AbstractApplicationContext)applicationContext).close();
	}

}
