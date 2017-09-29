package be.pxl.generics.opdracht2;

import java.util.ArrayList;

public class Team<E extends Player> {
	private ArrayList<E> members;
	private String name;
	private int played = 0;
	private int won = 0;
	private int lost = 0;
	private int tied = 0;
	
	public Team(String name) {
		this.name = name;
		members = new ArrayList<E>();
	}

	public ArrayList<E> getMembers() {
		return members;
	}

	public String getName() {
		return name;
	}

	public int getPlayed() {
		return played;
	}

	public int getWon() {
		return won;
	}

	public int getLost() {
		return lost;
	}

	public int getTied() {
		return tied;
	}
	
	public void addPlayer(E player){
		if(!members.contains(player)){
			members.add(player);	
		}
	}
	
	public int numberOfPlayers(){
		return members.size();
	}
	
	public void matchResult(Team<E> opponent, int ourScore, int theirScore) {
		if(opponent == null){
			opponent = new Team<E>("catchNull");
		}
		played++;
		opponent.played++;
		
		if(ourScore > theirScore){
			won++;
			opponent.lost++;
		} else if(theirScore>ourScore){
			lost++;
			opponent.won++;
		} else {
			tied++;
			opponent.tied++;
		}
		
	}
	
	public int ranking(){
		return won*3 + tied;
	}

}
