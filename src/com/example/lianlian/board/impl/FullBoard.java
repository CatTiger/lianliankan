package com.example.lianlian.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.lianlian.board.AbstractBoard;
import com.example.lianlian.object.GameConf;
import com.example.lianlian.view.Piece;

public class FullBoard extends AbstractBoard {

	@Override
	protected List<Piece> createPieces(GameConf config, Piece[][] pieces) {
		List<Piece> notNullPieces = new ArrayList<Piece>();
		
		for(int i = 1; i < pieces.length - 1; i++) {
			for(int j = 1; j < pieces[i].length - 1; j++) {
				Piece piece = new Piece(i, j);
				notNullPieces.add(piece);
			}
		}
		return notNullPieces;
	}

}
