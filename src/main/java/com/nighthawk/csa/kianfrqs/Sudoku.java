package com.nighthawk.csa.kianfrqs;
import java.util.*;

public class Sudoku {
    static int[][] full = new int[9][9];
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    static boolean run = false;
    ArrayList<Integer> setNumbs = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    ArrayList<Integer> exclude = new ArrayList<>(Arrays.asList(0,0));
    //figure out how to add the  number back into the array after it gets deleted by box checking or by column checking
    public int[][] generateSudoku() {
        int reset = 30;
        ArrayList<Integer> setNums = numbers;
        Collections.shuffle(setNums);
        /*
        int num = 0;
        //set top left, middle, and bottom right boxes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                full[i][j] = setNums.get(num);
                num++;
            }
        }
        num = 0;
        Collections.shuffle(setNums);
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                full[i][j] = setNums.get(num);
                num++;
            }
        }
        num = 0;
        Collections.shuffle(setNums);
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                full[i][j] = setNums.get(num);
                num++;
            }
        }
        */

        for (int i = 0; i < 9; i++) {
            while(true) {
                reset--;
                //System.out.println("Reset in: " + reset);
                setNumbs.clear();
                setNumbs.addAll(shuffleList());
                //System.out.println("setnumbs" + setNumbs);
                for (int j = 0; j < 9; j++) {
                    if (full[i][j] == 0) {
                        exclude.clear();
                        setNumbs.addAll(temp);
                        temp.clear();
                        ArrayList<Integer> set = checkConditions(i, j, setNumbs);
                        try {
                            full[i][j] = set.get(0);
                            run = true;
                        } catch (Exception e) {
                            //System.out.println("Try again!");
                            for (int a = 0; a < 9; a++) {
                                full[i][a] = 0;
                            }
                            i = 0;
                        }
                        /*
                        for (int k = 0; k < 9; k++) {
                            for (int l = 0; l < 9; l++) {
                                System.out.printf("%4d", full[k][l]);
                            }
                            System.out.printf("\n");

                        }*/
                    }
                }
                if (reset <= 0) {
                    for (int a = 0; a < 9; a++) {
                        for (int b = 0; b < 9; b++) {
                            full[a][b] = 0;
                        }
                    }
                    reset = 30;
                    run = true;
                    generateSudoku();
                    break;
                } else if (run) {
                    break;
                }
            }
        }

        return full;
    }

    public ArrayList<Integer> shuffleList() {
        Collections.shuffle(numbers);
        return numbers;
    }

    public ArrayList<Integer> checkConditions(int i, int j, ArrayList<Integer> setNums) {
        //System.out.println("start check");
        ArrayList<Integer> setNum = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
        for (int k = 0; k < 9; k++) {
            if(full[i][k] != 0) {
                exclude.add(full[i][k]);
            }
            if(full[k][j] != 0) {
                exclude.add(full[k][j]);
            }

        }

        if (i < 3) {
            if (j < 3) {
                exclude.addAll(checkBox(0,3,0,3));
            } else if (j < 6) {
                exclude.addAll(checkBox(0,3,3,6));
            } else if (j < 9) {
                exclude.addAll(checkBox(0,3,6,9));
            }
        } else if(i < 6) {
            if (j < 3) {
                exclude.addAll(checkBox(3,6,0,3));
            } else if (j < 6) {
                exclude.addAll(checkBox(3,6,3,6));
            } else if (j < 9) {
                exclude.addAll(checkBox(3,6,6,9));
            }
        } else if (i < 9) {
            if (j < 3) {
                exclude.addAll(checkBox(6,9,0,3));
            } else if (j < 6) {
                exclude.addAll(checkBox(6,9,3,6));
            } else if (j < 9) {
                exclude.addAll(checkBox(6,9,6,9));
            }
        }
        //System.out.println("exclude" + exclude);
          for (int l : setNums) {
            boolean match = false;
            for (Integer c : exclude) {
                if (Objects.equals(l, c)) {
                    if (l != 0) {
                        setNum.add(0);
                        temp.add(l);
                        match = true;
                        break;
                    }
                }

            }
            if (match) {
                continue;
            } else {
                setNum.add(l);
            }
        }

        setNums.clear();
        for (int l : setNum) {
            if (l != 0) {
                setNums.add(l);
            }
        }

        setNum.clear();
        //System.out.println("numbers " + setNums);
        exclude.clear();
        run = true;
        return setNums;
    }

    public ArrayList<Integer> checkBox(int a, int b, int c, int d) {
        ArrayList<Integer> value = new ArrayList<>();
        for (int x = a; x < b; x++) {
            for (int z = c; z < d; z++) {
                if(full[x][z] != 0) {
                    value.add(full[x][z]);
                }
            }
        }
        return value;
    }

    public void run(/*int row, int column*/) {
        int[][] starter = new int[9][9];
        int[][] solution = generateSudoku();
        for (int i = 0; i < 31; i++) {
            Random rand = new Random();
            int r = rand.nextInt(9);
            int c = rand.nextInt(9);
            starter[r][c] = solution[r][c];
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", solution[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println("Start!");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", starter[i][j]);
            }
            System.out.printf("\n");
        }
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input row (1-9)");
            int row = scan.nextInt()-1;
            System.out.println("Input column (1-9)");
            int column = scan.nextInt()-1;
            System.out.println("Input number (1-9)");
            int input = scan.nextInt();

            if (starter[row][column] == 0) {
                if (input == solution[row][column]) {
                    starter[row][column] = input;
                    System.out.println("You got it!");
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.printf("%4d", starter[i][j]);
                        }
                        System.out.printf("\n");
                    }
                } else {
                    System.out.println("Right answer is: " + solution[row][column] + " but your input is: " + input);
                }
            } else {
                System.out.println("This solution is already filled");
            }
            if (starter == solution) {
                break;
            }


    }
        System.out.println("You win!");
    }

    public static void main(String[] args) {
        Sudoku c = new Sudoku();
        c.run();
        /*
        int[][] print = c.generateSudoku();
            System.out.println("Final Randomly Generated Sudoku Solution: \n");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.printf("%4d", print[i][j]);
                }
                System.out.printf("\n");
            }

         */
    }


}
