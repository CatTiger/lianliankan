package com.example.lianlian.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.example.lianlian.R;
import com.example.lianlian.view.PieceImage;

public class ImageUtil {

	private static List<Integer> imageValues = getImageValues();

	public static List<PieceImage> getPlayImages(Context context, int size) {
		List<Integer> resourceValues = getPlayValues(size);
		List<PieceImage> result = new ArrayList<PieceImage>();

		for (Integer value : resourceValues) {
			Bitmap bm = BitmapFactory.decodeResource(context.getResources(),
					value);
			PieceImage pieceImage = new PieceImage(bm, value);
			result.add(pieceImage);
		}
		return result;
	}

	public static List<Integer> getPlayValues(int size) {
		if (size % 2 != 0) {
			size += 1;
		}
		List<Integer> playImageValues = getRadomValues(imageValues, size / 2);
		playImageValues.addAll(playImageValues);
		Collections.shuffle(playImageValues);
		return playImageValues;
	}

	public static List<Integer> getRadomValues(List<Integer> sourceValues,
			int size) {
		Random random = new Random();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			try {
				int index = random.nextInt(sourceValues.size());
				Integer image = sourceValues.get(index);
				result.add(image);
			} catch (Exception e) {
				return result;
			}
		}
		return result;
	}

	public static List<Integer> getImageValues() {
		Field[] drawableFileds = R.drawable.class.getFields();
		List<Integer> resourceValues = new ArrayList<Integer>();

		for (Field field : drawableFileds) {
			if (field.getName().indexOf("p_") != -1) {
				try {
					resourceValues.add(field.getInt(R.drawable.class));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				}
			}
		}
		return resourceValues;
	}

	// 获取选中标识的图片
	public static Bitmap getSelectImage(Context context) {
		return BitmapFactory.decodeResource(context.getResources(),
				R.drawable.start_down);
	}

}
