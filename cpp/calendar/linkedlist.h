#ifndef LINK_LIST_H_
#define LINK_LIST_H_

#include <iostream>
using namespace std;

class Node
{
    public:
        string data;
        Node *next;
};

void append(Node** head_ref, string new_data)
{
    Node* new_node = new Node();
  
    new_node->data = new_data;
  
    new_node->next = (*head_ref);

    (*head_ref) = new_node;
}

void printList(Node *node) 
{ 
    while (node != NULL) 
    { 
        cout<<" "<<node->data; 
        node = node->next; 
    } 
} 

#endif