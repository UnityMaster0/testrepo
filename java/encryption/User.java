package encryption;

public class User {

    long private_key, public_key, key, encrypted_message;
    char message;

    public long generatePublicKey() {

        return public_key = (3 ^ private_key) % 17;
    }

    public long generateSharedKey(long other_public_key) {

        return key = (other_public_key ^ private_key) % 17;
    }

    public long encrypt(char message) {

        return encrypted_message = message * key;
    }

    public char decrypt(long encrypted_message) {

        return message = (char) (encrypted_message / key);
    }
}
