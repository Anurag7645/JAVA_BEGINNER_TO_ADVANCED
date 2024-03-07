package LeetCode_POTD;

class Solution {
    public:
        ListNode* middleNode(ListNode* head)
        {
            ListNode* temp=head;
            int count=0;
            while (temp!=nullptr)
            {
                count++;
                temp=temp->next;
            }
            temp=head;
            int ans=count/2;
            while (ans)
            {
                temp=temp->next;
                ans--;
            }
            return temp;
        }
    };