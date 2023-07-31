public class BinaryTree {
    public static void buildFromLevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter data for root: ");
        int data = scanner.nextInt();
        root = new Node(data);
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            System.out.print("Enter left node for " + temp.data + ": ");
            int leftData = scanner.nextInt();
            if (leftData != -1) {
                temp.left = new Node(leftData);
                q.add(temp.left);
            }

            System.out.print("Enter right node for " + temp.data + ": ");
            int rightData = scanner.nextInt();
            if (rightData != -1) {
                temp.right = new Node(rightData);
                q.add(temp.right);
            }
        }
    }
}
