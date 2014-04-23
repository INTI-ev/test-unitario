package minefield;

public class MineField {
	
	private Mine[][] field;

	public MineField() {
		field = new Mine[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				field[i][j] = new Mine();
			}
		}
	}

	public Mine[][] getField() {
		return field;
	}

	public void setField(Mine[][] field) {
		this.field = field;
	}

	public void open(int x, int y) {
		field[x][y].setOpened(true);
	}

	public void close(int x, int y) {
		field[x][y].setOpened(false);
	}

	public void mark(int x, int y) {
		field[x][y].setMarked(true);
	}

	public void unmark(int x, int y) {
		field[x][y].setMarked(false);
	}

	public void putMine(int x, int y) {
		field[x][y].setMined(true);
	}

	public void removeMine(int x, int y) {
		field[x][y].setMined(false);
	}

	public int minedNeighbours(int x, int y) {
		if((x<0 || x>7) || (y<0 || y>7))
			throw new IndexOutOfBoundsException("La posición es incorrecta.");
		int res = 0;
		for (int i=-1; i<=1; i++) {
			for (int j=-1; j<=1; j++) {
				if (validPosition(x+i, y+j) && (i!=0 || j!=0) && field[x+i][y+j].isMined()) 
					res++;
			}
		}
		return res;
	}
	
	private boolean validPosition(int x, int y) {
		return (x>=0 && y>=0 && x<8 && y<8);
	}
}
