package funnel
package telemetry

import funnel.instruments._

object metrics {
  val MessagesReceived = counter("telemetry/messages/received", 0, "total number of messages received on telemetry sockets")
  val MessagesSent = counter("telemetry/messages/sent", 0, "total number of messages sent on telemetry sockets")
}