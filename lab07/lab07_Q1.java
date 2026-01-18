
public class lab07_Q1{

    public static int [][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo)
    {
        
        if(matrixOne.length != matrixTwo[0].length)
        {
            System.out.println("The matrices are not compatible for multiplication.");
        }

            //initialize the constants
            int constantRows = matrixOne.length;
            int constantColumns = matrixTwo[0].length;
            int commonDimension = matrixOne[0].length;

            int[][] multiplication = new int[constantRows][constantColumns];

            for(int i = 0; i<constantRows; i++)
            {
                for(int a = 0; a<constantColumns; a++)
                {
                    for(int b = 0; b<commonDimension; b++)
                    {
                        multiplication[i][a] += matrixOne[i][b] * matrixTwo[b][a];
                    }
                }
            }
        
        return multiplication;
        }

    public static String checkRectengular(int [][] matrix)
    {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if(rows != columns)
        {
            return "Matrix is not a square!";
        }

        boolean upperTriangular = true;
        boolean lowerTriangular = true;

        for(int a = 0; a<rows; a++)
        {
            for(int b = 0; b<columns; b++)
            {
                boolean check = matrix[a][b] != 0;
                if(b>a&&check)
                {
                    lowerTriangular = false;
                }
                else if(a>b&&check)
                {
                    upperTriangular = false;
                }
            }
        }
        if(lowerTriangular && upperTriangular)
        {
            return "both";
        }
        if(lowerTriangular)
        {
            return "Lower Triangular";
        }
        else if(upperTriangular)
        {
            return "Upper Triangular";
        }
        else
        {
            return "Neither";
        }

    
    }

    public static boolean isSubset(int[][] child, int [][] parent)
    {
        for(int a = 0; a<child.length; a++)
        {
            for(int b = 0; b<child[a].length; b++)
            {
                int neededCount = 0;
                int element = child[a][b];

                for(int c = 0; c<child.length ; c++)
                {
                    for(int d = 0; d<child.length; d++)
                    {
                        boolean checkForChild = (child[c][d]==element);
                        if(checkForChild)
                        {
                            neededCount++;
                        }
                    }
                }

                int count = 0;
                for(int e = 0; e < parent.length; e++)
                {
                    for(int f = 0; f<parent[e].length; f++)
                    {
                        boolean checkForParent = (parent[e][f] == element);
                        if(checkForParent)
                        {
                            count++;
                        }
                    }
                }

                if(count < neededCount)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void printMatrix(int [][] matrix)
    {
        for(int a = 0; a<matrix.length; a++)
        {
            for(int b = 0; b<matrix[a].length;b++)
            {
                System.out.print(matrix[a][b]+ "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        
        
        int[][] matrixOne = 
        {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixTwo = 
        {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] matrixSquare = 
        {
            {1, 0, 0},
            {2, 1, 0},
            {3, 4, 1}
        };

        int[][] childMatrix = 
        {
            {1, 5},
            {8, 9}
        };

        int[][] parentMatrix = 
        {
            {1, 0, 2, 3},
            {4, 1, 5, 6},
            {7, 8, 9, 10}
        };

        System.out.println("Matrix One: ");
        printMatrix(matrixOne);
        System.out.println("Matrix Two: ");
        printMatrix(matrixTwo);

        
        System.out.println("Multiplication result: ");
        int [][] result = multiplyMatrices(matrixOne, matrixTwo);
        printMatrix(result); 
        
        
        System.out.println("Checking if matrix is rectangular ");
        printMatrix(matrixSquare);
        String rectangularResult = checkRectengular(matrixSquare);
        System.out.println("Result: " + rectangularResult);

        System.out.println("Checking if child matrix is a subset of parent matrix.");
        System.out.println("Parent matrix: ");
        printMatrix(parentMatrix);
        System.out.println("Child matrix: ");
        printMatrix(childMatrix);

        boolean isSubsetResult = isSubset(parentMatrix, childMatrix);
        System.out.println("Is child matrix a subset of parent matrix: " + isSubsetResult);



    }
}