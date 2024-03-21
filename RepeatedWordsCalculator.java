import java.util.HashMap;

class RepeatedWordsCаlculator {

    public static void main(String[] args) {
        final String text = "The enormous room on the ground floor faced towards the north. Cold for all the summer beyond the panes, for all the tropical heat of the room itself, a harsh thin light glared through the windows, hungrily seeking some draped lay figure, some pallid shape of academic goose-flesh, but finding only the glass and nickel and bleakly shining porcelain of a laboratory. Wintriness responded to wintriness. The overalls of the workers were white, their hands gloved with a pale corpse-coloured rubber. The light was frozen, dead, a ghost. Only from the yellow barrels of the microscopes did it borrow a certain rich and living substance, lying along the polished tubes like butter, streak after luscious streak in long recession down the worktables.";
            var sentences = text.split("\\.");
            var wordsMap = new HashMap<String, Integer>();
            for (var i = 1; i < sentences.length; i++) {
                var words = sentences[i].replaceAll("|,|;|-|", "").split(" ");
                for (var s : words) {
                    var word = s.trim().toLowerCase();
                    if (word != "") {
                        var counter = wordsMap.get(word);
                        wordsMap.put(word, counter != null ? counter + 1 : 1);
                    }
                }
            }
            for (var w = 0; w < wordsMap.size(); w++) {
                var word = wordsMap.keySet().toArray()[w];
                var count = wordsMap.get(word);
                if (count > 1) {
                    System.out.println(word + ": " + count);
                }
            }
        }
    }
