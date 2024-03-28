package main.scala

import scala.collection.mutable

class LruCache[T](val capacity: Int) {

  private var size: Int = 0
  private val hashMap: mutable.Map[String, Node] = mutable.Map()
  private val internalQueue: DoublyLinkedList = new DoublyLinkedList()

  def get(key: String): Option[T] = {
    hashMap.get(key).map { node =>
      internalQueue.moveNodeToFront(node)
      node.value
    }
  }
  def put(key: String, value: T): Unit = {
    hashMap.get(key) match {
      case Some(currentNode) =>
        currentNode.value = value
        internalQueue.moveNodeToFront(currentNode)
      case None =>
        if (size == capacity) {
          val rearNodeKey = internalQueue.getRearKey()
          internalQueue.removeNodeFromRear()
          hashMap.remove(rearNodeKey)
          size -= 1
        }
        val node = new Node(key, value)
        internalQueue.addNodeToFront(node)
        hashMap.put(key, node)
        size += 1
    }
  }


  private class Node(var key: String, var value: T, var next: Node = null, var prev: Node = null)
  private class DoublyLinkedList{
    private var front: Node = _
    private var rear: Node = _

    def addNodeToFront(node: Node): Unit = {
      if(front == node) return
      if(node ==rear){
        rear = rear.prev
        rear.next = null
      } else {
        node.prev.next = node.next
        node.next.prev = node.prev
      }
      node.prev = null
      node.next = front
      front.prev = node
      front = node
    }
    def moveNodeToFront(node: Node): Unit = ???
    def removeNodeFromRear(): Unit = ???
    def getRearKey(): String = ???
  }

}
