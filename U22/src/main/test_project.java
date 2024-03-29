package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_project
{
	String player1;
	String player2;

	static List<Integer> atcard = new ArrayList<Integer>();//攻撃側山札（０～１１の計１２枚）
	static List<Integer> defcard = new ArrayList<Integer>();;//防御側山札（１２～１９の計８枚）

	static int[][] athand = new int[5][5];//攻撃側の手札（５枚）
	static int[][] defhand = new int[8][2];//防御側の手札（８枚）

	static int at_movept;//攻撃側の行動値
	static int def_movept;//防御側の行動値

	static int def_hp;//防御側の信頼度（HP＝これが０になったら攻撃側の勝ち）
	static int winpt;//勝利条件（防御側が３回防いだら＝これが３溜まったら防御側の勝ち）

	static int[] atcardinfo = new int[5];//DBから攻撃カードのデータを受け取るときの退避用配列
	static int[]defcardinfo =new int[2];//DBから防御カードのデータを受け取るときの退避用配列

	public static void main(String[] args)
	{
		start();
		System.out.println("攻撃側の山札" + atcard);
		System.out.println("防御側の山札" + defcard);

		System.out.println("\n" + "攻撃側の手札");
		athand();
		for (int i = 0; i < 5; i++)
		{
			System.out.println(athand[i][0]);
		}

		System.out.println("\n" + "防御側の手札");
		defhand();
		for (int i = 0; i < 8; i++)
		{
			System.out.println(defhand[i][0]);
		}
	}

	/*------メモ--------------------------------------------------------/
	/<リスト名>.add(要素番号);//リストに追加							/
	/<リスト名>.get(要素番号)											/
	/<リスト名>.remove(要素番号);//リスト内を要素番号で削除				/
	/Collections.shuffle(<リスト名>);//リスト内のシャッフル				/
	/<リスト名>.size();//リスト内の要素数					 			/
	/------------------------------------------------------------------*/
	//山札の初期設定
	static void start()
	{
		//攻撃側の山札の初期設定、リストに０～１１を入れる（攻撃カードIDとなる）
		for (int i = 0; i < 12; i++)
		{
			atcard.add(i);
		}

		//防御者の山札の初期設定、リストに１２～１９を入れる（防御カードIDとなる）
		for (int i = 12; i < 20; i++)
		{
			defcard.add(i);
		}
	}

	/*攻撃側の手札の配列内容(5×5)------------------------------/
	/															/
	/	[カードID][ダメージ値][コスト][防カード１][防カード２]	/
	/															/
	/----------------------------------------------------------*/

	//攻撃側の手札の設定
	static void athand()
	{
		Collections.shuffle(atcard);//攻撃カードの山札をシャッフル
		for (int i = 0; i < 5; i++)
		{
			athand[i][0] = atcard.get(i);//配列の１番目にカードIDをセット

			for (int j = 0; j < 5; j++)
			{

			}
		}

	}

	/*防御側の手札の配列内容(8×2)--/
	/								/
	/	[カードID][コスト]			/
	/								/
	/------------------------------*/

	//防御側の手札の設定
	static void defhand()
	{
		for (int i = 0; i < 8; i++)
		{
			defhand[i][0] = defcard.get(i);//配列の１番目にカードIDをセット
			for (int j = 0; j < 2; j++)
			{

			}
		}

	}

}