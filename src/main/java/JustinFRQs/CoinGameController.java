package JustinFRQs;
import com.nighthawk.csa.kianfrqs.Wordle;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class CoinGameController {

    @GetMapping("/coingame")

    public String coingame(@RequestParam(name="p1coins", required=false,  defaultValue="2") int p1coins, Model model) {

        CoinGame game = new CoinGame();

        model.addAttribute("game", game);

        return "coingame";
    }

    @PostMapping("/coingame")

    public String submitForm(@ModelAttribute("game") CoinGame game, Model model) {
        ArrayList<Integer> data = game.playRound(game.getP1Input());
        int p1spend = data.get(0);
        int p2spend = data.get(1);
        int p1Coins = data.get(2);
        int p2Coins = data.get(3);
        int round = data.get(4);

        model.addAttribute("p1spend", p1spend);
        model.addAttribute("p2spend", p2spend);
        model.addAttribute("p1Coins", p1Coins);
        model.addAttribute("p2Coins", p2Coins);
        model.addAttribute("round", round);

        return "coingame";
    }
}
