package com.sundy.www.gamecore;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

/**
 * ��ϷͼƬ����
 * 
 * @author Sundy
 * (moveRight��moveLeft��image���в���ʹ��)
 */
public class GameImage extends GameRect
{

	// ͼƬ�ı��
	private int ImageNum;

	/**
	 * ���캯��
	 * 
	 * @param imgName
	 *            ͼƬ���ƣ�.jpg��β��
	 * @param x
	 *            ����x
	 * @param y
	 *            ����y �����û���������꣬��ͼƬ������ʾ��
	 */
	public GameImage(String imgName, int x, int y)
	{
		// ͨ���������ñ��
		this.ImageNum = NumberManager.instance.getNum();
		GameCore.createImage(this.ImageNum, imgName);
		GameCore.setImagePosition(ImageNum, x, y);
	}

	/**
	 * ��ʾ
	 */
	@Override
	public void show()
	{
		GameCore.showImage(this.ImageNum);
	}

	/**
	 * ����
	 */
	@Override
	public void hide()
	{
		GameCore.hideImage(ImageNum);
	}

	/**
	 * �������
	 */
	@Override
	public Point getPosition()
	{
		return GameCore.getImagePosition(ImageNum);
	}

	/**
	 * ��������
	 */
	@Override
	public void setPosition(Point pos)
	{
		GameCore.setImagePosition(ImageNum, pos.x, pos.y);
	}

	/**
	 * ��������
	 */
	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setImagePosition(ImageNum, x, y);
	}

	/**
	 * �������x
	 */
	@Override
	public int getX()
	{
		return GameCore.getImageX(ImageNum);
	}

	/**
	 * �������y
	 */
	@Override
	public int getY()
	{
		return GameCore.getImageY(ImageNum);
	}

	/**
	 * ��������
	 * 
	 * @param imgName
	 *            ͼƬ����
	 */
	public void setImgName(String imgName)
	{
		GameCore.setImageSource(this.ImageNum, imgName);
	}

	/**
	 * �Ƴ�
	 */
	public void remove()
	{
		GameCore.removeImage(this.ImageNum);
	}

	/**
	 * ��óߴ�
	 */
	@Override
	public Dimension getSize()
	{
		return GameCore.getImageSize(ImageNum);
	}

	/**
	 * ��ø߶�
	 */
	@Override
	public int getHeight()
	{
		return GameCore.getImageHeight(ImageNum);
	}

	/**
	 * ��ÿ��
	 */
	@Override
	public int getWidth()
	{
		return GameCore.getImageWidth(ImageNum);
	}

}
