/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
 
 /*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

* You may assume the two numbers do not contain any leading zero, except the number 0 itself.

* Example:

* Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
* Output: 7 -> 0 -> 8
* Explanation: 342 + 465 = 807.
*/


const getValues = (listNode) => {
    let array = []
    while(listNode.next !== null){
        array.push(listNode.val)
        listNode = listNode.next
    }
    if(listNode.next === null){
        array.push(listNode.val)
    }
    return array    
}

const ListNode = (value) => {
    this.value = value;
    this.next = null;
}
var addTwoNumbers = function(l1, l2) {    
    const l1ArrayValue = parseInt(getValues(l1).reverse().join(''))
    const l2ArrayValue = parseInt(getValues(l2).reverse().join(''))
    const result = (l1ArrayValue + l2ArrayValue).toString().split('').map(t=>{
        ListNode(parseInt(t))
      })
    console.log(result)
};
