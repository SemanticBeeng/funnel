package oncue.svc.funnel.chemist

import com.amazonaws.services.sqs.AmazonSQS
import com.amazonaws.services.sqs.model._
import scala.collection.JavaConversions._

class TestAmazonSQS extends AmazonSQS {
  // methods we use
  def deleteMessageBatch(x$1: String,x$2: java.util.List[com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry]): com.amazonaws.services.sqs.model.DeleteMessageBatchResult = {
    new DeleteMessageBatchResult().withSuccessful(new DeleteMessageBatchResultEntry().withId("foo"))
  }
  def receiveMessage(x$1: com.amazonaws.services.sqs.model.ReceiveMessageRequest): com.amazonaws.services.sqs.model.ReceiveMessageResult = {
    new ReceiveMessageResult().withMessages(new Message().withMessageId("foo").withBody(Fixtures.asgEventJson1))
  }

  // erroneous methods

  def addPermission(x$1: String,x$2: String,x$3: java.util.List[String],x$4: java.util.List[String]): Unit = ???
  def addPermission(x$1: com.amazonaws.services.sqs.model.AddPermissionRequest): Unit = ???
  def changeMessageVisibility(x$1: String,x$2: String,x$3: Integer): Unit = ???
  def changeMessageVisibility(x$1: com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest): Unit = ???
  def changeMessageVisibilityBatch(x$1: String,x$2: java.util.List[com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequestEntry]): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult = ???
  def changeMessageVisibilityBatch(x$1: com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest): com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult = ???
  def createQueue(x$1: String): com.amazonaws.services.sqs.model.CreateQueueResult = ???
  def createQueue(x$1: com.amazonaws.services.sqs.model.CreateQueueRequest): com.amazonaws.services.sqs.model.CreateQueueResult = ???
  def deleteMessage(x$1: String,x$2: String): Unit = ???
  def deleteMessage(x$1: com.amazonaws.services.sqs.model.DeleteMessageRequest): Unit = ???
  def deleteMessageBatch(x$1: com.amazonaws.services.sqs.model.DeleteMessageBatchRequest): com.amazonaws.services.sqs.model.DeleteMessageBatchResult = ???
  def deleteQueue(x$1: String): Unit = ???
  def deleteQueue(x$1: com.amazonaws.services.sqs.model.DeleteQueueRequest): Unit = ???
  def getCachedResponseMetadata(x$1: com.amazonaws.AmazonWebServiceRequest): com.amazonaws.ResponseMetadata = ???
  def getQueueAttributes(x$1: String,x$2: java.util.List[String]): com.amazonaws.services.sqs.model.GetQueueAttributesResult = ???
  def getQueueAttributes(x$1: com.amazonaws.services.sqs.model.GetQueueAttributesRequest): com.amazonaws.services.sqs.model.GetQueueAttributesResult = ???
  def getQueueUrl(x$1: String): com.amazonaws.services.sqs.model.GetQueueUrlResult = ???
  def getQueueUrl(x$1: com.amazonaws.services.sqs.model.GetQueueUrlRequest): com.amazonaws.services.sqs.model.GetQueueUrlResult = ???
  def listDeadLetterSourceQueues(x$1: com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest): com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult = ???
  def listQueues(x$1: String): com.amazonaws.services.sqs.model.ListQueuesResult = ???
  def listQueues(): com.amazonaws.services.sqs.model.ListQueuesResult = ???
  def listQueues(x$1: com.amazonaws.services.sqs.model.ListQueuesRequest): com.amazonaws.services.sqs.model.ListQueuesResult = ???
  def receiveMessage(x$1: String): com.amazonaws.services.sqs.model.ReceiveMessageResult = ???
  def removePermission(x$1: String,x$2: String): Unit = ???
  def removePermission(x$1: com.amazonaws.services.sqs.model.RemovePermissionRequest): Unit = ???
  def sendMessage(x$1: String,x$2: String): com.amazonaws.services.sqs.model.SendMessageResult = ???
  def sendMessage(x$1: com.amazonaws.services.sqs.model.SendMessageRequest): com.amazonaws.services.sqs.model.SendMessageResult = ???
  def sendMessageBatch(x$1: String,x$2: java.util.List[com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry]): com.amazonaws.services.sqs.model.SendMessageBatchResult = ???
  def sendMessageBatch(x$1: com.amazonaws.services.sqs.model.SendMessageBatchRequest): com.amazonaws.services.sqs.model.SendMessageBatchResult = ???
  def setEndpoint(x$1: String): Unit = ???
  def setQueueAttributes(x$1: String,x$2: java.util.Map[String,String]): Unit = ???
  def setQueueAttributes(x$1: com.amazonaws.services.sqs.model.SetQueueAttributesRequest): Unit = ???
  def setRegion(x$1: com.amazonaws.regions.Region): Unit = ()
  def shutdown(): Unit = ()
}