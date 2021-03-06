package info.quiquedev.userservice.usecases.model

import io.circe.generic.auto._

final case class MailWithId(id: MailId, mail: Mail)

object MailWithId {
  type MailsWithId = Set[MailWithId]

  implicit val mailWithIdSetJsonCoder = jsonCoderOf[MailsWithId]
}
