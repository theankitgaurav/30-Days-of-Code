	// Add your code here
    Difference(int[] arr){
        this.elements = arr;
    }
    void computeDifference(){
        Arrays.sort(elements);
        int lengthy = elements.length;
        maximumDifference = elements[lengthy-1] - elements[0];
    }