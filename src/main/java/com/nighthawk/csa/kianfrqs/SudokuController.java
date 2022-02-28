package com.nighthawk.csa.kianfrqs;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SudokuController {
    int[][] board;
    @GetMapping("/sudoku")
    public String sudoku(Model model) {
        Sudoku solution = new Sudoku();
        board = solution.generateStarter();
        model.addAttribute("board",board);
        return "sudoku";
    }

    @PostMapping("/sudoku")
    public String submitForm(@ModelAttribute("solution") Sudoku solution, Model model) {
        int[][] right = solution.getSolution();
        String result;
        if (right.equals(board)) {
            result = "You win!";
        } else {
            result = "Incorrect!";
        }
        model.addAttribute("board", board);
        model.addAttribute("result",result);
        return "sudoku";
    }
}
