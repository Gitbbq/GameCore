package d_test.main;

import java.awt.Event;
import java.awt.Point;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
import com.sundy.www.gamecore.GameImage;
import com.sundy.www.gamecore.GameSprite;
import com.sundy.www.gamecore.GameText;

/**
 * 
 * @author Sundy
 * 
 */
public class Main implements Runnable
{

	@Override
	public void run()
	{
		/*
		 * ��д���Դ���
		 */
		GameCore.setGameTitle("������͵��(������)");// ���ر���
		GameCore.loadBgView("��ɫ.jpg");// ���ر���
		
		GameSprite spHouZi = new GameSprite("houzi", 40, 50);// ���Ӿ���
		spHouZi.playSpriteAnimate("tou");// ���ź���
		
		GameCore.pause(99999);//��ͣ
	}

	public static void main(String[] args)
	{
		GameCore.start(new Main());
	}
}
