#include <iostream>
#include <cmath>
using namespace std;

// This a class used to simulate a user
class User
{

public:
    long private_key, public_key, key, encrypted_message;
    char message;

    // Generates a public key for each user
    long generatePublicKey()
    {
        return public_key = (long(pow(3, private_key)) % 17);
    }

    // Generates a shared key
    long generateSharedKey(long other_public_key)
    {
        return key = (long(pow(other_public_key, private_key)) % 17);
    }

    // Encrypts message using multiplcation
    long encrypt(char message)
    {

        encrypted_message = message * key;
        return encrypted_message;
    }

    // Decrypts message using division
    char decrypt(long encrypted_message)
    {

        message = encrypted_message / key;
        return message;
    }
};

// A function to test the encrypt/decrypt process
void test(char message, long encrypted, char decrypted)
{

    cout << "Message - " << message << endl
         << "Encrypted - " << encrypted << endl
         << "Decrypted - " << decrypted << endl
         << endl;
}

int main()
{

    // Start of setup
    User user1;
    User user2;

    user1.private_key = 17;
    user2.private_key = 11;

    user1.generateSharedKey(user2.generatePublicKey());
    user2.generateSharedKey(user1.generatePublicKey());
    // End of setup

    string select;
    string message;

    long encrypted[message.length()];
    char decrypted[message.length()];

    /*
    While loop is the user interface
    For loops break up and reconstruct the message string
    */
    bool running = true;
    while (running == true)
    {

        cout << "What do you want to do: ";
        cin >> select;

        if (select.compare("Encrypt") == 0)
        {

            cout << "What is your message: ";
            cin >> message;

            for (int i = 0; i < message.length(); i++)
            {

                encrypted[i] = user1.encrypt(message[i]);
                cout << encrypted[i] << endl;
            }
        }
        else if (select.compare("Decrypt") == 0)
        {

            for (int i = 0; i < message.length(); i++)
            {

                decrypted[i] = user2.decrypt(encrypted[i]);
                cout << decrypted[i];
            }
            cout << endl;
        }
        else if (select.compare("Test") == 0)
        {

            for (int i = 0; i < message.length(); i++)
            {
                test(message[i], user1.encrypt(message[i]), user2.decrypt(user1.encrypt(message[i])));
            }
        }
        else if (select.compare("Read") == 0)
        {

            for (int i = 0; i < message.length(); i++)
            {

                if (message.length() > (i - 1))
                {
                    cout << encrypted[i];
                }
                else if (message.length() < i)
                {
                    cout << encrypted[i] << ", ";
                }
            }
            cout << endl;
        }
        else if (select.compare("Quit") == 0)
        {
            running = false;
        }
        else
        {
            cout << "Error";
        }
    }

    return 0;
}