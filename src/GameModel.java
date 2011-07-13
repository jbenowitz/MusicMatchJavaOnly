import java.util.ArrayList;
import java.util.Collections;


public class GameModel {
	
	static BandSong bandgame;
	static JavaInter gameinterface;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a new BandSong object
		bandgame = new BandSong();
		
		//Create a java interface object
		gameinterface = new JavaInter();

		gamePlay();

	}
	
	public static void gamePlay(){
		bandgame.populate(gameinterface.getLevel()); //begin game with level given by user
		
		//Add the bands and songs to their own separate ArrayLists and shuffle to randomize
		ArrayList<String> bands = new ArrayList<String>();
		bands.addAll(bandgame.getBands());
		Collections.shuffle(bands);
		
		ArrayList<String> songs = new ArrayList<String>();
		songs.addAll(bandgame.getSongs());
		Collections.shuffle(songs);
		
		String[][] bandboard = createBoard(bands);
		String[][] songboard = createBoard(songs);
		
		int gamecount = 0;
		do{
			System.out.println("Band");
			String band = bandboard[gameinterface.getRowNumber()][gameinterface.getColNumber()];
			System.out.println(band);
			
			System.out.println("Song");
			String song = songboard[gameinterface.getRowNumber()][gameinterface.getColNumber()];
			System.out.println(song);
			
			if(bandgame.isPartner(band, song)){
				System.out.println("You got it! Don't ask for that pair again!");
				gamecount++;
			}
		}while(gamecount<9);
		
		
		
	}
	
	public static String[][] createBoard(ArrayList<String> strings){
		String[][] board = new String[3][3];
		
		
		for(int i = 0; i<3; i++){
			for(int j=0; j<3; j++){
				board[i][j] = strings.get(i+j+(i*2));
			}
		}
		
		return board;
	}

}
