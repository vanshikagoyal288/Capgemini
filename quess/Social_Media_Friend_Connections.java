package LinkedList;
class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        friendId = id;
    }
}

class UserNode {
    int userId, age;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int id, String n, int a) {
        userId = id;
        name = n;
        age = a;
    }

    void addFriend(int fid) {
        FriendNode f = new FriendNode(fid);
        f.next = friends;
        friends = f;
    }

    void displayFriends() {
        FriendNode temp = friends;
        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }
}

public class Social_Media_Friend_Connections {
    public static void main(String[] args) {
        UserNode u1 = new UserNode(1, "Aman", 20);
        UserNode u2 = new UserNode(2, "Riya", 21);

        u1.addFriend(2);
        u2.addFriend(1);

        u1.displayFriends();
    }
}
