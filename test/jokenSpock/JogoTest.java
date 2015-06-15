package jokenSpock;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class JogoTest {

	private Jogo jogo;

	@Before
	public void setUp() throws Exception {
		jogo=new Jogo();
	}
	@Test
	public void tesouraVSPapelDaTesoura() {
		String winner = jogo.winnerName(jogo.getItem("Tesoura"),jogo.getItem("Papel"));
		assertEquals("Tesoura", winner);
	}
		
	@Test
	public void papelVSTesouraDaTesoura() {
		String winner = jogo.winnerName(jogo.getItem("Papel"),jogo.getItem("Tesoura"));
		assertEquals("Tesoura", winner);
	}


	@Test
	public void papelVSPedraDaPapel() {
		String winner = jogo.winnerName(jogo.getItem("Papel"),jogo.getItem("Pedra"));
		assertEquals("Papel", winner);
	}
	@Test
	public void pedraVSPapelDaPapel() {
		String winner = jogo.winnerName(jogo.getItem("Pedra"),jogo.getItem("Papel"));
		assertEquals("Papel", winner);
	}
	@Test
	public void pedraVSLagartoDaPedra() {
		String winner = jogo.winnerName(jogo.getItem("Pedra"),jogo.getItem("Lagarto"));
		assertEquals("Pedra", winner);
	}
	@Test
	public void lagartoVSPedraDaPedra() {
		String winner = jogo.winnerName(jogo.getItem("Lagarto"),jogo.getItem("Pedra"));
		assertEquals("Pedra", winner);
	}
	@Test
	public void spockVSLagartoDaLagarto() {
		String winner = jogo.winnerName(jogo.getItem("Spock"),jogo.getItem("Lagarto"));
		assertEquals("Lagarto", winner);
	}
	@Test
	public void lagartoVSSpockDaLagarto() {
		String winner = jogo.winnerName(jogo.getItem("Lagarto"),jogo.getItem("Spock"));
		assertEquals("Lagarto", winner);
	}
	@Test
	public void spockVSTesouraDaSpock() {
		String winner = jogo.winnerName(jogo.getItem("Spock"),jogo.getItem("Tesoura"));
		assertEquals("Spock", winner);
	}
	@Test
	public void tesouraVSSpockDaSpock() {
		String winner = jogo.winnerName(jogo.getItem("Tesoura"),jogo.getItem("Spock"));
		assertEquals("Spock", winner);
	}
	@Test
	public void lagartoVSTesouraDaTesoura() {
		String winner = jogo.winnerName(jogo.getItem("Lagarto"),jogo.getItem("Tesoura"));
		assertEquals("Tesoura", winner);
	}
	@Test
	public void tesouraVSLagartoDaTesoura() {
		String winner = jogo.winnerName(jogo.getItem("Tesoura"),jogo.getItem("Lagarto"));
		assertEquals("Tesoura", winner);
	}
	@Test
	public void lagartoVSPapelDaLagarto() {
		String winner = jogo.winnerName(jogo.getItem("Lagarto"),jogo.getItem("Papel"));
		assertEquals("Lagarto", winner);
	}
	@Test
	public void papelVSLagartoDaLagarto() {
		String winner = jogo.winnerName(jogo.getItem("Papel"),jogo.getItem("Lagarto"));
		assertEquals("Lagarto", winner);
	}
	@Test
	public void spockVSPapelDaPapel() {
		String winner = jogo.winnerName(jogo.getItem("Spock"),jogo.getItem("Papel"));
		assertEquals("Papel", winner);
	}
	@Test
	public void papelVSSpockDaPapel() {
		String winner = jogo.winnerName(jogo.getItem("Papel"),jogo.getItem("Spock"));
		assertEquals("Papel", winner);
	}
	@Test
	public void spockVSPedraDaSpock() {
		String winner = jogo.winnerName(jogo.getItem("Spock"),jogo.getItem("Pedra"));
		assertEquals("Spock", winner);
	}
	@Test
	public void pedraVSSpockDaPedra() {
		String winner = jogo.winnerName(jogo.getItem("Pedra"),jogo.getItem("Spock"));
		assertEquals("Spock", winner);
	}
	@Test
	public void tesouraVSPedraDaPedra() {
		String winner = jogo.winnerName(jogo.getItem("Tesoura"),jogo.getItem("Pedra"));
		assertEquals("Pedra", winner);
	}
	@Test
	public void pedraVSTesourakDaPedra() {
		String winner = jogo.winnerName(jogo.getItem("Pedra"),jogo.getItem("Tesoura"));
		assertEquals("Pedra", winner);
	}

	
	@Test
	public void doisItensTesoura(){
		String winner = jogo.winnerName(jogo.getItem("Tesoura"),jogo.getItem("Tesoura"));
		assertEquals("Empate", winner);
	}
	@Test
	public void doisItensPedra(){
		String winner = jogo.winnerName(jogo.getItem("Pedra"),jogo.getItem("Pedra"));
		assertEquals("Empate", winner);
	}@Test
	public void doisItensPapel(){
		String winner = jogo.winnerName(jogo.getItem("Papel"),jogo.getItem("Papel"));
		assertEquals("Empate", winner);
	}@Test
	public void doisItensSpock(){
		String winner = jogo.winnerName(jogo.getItem("Spock"),jogo.getItem("Spock"));
		assertEquals("Empate", winner);
	}@Test
	public void doisItensIguais(){
		String winner = jogo.winnerName(jogo.getItem("Lagarto"),jogo.getItem("Lagarto"));
		assertEquals("Empate", winner);
	}
	@Test
	public void itemInvalidos(){
		String winner = jogo.winnerName(jogo.getItem("Maçã"),jogo.getItem("Banana"));
		assertEquals("Erro", winner);
	}
}
