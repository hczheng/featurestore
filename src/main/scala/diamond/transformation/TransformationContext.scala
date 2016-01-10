package diamond.transformation

import scala.collection.mutable

/**
  *
  * Use this like any map to pass state between transformations if required.
  *
  * Created by markmo on 12/12/2015.
  */
class TransformationContext extends Serializable {

  val map = mutable.Map[String, Any]()

  def apply(key: String, value: Any) {
    map.put(key, value)
  }

  def apply(key: String) = map(key)

  def getOrElse(key: String, default: Any) = map.getOrElse(key, default)

  def contains(key: String) = map.contains(key)

}