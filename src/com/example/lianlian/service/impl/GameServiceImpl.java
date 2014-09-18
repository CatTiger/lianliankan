package com.example.lianlian.service.impl;

import java.util.Random;

import com.example.lianlian.board.AbstractBoard;
import com.example.lianlian.board.impl.FullBoard;
import com.example.lianlian.object.GameConf;
import com.example.lianlian.service.GameService;
import com.example.lianlian.view.Piece;

public class GameServiceImpl implements GameService{
	
	private Piece[][] pieces;
	
	private GameConf config;

	public GameServiceImpl(GameConf config) {
		super();
		this.config = config;
	}

	@Override
	public Piece[][] getPieces() {
		return this.pieces;
	}

	@Override
	public void startGame() {
		AbstractBoard board = null;
		Random random = new Random();
		int randomNum = random.nextInt(4);
		switch (randomNum) {
		case 1:
			board = new FullBoard();
			break;

		default:
			board = new FullBoard();
			break;
		}
		board = new FullBoard();//
		this.pieces = board.create(config);
	}

}
