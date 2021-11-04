package coinEat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// 1. 배경화면 구성
// 2. 배경화면 구성2 배경사진 넣기
// 3. player와 coin 이미지 설정

public class CoinEat extends JFrame{
	
	//5-1 player 깜빡임 방지
	private Image bufferImage;
	private Graphics screenGraphic;
	
	//2-1. 배경 사진
	private Image backgroundImage = new ImageIcon("src/images/bigCloud.jpg").getImage();
	//3-1. player와 coin 이미지
	private Image player = new ImageIcon("src/images/player.png").getImage();
	private Image coin = new ImageIcon("src/images/coin2.png").getImage();
	
	//3-2. player와 coin 이미지 크기와 좌표설정
	private int playerX, playerY;
	private int playerWidth = player.getWidth(null); //null의 의미는?
	private int playerHeight = player.getHeight(null);
	
	private int coinX, coinY;
	private int coinWidth = coin.getWidth(null);
	private int coinHeight= coin.getHeight(null);
	
	//3-3. 점수
	private int score;
	
	//4-1. 키보드의 움직임을 받아 줄 boolean 변수 . 초기값은 false로 하기.
	// 굳이 boolean으로 설정하지 않는다면 키 두개의 입력을 못 받아들인다. (오른쪽 대각선, 왼쪽 대각선 등)
	private boolean up, down, left, right;
	
	//1-1. 레이아웃, 틀
	public CoinEat() {
		setTitle("동전 먹기 게임");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//4-2. 키보드 리스터 추가
		// keypressed는 키를 눌렀을 때 실행할 메소드
		// w:위 a:왼쪽 s:아래 d:오른쪽
		// 위와 같이 방향키를 누를 때마다 up, down, left, right를 true 값으로 바꾸어주기
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_W:
					up = true;
					break;
				case KeyEvent.VK_A:
					left = true;
					break;
				case KeyEvent.VK_S:
					down = true;
					break;
				case KeyEvent.VK_D:
					right = true;
					break;
				
				}
			}
			//4-3. 키를 뗐을 때 실행하는 메소드
			// 각각의 up,down,left,right 값을 false로 바꿔준다.
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_W:
					up = false;
					break;
				case KeyEvent.VK_A:
					left = false;
					break;
				case KeyEvent.VK_S:
					down = false;
					break;
				case KeyEvent.VK_D:
					right = false;
					break;
					
				}
			}
		});
		
		
		
		//3-5. 초기화 해주는 메소드 호출하기.
		Init();

		//4-5. 살짝의 대기시간을 주면서 키 누르는 것을 반복하기
		while(true) {
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			keyProcess();
			//6-2 점수획득하는 것도 반복문 안에 넣어주기
			crashCheck();
		}
	}
	
	
	//3-4. 게임을 시작할 때 초기화 해주는 Init 메소드
	// 점수를 0으로 설정, 프레이어의 좌표는 정중앙에 위치하도록 하기
	// coin의 위치는 랜덤으로 설정 (Math.random()은 0-1사이의 난수가 나오므로 int형으로 변환해 소수점이하는 없애도록 하기)
	// coin의 y좌표는 프레임 틀의 길이를 생각해 30을 더 배준다.
	public void Init() {
		score = 0;
		
		// player는 화면 중앙에 위치
		playerX = (500 - playerWidth)/2; 
		playerY = (500 - playerHeight)/2;
		
		//coin은 랜덤으로 위치
		coinX = (int)(Math.random()*(501 - coinWidth));
		coinY = (int)(Math.random()*(501 - coinHeight - 30)) + 30; //왜 30을 도로 더할까?
	}
	
	//4-4.up,down,left,right의 boolean값으로 player를 이동시키는 메소드
	// player가 위 키를 눌렀고(up이 true), Y좌표 위치가 30이상이라면 Y좌표를 3만큼 위로 이동하라.
	// player가 아래 키를 눌렀고(down이 true), Y좌표 위치에서 player높이와 3을 더한 값이 500보다 작다면, Y좌표를 3만큼 아래로 이동하라.
	// player가 왼쪽 키를 눌렀고(left가 true), X좌표 위치에서 3을 뺀 값이 0보다 크다면, X좌표를 3만큼 왼쪽으로 이동하라.
	// player가 오른쪽 키를 눌렀고(right이 true), X좌표 위치에서 player너비와 3을 더한 값이 500보다 작다면, X좌표를 3만큼 오른쪽으로 이동하라.
	public void keyProcess() {
		if (up && playerY - 3 > 30) playerY -= 3; // 위로 이동하는데 왜 마이너스를 하는거지?
		if (down && playerY + playerHeight + 3 < 500) playerY += 3;
		if (left && playerX - 3 > 0) playerX -= 3;
		if (right && playerX + playerHeight + 3 <500) playerX += 3;
	}
	
	//6-1. player와 coin이 닿았을 때 점수 획득 구현하기.
	// 먼저 충돌 범위 설정하기.
	// 서로 닿으면 점수 획득하고, coin은 다시 랜덤으로 이동시키기
	public void crashCheck() {
		// player의 x좌표와 너비가 coin의 x 좌표보다 큰 수라고 한다면, 
		// 
		if (playerX+playerWidth > coinX && playerY+playerHeight > coinY && coinX+coinWidth > playerX && coinY+coinHeight > playerY) {
			score += 100;
			coinX = (int)(Math.random()*(501 - coinWidth));
			coinY = (int)(Math.random()*(501 - coinHeight - 30)) + 30; 			
		}
	}
	
	//5-2. player가 깜빡이지 않게 하기 위해 더블 버퍼링 기법 이용
	// 화면 크기의 버퍼이미지 생성해주고 그래픽 받아오기
	// 다시 screenDraw를 호출하여 이 버퍼 이미지를 화면에 그려주는 작업을 반복한다.
	public void paint(Graphics g) {
		bufferImage = createImage(500, 500);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}
	
	
	//2-2. 배경사진 run
	public void screenDraw(Graphics g) { //처음엔 메소드 명이 paint이였지만 4-6이후 screenDraw로 변경
		g.drawImage(backgroundImage, 0, 0, null);
		//3-6. player와 coin 이미지 출력해주기
		g.drawImage(player, playerX, playerY, null);
		g.drawImage(coin, coinX, coinY, null);
		// 3-7 점수 화면에 출력하기
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("SCORE : "+score, 30, 80);
		//4-6. player가 움직이도록 하기 (여기서 run해보면 너무 깜빡임)
		this.repaint();
		
	}
	
	//1-2. 레이아웃 run
	public static void main(String[] args) {
		new CoinEat();
	}

}
