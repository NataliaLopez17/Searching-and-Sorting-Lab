public class FileRecord implements Comparable<FileRecord> {
	public enum Sex {MALE, FEMALE} //Enumerated type to categorize between Male and Female

	private int recordID;
	private String patientName;
	private Sex sex;
	private char type;


	//Constructors
	public FileRecord(int recordID, String patientName, Sex sex, char patientType) {
		this.recordID = recordID;
		this.patientName = patientName;
		this.sex = sex;
		type = patientType;
	}

	public FileRecord(FileRecord otherFile) {
		recordID = otherFile.getID();
		patientName = otherFile.getPName();
		sex = otherFile.getSex();
		type = otherFile.getType();
	}

	@Override
	public int compareTo(FileRecord oFile) {
		return this.recordID - oFile.getID();
	}

	//Getters
	public Sex getSex() {
		return sex;
	}

	public char getType() {
		return type;
	}

	public String getPName() {
		return patientName;
	}

	public int getID() {
		return recordID;
	}

	//Equals method for comparing if another object is the same as this instance
	public boolean equals(Object obj) {
		if(!(obj instanceof FileRecord))
			return false;
		FileRecord other = (FileRecord) obj;
		return this.recordID == other.getID() &&
				this.patientName.equals(other.getPName()) &&
				this.sex == other.getSex() && this.type == other.getType();
	}

	/**
	 * A method to return a copy of the given array
	 * @param shelve - Original Array
	 * @return - Copy of shelve
	 */
	public static FileRecord[] copyOf(FileRecord[] shelve) {
		FileRecord[] copy = new FileRecord[shelve.length];
		for(int i = 0; i < shelve.length; i++) {
			copy[i] = shelve[i];
		}
		return copy;
	}

	/**
	 * Linear Algorithm to find the index of a given target.
	 * @param shelve - Target List
	 * @param target - Target Element
	 * @return - Index of Target Element (-1 if not found)
	 */
	public static int linearSearch(FileRecord[] shelve, FileRecord target) {
		return linHelper(shelve, 0, new FileRecord(target) {
			@SuppressWarnings("unused")
			public boolean equals(FileRecord otherRecord) {
				return this.getID() == otherRecord.getID();
			}
		});
	}

	/**
	 * Linear search helper
	 * @param shelve - Array to find target in
	 * @param index - index of current object we are comparing the target with 
	 * @param target - The object we want to find in the array
	 * @return index of what was found (-1 if not found)
	 */
	private static int linHelper(FileRecord[] shelve, int index, FileRecord target) {
		if(index >= shelve.length) {
			return -1;
		}
		if(target.equals(shelve[index])) {
			return index;
		}
		return linHelper(shelve, index+1, target);
	}

	/**
	 * Binary Algorithm to find the index of a given target.
	 * @param arr - Target List
	 * @param target - Target Element
	 * @return - Index of Target Element (-1 if not found)
	 */
	public static int binarySearch(FileRecord[] shelve, FileRecord target) {
		return helperBinary(shelve, target, 0, shelve.length -1);
	}

	public static int helperBinary(FileRecord[] shelve, FileRecord target, int left, int right) {
		int mid = (left + right) /2;

		if(left > right) {
			return -1;
		}

		if(shelve[mid].compareTo(target) > 0) {
			return helperBinary(shelve, target, 0, mid - 1);
		}
		else if(shelve[mid].compareTo(target) < 0) {
			return helperBinary(shelve, target, mid + 1, right);
		}
		else if(target.equals(shelve[mid])) { 
			return mid;
		}
		return -1;
	}


	/**
	 * Iterative bubble sort for an array
	 * @param shelve array to be sorted.
	 */
	public static void bubbleSort(FileRecord[] shelve) {
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int index = 1; index < shelve.length; index++) {
				if(shelve[index-1].compareTo(shelve[index]) >= 0) {
					swap(shelve, index-1, index);
					isSorted = false;
				}
			}
		}		
	}

	/**
	 * Helper method to swap the position of two objects in a given array
	 * @param shelve - array to work in
	 * @param a - index of the first object to swap
	 * @param b - index of the second object to swap
	 */
	private static void swap(FileRecord[] shelve, int a, int b) {
		FileRecord temp = shelve[a];
		shelve[a] = shelve[b];
		shelve[b] = temp;
	}

	/**
	 * Recursive Insertion Sort for an array
	 * @param shelve - Array to be sorted
	 */
	public static void insertionSort(FileRecord[] shelve) {
		insHelper(shelve, 1);
	}

	/**
	 * A helper method for the insertion sort's recursive algorithm
	 * @param shelve - Array to be sorted
	 * @param tailIndex - Index of the right part of the array that is yet to be sorted.
	 */
	private static void insHelper(FileRecord[] shelve, int tailIndex) {
		if(tailIndex >= shelve.length) {return;}
		for(int i = tailIndex-1; i >= 0; i--) {
			if(shelve[i+1].compareTo(shelve[i]) >= 0) {
				break;
			}
			swap(shelve, i, i+1);
		}
		insHelper(shelve, tailIndex+1);
	}

	/**
	 * Recursive Selection Sort for an array
	 * @param shelve - Array to be sorted
	 */
	public static void selectionSort(FileRecord[] shelve) {
		helperSel(shelve, 0, shelve.length);
	}

	public static void helperSel(FileRecord[] shelve, int i, int j) {
		int min = i;
		for (int k = i + 1; k < j; k++) {
			if (shelve[k].compareTo(shelve[min]) < 0) {
				min = k;	
			}
		}
		swap(shelve, min, i);
		if (i + 1 < j) {
			helperSel(shelve, i + 1, j);
		}
	}
}