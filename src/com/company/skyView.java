package com.company;

public class skyView {
    private double[][] view;

    public skyView(int rowNums, int numCols, double[] scanned)
    {
        double[][] view = new double[rowNums][numCols];
        for (int i = 0; i<rowNums;i++)
        {

        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0.0;
        int count = 0;
        for (int i = startRow; i<endRow;i++)
        {
            for (int x = startCol; x<endCol;x++)
            {
                sum=sum+view[i][x];
                count++;
            }
        }
        return sum/count;
    }
}
