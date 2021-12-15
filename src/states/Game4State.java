package states;

import java.awt.Graphics;
import java.util.ArrayList;

import gameObjects.Constants;
import graphics.Assets;
import math.Vector2D;
import ui.Action;
import ui.Button;
import ui.Question;

public class Game4State extends State{
	
	private ArrayList<Button> buttons;
	private ArrayList<Question> questions;

	private int score = 0;

	
	
	public Game4State() {
		buttons = new ArrayList<Button>();
		questions = new ArrayList<Question>();

		questions.add(new Question(
				Assets.question,
				Assets.question,
				Constants.WIDTH /2-200,
				Constants.HEIGHT / 2 - Assets.question.getHeight()+190,
				Constants.QUESTION4,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new Game4State());
					}
				}
				));
	
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 30,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+260,
				Constants.ANSWER13,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new Incorrect4State());
					}
					
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 + 80,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+260,
				Constants.ANSWER14,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new Incorrect4State());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 5 + 30,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+320,
				Constants.ANSWER15,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new Incorrect4State());
					}
				}
				));
		
		buttons.add(new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Constants.WIDTH / 2 + 80,
				Constants.HEIGHT / 2 - Assets.greyBtn.getHeight()+320,
				Constants.ANSWER16,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new Correct4State());
					}
				}
				));
		
	}
	
	public void addScore() {
		score += 1;
	}

	
	
	public void update() {
		for(Button b: buttons) {
			b.update();
		}
		
		 for(Question b: questions
		    		) {
			 b.update();
	    }
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(Assets.level, 0, 0, null);
		g.drawImage(Assets.player, 400, 150, null);
		
		    for(Question b: questions
		    		) {
			b.draw(g);
	    }
		    
			for(Button b: buttons) {
				b.draw(g);
		}
	}
	

		
	}