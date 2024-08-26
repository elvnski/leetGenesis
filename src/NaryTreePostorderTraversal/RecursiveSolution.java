package NaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSolution {

    public List<Integer> postorder(Node root) {

        List<Integer> result = new ArrayList<>();
        postorderHelper(root, result);

        return result;
    }

    private void postorderHelper(Node node, List<Integer> result) {

        if (node == null) return;

        if (node.children != null) {
            for (Node child : node.children) {
                postorderHelper(child, result);
            }
        }

        result.add(node.val);
    }


}
