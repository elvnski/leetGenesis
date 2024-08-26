package NaryTreePostorderTraversal;

import java.util.List;

public class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val);

        if (children != null && !children.isEmpty()) {
            sb.append(" [");
            for (int i = 0; i < children.size(); i++) {
                sb.append(children.get(i).toString());
                if (i < children.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
        }

        return sb.toString();
    }
}
