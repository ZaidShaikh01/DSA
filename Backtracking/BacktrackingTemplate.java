public class BacktrackingTemplate {
//
//    void backtrack(State state, List<Choice> choices) {
//        if (isSolution(state)) {  // Base Case: If we found a valid solution
//            processSolution(state);
//            return;
//        }
//
//        for (Choice choice : choices) {  // Iterate through all choices
//            if (isValid(choice, state)) {  // Check if the choice is valid
//                makeChoice(state, choice);  // Make the choice
//                backtrack(state, getNewChoices(choices, choice));  // Explore
//                undoChoice(state, choice);  // Undo choice (Backtrack)
//            }
//        }
//    }

    /*
    o, It's like for subset there is simple base case.... For subset 2 I can modify it to if list does not contain the element then only add the element ... Nd for combination question if the size is equal to k then only add.. Is it like the only diff?
     */

}
