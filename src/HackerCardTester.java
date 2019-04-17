import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Comparator;

import org.junit.Test;

public class HackerCardTester {
    
    HackerCard[] unsortedDeck1 = {
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.EIGHT),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.SIX),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.A),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.F),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.ONE),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.ZERO),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.D),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.TWO),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.THREE),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.FIVE),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.FOUR),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.SEVEN),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.B),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.NINE),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.E),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.C),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.EIGHT),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.SIX),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.A),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.F),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.ONE),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.ZERO),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.D),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.TWO),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.THREE),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.FIVE),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.FOUR),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.SEVEN),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.B),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.NINE),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.E),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.C),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.THREE),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.FIVE),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.FOUR),
            new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.EIGHT),
            new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.D),
            new HackerCard(HackerCard.Suit.INTERNET, HackerCard.Rank.SIX),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.E),
            new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.F)
    };
            
    
    
    
    
    @Test
    public void testEquals() {
        HackerCard r1 = new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.E);
        HackerCard r2 = new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.E);
        HackerCard r3 = new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.SIX);
        assertTrue("This File Records are identical", r1.equals(r1));
        assertFalse("These have a different suits", r1.equals(r2));
        assertFalse("These have a different ranks", r2.equals(r3));
        assertFalse("These are completely different", r3.equals(r1));
    }

    @Test

    public void testCopyOf() {
        HackerCard[] copy = HackerCard.copyOf(unsortedDeck1);
        assertEquals("These should be the same size.", unsortedDeck1.length, copy.length);
        for(int i = 0; i < unsortedDeck1.length; i++) {
            assertTrue(unsortedDeck1[i].equals(copy[i]));
        }
    }
    
    @Test 
    public void testQuickSort() {
        HackerCard[] toBeSortedDeck1 = HackerCard.copyOf(unsortedDeck1);
        Comparator<HackerCard> comp = new HackerCard.CardComparator();
        long st = System.nanoTime();
        HackerCard.quickSort(comp, toBeSortedDeck1);
        long et = System.nanoTime();
        System.out.println("Quick Sort Time: " + (et-st) + " nanoseconds.");
        assertEquals("These should be the same size", unsortedDeck1.length, toBeSortedDeck1.length);
        for(int i = 1; i < toBeSortedDeck1.length; i++) { 
            assertTrue("These should be in ascending order.", 
                    comp.compare(toBeSortedDeck1[i-1], toBeSortedDeck1[i]) < 0);
        }
    }
    
    @Test
    public void testComparator() {
    	Comparator<HackerCard> comp = new HackerCard.CardComparator();
    	HackerCard card1 = new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.E);
    	HackerCard card1Rep = new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.E);
    	HackerCard card1RankBig = new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.F);
    	HackerCard card1RankSmall = new HackerCard(HackerCard.Suit.PC, HackerCard.Rank.TWO);
    	HackerCard card2Big = new HackerCard(HackerCard.Suit.HACKER, HackerCard.Rank.E);
    	HackerCard card2Small = new HackerCard(HackerCard.Suit.PROGRAM, HackerCard.Rank.E);

    	assertTrue("Card is equal to itself.", 0 == comp.compare(card1, card1));
    	assertTrue("Card is equal to itself.", 0 == comp.compare(card1, card1Rep));
    	assertTrue("Card is equal to itself.", 0 > comp.compare(card1, card1RankBig));
    	assertTrue("Card is equal to itself.", 0 < comp.compare(card1, card1RankSmall));
    	assertTrue("Card is equal to itself.", 0 < comp.compare(card1, card2Big));
    	assertTrue("Card is equal to itself.", 0 > comp.compare(card1, card2Small));

    }
    
    @Test 
    public void testMergeSort() {
        HackerCard[] toBeSortedDeck1 = HackerCard.copyOf(unsortedDeck1);
        Comparator<HackerCard> comp = new HackerCard.CardComparator();
        long st = System.nanoTime();
        HackerCard.mergeSort(comp, toBeSortedDeck1);
        long et = System.nanoTime();
        System.out.println("Merge Sort Time: " + (et-st) + " nanoseconds.");
        assertEquals("These should be the same size", unsortedDeck1.length, toBeSortedDeck1.length);
        for(int i = 1; i < toBeSortedDeck1.length; i++) { 
            assertTrue("These should be in ascending order.", 
                    comp.compare(toBeSortedDeck1[i-1], toBeSortedDeck1[i]) < 0);
        }
    }
 }