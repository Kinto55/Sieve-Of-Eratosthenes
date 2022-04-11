//Grid.java - Program that Implements a class Grid that stores measurements in a rectangular grid
// Author:Markintus Morris
// Date: 26-July-2021

import java.util.ArrayList;

public class Grid {

    // Instance Variables

    private int row;
    private int column;
    private gridElement[][] gridArray;

    // internal classes
    class Location {
        //what it does: provides instance varibles
        //how it works: hold values referenced throughout the class
        private int row;
        private int col;

        public Location(int row, int col) {

            this.row= row;
            this.col= col;

        }

        public int getRow() {

            return row;

        }

        public int getCol() {

            return col;

        }
    }

    class gridElement {
        //This is a singular cell which is a building block of the Grid class
        int measurement;
        String description;

    }

    public Grid(int numRows, int numColumns) {
        //What it Does: The contstructor for the Grid class
        //How it Works: Initializes the number of rows and columns and creates a new 2D array of Grid elements.
        gridArray= new gridElement[numRows][numColumns];
        row= numRows;
        column= numColumns;

    }

    public void add(int row, int column, String description) {
        //What it Does: Adds a gridElement to the grid
        //How it Works: Instantiates a new gridElement to be added to the grid with a description
        gridElement cell= new gridElement();
        gridArray[row][column]= cell;
        gridArray[row][column].description= description;

    }

    public String getDescription(int row, int column) {
        //What it Does: Retrives description of gridElement
        //How it Works: Accesses gridElement from given dimensions and returns the description
        return gridArray[row][column].description;

    }

    public ArrayList<Location> getDescribedLocations() {
        //What it Does: Finds the locations of gridElements that exist
        //How it Works: Iterates through every cell and checks if the gridElement is null - if not, append to location ArrayList.
        ArrayList<Location> location= new ArrayList<>();

        for (int i= 0; i < row; i++ ) {
            for (int j= 0; j < column; j++ ) {
                if (gridArray[i][j] != null)
                    location.add(new Location(i, j));

            }

        }

        return location;

    }

//simple tester not necessary

    public static void main(String[] args) {
        Grid grid= new Grid(3, 4);
        grid.add(2, 1, "shoe");
        grid.add(1, 2, "tree");
        grid.add(0, 1, "car");
        System.out.println(grid.getDescription(0, 1));
        System.out.println("Expected: car");
        System.out.println(grid.getDescription(1, 2));
        System.out.println("Expected: tree");
        System.out.println(grid.getDescription(2, 1));
        System.out.println("Expected: shoe");
        for (Grid.Location location : grid.getDescribedLocations()) {
            System.out.print(location.getRow() + "," + location.getCol() + " ");
        }
        System.out.println();
        System.out.println("Expected: 0,1 1,2 2,1 ");
    }

}
