package fr.spwebdev.aspirateur;

public class Aspi {
	
	//properties
	private int xCoord;
	private int yCoord;
	private directionEnum direction;
	

	//constructor
	public Aspi(int xCoord, int yCoord, directionEnum direction) {
		super();
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.direction = direction;
	}

	
	public void move(commandEnum command ) {
		if (command == commandEnum.D) {
			//turn right
			if (this.getDirection() == directionEnum.N) {
				this.setDirection(directionEnum.E);
			}
			else if (this.getDirection() == directionEnum.E) {
				this.setDirection(directionEnum.S);
			}
			else if (this.getDirection() == directionEnum.S) {
				this.setDirection(directionEnum.W);
			}
			else if (this.getDirection() == directionEnum.W) {
				this.setDirection(directionEnum.N);
			}
		}
		if (command == commandEnum.G) {
			//turn left
			if (this.getDirection() == directionEnum.N) {
				this.setDirection(directionEnum.W);
			}
			else if (this.getDirection() == directionEnum.W) {
				this.setDirection(directionEnum.S);
			}
			else if (this.getDirection() == directionEnum.S) {
				this.setDirection(directionEnum.E);
			}
			else if (this.getDirection() == directionEnum.E) {
				this.setDirection(directionEnum.N);
			}
		}
		if (command == commandEnum.A) {
			//move from +1
			if (this.getDirection() == directionEnum.N) {
				this.setyCoord(yCoord + 1);
			}
			else if (this.getDirection() == directionEnum.W) {
				this.setxCoord(xCoord -1);
			}
			else if (this.getDirection() == directionEnum.S) {
				this.setyCoord(yCoord - 1);
			}
			else if (this.getDirection() == directionEnum.E) {
				this.setxCoord(xCoord +1);
			}
		}
	}
	
	
	
	
	//getters and setters
	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}

	public directionEnum getDirection() {
		return direction;
	}

	public void setDirection(directionEnum direction) {
		this.direction = direction;
	}


	@Override
	public String toString() {
		return xCoord + " " + yCoord + " " + direction ;
	}
	
	
}
