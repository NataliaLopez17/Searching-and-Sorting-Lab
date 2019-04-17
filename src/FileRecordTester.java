import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FileRecordTester {
    FileRecord[] emptyShelve = {};
    
    FileRecord[] unsortedShelve1 = {
            new FileRecord(2, "Apu", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(1, "Ami", FileRecord.Sex.MALE , 'H'),
            new FileRecord(0, "Jay", FileRecord.Sex.MALE , 'D'),
            new FileRecord(20, "May", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(4, "Gym", FileRecord.Sex.MALE , 'D'),
            new FileRecord(23, "Gil", FileRecord.Sex.MALE , 'A'),
            new FileRecord(33, "Gil", FileRecord.Sex.FEMALE , 'Y'),
            new FileRecord(12, "Sim", FileRecord.Sex.MALE , 'Z'),
            new FileRecord(24, "Bill", FileRecord.Sex.MALE , 'R'),
            new FileRecord(8, "Chrys", FileRecord.Sex.FEMALE , 'E'),
            new FileRecord(10, "Joel", FileRecord.Sex.MALE , 'M'),
            new FileRecord(22, "Chris", FileRecord.Sex.MALE , 'L'),
            new FileRecord(3, "Barb", FileRecord.Sex.FEMALE , 'I'),
            new FileRecord(45, "Dick", FileRecord.Sex.MALE , 'H'),
            new FileRecord(5, "Jake", FileRecord.Sex.MALE , 'B'),
            new FileRecord(14, "Jane", FileRecord.Sex.FEMALE , 'G'),
            new FileRecord(11, "James", FileRecord.Sex.MALE , 'D'),
            new FileRecord(6, "John", FileRecord.Sex.MALE , 'C'),
            new FileRecord(7, "Jan", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(19, "Juke", FileRecord.Sex.MALE , 'A'),
            new FileRecord(9, "Lake", FileRecord.Sex.FEMALE , 'H'),
            new FileRecord(21, "Tak", FileRecord.Sex.MALE , 'D'),
            new FileRecord(32, "Kay", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(30, "Rick", FileRecord.Sex.MALE , 'D'),
            new FileRecord(26, "Mam", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(43, "Best", FileRecord.Sex.MALE , 'Y'),
            new FileRecord(42, "Jale", FileRecord.Sex.FEMALE , 'Z'),
            new FileRecord(40, "Name", FileRecord.Sex.MALE , 'R'),
            new FileRecord(50, "Anon", FileRecord.Sex.MALE , 'E'),
            new FileRecord(53, "Nimous", FileRecord.Sex.FEMALE , 'M'),
            new FileRecord(55, "Idea", FileRecord.Sex.MALE , 'L'),
            new FileRecord(60, "Areout", FileRecord.Sex.FEMALE , 'I'),
            new FileRecord(62, "Ofmy", FileRecord.Sex.MALE , 'H'),
            new FileRecord(69, "Hea", FileRecord.Sex.FEMALE , 'B'),
            new FileRecord(70, "Dhelp", FileRecord.Sex.MALE , 'G'),
            new FileRecord(28, "Plea", FileRecord.Sex.FEMALE , 'D'),
            new FileRecord(77, "Seim", FileRecord.Sex.FEMALE , 'C'),
            new FileRecord(66, "Tir", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(78, "Edof", FileRecord.Sex.MALE , 'S'),
            new FileRecord(36, "Write", FileRecord.Sex.MALE , 'Q')
    };
    
    FileRecord[] unsortedShelve2 = {
            new FileRecord(2, "Apu", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(1, "Ami", FileRecord.Sex.MALE , 'H'),
            new FileRecord(0, "Jay", FileRecord.Sex.MALE , 'D'),
            new FileRecord(20, "May", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(4, "Gym", FileRecord.Sex.MALE , 'D'),
            new FileRecord(22, "Ofmy", FileRecord.Sex.MALE , 'H'),
            new FileRecord(39, "Hea", FileRecord.Sex.FEMALE , 'B'),
            new FileRecord(70, "Dhelp", FileRecord.Sex.MALE , 'G'),
            new FileRecord(28, "Plea", FileRecord.Sex.FEMALE , 'D'),
            new FileRecord(17, "Seim", FileRecord.Sex.FEMALE , 'C'),
            new FileRecord(16, "Tir", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(18, "Edof", FileRecord.Sex.MALE , 'S'),
            new FileRecord(36, "Write", FileRecord.Sex.MALE , 'Q')
    };
    
    FileRecord[] sortedShelve1 = {
            new FileRecord(0, "Apu", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(1, "Ami", FileRecord.Sex.MALE , 'H'),
            new FileRecord(2, "Jay", FileRecord.Sex.MALE , 'D'),
            new FileRecord(3, "May", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(4, "Gym", FileRecord.Sex.MALE , 'D'),
            new FileRecord(5, "Gil", FileRecord.Sex.MALE , 'A'),
            new FileRecord(6, "Gil", FileRecord.Sex.FEMALE , 'Y'),
            new FileRecord(7, "Sim", FileRecord.Sex.MALE , 'Z'),
            new FileRecord(8, "Bill", FileRecord.Sex.MALE , 'R'),
            new FileRecord(9, "Chrys", FileRecord.Sex.FEMALE , 'E'),
            new FileRecord(10, "Joel", FileRecord.Sex.MALE , 'M'),
            new FileRecord(11, "Chris", FileRecord.Sex.MALE , 'L'),
            new FileRecord(12, "Barb", FileRecord.Sex.FEMALE , 'I'),
            new FileRecord(13, "Dick", FileRecord.Sex.MALE , 'H'),
            new FileRecord(15, "Jake", FileRecord.Sex.MALE , 'B'),
            new FileRecord(18, "Jane", FileRecord.Sex.FEMALE , 'G'),
            new FileRecord(20, "James", FileRecord.Sex.MALE , 'D'),
            new FileRecord(21, "John", FileRecord.Sex.MALE , 'C'),
            new FileRecord(22, "Jan", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(23, "Juke", FileRecord.Sex.MALE , 'A'),
            new FileRecord(25, "Lake", FileRecord.Sex.FEMALE , 'H'),
            new FileRecord(26, "Tak", FileRecord.Sex.MALE , 'D'),
            new FileRecord(29, "Kay", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(30, "Rick", FileRecord.Sex.MALE , 'D'),
            new FileRecord(31, "Mam", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(32, "Best", FileRecord.Sex.MALE , 'Y'),
            new FileRecord(33, "Jale", FileRecord.Sex.FEMALE , 'Z'),
            new FileRecord(35, "Name", FileRecord.Sex.MALE , 'R'),
            new FileRecord(39, "Anon", FileRecord.Sex.MALE , 'E'),
            new FileRecord(40, "Nimous", FileRecord.Sex.FEMALE , 'M'),
            new FileRecord(42, "Idea", FileRecord.Sex.MALE , 'L'),
            new FileRecord(43, "Areout", FileRecord.Sex.FEMALE , 'I'),
            new FileRecord(44, "Ofmy", FileRecord.Sex.MALE , 'H'),
            new FileRecord(45, "Hea", FileRecord.Sex.FEMALE , 'B'),
            new FileRecord(48, "Dhelp", FileRecord.Sex.MALE , 'G'),
            new FileRecord(50, "Plea", FileRecord.Sex.FEMALE , 'D'),
            new FileRecord(52, "Seim", FileRecord.Sex.FEMALE , 'C'),
            new FileRecord(55, "Tir", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(60, "Edof", FileRecord.Sex.MALE , 'S'),
            new FileRecord(62, "Write", FileRecord.Sex.MALE , 'Q')
    };
    
    FileRecord[] sortedShelve2 = {
            new FileRecord(3, "Apu", FileRecord.Sex.FEMALE , 'A'),
            new FileRecord(5, "Ami", FileRecord.Sex.MALE , 'H'),
            new FileRecord(18, "Jay", FileRecord.Sex.MALE , 'D'),
            new FileRecord(26, "May", FileRecord.Sex.FEMALE , 'J'),
            new FileRecord(37, "Gym", FileRecord.Sex.MALE , 'D'),
            new FileRecord(44, "Ofmy", FileRecord.Sex.MALE , 'H'),
            new FileRecord(51, "Hea", FileRecord.Sex.FEMALE , 'B'),
            new FileRecord(69, "Dhelp", FileRecord.Sex.MALE , 'G'),
            new FileRecord(73, "Plea", FileRecord.Sex.FEMALE , 'D'),
            new FileRecord(80, "Seim", FileRecord.Sex.FEMALE , 'C'),
            new FileRecord(92, "Tir", FileRecord.Sex.FEMALE , 'T'),
            new FileRecord(102, "Edof", FileRecord.Sex.MALE , 'S'),
            new FileRecord(105, "Write", FileRecord.Sex.MALE , 'Q')
    };
    
    @Test
    public void testEquals() {
        FileRecord r1 = new FileRecord(92, "Tir", FileRecord.Sex.FEMALE , 'T');
        FileRecord r1c = new FileRecord(r1);
        FileRecord r2 = new FileRecord(92, "Tir", FileRecord.Sex.MALE , 'T'); 
        FileRecord r3 = new FileRecord(92, "Tir", FileRecord.Sex.MALE , 'A');
        FileRecord r4 = new FileRecord(92, "Bif", FileRecord.Sex.MALE , 'T'); 
        FileRecord r5 = new FileRecord(94, "Tir", FileRecord.Sex.MALE , 'T'); 
        assertTrue("This File Records are identical", r1.equals(r1c));
        assertFalse("These have a different Sex", r1.equals(r2));
        assertFalse("These have a different Types", r2.equals(r3));
        assertFalse("These have a different Names", r3.equals(r4));
        assertFalse("These have a different IDs", r4.equals(r5));
        assertFalse("These are completely different", r5.equals(r1));
    }
    
    @Test
    public void testCopyOf() {
        FileRecord[] copy = FileRecord.copyOf(unsortedShelve2);
        for(int i = 0; i < unsortedShelve2.length; i++) {
            assertTrue(unsortedShelve2[i].equals(copy[i]));
        }
    }
    
    @Test
    public void testLinearSearch() {
        assertEquals(-1, FileRecord.linearSearch(emptyShelve, new FileRecord(14, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(15, FileRecord.linearSearch(unsortedShelve1, new FileRecord(14, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(-1, FileRecord.linearSearch(unsortedShelve1, new FileRecord(15, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(5, FileRecord.linearSearch(unsortedShelve2, new FileRecord(22, "Ofmy", FileRecord.Sex.MALE , 'H')));
        assertEquals(-1, FileRecord.linearSearch(unsortedShelve2, new FileRecord(23, "Ofmy", FileRecord.Sex.MALE , 'H')));
        long st = System.nanoTime();
        assertEquals(27, FileRecord.linearSearch(sortedShelve1, new FileRecord(35, "Name", FileRecord.Sex.MALE , 'R')));
        long et = System.nanoTime();
        System.out.println("Linear Search Time (Found): " + (et-st) + " nanoseconds.");
        st = System.nanoTime();
        assertEquals(-1, FileRecord.linearSearch(sortedShelve1, new FileRecord(36, "Name", FileRecord.Sex.MALE , 'R')));
        et = System.nanoTime();
        System.out.println("Linear Search Time (Not Found): " + (et-st) + " nanoseconds.");
        assertEquals(7, FileRecord.linearSearch(sortedShelve2, new FileRecord(69, "Dhelp", FileRecord.Sex.MALE , 'G')));
        assertEquals(-1, FileRecord.linearSearch(sortedShelve2, new FileRecord(70, "Dhelp", FileRecord.Sex.MALE , 'G')));
    }
    
    @Test
    public void testBinarySearch() {
        assertEquals(-1, FileRecord.binarySearch(emptyShelve, new FileRecord(14, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(-1, FileRecord.binarySearch(unsortedShelve1, new FileRecord(14, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(-1, FileRecord.binarySearch(unsortedShelve1, new FileRecord(15, "Jane", FileRecord.Sex.FEMALE , 'G')));
        assertEquals(-1, FileRecord.binarySearch(unsortedShelve2, new FileRecord(39, "Ofmy", FileRecord.Sex.MALE , 'H')));
        assertEquals(-1, FileRecord.binarySearch(unsortedShelve2, new FileRecord(23, "Ofmy", FileRecord.Sex.MALE , 'H')));
        long st = System.nanoTime();
        assertEquals(27, FileRecord.binarySearch(sortedShelve1, new FileRecord(35, "Name", FileRecord.Sex.MALE , 'R')));
        long et = System.nanoTime();
        System.out.println("Binary Search Time (Found): " + (et-st) + " nanoseconds.");
        st = System.nanoTime();
        assertEquals(-1, FileRecord.binarySearch(sortedShelve1, new FileRecord(36, "Name", FileRecord.Sex.MALE , 'R')));
        et = System.nanoTime();
        System.out.println("Binary Search Time (Not Found): " + (et-st) + " nanoseconds.");
        assertEquals(7, FileRecord.binarySearch(sortedShelve2, new FileRecord(69, "Dhelp", FileRecord.Sex.MALE , 'G')));
        assertEquals(-1, FileRecord.binarySearch(sortedShelve2, new FileRecord(70, "Dhelp", FileRecord.Sex.MALE , 'G')));
    }   
    
    @Test 
    public void testBubbleSort() {
        FileRecord[] toBeSortedShelve1 = FileRecord.copyOf(unsortedShelve1);
        long st = System.nanoTime();
        FileRecord.bubbleSort(toBeSortedShelve1);
        long et = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (et-st) + " nanoseconds.");
        assertEquals("These should be the same size", unsortedShelve1.length, toBeSortedShelve1.length);
        for(int i = 1; i < toBeSortedShelve1.length; i++) { 
            assertTrue("These should be in assending order.", 
                    toBeSortedShelve1[i-1].compareTo(toBeSortedShelve1[i]) < 0);
        }
    }
    
    @Test 
    public void testInsertionSort() {
        FileRecord[] toBeSortedShelve1 = FileRecord.copyOf(unsortedShelve1);
        long st = System.nanoTime();
        FileRecord.insertionSort(toBeSortedShelve1);
        long et = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (et-st) + " nanoseconds.");
        assertEquals("These should be the same size", unsortedShelve1.length, toBeSortedShelve1.length);
        for(int i = 1; i < toBeSortedShelve1.length; i++) { 
            assertTrue("These should be in ascending order.", toBeSortedShelve1[i-1].compareTo(toBeSortedShelve1[i]) < 0);
        }
    }
@Test 
    public void testSelectionSort() {
        FileRecord[] toBeSortedShelve1 = FileRecord.copyOf(unsortedShelve1);
        long st = System.nanoTime();
        FileRecord.selectionSort(toBeSortedShelve1);
        long et = System.nanoTime();
        System.out.println("Insertion Sort Time: " + (et-st) + " nanoseconds.");
        assertEquals("These should be the same size", unsortedShelve1.length, toBeSortedShelve1.length);
        for(int i = 1; i < toBeSortedShelve1.length; i++) { 
            assertTrue("These should be in ascending order.", toBeSortedShelve1[i-1].compareTo(toBeSortedShelve1[i]) < 0);
        }
    }
}