package com.sundy.www.gamecore;

import java.awt.Point;

public abstract class GameObject
{
	// ��ʾ
	public abstract void show();

	// ����
	public abstract void hide();

	// �������
	public abstract Point getPosition();

	// ���x
	public abstract int getX();

	// ���y
	public abstract int getY();

	// ��������
	public abstract void setPosition(Point pos);

	// ��������
	public abstract void setPosition(int x, int y);

	moveRight()
}
