class Trie {
    private class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean endOfWord = false;
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode()); // store in a new node
            node = node.children.get(c);
        }
        node.endOfWord = true; 
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()) {
            if(!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }

        return node.endOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c : prefix.toCharArray()) {
            if(!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */