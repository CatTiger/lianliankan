package com.example.lianlian.board;

import java.util.List;

import com.example.lianlian.object.GameConf;
import com.example.lianlian.util.ImageUtil;
import com.example.lianlian.view.Piece;
import com.example.lianlian.view.PieceImage;

public abstract class AbstractBoard {

	protected abstract List<Piece> createPieces(GameConf config,
			Piece[][] pieces);

	public Piece[][] create(GameConf config) {
		// 创建空的数组
		Piece[][] pieces = new Piece[config.getxSize()][config.getySize()];
		//
		List<Piece> notNullPieces = createPieces(config, pieces);
		//
		List<PieceImage> playImages = ImageUtil.getPlayImages(
				config.getContext(), notNullPieces.size());//
		//
		int imageWidth = GameConf.PIECE_WIDTH;
		int imageHeight = GameConf.PIECE_HEIGHT;

		for (int i = 0; i < notNullPieces.size(); i++) {
			Piece piece = notNullPieces.get(i);
			piece.setImage(playImages.get(i));
			piece.setBeginX(config.getBeginImageX() + piece.getIndexX()
					* imageWidth);
			piece.setBeginY(config.getBeginImageY() + piece.getIndexY()
					* imageHeight);
			pieces[piece.getIndexX()][piece.getIndexY()] = piece;
		}
		return pieces;
	}

}
