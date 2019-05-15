package com.cricket.fantasy.players;

import javax.persistence.Id;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "players")
public class Players {

	
	@Id
	  public ObjectId _id;
	@Field("PLAYER_ID")
	Long playerId;
	@Field("PLAYER_TEAM")
	String playerTeam;
	@Field("PLAYER_NAME")
	String playerName;
	@Field("PLAYER_COUNTRY")
	String playerCountry;
	@Field("PLAYER_DOB")
	String playerDOB;
	@Field("PLAYER_ROLE")
	String playerRole;
	@Field("PLAYER_BATTINGSTYLE")
	String playerBattingStyle;
	@Field("PLAYER_BOWLINGSTYLE")
	String playerBowlingStyle;
	@Field("PLAYER_HEIGHT")
	String playerHeight;
	@Field("PLAYER_AUCTIONPRICE")
	String playerAuctionPrice;
	
	public Players(){
		
	}
	public Long getPlayerId() {
		return this.playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerTeam() {
		return this.playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	public String getPlayerName() {
		return this.playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerCountry() {
		return this.playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public String getPlayerDOB() {
		return this.playerDOB;
	}
	public void setPlayerDOB(String playerDOB) {
		this.playerDOB = playerDOB;
	}
	public String getPlayerRole() {
		return this.playerRole;
	}
	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}
	public String getPlayerBattingStyle() {
		return this.playerBattingStyle;
	}
	public void setPlayerBattingStyle(String playerBattingStyle) {
		this.playerBattingStyle = playerBattingStyle;
	}
	public String getPlayerBowlingStyle() {
		return this.playerBowlingStyle;
	}
	public void setPlayerBowlingStyle(String playerBowlingStyle) {
		this.playerBowlingStyle = playerBowlingStyle;
	}
	public String getPlayerHeight() {
		return this.playerHeight;
	}
	public void setPlayerHeight(String playerHeight) {
		this.playerHeight = playerHeight;
	}
	public String getPlayerAuctionPrice() {
		return this.playerAuctionPrice;
	}
	public void setPlayerAuctionPrice(String playerAuctionPrice) {
		this.playerAuctionPrice = playerAuctionPrice;
	}
	
	
	
	
	
}
